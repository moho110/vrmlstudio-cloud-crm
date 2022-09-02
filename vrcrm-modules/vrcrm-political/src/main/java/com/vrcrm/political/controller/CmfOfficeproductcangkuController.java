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
import com.vrcrm.political.domain.CmfOfficeproductcangku;
import com.vrcrm.political.service.ICmfOfficeproductcangkuService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 办公用品仓库Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/officeproductcangku")
public class CmfOfficeproductcangkuController extends BaseController
{
    @Autowired
    private ICmfOfficeproductcangkuService cmfOfficeproductcangkuService;

    /**
     * 查询办公用品仓库列表
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductcangku:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfOfficeproductcangku cmfOfficeproductcangku)
    {
        startPage();
        List<CmfOfficeproductcangku> list = cmfOfficeproductcangkuService.selectCmfOfficeproductcangkuList(cmfOfficeproductcangku);
        return getDataTable(list);
    }

    /**
     * 导出办公用品仓库列表
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductcangku:export')")
    @Log(title = "办公用品仓库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfOfficeproductcangku cmfOfficeproductcangku)
    {
        List<CmfOfficeproductcangku> list = cmfOfficeproductcangkuService.selectCmfOfficeproductcangkuList(cmfOfficeproductcangku);
        ExcelUtil<CmfOfficeproductcangku> util = new ExcelUtil<CmfOfficeproductcangku>(CmfOfficeproductcangku.class);
        util.exportExcel(response, list, "办公用品仓库数据");
    }

    /**
     * 获取办公用品仓库详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductcangku:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfOfficeproductcangkuService.selectCmfOfficeproductcangkuById(id));
    }

    /**
     * 新增办公用品仓库
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductcangku:add')")
    @Log(title = "办公用品仓库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfOfficeproductcangku cmfOfficeproductcangku)
    {
        return toAjax(cmfOfficeproductcangkuService.insertCmfOfficeproductcangku(cmfOfficeproductcangku));
    }

    /**
     * 修改办公用品仓库
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductcangku:edit')")
    @Log(title = "办公用品仓库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfOfficeproductcangku cmfOfficeproductcangku)
    {
        return toAjax(cmfOfficeproductcangkuService.updateCmfOfficeproductcangku(cmfOfficeproductcangku));
    }

    /**
     * 删除办公用品仓库
     */
    @PreAuthorize("@ss.hasPermi('political:officeproductcangku:remove')")
    @Log(title = "办公用品仓库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfOfficeproductcangkuService.deleteCmfOfficeproductcangkuByIds(ids));
    }
}
