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
import com.vrcrm.political.domain.CmfOfficeproductbaofei;
import com.vrcrm.political.service.ICmfOfficeproductbaofeiService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 办公用品报废Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/officeproductbaofei")
public class CmfOfficeproductbaofeiController extends BaseController
{
    @Autowired
    private ICmfOfficeproductbaofeiService cmfOfficeproductbaofeiService;

    /**
     * 查询办公用品报废列表
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductbaofei:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfOfficeproductbaofei cmfOfficeproductbaofei)
    {
        startPage();
        List<CmfOfficeproductbaofei> list = cmfOfficeproductbaofeiService.selectCmfOfficeproductbaofeiList(cmfOfficeproductbaofei);
        return getDataTable(list);
    }

    /**
     * 导出办公用品报废列表
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductbaofei:export')")
    @Log(title = "办公用品报废", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfOfficeproductbaofei cmfOfficeproductbaofei)
    {
        List<CmfOfficeproductbaofei> list = cmfOfficeproductbaofeiService.selectCmfOfficeproductbaofeiList(cmfOfficeproductbaofei);
        ExcelUtil<CmfOfficeproductbaofei> util = new ExcelUtil<CmfOfficeproductbaofei>(CmfOfficeproductbaofei.class);
        util.exportExcel(response, list, "办公用品报废数据");
    }

    /**
     * 获取办公用品报废详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductbaofei:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfOfficeproductbaofeiService.selectCmfOfficeproductbaofeiById(id));
    }

    /**
     * 新增办公用品报废
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductbaofei:add')")
    @Log(title = "办公用品报废", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfOfficeproductbaofei cmfOfficeproductbaofei)
    {
        return toAjax(cmfOfficeproductbaofeiService.insertCmfOfficeproductbaofei(cmfOfficeproductbaofei));
    }

    /**
     * 修改办公用品报废
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductbaofei:edit')")
    @Log(title = "办公用品报废", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfOfficeproductbaofei cmfOfficeproductbaofei)
    {
        return toAjax(cmfOfficeproductbaofeiService.updateCmfOfficeproductbaofei(cmfOfficeproductbaofei));
    }

    /**
     * 删除办公用品报废
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductbaofei:remove')")
    @Log(title = "办公用品报废", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfOfficeproductbaofeiService.deleteCmfOfficeproductbaofeiByIds(ids));
    }
}
