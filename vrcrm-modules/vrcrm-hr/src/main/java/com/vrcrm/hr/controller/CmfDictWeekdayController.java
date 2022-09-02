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
import com.vrcrm.hr.domain.CmfDictWeekday;
import com.vrcrm.hr.service.ICmfDictWeekdayService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 周工作日Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/dictweekday")
public class CmfDictWeekdayController extends BaseController
{
    @Autowired
    private ICmfDictWeekdayService cmfDictWeekdayService;

    /**
     * 查询周工作日列表
     */
    @PreAuthorize("@ss.hasPermi('hr:dictweekday:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfDictWeekday cmfDictWeekday)
    {
        startPage();
        List<CmfDictWeekday> list = cmfDictWeekdayService.selectCmfDictWeekdayList(cmfDictWeekday);
        return getDataTable(list);
    }

    /**
     * 导出周工作日列表
     */
    @PreAuthorize("@ss.hasPermi('hr:dictweekday:export')")
    @Log(title = "周工作日", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfDictWeekday cmfDictWeekday)
    {
        List<CmfDictWeekday> list = cmfDictWeekdayService.selectCmfDictWeekdayList(cmfDictWeekday);
        ExcelUtil<CmfDictWeekday> util = new ExcelUtil<CmfDictWeekday>(CmfDictWeekday.class);
        util.exportExcel(response, list, "周工作日数据");
    }

    /**
     * 获取周工作日详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:dictweekday:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfDictWeekdayService.selectCmfDictWeekdayById(id));
    }

    /**
     * 新增周工作日
     */
    @PreAuthorize("@ss.hasPermi('hr:dictweekday:add')")
    @Log(title = "周工作日", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfDictWeekday cmfDictWeekday)
    {
        return toAjax(cmfDictWeekdayService.insertCmfDictWeekday(cmfDictWeekday));
    }

    /**
     * 修改周工作日
     */
    @PreAuthorize("@ss.hasPermi('hr:dictweekday:edit')")
    @Log(title = "周工作日", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfDictWeekday cmfDictWeekday)
    {
        return toAjax(cmfDictWeekdayService.updateCmfDictWeekday(cmfDictWeekday));
    }

    /**
     * 删除周工作日
     */
    @PreAuthorize("@ss.hasPermi('hr:dictweekday:remove')")
    @Log(title = "周工作日", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfDictWeekdayService.deleteCmfDictWeekdayByIds(ids));
    }
}
