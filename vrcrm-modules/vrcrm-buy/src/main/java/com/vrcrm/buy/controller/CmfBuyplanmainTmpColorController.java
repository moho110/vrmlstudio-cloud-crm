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
import com.vrcrm.buy.domain.CmfBuyplanmainTmpColor;
import com.vrcrm.buy.service.ICmfBuyplanmainTmpColorService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 采购单临时颜色表Controller
 * 
 * @author VRer
 * @date 2022-04-14
 */
@RestController
@RequestMapping("/buyplanmaintmpcolor")
public class CmfBuyplanmainTmpColorController extends BaseController
{
    @Autowired
    private ICmfBuyplanmainTmpColorService cmfBuyplanmainTmpColorService;

    /**
     * 查询采购单临时颜色表列表
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanmaintmpcolor:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfBuyplanmainTmpColor cmfBuyplanmainTmpColor)
    {
        startPage();
        List<CmfBuyplanmainTmpColor> list = cmfBuyplanmainTmpColorService.selectCmfBuyplanmainTmpColorList(cmfBuyplanmainTmpColor);
        return getDataTable(list);
    }

    /**
     * 导出采购单临时颜色表列表
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanmaintmpcolor:export')")
    @Log(title = "采购单临时颜色表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfBuyplanmainTmpColor cmfBuyplanmainTmpColor)
    {
        List<CmfBuyplanmainTmpColor> list = cmfBuyplanmainTmpColorService.selectCmfBuyplanmainTmpColorList(cmfBuyplanmainTmpColor);
        ExcelUtil<CmfBuyplanmainTmpColor> util = new ExcelUtil<CmfBuyplanmainTmpColor>(CmfBuyplanmainTmpColor.class);
        util.exportExcel(response, list, "采购单临时颜色表数据");
    }

    /**
     * 获取采购单临时颜色表详细信息
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanmaintmpcolor:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfBuyplanmainTmpColorService.selectCmfBuyplanmainTmpColorById(id));
    }

    /**
     * 新增采购单临时颜色表
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanmaintmpcolor:add')")
    @Log(title = "采购单临时颜色表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfBuyplanmainTmpColor cmfBuyplanmainTmpColor)
    {
        return toAjax(cmfBuyplanmainTmpColorService.insertCmfBuyplanmainTmpColor(cmfBuyplanmainTmpColor));
    }

    /**
     * 修改采购单临时颜色表
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanmaintmpcolor:edit')")
    @Log(title = "采购单临时颜色表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfBuyplanmainTmpColor cmfBuyplanmainTmpColor)
    {
        return toAjax(cmfBuyplanmainTmpColorService.updateCmfBuyplanmainTmpColor(cmfBuyplanmainTmpColor));
    }

    /**
     * 删除采购单临时颜色表
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanmaintmpcolor:remove')")
    @Log(title = "采购单临时颜色表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfBuyplanmainTmpColorService.deleteCmfBuyplanmainTmpColorByIds(ids));
    }
}
