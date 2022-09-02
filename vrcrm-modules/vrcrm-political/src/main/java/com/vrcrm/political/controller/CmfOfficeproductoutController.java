package com.vrcrm.political.controller;

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
import com.vrcrm.political.domain.CmfOfficeproductout;
import com.vrcrm.political.service.ICmfOfficeproductoutService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 办公用品出库Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/officeproductout")
public class CmfOfficeproductoutController extends BaseController
{
    @Autowired
    private ICmfOfficeproductoutService cmfOfficeproductoutService;

    /**
     * 查询办公用品出库列表
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductout:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfOfficeproductout cmfOfficeproductout)
    {
        startPage();
        List<CmfOfficeproductout> list = cmfOfficeproductoutService.selectCmfOfficeproductoutList(cmfOfficeproductout);
        return getDataTable(list);
    }

    /**
     * 导出办公用品出库列表
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductout:export')")
    @Log(title = "办公用品出库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfOfficeproductout cmfOfficeproductout)
    {
        List<CmfOfficeproductout> list = cmfOfficeproductoutService.selectCmfOfficeproductoutList(cmfOfficeproductout);
        ExcelUtil<CmfOfficeproductout> util = new ExcelUtil<CmfOfficeproductout>(CmfOfficeproductout.class);
        util.exportExcel(response, list, "办公用品出库数据");
    }

    /**
     * 获取办公用品出库详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductout:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfOfficeproductoutService.selectCmfOfficeproductoutById(id));
    }

    /**
     * 新增办公用品出库
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductout:add')")
    @Log(title = "办公用品出库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfOfficeproductout cmfOfficeproductout)
    {
        return toAjax(cmfOfficeproductoutService.insertCmfOfficeproductout(cmfOfficeproductout));
    }

    /**
     * 修改办公用品出库
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductout:edit')")
    @Log(title = "办公用品出库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfOfficeproductout cmfOfficeproductout)
    {
        return toAjax(cmfOfficeproductoutService.updateCmfOfficeproductout(cmfOfficeproductout));
    }

    /**
     * 删除办公用品出库
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductout:remove')")
    @Log(title = "办公用品出库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfOfficeproductoutService.deleteCmfOfficeproductoutByIds(ids));
    }
}
