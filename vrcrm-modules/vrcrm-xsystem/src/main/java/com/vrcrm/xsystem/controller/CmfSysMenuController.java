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
import com.vrcrm.xsystem.domain.CmfSysMenu;
import com.vrcrm.xsystem.service.ICmfSysMenuService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;


/**
 * 系统菜单Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/sysmenu")
public class CmfSysMenuController extends BaseController
{
    @Autowired
    private ICmfSysMenuService cmfSysMenuService;

    /**
     * 查询系统菜单列表
     */
    @PreAuthorize("@ss.hasPermi('system:menu:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfSysMenu cmfSysMenu)
    {
        startPage();
        List<CmfSysMenu> list = cmfSysMenuService.selectCmfSysMenuList(cmfSysMenu);
        return getDataTable(list);
    }

    /**
     * 导出系统菜单列表
     */
    @PreAuthorize("@ss.hasPermi('system:menu:export')")
    @Log(title = "系统菜单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfSysMenu cmfSysMenu)
    {
        List<CmfSysMenu> list = cmfSysMenuService.selectCmfSysMenuList(cmfSysMenu);
        ExcelUtil<CmfSysMenu> util = new ExcelUtil<CmfSysMenu>(CmfSysMenu.class);
        util.exportExcel(response, list, "系统菜单数据");
    }

    /**
     * 获取系统菜单详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:menu:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfSysMenuService.selectCmfSysMenuById(id));
    }

    /**
     * 新增系统菜单
     */
    @PreAuthorize("@ss.hasPermi('system:menu:add')")
    @Log(title = "系统菜单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfSysMenu cmfSysMenu)
    {
        return toAjax(cmfSysMenuService.insertCmfSysMenu(cmfSysMenu));
    }

    /**
     * 修改系统菜单
     */
    @PreAuthorize("@ss.hasPermi('system:menu:edit')")
    @Log(title = "系统菜单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfSysMenu cmfSysMenu)
    {
        return toAjax(cmfSysMenuService.updateCmfSysMenu(cmfSysMenu));
    }

    /**
     * 删除系统菜单
     */
    @PreAuthorize("@ss.hasPermi('system:menu:remove')")
    @Log(title = "系统菜单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfSysMenuService.deleteCmfSysMenuByIds(ids));
    }
}
