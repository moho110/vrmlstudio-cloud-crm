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
import com.vrcrm.basicdata.domain.CmfProduct;
import com.vrcrm.basicdata.service.ICmfProductService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 产品Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/product")
public class CmfProductController extends BaseController
{
    @Autowired
    private ICmfProductService cmfProductService;

    /**
     * 查询产品列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:product:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfProduct cmfProduct)
    {
        startPage();
        List<CmfProduct> list = cmfProductService.selectCmfProductList(cmfProduct);
        return getDataTable(list);
    }

    /**
     * 导出产品列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:product:export')")
    @Log(title = "产品", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfProduct cmfProduct)
    {
        List<CmfProduct> list = cmfProductService.selectCmfProductList(cmfProduct);
        ExcelUtil<CmfProduct> util = new ExcelUtil<CmfProduct>(CmfProduct.class);
        util.exportExcel(response, list, "产品数据");
    }

    /**
     * 获取产品详细信息
     */
    @PreAuthorize("@ss.hasPermi('basicdata:product:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfProductService.selectCmfProductById(id));
    }

    /**
     * 新增产品
     */
    @PreAuthorize("@ss.hasPermi('basicdata:product:add')")
    @Log(title = "产品", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfProduct cmfProduct)
    {
        return toAjax(cmfProductService.insertCmfProduct(cmfProduct));
    }

    /**
     * 修改产品
     */
    @PreAuthorize("@ss.hasPermi('basicdata:product:edit')")
    @Log(title = "产品", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfProduct cmfProduct)
    {
        return toAjax(cmfProductService.updateCmfProduct(cmfProduct));
    }

    /**
     * 删除产品
     */
    @PreAuthorize("@ss.hasPermi('basicdata:product:remove')")
    @Log(title = "产品", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfProductService.deleteCmfProductByIds(ids));
    }
}
