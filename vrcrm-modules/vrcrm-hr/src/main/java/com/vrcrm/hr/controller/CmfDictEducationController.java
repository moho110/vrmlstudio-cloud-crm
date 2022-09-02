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
import com.vrcrm.hr.domain.CmfDictEducation;
import com.vrcrm.hr.service.ICmfDictEducationService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 教育明细Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/dicteducation")
public class CmfDictEducationController extends BaseController
{
    @Autowired
    private ICmfDictEducationService cmfDictEducationService;

    /**
     * 查询教育明细列表
     */
    @PreAuthorize("@ss.hasPermi('hr:dicteducation:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfDictEducation cmfDictEducation)
    {
        startPage();
        List<CmfDictEducation> list = cmfDictEducationService.selectCmfDictEducationList(cmfDictEducation);
        return getDataTable(list);
    }

    /**
     * 导出教育明细列表
     */
    @PreAuthorize("@ss.hasPermi('hr:dicteducation:export')")
    @Log(title = "教育明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfDictEducation cmfDictEducation)
    {
        List<CmfDictEducation> list = cmfDictEducationService.selectCmfDictEducationList(cmfDictEducation);
        ExcelUtil<CmfDictEducation> util = new ExcelUtil<CmfDictEducation>(CmfDictEducation.class);
        util.exportExcel(response, list, "教育明细数据");
    }

    /**
     * 获取教育明细详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:dicteducation:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfDictEducationService.selectCmfDictEducationById(id));
    }

    /**
     * 新增教育明细
     */
    @PreAuthorize("@ss.hasPermi('hr:dicteducation:add')")
    @Log(title = "教育明细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfDictEducation cmfDictEducation)
    {
        return toAjax(cmfDictEducationService.insertCmfDictEducation(cmfDictEducation));
    }

    /**
     * 修改教育明细
     */
    @PreAuthorize("@ss.hasPermi('hr:dicteducation:edit')")
    @Log(title = "教育明细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfDictEducation cmfDictEducation)
    {
        return toAjax(cmfDictEducationService.updateCmfDictEducation(cmfDictEducation));
    }

    /**
     * 删除教育明细
     */
    @PreAuthorize("@ss.hasPermi('hr:dicteducation:remove')")
    @Log(title = "教育明细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfDictEducationService.deleteCmfDictEducationByIds(ids));
    }
}
