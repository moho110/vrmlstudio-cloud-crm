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
import com.vrcrm.store.domain.CmfStockchangestate;
import com.vrcrm.store.service.ICmfStockchangestateService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 仓库管理调拔状态Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/stockchangestate")
public class CmfStockchangestateController extends BaseController
{
    @Autowired
    private ICmfStockchangestateService cmfStockchangestateService;

    /**
     * 查询仓库管理调拔状态列表
     */
    @PreAuthorize("@ss.hasPermi('store:stockchangestate:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfStockchangestate cmfStockchangestate)
    {
        startPage();
        List<CmfStockchangestate> list = cmfStockchangestateService.selectCmfStockchangestateList(cmfStockchangestate);
        return getDataTable(list);
    }

    /**
     * 导出仓库管理调拔状态列表
     */
    @PreAuthorize("@ss.hasPermi('store:stockchangestate:export')")
    @Log(title = "仓库管理调拔状态", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfStockchangestate cmfStockchangestate)
    {
        List<CmfStockchangestate> list = cmfStockchangestateService.selectCmfStockchangestateList(cmfStockchangestate);
        ExcelUtil<CmfStockchangestate> util = new ExcelUtil<CmfStockchangestate>(CmfStockchangestate.class);
        util.exportExcel(response, list, "仓库管理调拔状态数据");
    }

    /**
     * 获取仓库管理调拔状态详细信息
     */
    @PreAuthorize("@ss.hasPermi('store:stockchangestate:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfStockchangestateService.selectCmfStockchangestateById(id));
    }

    /**
     * 新增仓库管理调拔状态
     */
    @PreAuthorize("@ss.hasPermi('store:stockchangestate:add')")
    @Log(title = "仓库管理调拔状态", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfStockchangestate cmfStockchangestate)
    {
        return toAjax(cmfStockchangestateService.insertCmfStockchangestate(cmfStockchangestate));
    }

    /**
     * 修改仓库管理调拔状态
     */
    @PreAuthorize("@ss.hasPermi('store:stockchangestate:edit')")
    @Log(title = "仓库管理调拔状态", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfStockchangestate cmfStockchangestate)
    {
        return toAjax(cmfStockchangestateService.updateCmfStockchangestate(cmfStockchangestate));
    }

    /**
     * 删除仓库管理调拔状态
     */
    @PreAuthorize("@ss.hasPermi('store:stockchangestate:remove')")
    @Log(title = "仓库管理调拔状态", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfStockchangestateService.deleteCmfStockchangestateByIds(ids));
    }
}
