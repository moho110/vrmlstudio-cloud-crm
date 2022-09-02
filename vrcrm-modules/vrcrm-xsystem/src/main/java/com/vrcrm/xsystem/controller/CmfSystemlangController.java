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
import com.vrcrm.xsystem.domain.CmfSystemlang;
import com.vrcrm.xsystem.service.ICmfSystemlangService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 系统语言Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/systemlang")
public class CmfSystemlangController extends BaseController
{
    @Autowired
    private ICmfSystemlangService cmfSystemlangService;

    /**
     * 查询系统语言列表
     */
    @PreAuthorize("@ss.hasPermi('system:systemlang:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfSystemlang cmfSystemlang)
    {
        startPage();
        List<CmfSystemlang> list = cmfSystemlangService.selectCmfSystemlangList(cmfSystemlang);
        return getDataTable(list);
    }

    /**
     * 导出系统语言列表
     */
    @PreAuthorize("@ss.hasPermi('system:systemlang:export')")
    @Log(title = "系统语言", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfSystemlang cmfSystemlang)
    {
        List<CmfSystemlang> list = cmfSystemlangService.selectCmfSystemlangList(cmfSystemlang);
        ExcelUtil<CmfSystemlang> util = new ExcelUtil<CmfSystemlang>(CmfSystemlang.class);
        util.exportExcel(response, list, "系统语言数据");
    }

    /**
     * 获取系统语言详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:systemlang:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfSystemlangService.selectCmfSystemlangById(id));
    }

    /**
     * 新增系统语言
     */
    @PreAuthorize("@ss.hasPermi('system:systemlang:add')")
    @Log(title = "系统语言", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfSystemlang cmfSystemlang)
    {
        return toAjax(cmfSystemlangService.insertCmfSystemlang(cmfSystemlang));
    }

    /**
     * 修改系统语言
     */
    @PreAuthorize("@ss.hasPermi('system:systemlang:edit')")
    @Log(title = "系统语言", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfSystemlang cmfSystemlang)
    {
        return toAjax(cmfSystemlangService.updateCmfSystemlang(cmfSystemlang));
    }

    /**
     * 删除系统语言
     */
    @PreAuthorize("@ss.hasPermi('system:systemlang:remove')")
    @Log(title = "系统语言", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfSystemlangService.deleteCmfSystemlangByIds(ids));
    }
}
