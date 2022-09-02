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
import com.vrcrm.mytable.domain.CmfCalendarType;
import com.vrcrm.mytable.service.ICmfCalendarTypeService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 日程类型Controller
 * 
 * @author VRer
 * @date 2022-04-14
 */
@RestController
@RequestMapping("/calendartype")
public class CmfCalendarTypeController extends BaseController
{
    @Autowired
    private ICmfCalendarTypeService cmfCalendarTypeService;

    /**
     * 查询日程类型列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:calendartype:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfCalendarType cmfCalendarType)
    {
        startPage();
        List<CmfCalendarType> list = cmfCalendarTypeService.selectCmfCalendarTypeList(cmfCalendarType);
        return getDataTable(list);
    }

    /**
     * 导出日程类型列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:calendartype:export')")
    @Log(title = "日程类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfCalendarType cmfCalendarType)
    {
        List<CmfCalendarType> list = cmfCalendarTypeService.selectCmfCalendarTypeList(cmfCalendarType);
        ExcelUtil<CmfCalendarType> util = new ExcelUtil<CmfCalendarType>(CmfCalendarType.class);
        util.exportExcel(response, list, "日程类型数据");
    }

    /**
     * 获取日程类型详细信息
     */
    @PreAuthorize("@ss.hasPermi('mytable:calendartype:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfCalendarTypeService.selectCmfCalendarTypeById(id));
    }

    /**
     * 新增日程类型
     */
    @PreAuthorize("@ss.hasPermi('mytable:calendartype:add')")
    @Log(title = "日程类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfCalendarType cmfCalendarType)
    {
        return toAjax(cmfCalendarTypeService.insertCmfCalendarType(cmfCalendarType));
    }

    /**
     * 修改日程类型
     */
    @PreAuthorize("@ss.hasPermi('mytable:calendartype:edit')")
    @Log(title = "日程类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfCalendarType cmfCalendarType)
    {
        return toAjax(cmfCalendarTypeService.updateCmfCalendarType(cmfCalendarType));
    }

    /**
     * 删除日程类型
     */
    @PreAuthorize("@ss.hasPermi('mytable:calendartype:remove')")
    @Log(title = "日程类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfCalendarTypeService.deleteCmfCalendarTypeByIds(ids));
    }
}
