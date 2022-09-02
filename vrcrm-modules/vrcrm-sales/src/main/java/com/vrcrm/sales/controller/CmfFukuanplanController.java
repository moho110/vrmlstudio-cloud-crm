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
import com.vrcrm.sales.domain.CmfFukuanplan;
import com.vrcrm.sales.service.ICmfFukuanplanService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 付款计划Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/fukuanplan")
public class CmfFukuanplanController extends BaseController
{
    @Autowired
    private ICmfFukuanplanService cmfFukuanplanService;

    /**
     * 查询付款计划列表
     */
    @PreAuthorize("@ss.hasPermi('sales:fukuanplan:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfFukuanplan cmfFukuanplan)
    {
        startPage();
        List<CmfFukuanplan> list = cmfFukuanplanService.selectCmfFukuanplanList(cmfFukuanplan);
        return getDataTable(list);
    }

    /**
     * 导出付款计划列表
     */
    @PreAuthorize("@ss.hasPermi('sales:fukuanplan:export')")
    @Log(title = "付款计划", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfFukuanplan cmfFukuanplan)
    {
        List<CmfFukuanplan> list = cmfFukuanplanService.selectCmfFukuanplanList(cmfFukuanplan);
        ExcelUtil<CmfFukuanplan> util = new ExcelUtil<CmfFukuanplan>(CmfFukuanplan.class);
        util.exportExcel(response, list, "付款计划数据");
    }

    /**
     * 获取付款计划详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:fukuanplan:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfFukuanplanService.selectCmfFukuanplanById(id));
    }

    /**
     * 新增付款计划
     */
    @PreAuthorize("@ss.hasPermi('sales:fukuanplan:add')")
    @Log(title = "付款计划", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfFukuanplan cmfFukuanplan)
    {
        return toAjax(cmfFukuanplanService.insertCmfFukuanplan(cmfFukuanplan));
    }

    /**
     * 修改付款计划
     */
    @PreAuthorize("@ss.hasPermi('sales:fukuanplan:edit')")
    @Log(title = "付款计划", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfFukuanplan cmfFukuanplan)
    {
        return toAjax(cmfFukuanplanService.updateCmfFukuanplan(cmfFukuanplan));
    }

    /**
     * 删除付款计划
     */
    @PreAuthorize("@ss.hasPermi('sales:fukuanplan:remove')")
    @Log(title = "付款计划", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfFukuanplanService.deleteCmfFukuanplanByIds(ids));
    }
}
