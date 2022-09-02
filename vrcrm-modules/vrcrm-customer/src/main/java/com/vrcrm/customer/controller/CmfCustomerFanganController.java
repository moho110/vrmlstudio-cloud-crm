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
import com.vrcrm.customer.domain.CmfCustomerFangan;
import com.vrcrm.customer.service.ICmfCustomerFanganService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 客户方案Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/fangan")
public class CmfCustomerFanganController extends BaseController
{
    @Autowired
    private ICmfCustomerFanganService cmfCustomerFanganService;

    /**
     * 查询客户方案列表
     */
    @PreAuthorize("@ss.hasPermi('customer:fangan:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfCustomerFangan cmfCustomerFangan)
    {
        startPage();
        List<CmfCustomerFangan> list = cmfCustomerFanganService.selectCmfCustomerFanganList(cmfCustomerFangan);
        return getDataTable(list);
    }

    /**
     * 导出客户方案列表
     */
    @PreAuthorize("@ss.hasPermi('customer:fangan:export')")
    @Log(title = "客户方案", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfCustomerFangan cmfCustomerFangan)
    {
        List<CmfCustomerFangan> list = cmfCustomerFanganService.selectCmfCustomerFanganList(cmfCustomerFangan);
        ExcelUtil<CmfCustomerFangan> util = new ExcelUtil<CmfCustomerFangan>(CmfCustomerFangan.class);
        util.exportExcel(response, list, "客户方案数据");
    }

    /**
     * 获取客户方案详细信息
     */
    @PreAuthorize("@ss.hasPermi('customer:fangan:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfCustomerFanganService.selectCmfCustomerFanganById(id));
    }

    /**
     * 新增客户方案
     */
    @PreAuthorize("@ss.hasPermi('customer:fangan:add')")
    @Log(title = "客户方案", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfCustomerFangan cmfCustomerFangan)
    {
        return toAjax(cmfCustomerFanganService.insertCmfCustomerFangan(cmfCustomerFangan));
    }

    /**
     * 修改客户方案
     */
    @PreAuthorize("@ss.hasPermi('customer:fangan:edit')")
    @Log(title = "客户方案", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfCustomerFangan cmfCustomerFangan)
    {
        return toAjax(cmfCustomerFanganService.updateCmfCustomerFangan(cmfCustomerFangan));
    }

    /**
     * 删除客户方案
     */
    @PreAuthorize("@ss.hasPermi('customer:fangan:remove')")
    @Log(title = "客户方案", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfCustomerFanganService.deleteCmfCustomerFanganByIds(ids));
    }
}
