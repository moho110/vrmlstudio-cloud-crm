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
import com.vrcrm.political.domain.CmfDictSatisfaction;
import com.vrcrm.political.service.ICmfDictSatisfactionService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 满意度Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/dictsatisfaction")
public class CmfDictSatisfactionController extends BaseController
{
    @Autowired
    private ICmfDictSatisfactionService cmfDictSatisfactionService;

    /**
     * 查询满意度列表
     */
    @PreAuthorize("@ss.hasPermi('political:satisfaction:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfDictSatisfaction cmfDictSatisfaction)
    {
        startPage();
        List<CmfDictSatisfaction> list = cmfDictSatisfactionService.selectCmfDictSatisfactionList(cmfDictSatisfaction);
        return getDataTable(list);
    }

    /**
     * 导出满意度列表
     */
    @PreAuthorize("@ss.hasPermi('political:satisfaction:export')")
    @Log(title = "满意度", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfDictSatisfaction cmfDictSatisfaction)
    {
        List<CmfDictSatisfaction> list = cmfDictSatisfactionService.selectCmfDictSatisfactionList(cmfDictSatisfaction);
        ExcelUtil<CmfDictSatisfaction> util = new ExcelUtil<CmfDictSatisfaction>(CmfDictSatisfaction.class);
        util.exportExcel(response, list, "满意度数据");
    }

    /**
     * 获取满意度详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:satisfaction:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfDictSatisfactionService.selectCmfDictSatisfactionById(id));
    }

    /**
     * 新增满意度
     */
    @PreAuthorize("@ss.hasPermi('political:satisfaction:add')")
    @Log(title = "满意度", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfDictSatisfaction cmfDictSatisfaction)
    {
        return toAjax(cmfDictSatisfactionService.insertCmfDictSatisfaction(cmfDictSatisfaction));
    }

    /**
     * 修改满意度
     */
    @PreAuthorize("@ss.hasPermi('political:satisfaction:edit')")
    @Log(title = "满意度", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfDictSatisfaction cmfDictSatisfaction)
    {
        return toAjax(cmfDictSatisfactionService.updateCmfDictSatisfaction(cmfDictSatisfaction));
    }

    /**
     * 删除满意度
     */
    @PreAuthorize("@ss.hasPermi('political:satisfaction:remove')")
    @Log(title = "满意度", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfDictSatisfactionService.deleteCmfDictSatisfactionByIds(ids));
    }
}
