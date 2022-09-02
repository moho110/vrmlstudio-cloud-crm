package com.vrcrm.mytable.controller;

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
import com.vrcrm.mytable.domain.CmfWorkplanstate;
import com.vrcrm.mytable.service.ICmfWorkplanstateService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 工作计划状态Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/workplanstate")
public class CmfWorkplanstateController extends BaseController
{
    @Autowired
    private ICmfWorkplanstateService cmfWorkplanstateService;

    /**
     * 查询工作计划状态列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanstate:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfWorkplanstate cmfWorkplanstate)
    {
        startPage();
        List<CmfWorkplanstate> list = cmfWorkplanstateService.selectCmfWorkplanstateList(cmfWorkplanstate);
        return getDataTable(list);
    }

    /**
     * 导出工作计划状态列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanstate:export')")
    @Log(title = "工作计划状态", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfWorkplanstate cmfWorkplanstate)
    {
        List<CmfWorkplanstate> list = cmfWorkplanstateService.selectCmfWorkplanstateList(cmfWorkplanstate);
        ExcelUtil<CmfWorkplanstate> util = new ExcelUtil<CmfWorkplanstate>(CmfWorkplanstate.class);
        util.exportExcel(response, list, "工作计划状态数据");
    }

    /**
     * 获取工作计划状态详细信息
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanstate:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfWorkplanstateService.selectCmfWorkplanstateById(id));
    }

    /**
     * 新增工作计划状态
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanstate:add')")
    @Log(title = "工作计划状态", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfWorkplanstate cmfWorkplanstate)
    {
        return toAjax(cmfWorkplanstateService.insertCmfWorkplanstate(cmfWorkplanstate));
    }

    /**
     * 修改工作计划状态
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanstate:edit')")
    @Log(title = "工作计划状态", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfWorkplanstate cmfWorkplanstate)
    {
        return toAjax(cmfWorkplanstateService.updateCmfWorkplanstate(cmfWorkplanstate));
    }

    /**
     * 删除工作计划状态
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanstate:remove')")
    @Log(title = "工作计划状态", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfWorkplanstateService.deleteCmfWorkplanstateByIds(ids));
    }
}
