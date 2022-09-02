package com.vrcrm.hr.controller;

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
import com.vrcrm.hr.domain.CmfEduSchoolcalendar;
import com.vrcrm.hr.service.ICmfEduSchoolcalendarService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 校历Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/schoolcalendar")
public class CmfEduSchoolcalendarController extends BaseController
{
    @Autowired
    private ICmfEduSchoolcalendarService cmfEduSchoolcalendarService;

    /**
     * 查询校历列表
     */
    @PreAuthorize("@ss.hasPermi('hr:schoolcalendar:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfEduSchoolcalendar cmfEduSchoolcalendar)
    {
        startPage();
        List<CmfEduSchoolcalendar> list = cmfEduSchoolcalendarService.selectCmfEduSchoolcalendarList(cmfEduSchoolcalendar);
        return getDataTable(list);
    }

    /**
     * 导出校历列表
     */
    @PreAuthorize("@ss.hasPermi('hr:schoolcalendar:export')")
    @Log(title = "校历", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfEduSchoolcalendar cmfEduSchoolcalendar)
    {
        List<CmfEduSchoolcalendar> list = cmfEduSchoolcalendarService.selectCmfEduSchoolcalendarList(cmfEduSchoolcalendar);
        ExcelUtil<CmfEduSchoolcalendar> util = new ExcelUtil<CmfEduSchoolcalendar>(CmfEduSchoolcalendar.class);
        util.exportExcel(response, list, "校历数据");
    }

    /**
     * 获取校历详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:schoolcalendar:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfEduSchoolcalendarService.selectCmfEduSchoolcalendarById(id));
    }

    /**
     * 新增校历
     */
    @PreAuthorize("@ss.hasPermi('hr:schoolcalendar:add')")
    @Log(title = "校历", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfEduSchoolcalendar cmfEduSchoolcalendar)
    {
        return toAjax(cmfEduSchoolcalendarService.insertCmfEduSchoolcalendar(cmfEduSchoolcalendar));
    }

    /**
     * 修改校历
     */
    @PreAuthorize("@ss.hasPermi('hr:schoolcalendar:edit')")
    @Log(title = "校历", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfEduSchoolcalendar cmfEduSchoolcalendar)
    {
        return toAjax(cmfEduSchoolcalendarService.updateCmfEduSchoolcalendar(cmfEduSchoolcalendar));
    }

    /**
     * 删除校历
     */
    @PreAuthorize("@ss.hasPermi('hr:schoolcalendar:remove')")
    @Log(title = "校历", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfEduSchoolcalendarService.deleteCmfEduSchoolcalendarByIds(ids));
    }
}
