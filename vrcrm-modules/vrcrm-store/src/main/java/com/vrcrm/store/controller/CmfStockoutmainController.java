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
import com.vrcrm.store.domain.CmfStockoutmain;
import com.vrcrm.store.service.ICmfStockoutmainService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 仓库出库Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/stockoutmain")
public class CmfStockoutmainController extends BaseController
{
    @Autowired
    private ICmfStockoutmainService cmfStockoutmainService;

    /**
     * 查询仓库出库列表
     */
    @PreAuthorize("@ss.hasPermi('store:stockoutmain:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfStockoutmain cmfStockoutmain)
    {
        startPage();
        List<CmfStockoutmain> list = cmfStockoutmainService.selectCmfStockoutmainList(cmfStockoutmain);
        return getDataTable(list);
    }

    /**
     * 导出仓库出库列表
     */
    @PreAuthorize("@ss.hasPermi('store:stockoutmain:export')")
    @Log(title = "仓库出库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfStockoutmain cmfStockoutmain)
    {
        List<CmfStockoutmain> list = cmfStockoutmainService.selectCmfStockoutmainList(cmfStockoutmain);
        ExcelUtil<CmfStockoutmain> util = new ExcelUtil<CmfStockoutmain>(CmfStockoutmain.class);
        util.exportExcel(response, list, "仓库出库数据");
    }

    /**
     * 获取仓库出库详细信息
     */
    @PreAuthorize("@ss.hasPermi('store:stockoutmain:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfStockoutmainService.selectCmfStockoutmainById(id));
    }

    /**
     * 新增仓库出库
     */
    @PreAuthorize("@ss.hasPermi('store:stockoutmain:add')")
    @Log(title = "仓库出库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfStockoutmain cmfStockoutmain)
    {
        return toAjax(cmfStockoutmainService.insertCmfStockoutmain(cmfStockoutmain));
    }

    /**
     * 修改仓库出库
     */
    @PreAuthorize("@ss.hasPermi('store:stockoutmain:edit')")
    @Log(title = "仓库出库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfStockoutmain cmfStockoutmain)
    {
        return toAjax(cmfStockoutmainService.updateCmfStockoutmain(cmfStockoutmain));
    }

    /**
     * 删除仓库出库
     */
    @PreAuthorize("@ss.hasPermi('store:stockoutmain:remove')")
    @Log(title = "仓库出库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfStockoutmainService.deleteCmfStockoutmainByIds(ids));
    }
}
