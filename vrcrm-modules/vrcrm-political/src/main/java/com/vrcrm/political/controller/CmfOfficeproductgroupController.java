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
import com.vrcrm.political.domain.CmfOfficeproductgroup;
import com.vrcrm.political.service.ICmfOfficeproductgroupService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 办公用品分类Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/officeproductgroup")
public class CmfOfficeproductgroupController extends BaseController
{
    @Autowired
    private ICmfOfficeproductgroupService cmfOfficeproductgroupService;

    /**
     * 查询办公用品分类列表
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductgroup:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfOfficeproductgroup cmfOfficeproductgroup)
    {
        startPage();
        List<CmfOfficeproductgroup> list = cmfOfficeproductgroupService.selectCmfOfficeproductgroupList(cmfOfficeproductgroup);
        return getDataTable(list);
    }

    /**
     * 导出办公用品分类列表
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductgroup:export')")
    @Log(title = "办公用品分类", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfOfficeproductgroup cmfOfficeproductgroup)
    {
        List<CmfOfficeproductgroup> list = cmfOfficeproductgroupService.selectCmfOfficeproductgroupList(cmfOfficeproductgroup);
        ExcelUtil<CmfOfficeproductgroup> util = new ExcelUtil<CmfOfficeproductgroup>(CmfOfficeproductgroup.class);
        util.exportExcel(response, list, "办公用品分类数据");
    }

    /**
     * 获取办公用品分类详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductgroup:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfOfficeproductgroupService.selectCmfOfficeproductgroupById(id));
    }

    /**
     * 新增办公用品分类
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductgroup:add')")
    @Log(title = "办公用品分类", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfOfficeproductgroup cmfOfficeproductgroup)
    {
        return toAjax(cmfOfficeproductgroupService.insertCmfOfficeproductgroup(cmfOfficeproductgroup));
    }

    /**
     * 修改办公用品分类
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductgroup:edit')")
    @Log(title = "办公用品分类", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfOfficeproductgroup cmfOfficeproductgroup)
    {
        return toAjax(cmfOfficeproductgroupService.updateCmfOfficeproductgroup(cmfOfficeproductgroup));
    }

    /**
     * 删除办公用品分类
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductgroup:remove')")
    @Log(title = "办公用品分类", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfOfficeproductgroupService.deleteCmfOfficeproductgroupByIds(ids));
    }
}
