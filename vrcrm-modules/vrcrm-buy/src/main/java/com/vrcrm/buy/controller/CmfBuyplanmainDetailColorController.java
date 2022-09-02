package com.vrcrm.buy.controller;

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
import com.vrcrm.buy.domain.CmfBuyplanmainDetailColor;
import com.vrcrm.buy.service.ICmfBuyplanmainDetailColorService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 采购计划明细表颜色Controller
 * 
 * @author VRer
 * @date 2022-04-14
 */
@RestController
@RequestMapping("/buyplanmaindetailcolor")
public class CmfBuyplanmainDetailColorController extends BaseController
{
    @Autowired
    private ICmfBuyplanmainDetailColorService cmfBuyplanmainDetailColorService;

    /**
     * 查询采购计划明细表颜色列表
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanmaindetailcolor:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfBuyplanmainDetailColor cmfBuyplanmainDetailColor)
    {
        startPage();
        List<CmfBuyplanmainDetailColor> list = cmfBuyplanmainDetailColorService.selectCmfBuyplanmainDetailColorList(cmfBuyplanmainDetailColor);
        return getDataTable(list);
    }

    /**
     * 导出采购计划明细表颜色列表
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanmaindetailcolor:export')")
    @Log(title = "采购计划明细表颜色", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfBuyplanmainDetailColor cmfBuyplanmainDetailColor)
    {
        List<CmfBuyplanmainDetailColor> list = cmfBuyplanmainDetailColorService.selectCmfBuyplanmainDetailColorList(cmfBuyplanmainDetailColor);
        ExcelUtil<CmfBuyplanmainDetailColor> util = new ExcelUtil<CmfBuyplanmainDetailColor>(CmfBuyplanmainDetailColor.class);
        util.exportExcel(response, list, "采购计划明细表颜色数据");
    }

    /**
     * 获取采购计划明细表颜色详细信息
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanmaindetailcolor:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfBuyplanmainDetailColorService.selectCmfBuyplanmainDetailColorById(id));
    }

    /**
     * 新增采购计划明细表颜色
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanmaindetailcolor:add')")
    @Log(title = "采购计划明细表颜色", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfBuyplanmainDetailColor cmfBuyplanmainDetailColor)
    {
        return toAjax(cmfBuyplanmainDetailColorService.insertCmfBuyplanmainDetailColor(cmfBuyplanmainDetailColor));
    }

    /**
     * 修改采购计划明细表颜色
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanmaindetailcolor:edit')")
    @Log(title = "采购计划明细表颜色", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfBuyplanmainDetailColor cmfBuyplanmainDetailColor)
    {
        return toAjax(cmfBuyplanmainDetailColorService.updateCmfBuyplanmainDetailColor(cmfBuyplanmainDetailColor));
    }

    /**
     * 删除采购计划明细表颜色
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanmaindetailcolor:remove')")
    @Log(title = "采购计划明细表颜色", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfBuyplanmainDetailColorService.deleteCmfBuyplanmainDetailColorByIds(ids));
    }
}
