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
import com.vrcrm.mytable.domain.CmfCrmMytableWz;
import com.vrcrm.mytable.service.ICmfCrmMytableWzService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 桌面显示位置表Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/mytablewz")
public class CmfCrmMytableWzController extends BaseController
{
    @Autowired
    private ICmfCrmMytableWzService cmfCrmMytableWzService;

    /**
     * 查询桌面显示位置表列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:mytablewz:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfCrmMytableWz cmfCrmMytableWz)
    {
        startPage();
        List<CmfCrmMytableWz> list = cmfCrmMytableWzService.selectCmfCrmMytableWzList(cmfCrmMytableWz);
        return getDataTable(list);
    }

    /**
     * 导出桌面显示位置表列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:mytablewz:export')")
    @Log(title = "桌面显示位置表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfCrmMytableWz cmfCrmMytableWz)
    {
        List<CmfCrmMytableWz> list = cmfCrmMytableWzService.selectCmfCrmMytableWzList(cmfCrmMytableWz);
        ExcelUtil<CmfCrmMytableWz> util = new ExcelUtil<CmfCrmMytableWz>(CmfCrmMytableWz.class);
        util.exportExcel(response, list, "桌面显示位置表数据");
    }

    /**
     * 获取桌面显示位置表详细信息
     */
    @PreAuthorize("@ss.hasPermi('mytable:mytablewz:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfCrmMytableWzService.selectCmfCrmMytableWzById(id));
    }

    /**
     * 新增桌面显示位置表
     */
    @PreAuthorize("@ss.hasPermi('mytable:mytablewz:add')")
    @Log(title = "桌面显示位置表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfCrmMytableWz cmfCrmMytableWz)
    {
        return toAjax(cmfCrmMytableWzService.insertCmfCrmMytableWz(cmfCrmMytableWz));
    }

    /**
     * 修改桌面显示位置表
     */
    @PreAuthorize("@ss.hasPermi('mytable:mytablewz:edit')")
    @Log(title = "桌面显示位置表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfCrmMytableWz cmfCrmMytableWz)
    {
        return toAjax(cmfCrmMytableWzService.updateCmfCrmMytableWz(cmfCrmMytableWz));
    }

    /**
     * 删除桌面显示位置表
     */
    @PreAuthorize("@ss.hasPermi('mytable:mytablewz:remove')")
    @Log(title = "桌面显示位置表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfCrmMytableWzService.deleteCmfCrmMytableWzByIds(ids));
    }
}
