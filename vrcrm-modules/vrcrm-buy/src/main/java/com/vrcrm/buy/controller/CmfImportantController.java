package com.vrcrm.buy.controller;

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
import com.vrcrm.buy.domain.CmfImportant;
import com.vrcrm.buy.service.ICmfImportantService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 重要性Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/important")
public class CmfImportantController extends BaseController
{
    @Autowired
    private ICmfImportantService cmfImportantService;

    /**
     * 查询重要性列表
     */
    @PreAuthorize("@ss.hasPermi('buy:important:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfImportant cmfImportant)
    {
        startPage();
        List<CmfImportant> list = cmfImportantService.selectCmfImportantList(cmfImportant);
        return getDataTable(list);
    }

    /**
     * 导出重要性列表
     */
    @PreAuthorize("@ss.hasPermi('buy:important:export')")
    @Log(title = "重要性", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfImportant cmfImportant)
    {
        List<CmfImportant> list = cmfImportantService.selectCmfImportantList(cmfImportant);
        ExcelUtil<CmfImportant> util = new ExcelUtil<CmfImportant>(CmfImportant.class);
        util.exportExcel(response, list, "重要性数据");
    }

    /**
     * 获取重要性详细信息
     */
    @PreAuthorize("@ss.hasPermi('buy:important:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfImportantService.selectCmfImportantById(id));
    }

    /**
     * 新增重要性
     */
    @PreAuthorize("@ss.hasPermi('buy:important:add')")
    @Log(title = "重要性", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfImportant cmfImportant)
    {
        return toAjax(cmfImportantService.insertCmfImportant(cmfImportant));
    }

    /**
     * 修改重要性
     */
    @PreAuthorize("@ss.hasPermi('buy:important:edit')")
    @Log(title = "重要性", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfImportant cmfImportant)
    {
        return toAjax(cmfImportantService.updateCmfImportant(cmfImportant));
    }

    /**
     * 删除重要性
     */
    @PreAuthorize("@ss.hasPermi('buy:important:remove')")
    @Log(title = "重要性", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfImportantService.deleteCmfImportantByIds(ids));
    }
}
