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
import com.vrcrm.customer.domain.CmfCustomerbelong;
import com.vrcrm.customer.service.ICmfCustomerbelongService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 客户所属Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/customerbelong")
public class CmfCustomerbelongController extends BaseController
{
    @Autowired
    private ICmfCustomerbelongService cmfCustomerbelongService;

    /**
     * 查询客户所属列表
     */
    @PreAuthorize("@ss.hasPermi('customer:customerbelong:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfCustomerbelong cmfCustomerbelong)
    {
        startPage();
        List<CmfCustomerbelong> list = cmfCustomerbelongService.selectCmfCustomerbelongList(cmfCustomerbelong);
        return getDataTable(list);
    }

    /**
     * 导出客户所属列表
     */
    @PreAuthorize("@ss.hasPermi('customer:customerbelong:export')")
    @Log(title = "客户所属", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfCustomerbelong cmfCustomerbelong)
    {
        List<CmfCustomerbelong> list = cmfCustomerbelongService.selectCmfCustomerbelongList(cmfCustomerbelong);
        ExcelUtil<CmfCustomerbelong> util = new ExcelUtil<CmfCustomerbelong>(CmfCustomerbelong.class);
        util.exportExcel(response, list, "客户所属数据");
    }

    /**
     * 获取客户所属详细信息
     */
    @PreAuthorize("@ss.hasPermi('customer:customerbelong:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfCustomerbelongService.selectCmfCustomerbelongById(id));
    }

    /**
     * 新增客户所属
     */
    @PreAuthorize("@ss.hasPermi('customer:customerbelong:add')")
    @Log(title = "客户所属", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfCustomerbelong cmfCustomerbelong)
    {
        return toAjax(cmfCustomerbelongService.insertCmfCustomerbelong(cmfCustomerbelong));
    }

    /**
     * 修改客户所属
     */
    @PreAuthorize("@ss.hasPermi('customer:customerbelong:edit')")
    @Log(title = "客户所属", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfCustomerbelong cmfCustomerbelong)
    {
        return toAjax(cmfCustomerbelongService.updateCmfCustomerbelong(cmfCustomerbelong));
    }

    /**
     * 删除客户所属
     */
    @PreAuthorize("@ss.hasPermi('customer:customerbelong:remove')")
    @Log(title = "客户所属", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfCustomerbelongService.deleteCmfCustomerbelongByIds(ids));
    }
}
