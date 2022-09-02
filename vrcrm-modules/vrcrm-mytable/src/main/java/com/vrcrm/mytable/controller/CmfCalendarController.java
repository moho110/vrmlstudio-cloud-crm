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
import com.vrcrm.mytable.domain.CmfCalendar;
import com.vrcrm.mytable.service.ICmfCalendarService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 日程安排Controller
 * 
 * @author VRer
 * @date 2022-04-14
 */
@RestController
@RequestMapping("/calendar")
public class CmfCalendarController extends BaseController
{
    @Autowired
    private ICmfCalendarService cmfCalendarService;

    /**
     * 查询日程安排列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:calendar:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfCalendar cmfCalendar)
    {
        startPage();
        List<CmfCalendar> list = cmfCalendarService.selectCmfCalendarList(cmfCalendar);
        return getDataTable(list);
    }

    /**
     * 导出日程安排列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:calendar:export')")
    @Log(title = "日程安排", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfCalendar cmfCalendar)
    {
        List<CmfCalendar> list = cmfCalendarService.selectCmfCalendarList(cmfCalendar);
        ExcelUtil<CmfCalendar> util = new ExcelUtil<CmfCalendar>(CmfCalendar.class);
        util.exportExcel(response, list, "日程安排数据");
    }

    /**
     * 获取日程安排详细信息
     */
    @PreAuthorize("@ss.hasPermi('mytable:calendar:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(cmfCalendarService.selectCmfCalendarById(id));
    }

    /**
     * 新增日程安排
     */
    @PreAuthorize("@ss.hasPermi('mytable:calendar:add')")
    @Log(title = "日程安排", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfCalendar cmfCalendar)
    {
        return toAjax(cmfCalendarService.insertCmfCalendar(cmfCalendar));
    }

    /**
     * 修改日程安排
     */
    @PreAuthorize("@ss.hasPermi('mytable:calendar:edit')")
    @Log(title = "日程安排", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfCalendar cmfCalendar)
    {
        return toAjax(cmfCalendarService.updateCmfCalendar(cmfCalendar));
    }

    /**
     * 删除日程安排
     */
    @PreAuthorize("@ss.hasPermi('mytable:calendar:remove')")
    @Log(title = "日程安排", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(cmfCalendarService.deleteCmfCalendarByIds(ids));
    }
}
