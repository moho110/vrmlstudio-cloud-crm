package com.vrcrm.political.controller;

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
import com.vrcrm.political.domain.CmfOfficeTask;
import com.vrcrm.political.service.ICmfOfficeTaskService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 办公任务Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/officetask")
public class CmfOfficeTaskController extends BaseController
{
    @Autowired
    private ICmfOfficeTaskService cmfOfficeTaskService;

    /**
     * 查询办公任务列表
     */
    @PreAuthorize("@ss.hasPermi('political:officetask:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfOfficeTask cmfOfficeTask)
    {
        startPage();
        List<CmfOfficeTask> list = cmfOfficeTaskService.selectCmfOfficeTaskList(cmfOfficeTask);
        return getDataTable(list);
    }

    /**
     * 导出办公任务列表
     */
    @PreAuthorize("@ss.hasPermi('political:officetask:export')")
    @Log(title = "办公任务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfOfficeTask cmfOfficeTask)
    {
        List<CmfOfficeTask> list = cmfOfficeTaskService.selectCmfOfficeTaskList(cmfOfficeTask);
        ExcelUtil<CmfOfficeTask> util = new ExcelUtil<CmfOfficeTask>(CmfOfficeTask.class);
        util.exportExcel(response, list, "办公任务数据");
    }

    /**
     * 获取办公任务详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:officetask:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfOfficeTaskService.selectCmfOfficeTaskById(id));
    }

    /**
     * 新增办公任务
     */
    @PreAuthorize("@ss.hasPermi('political:officetask:add')")
    @Log(title = "办公任务", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfOfficeTask cmfOfficeTask)
    {
        return toAjax(cmfOfficeTaskService.insertCmfOfficeTask(cmfOfficeTask));
    }

    /**
     * 修改办公任务
     */
    @PreAuthorize("@ss.hasPermi('political:officetask:edit')")
    @Log(title = "办公任务", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfOfficeTask cmfOfficeTask)
    {
        return toAjax(cmfOfficeTaskService.updateCmfOfficeTask(cmfOfficeTask));
    }

    /**
     * 删除办公任务
     */
    @PreAuthorize("@ss.hasPermi('political:officetask:remove')")
    @Log(title = "办公任务", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfOfficeTaskService.deleteCmfOfficeTaskByIds(ids));
    }
}
