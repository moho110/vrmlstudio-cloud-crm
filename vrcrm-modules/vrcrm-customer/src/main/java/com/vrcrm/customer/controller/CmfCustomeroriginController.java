package com.vrcrm.customer.controller;

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
import com.vrcrm.customer.domain.CmfCustomerorigin;
import com.vrcrm.customer.service.ICmfCustomeroriginService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 客户来源Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/customerorigin")
public class CmfCustomeroriginController extends BaseController
{
    @Autowired
    private ICmfCustomeroriginService cmfCustomeroriginService;

    /**
     * 查询客户来源列表
     */
    @PreAuthorize("@ss.hasPermi('customer:customerorigin:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfCustomerorigin cmfCustomerorigin)
    {
        startPage();
        List<CmfCustomerorigin> list = cmfCustomeroriginService.selectCmfCustomeroriginList(cmfCustomerorigin);
        return getDataTable(list);
    }

    /**
     * 导出客户来源列表
     */
    @PreAuthorize("@ss.hasPermi('customer:customerorigin:export')")
    @Log(title = "客户来源", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfCustomerorigin cmfCustomerorigin)
    {
        List<CmfCustomerorigin> list = cmfCustomeroriginService.selectCmfCustomeroriginList(cmfCustomerorigin);
        ExcelUtil<CmfCustomerorigin> util = new ExcelUtil<CmfCustomerorigin>(CmfCustomerorigin.class);
        util.exportExcel(response, list, "客户来源数据");
    }

    /**
     * 获取客户来源详细信息
     */
    @PreAuthorize("@ss.hasPermi('customer:customerorigin:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfCustomeroriginService.selectCmfCustomeroriginById(id));
    }

    /**
     * 新增客户来源
     */
    @PreAuthorize("@ss.hasPermi('customer:customerorigin:add')")
    @Log(title = "客户来源", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfCustomerorigin cmfCustomerorigin)
    {
        return toAjax(cmfCustomeroriginService.insertCmfCustomerorigin(cmfCustomerorigin));
    }

    /**
     * 修改客户来源
     */
    @PreAuthorize("@ss.hasPermi('customer:customerorigin:edit')")
    @Log(title = "客户来源", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfCustomerorigin cmfCustomerorigin)
    {
        return toAjax(cmfCustomeroriginService.updateCmfCustomerorigin(cmfCustomerorigin));
    }

    /**
     * 删除客户来源
     */
    @PreAuthorize("@ss.hasPermi('customer:customerorigin:remove')")
    @Log(title = "客户来源", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfCustomeroriginService.deleteCmfCustomeroriginByIds(ids));
    }
}
