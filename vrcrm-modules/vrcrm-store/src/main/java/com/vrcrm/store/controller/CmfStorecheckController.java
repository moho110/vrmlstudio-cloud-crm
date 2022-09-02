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
import com.vrcrm.store.domain.CmfStorecheck;
import com.vrcrm.store.service.ICmfStorecheckService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 库存盘点Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/storecheck")
public class CmfStorecheckController extends BaseController
{
    @Autowired
    private ICmfStorecheckService cmfStorecheckService;

    /**
     * 查询库存盘点列表
     */
    @PreAuthorize("@ss.hasPermi('store:storecheck:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfStorecheck cmfStorecheck)
    {
        startPage();
        List<CmfStorecheck> list = cmfStorecheckService.selectCmfStorecheckList(cmfStorecheck);
        return getDataTable(list);
    }

    /**
     * 导出库存盘点列表
     */
    @PreAuthorize("@ss.hasPermi('store:storecheck:export')")
    @Log(title = "库存盘点", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfStorecheck cmfStorecheck)
    {
        List<CmfStorecheck> list = cmfStorecheckService.selectCmfStorecheckList(cmfStorecheck);
        ExcelUtil<CmfStorecheck> util = new ExcelUtil<CmfStorecheck>(CmfStorecheck.class);
        util.exportExcel(response, list, "库存盘点数据");
    }

    /**
     * 获取库存盘点详细信息
     */
    @PreAuthorize("@ss.hasPermi('store:storecheck:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfStorecheckService.selectCmfStorecheckById(id));
    }

    /**
     * 新增库存盘点
     */
    @PreAuthorize("@ss.hasPermi('store:storecheck:add')")
    @Log(title = "库存盘点", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfStorecheck cmfStorecheck)
    {
        return toAjax(cmfStorecheckService.insertCmfStorecheck(cmfStorecheck));
    }

    /**
     * 修改库存盘点
     */
    @PreAuthorize("@ss.hasPermi('store:storecheck:edit')")
    @Log(title = "库存盘点", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfStorecheck cmfStorecheck)
    {
        return toAjax(cmfStorecheckService.updateCmfStorecheck(cmfStorecheck));
    }

    /**
     * 删除库存盘点
     */
    @PreAuthorize("@ss.hasPermi('store:storecheck:remove')")
    @Log(title = "库存盘点", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfStorecheckService.deleteCmfStorecheckByIds(ids));
    }
}
