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
import com.vrcrm.sales.domain.CmfSellplanmainDetailColor;
import com.vrcrm.sales.service.ICmfSellplanmainDetailColorService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 销售计划明细表颜色Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/sellplanmaindetailcolor")
public class CmfSellplanmainDetailColorController extends BaseController
{
    @Autowired
    private ICmfSellplanmainDetailColorService cmfSellplanmainDetailColorService;

    /**
     * 查询销售计划明细表颜色列表
     */
    @PreAuthorize("@ss.hasPermi('sales:scolor:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfSellplanmainDetailColor cmfSellplanmainDetailColor)
    {
        startPage();
        List<CmfSellplanmainDetailColor> list = cmfSellplanmainDetailColorService.selectCmfSellplanmainDetailColorList(cmfSellplanmainDetailColor);
        return getDataTable(list);
    }

    /**
     * 导出销售计划明细表颜色列表
     */
    @PreAuthorize("@ss.hasPermi('sales:scolor:export')")
    @Log(title = "销售计划明细表颜色", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfSellplanmainDetailColor cmfSellplanmainDetailColor)
    {
        List<CmfSellplanmainDetailColor> list = cmfSellplanmainDetailColorService.selectCmfSellplanmainDetailColorList(cmfSellplanmainDetailColor);
        ExcelUtil<CmfSellplanmainDetailColor> util = new ExcelUtil<CmfSellplanmainDetailColor>(CmfSellplanmainDetailColor.class);
        util.exportExcel(response, list, "销售计划明细表颜色数据");
    }

    /**
     * 获取销售计划明细表颜色详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:scolor:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfSellplanmainDetailColorService.selectCmfSellplanmainDetailColorById(id));
    }

    /**
     * 新增销售计划明细表颜色
     */
    @PreAuthorize("@ss.hasPermi('sales:scolor:add')")
    @Log(title = "销售计划明细表颜色", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfSellplanmainDetailColor cmfSellplanmainDetailColor)
    {
        return toAjax(cmfSellplanmainDetailColorService.insertCmfSellplanmainDetailColor(cmfSellplanmainDetailColor));
    }

    /**
     * 修改销售计划明细表颜色
     */
    @PreAuthorize("@ss.hasPermi('sales:scolor:edit')")
    @Log(title = "销售计划明细表颜色", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfSellplanmainDetailColor cmfSellplanmainDetailColor)
    {
        return toAjax(cmfSellplanmainDetailColorService.updateCmfSellplanmainDetailColor(cmfSellplanmainDetailColor));
    }

    /**
     * 删除销售计划明细表颜色
     */
    @PreAuthorize("@ss.hasPermi('sales:scolor:remove')")
    @Log(title = "销售计划明细表颜色", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfSellplanmainDetailColorService.deleteCmfSellplanmainDetailColorByIds(ids));
    }
}
