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
import com.vrcrm.customer.domain.CmfCustomerproductDetail;
import com.vrcrm.customer.service.ICmfCustomerproductDetailService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 产品明细表Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/customerproductdetail")
public class CmfCustomerproductDetailController extends BaseController
{
    @Autowired
    private ICmfCustomerproductDetailService cmfCustomerproductDetailService;

    /**
     * 查询产品明细表列表
     */
    @PreAuthorize("@ss.hasPermi('customer:customerproductdetail:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfCustomerproductDetail cmfCustomerproductDetail)
    {
        startPage();
        List<CmfCustomerproductDetail> list = cmfCustomerproductDetailService.selectCmfCustomerproductDetailList(cmfCustomerproductDetail);
        return getDataTable(list);
    }

    /**
     * 导出产品明细表列表
     */
    @PreAuthorize("@ss.hasPermi('customer:customerproductdetail:export')")
    @Log(title = "产品明细表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfCustomerproductDetail cmfCustomerproductDetail)
    {
        List<CmfCustomerproductDetail> list = cmfCustomerproductDetailService.selectCmfCustomerproductDetailList(cmfCustomerproductDetail);
        ExcelUtil<CmfCustomerproductDetail> util = new ExcelUtil<CmfCustomerproductDetail>(CmfCustomerproductDetail.class);
        util.exportExcel(response, list, "产品明细表数据");
    }

    /**
     * 获取产品明细表详细信息
     */
    @PreAuthorize("@ss.hasPermi('customer:customerproductdetail:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfCustomerproductDetailService.selectCmfCustomerproductDetailById(id));
    }

    /**
     * 新增产品明细表
     */
    @PreAuthorize("@ss.hasPermi('customer:customerproductdetail:add')")
    @Log(title = "产品明细表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfCustomerproductDetail cmfCustomerproductDetail)
    {
        return toAjax(cmfCustomerproductDetailService.insertCmfCustomerproductDetail(cmfCustomerproductDetail));
    }

    /**
     * 修改产品明细表
     */
    @PreAuthorize("@ss.hasPermi('customer:customerproductdetail:edit')")
    @Log(title = "产品明细表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfCustomerproductDetail cmfCustomerproductDetail)
    {
        return toAjax(cmfCustomerproductDetailService.updateCmfCustomerproductDetail(cmfCustomerproductDetail));
    }

    /**
     * 删除产品明细表
     */
    @PreAuthorize("@ss.hasPermi('customer:customerproductdetail:remove')")
    @Log(title = "产品明细表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfCustomerproductDetailService.deleteCmfCustomerproductDetailByIds(ids));
    }
}
