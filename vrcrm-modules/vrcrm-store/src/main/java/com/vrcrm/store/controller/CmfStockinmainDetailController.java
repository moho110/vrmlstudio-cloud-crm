package com.vrcrm.store.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import com.vrcrm.common.log.enums.BusinessType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vrcrm.common.log.annotation.Log;
import com.vrcrm.common.core.web.controller.BaseController;
import com.vrcrm.common.core.web.domain.AjaxResult;
import com.vrcrm.store.domain.CmfStockinmainDetail;
import com.vrcrm.store.service.ICmfStockinmainDetailService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 仓库管理入库明细Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/stockinmaindetail")
public class CmfStockinmainDetailController extends BaseController
{
    @Autowired
    private ICmfStockinmainDetailService cmfStockinmainDetailService;

    /**
     * 查询仓库管理入库明细列表
     */
    @PreAuthorize("@ss.hasPermi('store:indetail:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfStockinmainDetail cmfStockinmainDetail)
    {
        startPage();
        List<CmfStockinmainDetail> list = cmfStockinmainDetailService.selectCmfStockinmainDetailList(cmfStockinmainDetail);
        return getDataTable(list);
    }

    /**
     * 导出仓库管理入库明细列表
     */
    @PreAuthorize("@ss.hasPermi('store:indetail:export')")
    @Log(title = "仓库管理入库明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfStockinmainDetail cmfStockinmainDetail)
    {
        List<CmfStockinmainDetail> list = cmfStockinmainDetailService.selectCmfStockinmainDetailList(cmfStockinmainDetail);
        ExcelUtil<CmfStockinmainDetail> util = new ExcelUtil<CmfStockinmainDetail>(CmfStockinmainDetail.class);
        util.exportExcel(response, list, "仓库管理入库明细数据");
    }

    /**
     * 获取仓库管理入库明细详细信息
     */
    @PreAuthorize("@ss.hasPermi('store:indetail:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfStockinmainDetailService.selectCmfStockinmainDetailById(id));
    }

    /**
     * 新增仓库管理入库明细
     */
    @PreAuthorize("@ss.hasPermi('store:indetail:add')")
    @Log(title = "仓库管理入库明细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfStockinmainDetail cmfStockinmainDetail)
    {
        return toAjax(cmfStockinmainDetailService.insertCmfStockinmainDetail(cmfStockinmainDetail));
    }

    /**
     * 修改仓库管理入库明细
     */
    @PreAuthorize("@ss.hasPermi('store:indetail:edit')")
    @Log(title = "仓库管理入库明细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfStockinmainDetail cmfStockinmainDetail)
    {
        return toAjax(cmfStockinmainDetailService.updateCmfStockinmainDetail(cmfStockinmainDetail));
    }

    /**
     * 删除仓库管理入库明细
     */
    @PreAuthorize("@ss.hasPermi('store:indetail:remove')")
    @Log(title = "仓库管理入库明细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfStockinmainDetailService.deleteCmfStockinmainDetailByIds(ids));
    }
}
