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
import com.vrcrm.customer.domain.CmfCrmCustomerMove;
import com.vrcrm.customer.service.ICmfCrmCustomerMoveService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 客户移除Controller
 * 
 * @author VRer
 * @date 2022-04-14
 */
@RestController
@RequestMapping("/customermove")
public class CmfCrmCustomerMoveController extends BaseController
{
    @Autowired
    private ICmfCrmCustomerMoveService cmfCrmCustomerMoveService;

    /**
     * 查询客户移除列表
     */
    @PreAuthorize("@ss.hasPermi('customer:customermove:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfCrmCustomerMove cmfCrmCustomerMove)
    {
        startPage();
        List<CmfCrmCustomerMove> list = cmfCrmCustomerMoveService.selectCmfCrmCustomerMoveList(cmfCrmCustomerMove);
        return getDataTable(list);
    }

    /**
     * 导出客户移除列表
     */
    @PreAuthorize("@ss.hasPermi('customer:customermove:export')")
    @Log(title = "客户移除", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfCrmCustomerMove cmfCrmCustomerMove)
    {
        List<CmfCrmCustomerMove> list = cmfCrmCustomerMoveService.selectCmfCrmCustomerMoveList(cmfCrmCustomerMove);
        ExcelUtil<CmfCrmCustomerMove> util = new ExcelUtil<CmfCrmCustomerMove>(CmfCrmCustomerMove.class);
        util.exportExcel(response, list, "客户移除数据");
    }

    /**
     * 获取客户移除详细信息
     */
    @PreAuthorize("@ss.hasPermi('customer:customermove:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfCrmCustomerMoveService.selectCmfCrmCustomerMoveById(id));
    }

    /**
     * 新增客户移除
     */
    @PreAuthorize("@ss.hasPermi('customer:customermove:add')")
    @Log(title = "客户移除", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfCrmCustomerMove cmfCrmCustomerMove)
    {
        return toAjax(cmfCrmCustomerMoveService.insertCmfCrmCustomerMove(cmfCrmCustomerMove));
    }

    /**
     * 修改客户移除
     */
    @PreAuthorize("@ss.hasPermi('customer:customermove:edit')")
    @Log(title = "客户移除", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfCrmCustomerMove cmfCrmCustomerMove)
    {
        return toAjax(cmfCrmCustomerMoveService.updateCmfCrmCustomerMove(cmfCrmCustomerMove));
    }

    /**
     * 删除客户移除
     */
    @PreAuthorize("@ss.hasPermi('customer:customermove:remove')")
    @Log(title = "客户移除", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfCrmCustomerMoveService.deleteCmfCrmCustomerMoveByIds(ids));
    }
}
