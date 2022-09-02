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
import com.vrcrm.political.domain.CmfOfficeproductin;
import com.vrcrm.political.service.ICmfOfficeproductinService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 办公用品入库Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/officeproductin")
public class CmfOfficeproductinController extends BaseController
{
    @Autowired
    private ICmfOfficeproductinService cmfOfficeproductinService;

    /**
     * 查询办公用品入库列表
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductin:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfOfficeproductin cmfOfficeproductin)
    {
        startPage();
        List<CmfOfficeproductin> list = cmfOfficeproductinService.selectCmfOfficeproductinList(cmfOfficeproductin);
        return getDataTable(list);
    }

    /**
     * 导出办公用品入库列表
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductin:export')")
    @Log(title = "办公用品入库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfOfficeproductin cmfOfficeproductin)
    {
        List<CmfOfficeproductin> list = cmfOfficeproductinService.selectCmfOfficeproductinList(cmfOfficeproductin);
        ExcelUtil<CmfOfficeproductin> util = new ExcelUtil<CmfOfficeproductin>(CmfOfficeproductin.class);
        util.exportExcel(response, list, "办公用品入库数据");
    }

    /**
     * 获取办公用品入库详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductin:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfOfficeproductinService.selectCmfOfficeproductinById(id));
    }

    /**
     * 新增办公用品入库
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductin:add')")
    @Log(title = "办公用品入库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfOfficeproductin cmfOfficeproductin)
    {
        return toAjax(cmfOfficeproductinService.insertCmfOfficeproductin(cmfOfficeproductin));
    }

    /**
     * 修改办公用品入库
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductin:edit')")
    @Log(title = "办公用品入库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfOfficeproductin cmfOfficeproductin)
    {
        return toAjax(cmfOfficeproductinService.updateCmfOfficeproductin(cmfOfficeproductin));
    }

    /**
     * 删除办公用品入库
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductin:remove')")
    @Log(title = "办公用品入库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfOfficeproductinService.deleteCmfOfficeproductinByIds(ids));
    }
}
