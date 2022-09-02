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
import com.vrcrm.xsystem.domain.CmfSystemprivate;
import com.vrcrm.xsystem.service.ICmfSystemprivateService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 系统权限Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/systemprivate")
public class CmfSystemprivateController extends BaseController
{
    @Autowired
    private ICmfSystemprivateService cmfSystemprivateService;

    /**
     * 查询系统权限列表
     */
    @PreAuthorize("@ss.hasPermi('system:systemprivate:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfSystemprivate cmfSystemprivate)
    {
        startPage();
        List<CmfSystemprivate> list = cmfSystemprivateService.selectCmfSystemprivateList(cmfSystemprivate);
        return getDataTable(list);
    }

    /**
     * 导出系统权限列表
     */
    @PreAuthorize("@ss.hasPermi('system:systemprivate:export')")
    @Log(title = "系统权限", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfSystemprivate cmfSystemprivate)
    {
        List<CmfSystemprivate> list = cmfSystemprivateService.selectCmfSystemprivateList(cmfSystemprivate);
        ExcelUtil<CmfSystemprivate> util = new ExcelUtil<CmfSystemprivate>(CmfSystemprivate.class);
        util.exportExcel(response, list, "系统权限数据");
    }

    /**
     * 获取系统权限详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:systemprivate:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfSystemprivateService.selectCmfSystemprivateById(id));
    }

    /**
     * 新增系统权限
     */
    @PreAuthorize("@ss.hasPermi('system:systemprivate:add')")
    @Log(title = "系统权限", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfSystemprivate cmfSystemprivate)
    {
        return toAjax(cmfSystemprivateService.insertCmfSystemprivate(cmfSystemprivate));
    }

    /**
     * 修改系统权限
     */
    @PreAuthorize("@ss.hasPermi('system:systemprivate:edit')")
    @Log(title = "系统权限", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfSystemprivate cmfSystemprivate)
    {
        return toAjax(cmfSystemprivateService.updateCmfSystemprivate(cmfSystemprivate));
    }

    /**
     * 删除系统权限
     */
    @PreAuthorize("@ss.hasPermi('system:systemprivate:remove')")
    @Log(title = "系统权限", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfSystemprivateService.deleteCmfSystemprivateByIds(ids));
    }
}
