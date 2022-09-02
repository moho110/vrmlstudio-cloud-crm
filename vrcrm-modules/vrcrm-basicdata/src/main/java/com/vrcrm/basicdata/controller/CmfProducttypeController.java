package com.vrcrm.basicdata.controller;

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
import com.vrcrm.basicdata.domain.CmfProducttype;
import com.vrcrm.basicdata.service.ICmfProducttypeService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 产品类型Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/producttype")
public class CmfProducttypeController extends BaseController
{
    @Autowired
    private ICmfProducttypeService cmfProducttypeService;

    /**
     * 查询产品类型列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:producttype:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfProducttype cmfProducttype)
    {
        startPage();
        List<CmfProducttype> list = cmfProducttypeService.selectCmfProducttypeList(cmfProducttype);
        return getDataTable(list);
    }

    /**
     * 导出产品类型列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:producttype:export')")
    @Log(title = "产品类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfProducttype cmfProducttype)
    {
        List<CmfProducttype> list = cmfProducttypeService.selectCmfProducttypeList(cmfProducttype);
        ExcelUtil<CmfProducttype> util = new ExcelUtil<CmfProducttype>(CmfProducttype.class);
        util.exportExcel(response, list, "产品类型数据");
    }

    /**
     * 获取产品类型详细信息
     */
    @PreAuthorize("@ss.hasPermi('basicdata:producttype:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfProducttypeService.selectCmfProducttypeById(id));
    }

    /**
     * 新增产品类型
     */
    @PreAuthorize("@ss.hasPermi('basicdata:producttype:add')")
    @Log(title = "产品类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfProducttype cmfProducttype)
    {
        return toAjax(cmfProducttypeService.insertCmfProducttype(cmfProducttype));
    }

    /**
     * 修改产品类型
     */
    @PreAuthorize("@ss.hasPermi('basicdata:producttype:edit')")
    @Log(title = "产品类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfProducttype cmfProducttype)
    {
        return toAjax(cmfProducttypeService.updateCmfProducttype(cmfProducttype));
    }

    /**
     * 删除产品类型
     */
    @PreAuthorize("@ss.hasPermi('basicdata:producttype:remove')")
    @Log(title = "产品类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfProducttypeService.deleteCmfProducttypeByIds(ids));
    }
}
