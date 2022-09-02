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
import com.vrcrm.xsystem.domain.CmfSystemhelp;
import com.vrcrm.xsystem.service.ICmfSystemhelpService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 系统帮助Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/systemhelp")
public class CmfSystemhelpController extends BaseController
{
    @Autowired
    private ICmfSystemhelpService cmfSystemhelpService;

    /**
     * 查询系统帮助列表
     */
    @PreAuthorize("@ss.hasPermi('system:systemhelp:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfSystemhelp cmfSystemhelp)
    {
        startPage();
        List<CmfSystemhelp> list = cmfSystemhelpService.selectCmfSystemhelpList(cmfSystemhelp);
        return getDataTable(list);
    }

    /**
     * 导出系统帮助列表
     */
    @PreAuthorize("@ss.hasPermi('system:systemhelp:export')")
    @Log(title = "系统帮助", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfSystemhelp cmfSystemhelp)
    {
        List<CmfSystemhelp> list = cmfSystemhelpService.selectCmfSystemhelpList(cmfSystemhelp);
        ExcelUtil<CmfSystemhelp> util = new ExcelUtil<CmfSystemhelp>(CmfSystemhelp.class);
        util.exportExcel(response, list, "系统帮助数据");
    }

    /**
     * 获取系统帮助详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:systemhelp:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfSystemhelpService.selectCmfSystemhelpById(id));
    }

    /**
     * 新增系统帮助
     */
    @PreAuthorize("@ss.hasPermi('system:systemhelp:add')")
    @Log(title = "系统帮助", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfSystemhelp cmfSystemhelp)
    {
        return toAjax(cmfSystemhelpService.insertCmfSystemhelp(cmfSystemhelp));
    }

    /**
     * 修改系统帮助
     */
    @PreAuthorize("@ss.hasPermi('system:systemhelp:edit')")
    @Log(title = "系统帮助", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfSystemhelp cmfSystemhelp)
    {
        return toAjax(cmfSystemhelpService.updateCmfSystemhelp(cmfSystemhelp));
    }

    /**
     * 删除系统帮助
     */
    @PreAuthorize("@ss.hasPermi('system:systemhelp:remove')")
    @Log(title = "系统帮助", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfSystemhelpService.deleteCmfSystemhelpByIds(ids));
    }
}
