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
import com.vrcrm.xsystem.domain.CmfSystemLogall;
import com.vrcrm.xsystem.service.ICmfSystemLogallService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 系统操作日志Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/systemlogall")
public class CmfSystemLogallController extends BaseController
{
    @Autowired
    private ICmfSystemLogallService cmfSystemLogallService;

    /**
     * 查询系统操作日志列表
     */
    @PreAuthorize("@ss.hasPermi('system:logall:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfSystemLogall cmfSystemLogall)
    {
        startPage();
        List<CmfSystemLogall> list = cmfSystemLogallService.selectCmfSystemLogallList(cmfSystemLogall);
        return getDataTable(list);
    }

    /**
     * 导出系统操作日志列表
     */
    @PreAuthorize("@ss.hasPermi('system:logall:export')")
    @Log(title = "系统操作日志", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfSystemLogall cmfSystemLogall)
    {
        List<CmfSystemLogall> list = cmfSystemLogallService.selectCmfSystemLogallList(cmfSystemLogall);
        ExcelUtil<CmfSystemLogall> util = new ExcelUtil<CmfSystemLogall>(CmfSystemLogall.class);
        util.exportExcel(response, list, "系统操作日志数据");
    }

    /**
     * 获取系统操作日志详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:logall:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfSystemLogallService.selectCmfSystemLogallById(id));
    }

    /**
     * 新增系统操作日志
     */
    @PreAuthorize("@ss.hasPermi('system:logall:add')")
    @Log(title = "系统操作日志", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfSystemLogall cmfSystemLogall)
    {
        return toAjax(cmfSystemLogallService.insertCmfSystemLogall(cmfSystemLogall));
    }

    /**
     * 修改系统操作日志
     */
    @PreAuthorize("@ss.hasPermi('system:logall:edit')")
    @Log(title = "系统操作日志", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfSystemLogall cmfSystemLogall)
    {
        return toAjax(cmfSystemLogallService.updateCmfSystemLogall(cmfSystemLogall));
    }

    /**
     * 删除系统操作日志
     */
    @PreAuthorize("@ss.hasPermi('system:logall:remove')")
    @Log(title = "系统操作日志", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfSystemLogallService.deleteCmfSystemLogallByIds(ids));
    }
}
