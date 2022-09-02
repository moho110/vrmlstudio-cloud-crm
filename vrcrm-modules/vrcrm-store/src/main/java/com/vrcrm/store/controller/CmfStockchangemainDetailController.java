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
import com.vrcrm.store.domain.CmfStockchangemainDetail;
import com.vrcrm.store.service.ICmfStockchangemainDetailService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 仓库管理调拔明细Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/stockchangmaindetail")
public class CmfStockchangemainDetailController extends BaseController
{
    @Autowired
    private ICmfStockchangemainDetailService cmfStockchangemainDetailService;

    /**
     * 查询仓库管理调拔明细列表
     */
    @PreAuthorize("@ss.hasPermi('store:changmaindetail:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfStockchangemainDetail cmfStockchangemainDetail)
    {
        startPage();
        List<CmfStockchangemainDetail> list = cmfStockchangemainDetailService.selectCmfStockchangemainDetailList(cmfStockchangemainDetail);
        return getDataTable(list);
    }

    /**
     * 导出仓库管理调拔明细列表
     */
    @PreAuthorize("@ss.hasPermi('store:changmaindetail:export')")
    @Log(title = "仓库管理调拔明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfStockchangemainDetail cmfStockchangemainDetail)
    {
        List<CmfStockchangemainDetail> list = cmfStockchangemainDetailService.selectCmfStockchangemainDetailList(cmfStockchangemainDetail);
        ExcelUtil<CmfStockchangemainDetail> util = new ExcelUtil<CmfStockchangemainDetail>(CmfStockchangemainDetail.class);
        util.exportExcel(response, list, "仓库管理调拔明细数据");
    }

    /**
     * 获取仓库管理调拔明细详细信息
     */
    @PreAuthorize("@ss.hasPermi('store:changmaindetail:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfStockchangemainDetailService.selectCmfStockchangemainDetailById(id));
    }

    /**
     * 新增仓库管理调拔明细
     */
    @PreAuthorize("@ss.hasPermi('store:changmaindetail:add')")
    @Log(title = "仓库管理调拔明细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfStockchangemainDetail cmfStockchangemainDetail)
    {
        return toAjax(cmfStockchangemainDetailService.insertCmfStockchangemainDetail(cmfStockchangemainDetail));
    }

    /**
     * 修改仓库管理调拔明细
     */
    @PreAuthorize("@ss.hasPermi('store:changmaindetail:edit')")
    @Log(title = "仓库管理调拔明细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfStockchangemainDetail cmfStockchangemainDetail)
    {
        return toAjax(cmfStockchangemainDetailService.updateCmfStockchangemainDetail(cmfStockchangemainDetail));
    }

    /**
     * 删除仓库管理调拔明细
     */
    @PreAuthorize("@ss.hasPermi('store:changmaindetail:remove')")
    @Log(title = "仓库管理调拔明细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfStockchangemainDetailService.deleteCmfStockchangemainDetailByIds(ids));
    }
}
