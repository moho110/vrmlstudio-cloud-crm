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
import com.vrcrm.customer.domain.CmfCustomerarea;
import com.vrcrm.customer.service.ICmfCustomerareaService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 客户区域Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/customerarea")
public class CmfCustomerareaController extends BaseController
{
    @Autowired
    private ICmfCustomerareaService cmfCustomerareaService;

    /**
     * 查询客户区域列表
     */
    @PreAuthorize("@ss.hasPermi('customer:customerarea:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfCustomerarea cmfCustomerarea)
    {
        startPage();
        List<CmfCustomerarea> list = cmfCustomerareaService.selectCmfCustomerareaList(cmfCustomerarea);
        return getDataTable(list);
    }

    /**
     * 导出客户区域列表
     */
    @PreAuthorize("@ss.hasPermi('customer:customerarea:export')")
    @Log(title = "客户区域", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfCustomerarea cmfCustomerarea)
    {
        List<CmfCustomerarea> list = cmfCustomerareaService.selectCmfCustomerareaList(cmfCustomerarea);
        ExcelUtil<CmfCustomerarea> util = new ExcelUtil<CmfCustomerarea>(CmfCustomerarea.class);
        util.exportExcel(response, list, "客户区域数据");
    }

    /**
     * 获取客户区域详细信息
     */
    @PreAuthorize("@ss.hasPermi('customer:customerarea:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfCustomerareaService.selectCmfCustomerareaById(id));
    }

    /**
     * 新增客户区域
     */
    @PreAuthorize("@ss.hasPermi('customer:customerarea:add')")
    @Log(title = "客户区域", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfCustomerarea cmfCustomerarea)
    {
        return toAjax(cmfCustomerareaService.insertCmfCustomerarea(cmfCustomerarea));
    }

    /**
     * 修改客户区域
     */
    @PreAuthorize("@ss.hasPermi('customer:customerarea:edit')")
    @Log(title = "客户区域", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfCustomerarea cmfCustomerarea)
    {
        return toAjax(cmfCustomerareaService.updateCmfCustomerarea(cmfCustomerarea));
    }

    /**
     * 删除客户区域
     */
    @PreAuthorize("@ss.hasPermi('customer:customerarea:remove')")
    @Log(title = "客户区域", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfCustomerareaService.deleteCmfCustomerareaByIds(ids));
    }
}
