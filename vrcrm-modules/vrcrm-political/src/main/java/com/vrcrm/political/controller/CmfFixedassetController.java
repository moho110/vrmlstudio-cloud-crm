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
import com.vrcrm.political.domain.CmfFixedasset;
import com.vrcrm.political.service.ICmfFixedassetService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 固定资产Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/fixedasset")
public class CmfFixedassetController extends BaseController
{
    @Autowired
    private ICmfFixedassetService cmfFixedassetService;

    /**
     * 查询固定资产列表
     */
    @PreAuthorize("@ss.hasPermi('political:fixedasset:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfFixedasset cmfFixedasset)
    {
        startPage();
        List<CmfFixedasset> list = cmfFixedassetService.selectCmfFixedassetList(cmfFixedasset);
        return getDataTable(list);
    }

    /**
     * 导出固定资产列表
     */
    @PreAuthorize("@ss.hasPermi('political:fixedasset:export')")
    @Log(title = "固定资产", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfFixedasset cmfFixedasset)
    {
        List<CmfFixedasset> list = cmfFixedassetService.selectCmfFixedassetList(cmfFixedasset);
        ExcelUtil<CmfFixedasset> util = new ExcelUtil<CmfFixedasset>(CmfFixedasset.class);
        util.exportExcel(response, list, "固定资产数据");
    }

    /**
     * 获取固定资产详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:fixedasset:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfFixedassetService.selectCmfFixedassetById(id));
    }

    /**
     * 新增固定资产
     */
    @PreAuthorize("@ss.hasPermi('political:fixedasset:add')")
    @Log(title = "固定资产", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfFixedasset cmfFixedasset)
    {
        return toAjax(cmfFixedassetService.insertCmfFixedasset(cmfFixedasset));
    }

    /**
     * 修改固定资产
     */
    @PreAuthorize("@ss.hasPermi('political:fixedasset:edit')")
    @Log(title = "固定资产", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfFixedasset cmfFixedasset)
    {
        return toAjax(cmfFixedassetService.updateCmfFixedasset(cmfFixedasset));
    }

    /**
     * 删除固定资产
     */
    @PreAuthorize("@ss.hasPermi('political:fixedasset:remove')")
    @Log(title = "固定资产", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfFixedassetService.deleteCmfFixedassetByIds(ids));
    }
}
