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
import com.vrcrm.store.domain.CmfStockoutmainDetail;
import com.vrcrm.store.service.ICmfStockoutmainDetailService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 仓库出库明细Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/stockoutmaindetail")
public class CmfStockoutmainDetailController extends BaseController
{
    @Autowired
    private ICmfStockoutmainDetailService cmfStockoutmainDetailService;

    /**
     * 查询仓库出库明细列表
     */
    @PreAuthorize("@ss.hasPermi('store:outdetail:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfStockoutmainDetail cmfStockoutmainDetail)
    {
        startPage();
        List<CmfStockoutmainDetail> list = cmfStockoutmainDetailService.selectCmfStockoutmainDetailList(cmfStockoutmainDetail);
        return getDataTable(list);
    }

    /**
     * 导出仓库出库明细列表
     */
    @PreAuthorize("@ss.hasPermi('store:outdetail:export')")
    @Log(title = "仓库出库明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfStockoutmainDetail cmfStockoutmainDetail)
    {
        List<CmfStockoutmainDetail> list = cmfStockoutmainDetailService.selectCmfStockoutmainDetailList(cmfStockoutmainDetail);
        ExcelUtil<CmfStockoutmainDetail> util = new ExcelUtil<CmfStockoutmainDetail>(CmfStockoutmainDetail.class);
        util.exportExcel(response, list, "仓库出库明细数据");
    }

    /**
     * 获取仓库出库明细详细信息
     */
    @PreAuthorize("@ss.hasPermi('store:outdetail:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfStockoutmainDetailService.selectCmfStockoutmainDetailById(id));
    }

    /**
     * 新增仓库出库明细
     */
    @PreAuthorize("@ss.hasPermi('store:outdetail:add')")
    @Log(title = "仓库出库明细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfStockoutmainDetail cmfStockoutmainDetail)
    {
        return toAjax(cmfStockoutmainDetailService.insertCmfStockoutmainDetail(cmfStockoutmainDetail));
    }

    /**
     * 修改仓库出库明细
     */
    @PreAuthorize("@ss.hasPermi('store:outdetail:edit')")
    @Log(title = "仓库出库明细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfStockoutmainDetail cmfStockoutmainDetail)
    {
        return toAjax(cmfStockoutmainDetailService.updateCmfStockoutmainDetail(cmfStockoutmainDetail));
    }

    /**
     * 删除仓库出库明细
     */
    @PreAuthorize("@ss.hasPermi('store:outdetail:remove')")
    @Log(title = "仓库出库明细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfStockoutmainDetailService.deleteCmfStockoutmainDetailByIds(ids));
    }
}
