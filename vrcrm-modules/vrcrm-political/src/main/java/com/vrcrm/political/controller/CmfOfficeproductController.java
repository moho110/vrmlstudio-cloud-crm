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
import com.vrcrm.political.domain.CmfOfficeproduct;
import com.vrcrm.political.service.ICmfOfficeproductService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 办公用品列表Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/officeproduct")
public class CmfOfficeproductController extends BaseController
{
    @Autowired
    private ICmfOfficeproductService cmfOfficeproductService;

    /**
     * 查询办公用品列表列表
     */
    @PreAuthorize("@ss.hasPermi('political:officeproduct:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfOfficeproduct cmfOfficeproduct)
    {
        startPage();
        List<CmfOfficeproduct> list = cmfOfficeproductService.selectCmfOfficeproductList(cmfOfficeproduct);
        return getDataTable(list);
    }

    /**
     * 导出办公用品列表列表
     */
    @PreAuthorize("@ss.hasPermi('political:officeproduct:export')")
    @Log(title = "办公用品列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfOfficeproduct cmfOfficeproduct)
    {
        List<CmfOfficeproduct> list = cmfOfficeproductService.selectCmfOfficeproductList(cmfOfficeproduct);
        ExcelUtil<CmfOfficeproduct> util = new ExcelUtil<CmfOfficeproduct>(CmfOfficeproduct.class);
        util.exportExcel(response, list, "办公用品列表数据");
    }

    /**
     * 获取办公用品列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:officeproduct:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfOfficeproductService.selectCmfOfficeproductById(id));
    }

    /**
     * 新增办公用品列表
     */
    @PreAuthorize("@ss.hasPermi('political:officeproduct:add')")
    @Log(title = "办公用品列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfOfficeproduct cmfOfficeproduct)
    {
        return toAjax(cmfOfficeproductService.insertCmfOfficeproduct(cmfOfficeproduct));
    }

    /**
     * 修改办公用品列表
     */
    @PreAuthorize("@ss.hasPermi('political:officeproduct:edit')")
    @Log(title = "办公用品列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfOfficeproduct cmfOfficeproduct)
    {
        return toAjax(cmfOfficeproductService.updateCmfOfficeproduct(cmfOfficeproduct));
    }

    /**
     * 删除办公用品列表
     */
    @PreAuthorize("@ss.hasPermi('political:officeproduct:remove')")
    @Log(title = "办公用品列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfOfficeproductService.deleteCmfOfficeproductByIds(ids));
    }
}
