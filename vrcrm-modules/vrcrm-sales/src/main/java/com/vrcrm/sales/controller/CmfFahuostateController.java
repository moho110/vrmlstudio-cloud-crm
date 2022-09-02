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
import com.vrcrm.sales.domain.CmfFahuostate;
import com.vrcrm.sales.service.ICmfFahuostateService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 发货状态Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/fahuostate")
public class CmfFahuostateController extends BaseController
{
    @Autowired
    private ICmfFahuostateService cmfFahuostateService;

    /**
     * 查询发货状态列表
     */
    @PreAuthorize("@ss.hasPermi('sales:fahuostate:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfFahuostate cmfFahuostate)
    {
        startPage();
        List<CmfFahuostate> list = cmfFahuostateService.selectCmfFahuostateList(cmfFahuostate);
        return getDataTable(list);
    }

    /**
     * 导出发货状态列表
     */
    @PreAuthorize("@ss.hasPermi('sales:fahuostate:export')")
    @Log(title = "发货状态", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfFahuostate cmfFahuostate)
    {
        List<CmfFahuostate> list = cmfFahuostateService.selectCmfFahuostateList(cmfFahuostate);
        ExcelUtil<CmfFahuostate> util = new ExcelUtil<CmfFahuostate>(CmfFahuostate.class);
        util.exportExcel(response, list, "发货状态数据");
    }

    /**
     * 获取发货状态详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:fahuostate:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfFahuostateService.selectCmfFahuostateById(id));
    }

    /**
     * 新增发货状态
     */
    @PreAuthorize("@ss.hasPermi('sales:fahuostate:add')")
    @Log(title = "发货状态", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfFahuostate cmfFahuostate)
    {
        return toAjax(cmfFahuostateService.insertCmfFahuostate(cmfFahuostate));
    }

    /**
     * 修改发货状态
     */
    @PreAuthorize("@ss.hasPermi('sales:fahuostate:edit')")
    @Log(title = "发货状态", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfFahuostate cmfFahuostate)
    {
        return toAjax(cmfFahuostateService.updateCmfFahuostate(cmfFahuostate));
    }

    /**
     * 删除发货状态
     */
    @PreAuthorize("@ss.hasPermi('sales:fahuostate:remove')")
    @Log(title = "发货状态", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfFahuostateService.deleteCmfFahuostateByIds(ids));
    }
}
