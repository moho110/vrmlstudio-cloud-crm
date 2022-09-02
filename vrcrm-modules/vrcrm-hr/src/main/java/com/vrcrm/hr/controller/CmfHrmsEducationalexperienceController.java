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
import com.vrcrm.hr.domain.CmfHrmsEducationalexperience;
import com.vrcrm.hr.service.ICmfHrmsEducationalexperienceService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 教育经历Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/educationalexperience")
public class CmfHrmsEducationalexperienceController extends BaseController
{
    @Autowired
    private ICmfHrmsEducationalexperienceService cmfHrmsEducationalexperienceService;

    /**
     * 查询教育经历列表
     */
    @PreAuthorize("@ss.hasPermi('hr:educationalexperience:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfHrmsEducationalexperience cmfHrmsEducationalexperience)
    {
        startPage();
        List<CmfHrmsEducationalexperience> list = cmfHrmsEducationalexperienceService.selectCmfHrmsEducationalexperienceList(cmfHrmsEducationalexperience);
        return getDataTable(list);
    }

    /**
     * 导出教育经历列表
     */
    @PreAuthorize("@ss.hasPermi('hr:educationalexperience:export')")
    @Log(title = "教育经历", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfHrmsEducationalexperience cmfHrmsEducationalexperience)
    {
        List<CmfHrmsEducationalexperience> list = cmfHrmsEducationalexperienceService.selectCmfHrmsEducationalexperienceList(cmfHrmsEducationalexperience);
        ExcelUtil<CmfHrmsEducationalexperience> util = new ExcelUtil<CmfHrmsEducationalexperience>(CmfHrmsEducationalexperience.class);
        util.exportExcel(response, list, "教育经历数据");
    }

    /**
     * 获取教育经历详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:educationalexperience:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfHrmsEducationalexperienceService.selectCmfHrmsEducationalexperienceById(id));
    }

    /**
     * 新增教育经历
     */
    @PreAuthorize("@ss.hasPermi('hr:educationalexperience:add')")
    @Log(title = "教育经历", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfHrmsEducationalexperience cmfHrmsEducationalexperience)
    {
        return toAjax(cmfHrmsEducationalexperienceService.insertCmfHrmsEducationalexperience(cmfHrmsEducationalexperience));
    }

    /**
     * 修改教育经历
     */
    @PreAuthorize("@ss.hasPermi('hr:educationalexperience:edit')")
    @Log(title = "教育经历", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfHrmsEducationalexperience cmfHrmsEducationalexperience)
    {
        return toAjax(cmfHrmsEducationalexperienceService.updateCmfHrmsEducationalexperience(cmfHrmsEducationalexperience));
    }

    /**
     * 删除教育经历
     */
    @PreAuthorize("@ss.hasPermi('hr:educationalexperience:remove')")
    @Log(title = "教育经历", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfHrmsEducationalexperienceService.deleteCmfHrmsEducationalexperienceByIds(ids));
    }
}
