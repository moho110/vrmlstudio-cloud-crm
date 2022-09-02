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
import com.vrcrm.political.domain.CmfGbMarriage;
import com.vrcrm.political.service.ICmfGbMarriageService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 婚否Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/marriage")
public class CmfGbMarriageController extends BaseController
{
    @Autowired
    private ICmfGbMarriageService cmfGbMarriageService;

    /**
     * 查询婚否列表
     */
    @PreAuthorize("@ss.hasPermi('political:marriage:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfGbMarriage cmfGbMarriage)
    {
        startPage();
        List<CmfGbMarriage> list = cmfGbMarriageService.selectCmfGbMarriageList(cmfGbMarriage);
        return getDataTable(list);
    }

    /**
     * 导出婚否列表
     */
    @PreAuthorize("@ss.hasPermi('political:marriage:export')")
    @Log(title = "婚否", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfGbMarriage cmfGbMarriage)
    {
        List<CmfGbMarriage> list = cmfGbMarriageService.selectCmfGbMarriageList(cmfGbMarriage);
        ExcelUtil<CmfGbMarriage> util = new ExcelUtil<CmfGbMarriage>(CmfGbMarriage.class);
        util.exportExcel(response, list, "婚否数据");
    }

    /**
     * 获取婚否详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:marriage:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfGbMarriageService.selectCmfGbMarriageById(id));
    }

    /**
     * 新增婚否
     */
    @PreAuthorize("@ss.hasPermi('political:marriage:add')")
    @Log(title = "婚否", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfGbMarriage cmfGbMarriage)
    {
        return toAjax(cmfGbMarriageService.insertCmfGbMarriage(cmfGbMarriage));
    }

    /**
     * 修改婚否
     */
    @PreAuthorize("@ss.hasPermi('political:marriage:edit')")
    @Log(title = "婚否", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfGbMarriage cmfGbMarriage)
    {
        return toAjax(cmfGbMarriageService.updateCmfGbMarriage(cmfGbMarriage));
    }

    /**
     * 删除婚否
     */
    @PreAuthorize("@ss.hasPermi('political:marriage:remove')")
    @Log(title = "婚否", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfGbMarriageService.deleteCmfGbMarriageByIds(ids));
    }
}
