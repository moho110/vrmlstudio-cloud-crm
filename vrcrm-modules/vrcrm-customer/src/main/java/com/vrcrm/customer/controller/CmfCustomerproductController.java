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
import com.vrcrm.customer.domain.CmfCustomerproduct;
import com.vrcrm.customer.service.ICmfCustomerproductService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 产品列表Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/customerproduct")
public class CmfCustomerproductController extends BaseController
{
    @Autowired
    private ICmfCustomerproductService cmfCustomerproductService;

    /**
     * 查询产品列表列表
     */
    @PreAuthorize("@ss.hasPermi('customer:customerproduct:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfCustomerproduct cmfCustomerproduct)
    {
        startPage();
        List<CmfCustomerproduct> list = cmfCustomerproductService.selectCmfCustomerproductList(cmfCustomerproduct);
        return getDataTable(list);
    }

    /**
     * 导出产品列表列表
     */
    @PreAuthorize("@ss.hasPermi('customer:customerproduct:export')")
    @Log(title = "产品列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfCustomerproduct cmfCustomerproduct)
    {
        List<CmfCustomerproduct> list = cmfCustomerproductService.selectCmfCustomerproductList(cmfCustomerproduct);
        ExcelUtil<CmfCustomerproduct> util = new ExcelUtil<CmfCustomerproduct>(CmfCustomerproduct.class);
        util.exportExcel(response, list, "产品列表数据");
    }

    /**
     * 获取产品列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('customer:customerproduct:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfCustomerproductService.selectCmfCustomerproductById(id));
    }

    /**
     * 新增产品列表
     */
    @PreAuthorize("@ss.hasPermi('customer:customerproduct:add')")
    @Log(title = "产品列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfCustomerproduct cmfCustomerproduct)
    {
        return toAjax(cmfCustomerproductService.insertCmfCustomerproduct(cmfCustomerproduct));
    }

    /**
     * 修改产品列表
     */
    @PreAuthorize("@ss.hasPermi('customer:customerproduct:edit')")
    @Log(title = "产品列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfCustomerproduct cmfCustomerproduct)
    {
        return toAjax(cmfCustomerproductService.updateCmfCustomerproduct(cmfCustomerproduct));
    }

    /**
     * 删除产品列表
     */
    @PreAuthorize("@ss.hasPermi('customer:customerproduct:remove')")
    @Log(title = "产品列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfCustomerproductService.deleteCmfCustomerproductByIds(ids));
    }
}
