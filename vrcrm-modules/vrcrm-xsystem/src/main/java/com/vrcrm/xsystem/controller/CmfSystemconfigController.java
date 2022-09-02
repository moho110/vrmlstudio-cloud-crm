package com.vrcrm.xsystem.controller;

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
import com.vrcrm.xsystem.domain.CmfSystemconfig;
import com.vrcrm.xsystem.service.ICmfSystemconfigService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 系统配置Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/systemconfig")
public class CmfSystemconfigController extends BaseController
{
    @Autowired
    private ICmfSystemconfigService cmfSystemconfigService;

    /**
     * 查询系统配置列表
     */
    @PreAuthorize("@ss.hasPermi('system:systemconfig:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfSystemconfig cmfSystemconfig)
    {
        startPage();
        List<CmfSystemconfig> list = cmfSystemconfigService.selectCmfSystemconfigList(cmfSystemconfig);
        return getDataTable(list);
    }

    /**
     * 导出系统配置列表
     */
    @PreAuthorize("@ss.hasPermi('system:systemconfig:export')")
    @Log(title = "系统配置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfSystemconfig cmfSystemconfig)
    {
        List<CmfSystemconfig> list = cmfSystemconfigService.selectCmfSystemconfigList(cmfSystemconfig);
        ExcelUtil<CmfSystemconfig> util = new ExcelUtil<CmfSystemconfig>(CmfSystemconfig.class);
        util.exportExcel(response, list, "系统配置数据");
    }

    /**
     * 获取系统配置详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:systemconfig:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfSystemconfigService.selectCmfSystemconfigById(id));
    }

    /**
     * 新增系统配置
     */
    @PreAuthorize("@ss.hasPermi('system:systemconfig:add')")
    @Log(title = "系统配置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfSystemconfig cmfSystemconfig)
    {
        return toAjax(cmfSystemconfigService.insertCmfSystemconfig(cmfSystemconfig));
    }

    /**
     * 修改系统配置
     */
    @PreAuthorize("@ss.hasPermi('system:systemconfig:edit')")
    @Log(title = "系统配置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfSystemconfig cmfSystemconfig)
    {
        return toAjax(cmfSystemconfigService.updateCmfSystemconfig(cmfSystemconfig));
    }

    /**
     * 删除系统配置
     */
    @PreAuthorize("@ss.hasPermi('system:systemconfig:remove')")
    @Log(title = "系统配置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfSystemconfigService.deleteCmfSystemconfigByIds(ids));
    }
}
