package com.vrcrm.store.controller;

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
import com.vrcrm.store.domain.CmfStoreaccesstype;
import com.vrcrm.store.service.ICmfStoreaccesstypeService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 库存处理类型Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/storeaccesstype")
public class CmfStoreaccesstypeController extends BaseController
{
    @Autowired
    private ICmfStoreaccesstypeService cmfStoreaccesstypeService;

    /**
     * 查询库存处理类型列表
     */
    @PreAuthorize("@ss.hasPermi('store:storeaccesstype:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfStoreaccesstype cmfStoreaccesstype)
    {
        startPage();
        List<CmfStoreaccesstype> list = cmfStoreaccesstypeService.selectCmfStoreaccesstypeList(cmfStoreaccesstype);
        return getDataTable(list);
    }

    /**
     * 导出库存处理类型列表
     */
    @PreAuthorize("@ss.hasPermi('store:storeaccesstype:export')")
    @Log(title = "库存处理类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfStoreaccesstype cmfStoreaccesstype)
    {
        List<CmfStoreaccesstype> list = cmfStoreaccesstypeService.selectCmfStoreaccesstypeList(cmfStoreaccesstype);
        ExcelUtil<CmfStoreaccesstype> util = new ExcelUtil<CmfStoreaccesstype>(CmfStoreaccesstype.class);
        util.exportExcel(response, list, "库存处理类型数据");
    }

    /**
     * 获取库存处理类型详细信息
     */
    @PreAuthorize("@ss.hasPermi('store:storeaccesstype:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfStoreaccesstypeService.selectCmfStoreaccesstypeById(id));
    }

    /**
     * 新增库存处理类型
     */
    @PreAuthorize("@ss.hasPermi('store:storeaccesstype:add')")
    @Log(title = "库存处理类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfStoreaccesstype cmfStoreaccesstype)
    {
        return toAjax(cmfStoreaccesstypeService.insertCmfStoreaccesstype(cmfStoreaccesstype));
    }

    /**
     * 修改库存处理类型
     */
    @PreAuthorize("@ss.hasPermi('store:storeaccesstype:edit')")
    @Log(title = "库存处理类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfStoreaccesstype cmfStoreaccesstype)
    {
        return toAjax(cmfStoreaccesstypeService.updateCmfStoreaccesstype(cmfStoreaccesstype));
    }

    /**
     * 删除库存处理类型
     */
    @PreAuthorize("@ss.hasPermi('store:storeaccesstype:remove')")
    @Log(title = "库存处理类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfStoreaccesstypeService.deleteCmfStoreaccesstypeByIds(ids));
    }
}
