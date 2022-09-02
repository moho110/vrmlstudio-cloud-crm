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
import com.vrcrm.xsystem.domain.CmfSystemLog;
import com.vrcrm.xsystem.service.ICmfSystemLogService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 系统日志Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/systemlog")
public class CmfSystemLogController extends BaseController
{
    @Autowired
    private ICmfSystemLogService cmfSystemLogService;

    /**
     * 查询系统日志列表
     */
    @PreAuthorize("@ss.hasPermi('system:log:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfSystemLog cmfSystemLog)
    {
        startPage();
        List<CmfSystemLog> list = cmfSystemLogService.selectCmfSystemLogList(cmfSystemLog);
        return getDataTable(list);
    }

    /**
     * 导出系统日志列表
     */
    @PreAuthorize("@ss.hasPermi('system:log:export')")
    @Log(title = "系统日志", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfSystemLog cmfSystemLog)
    {
        List<CmfSystemLog> list = cmfSystemLogService.selectCmfSystemLogList(cmfSystemLog);
        ExcelUtil<CmfSystemLog> util = new ExcelUtil<CmfSystemLog>(CmfSystemLog.class);
        util.exportExcel(response, list, "系统日志数据");
    }

    /**
     * 获取系统日志详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:log:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfSystemLogService.selectCmfSystemLogById(id));
    }

    /**
     * 新增系统日志
     */
    @PreAuthorize("@ss.hasPermi('system:log:add')")
    @Log(title = "系统日志", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfSystemLog cmfSystemLog)
    {
        return toAjax(cmfSystemLogService.insertCmfSystemLog(cmfSystemLog));
    }

    /**
     * 修改系统日志
     */
    @PreAuthorize("@ss.hasPermi('system:log:edit')")
    @Log(title = "系统日志", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfSystemLog cmfSystemLog)
    {
        return toAjax(cmfSystemLogService.updateCmfSystemLog(cmfSystemLog));
    }

    /**
     * 删除系统日志
     */
    @PreAuthorize("@ss.hasPermi('system:log:remove')")
    @Log(title = "系统日志", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfSystemLogService.deleteCmfSystemLogByIds(ids));
    }
}
