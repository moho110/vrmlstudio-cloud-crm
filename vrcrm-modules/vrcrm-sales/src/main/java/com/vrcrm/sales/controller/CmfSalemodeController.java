package com.vrcrm.sales.controller;

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
import com.vrcrm.sales.domain.CmfSalemode;
import com.vrcrm.sales.service.ICmfSalemodeService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 销售模式Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/salemode")
public class CmfSalemodeController extends BaseController
{
    @Autowired
    private ICmfSalemodeService cmfSalemodeService;

    /**
     * 查询销售模式列表
     */
    @PreAuthorize("@ss.hasPermi('sales:salemode:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfSalemode cmfSalemode)
    {
        startPage();
        List<CmfSalemode> list = cmfSalemodeService.selectCmfSalemodeList(cmfSalemode);
        return getDataTable(list);
    }

    /**
     * 导出销售模式列表
     */
    @PreAuthorize("@ss.hasPermi('sales:salemode:export')")
    @Log(title = "销售模式", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfSalemode cmfSalemode)
    {
        List<CmfSalemode> list = cmfSalemodeService.selectCmfSalemodeList(cmfSalemode);
        ExcelUtil<CmfSalemode> util = new ExcelUtil<CmfSalemode>(CmfSalemode.class);
        util.exportExcel(response, list, "销售模式数据");
    }

    /**
     * 获取销售模式详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:salemode:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfSalemodeService.selectCmfSalemodeById(id));
    }

    /**
     * 新增销售模式
     */
    @PreAuthorize("@ss.hasPermi('sales:salemode:add')")
    @Log(title = "销售模式", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfSalemode cmfSalemode)
    {
        return toAjax(cmfSalemodeService.insertCmfSalemode(cmfSalemode));
    }

    /**
     * 修改销售模式
     */
    @PreAuthorize("@ss.hasPermi('sales:salemode:edit')")
    @Log(title = "销售模式", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfSalemode cmfSalemode)
    {
        return toAjax(cmfSalemodeService.updateCmfSalemode(cmfSalemode));
    }

    /**
     * 删除销售模式
     */
    @PreAuthorize("@ss.hasPermi('sales:salemode:remove')")
    @Log(title = "销售模式", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfSalemodeService.deleteCmfSalemodeByIds(ids));
    }
}
