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
import com.vrcrm.political.domain.CmfWuBoolean;
import com.vrcrm.political.service.ICmfWuBooleanService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 是否Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/wuboolean")
public class CmfWuBooleanController extends BaseController
{
    @Autowired
    private ICmfWuBooleanService cmfWuBooleanService;

    /**
     * 查询是否列表
     */
    @PreAuthorize("@ss.hasPermi('political:wuboolean:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfWuBoolean cmfWuBoolean)
    {
        startPage();
        List<CmfWuBoolean> list = cmfWuBooleanService.selectCmfWuBooleanList(cmfWuBoolean);
        return getDataTable(list);
    }

    /**
     * 导出是否列表
     */
    @PreAuthorize("@ss.hasPermi('political:wuboolean:export')")
    @Log(title = "是否", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfWuBoolean cmfWuBoolean)
    {
        List<CmfWuBoolean> list = cmfWuBooleanService.selectCmfWuBooleanList(cmfWuBoolean);
        ExcelUtil<CmfWuBoolean> util = new ExcelUtil<CmfWuBoolean>(CmfWuBoolean.class);
        util.exportExcel(response, list, "是否数据");
    }

    /**
     * 获取是否详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:wuboolean:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfWuBooleanService.selectCmfWuBooleanById(id));
    }

    /**
     * 新增是否
     */
    @PreAuthorize("@ss.hasPermi('political:wuboolean:add')")
    @Log(title = "是否", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfWuBoolean cmfWuBoolean)
    {
        return toAjax(cmfWuBooleanService.insertCmfWuBoolean(cmfWuBoolean));
    }

    /**
     * 修改是否
     */
    @PreAuthorize("@ss.hasPermi('political:wuboolean:edit')")
    @Log(title = "是否", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfWuBoolean cmfWuBoolean)
    {
        return toAjax(cmfWuBooleanService.updateCmfWuBoolean(cmfWuBoolean));
    }

    /**
     * 删除是否
     */
    @PreAuthorize("@ss.hasPermi('political:wuboolean:remove')")
    @Log(title = "是否", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfWuBooleanService.deleteCmfWuBooleanByIds(ids));
    }
}
