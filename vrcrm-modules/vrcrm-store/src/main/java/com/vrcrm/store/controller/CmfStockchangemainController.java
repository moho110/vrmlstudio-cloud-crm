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
import com.vrcrm.store.domain.CmfStockchangemain;
import com.vrcrm.store.service.ICmfStockchangemainService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 仓库管理调拔Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/stockchangemain")
public class CmfStockchangemainController extends BaseController
{
    @Autowired
    private ICmfStockchangemainService cmfStockchangemainService;

    /**
     * 查询仓库管理调拔列表
     */
    @PreAuthorize("@ss.hasPermi('store:stockchangemain:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfStockchangemain cmfStockchangemain)
    {
        startPage();
        List<CmfStockchangemain> list = cmfStockchangemainService.selectCmfStockchangemainList(cmfStockchangemain);
        return getDataTable(list);
    }

    /**
     * 导出仓库管理调拔列表
     */
    @PreAuthorize("@ss.hasPermi('store:stockchangemain:export')")
    @Log(title = "仓库管理调拔", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfStockchangemain cmfStockchangemain)
    {
        List<CmfStockchangemain> list = cmfStockchangemainService.selectCmfStockchangemainList(cmfStockchangemain);
        ExcelUtil<CmfStockchangemain> util = new ExcelUtil<CmfStockchangemain>(CmfStockchangemain.class);
        util.exportExcel(response, list, "仓库管理调拔数据");
    }

    /**
     * 获取仓库管理调拔详细信息
     */
    @PreAuthorize("@ss.hasPermi('store:stockchangemain:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfStockchangemainService.selectCmfStockchangemainById(id));
    }

    /**
     * 新增仓库管理调拔
     */
    @PreAuthorize("@ss.hasPermi('store:stockchangemain:add')")
    @Log(title = "仓库管理调拔", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfStockchangemain cmfStockchangemain)
    {
        return toAjax(cmfStockchangemainService.insertCmfStockchangemain(cmfStockchangemain));
    }

    /**
     * 修改仓库管理调拔
     */
    @PreAuthorize("@ss.hasPermi('store:stockchangemain:edit')")
    @Log(title = "仓库管理调拔", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfStockchangemain cmfStockchangemain)
    {
        return toAjax(cmfStockchangemainService.updateCmfStockchangemain(cmfStockchangemain));
    }

    /**
     * 删除仓库管理调拔
     */
    @PreAuthorize("@ss.hasPermi('store:stockchangemain:remove')")
    @Log(title = "仓库管理调拔", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfStockchangemainService.deleteCmfStockchangemainByIds(ids));
    }
}
