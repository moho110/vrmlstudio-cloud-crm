package com.vrcrm.sales.controller;

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
import com.vrcrm.sales.domain.CmfCrmChance;
import com.vrcrm.sales.service.ICmfCrmChanceService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 销售机会Controller
 * 
 * @author VRer
 * @date 2022-04-14
 */
@RestController
@RequestMapping("/crmchance")
public class CmfCrmChanceController extends BaseController
{
    @Autowired
    private ICmfCrmChanceService cmfCrmChanceService;

    /**
     * 查询销售机会列表
     */
    @PreAuthorize("@ss.hasPermi('sales:chance:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfCrmChance cmfCrmChance)
    {
        startPage();
        List<CmfCrmChance> list = cmfCrmChanceService.selectCmfCrmChanceList(cmfCrmChance);
        return getDataTable(list);
    }

    /**
     * 导出销售机会列表
     */
    @PreAuthorize("@ss.hasPermi('sales:chance:export')")
    @Log(title = "销售机会", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfCrmChance cmfCrmChance)
    {
        List<CmfCrmChance> list = cmfCrmChanceService.selectCmfCrmChanceList(cmfCrmChance);
        ExcelUtil<CmfCrmChance> util = new ExcelUtil<CmfCrmChance>(CmfCrmChance.class);
        util.exportExcel(response, list, "销售机会数据");
    }

    /**
     * 获取销售机会详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:chance:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfCrmChanceService.selectCmfCrmChanceById(id));
    }

    /**
     * 新增销售机会
     */
    @PreAuthorize("@ss.hasPermi('sales:chance:add')")
    @Log(title = "销售机会", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfCrmChance cmfCrmChance)
    {
        return toAjax(cmfCrmChanceService.insertCmfCrmChance(cmfCrmChance));
    }

    /**
     * 修改销售机会
     */
    @PreAuthorize("@ss.hasPermi('sales:chance:edit')")
    @Log(title = "销售机会", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfCrmChance cmfCrmChance)
    {
        return toAjax(cmfCrmChanceService.updateCmfCrmChance(cmfCrmChance));
    }

    /**
     * 删除销售机会
     */
    @PreAuthorize("@ss.hasPermi('sales:chance:remove')")
    @Log(title = "销售机会", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfCrmChanceService.deleteCmfCrmChanceByIds(ids));
    }
}
