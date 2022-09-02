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
import com.vrcrm.sales.domain.CmfCrmChanceRate;
import com.vrcrm.sales.service.ICmfCrmChanceRateService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 销售机会成功率Controller
 * 
 * @author VRer
 * @date 2022-04-14
 */
@RestController
@RequestMapping("/crmchancerate")
public class CmfCrmChanceRateController extends BaseController
{
    @Autowired
    private ICmfCrmChanceRateService cmfCrmChanceRateService;

    /**
     * 查询销售机会成功率列表
     */
    @PreAuthorize("@ss.hasPermi('sales:chancerate:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfCrmChanceRate cmfCrmChanceRate)
    {
        startPage();
        List<CmfCrmChanceRate> list = cmfCrmChanceRateService.selectCmfCrmChanceRateList(cmfCrmChanceRate);
        return getDataTable(list);
    }

    /**
     * 导出销售机会成功率列表
     */
    @PreAuthorize("@ss.hasPermi('sales:chancerate:export')")
    @Log(title = "销售机会成功率", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfCrmChanceRate cmfCrmChanceRate)
    {
        List<CmfCrmChanceRate> list = cmfCrmChanceRateService.selectCmfCrmChanceRateList(cmfCrmChanceRate);
        ExcelUtil<CmfCrmChanceRate> util = new ExcelUtil<CmfCrmChanceRate>(CmfCrmChanceRate.class);
        util.exportExcel(response, list, "销售机会成功率数据");
    }

    /**
     * 获取销售机会成功率详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:chancerate:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfCrmChanceRateService.selectCmfCrmChanceRateById(id));
    }

    /**
     * 新增销售机会成功率
     */
    @PreAuthorize("@ss.hasPermi('sales:chancerate:add')")
    @Log(title = "销售机会成功率", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfCrmChanceRate cmfCrmChanceRate)
    {
        return toAjax(cmfCrmChanceRateService.insertCmfCrmChanceRate(cmfCrmChanceRate));
    }

    /**
     * 修改销售机会成功率
     */
    @PreAuthorize("@ss.hasPermi('sales:chancerate:edit')")
    @Log(title = "销售机会成功率", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfCrmChanceRate cmfCrmChanceRate)
    {
        return toAjax(cmfCrmChanceRateService.updateCmfCrmChanceRate(cmfCrmChanceRate));
    }

    /**
     * 删除销售机会成功率
     */
    @PreAuthorize("@ss.hasPermi('sales:chancerate:remove')")
    @Log(title = "销售机会成功率", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfCrmChanceRateService.deleteCmfCrmChanceRateByIds(ids));
    }
}
