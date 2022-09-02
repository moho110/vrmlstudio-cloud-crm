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
import com.vrcrm.hr.domain.CmfHrmsLaboringskill;
import com.vrcrm.hr.service.ICmfHrmsLaboringskillService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 人员技能Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/laboringskill")
public class CmfHrmsLaboringskillController extends BaseController
{
    @Autowired
    private ICmfHrmsLaboringskillService cmfHrmsLaboringskillService;

    /**
     * 查询人员技能列表
     */
    @PreAuthorize("@ss.hasPermi('hr:laboringskill:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfHrmsLaboringskill cmfHrmsLaboringskill)
    {
        startPage();
        List<CmfHrmsLaboringskill> list = cmfHrmsLaboringskillService.selectCmfHrmsLaboringskillList(cmfHrmsLaboringskill);
        return getDataTable(list);
    }

    /**
     * 导出人员技能列表
     */
    @PreAuthorize("@ss.hasPermi('hr:laboringskill:export')")
    @Log(title = "人员技能", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfHrmsLaboringskill cmfHrmsLaboringskill)
    {
        List<CmfHrmsLaboringskill> list = cmfHrmsLaboringskillService.selectCmfHrmsLaboringskillList(cmfHrmsLaboringskill);
        ExcelUtil<CmfHrmsLaboringskill> util = new ExcelUtil<CmfHrmsLaboringskill>(CmfHrmsLaboringskill.class);
        util.exportExcel(response, list, "人员技能数据");
    }

    /**
     * 获取人员技能详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:laboringskill:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfHrmsLaboringskillService.selectCmfHrmsLaboringskillById(id));
    }

    /**
     * 新增人员技能
     */
    @PreAuthorize("@ss.hasPermi('hr:laboringskill:add')")
    @Log(title = "人员技能", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfHrmsLaboringskill cmfHrmsLaboringskill)
    {
        return toAjax(cmfHrmsLaboringskillService.insertCmfHrmsLaboringskill(cmfHrmsLaboringskill));
    }

    /**
     * 修改人员技能
     */
    @PreAuthorize("@ss.hasPermi('hr:laboringskill:edit')")
    @Log(title = "人员技能", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfHrmsLaboringskill cmfHrmsLaboringskill)
    {
        return toAjax(cmfHrmsLaboringskillService.updateCmfHrmsLaboringskill(cmfHrmsLaboringskill));
    }

    /**
     * 删除人员技能
     */
    @PreAuthorize("@ss.hasPermi('hr:laboringskill:remove')")
    @Log(title = "人员技能", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfHrmsLaboringskillService.deleteCmfHrmsLaboringskillByIds(ids));
    }
}
