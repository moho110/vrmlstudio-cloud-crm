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
import com.vrcrm.political.domain.CmfFixedassetstatus;
import com.vrcrm.political.service.ICmfFixedassetstatusService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 固定资产状态Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/fixedassetstatus")
public class CmfFixedassetstatusController extends BaseController
{
    @Autowired
    private ICmfFixedassetstatusService cmfFixedassetstatusService;

    /**
     * 查询固定资产状态列表
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetstatus:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfFixedassetstatus cmfFixedassetstatus)
    {
        startPage();
        List<CmfFixedassetstatus> list = cmfFixedassetstatusService.selectCmfFixedassetstatusList(cmfFixedassetstatus);
        return getDataTable(list);
    }

    /**
     * 导出固定资产状态列表
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetstatus:export')")
    @Log(title = "固定资产状态", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfFixedassetstatus cmfFixedassetstatus)
    {
        List<CmfFixedassetstatus> list = cmfFixedassetstatusService.selectCmfFixedassetstatusList(cmfFixedassetstatus);
        ExcelUtil<CmfFixedassetstatus> util = new ExcelUtil<CmfFixedassetstatus>(CmfFixedassetstatus.class);
        util.exportExcel(response, list, "固定资产状态数据");
    }

    /**
     * 获取固定资产状态详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetstatus:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfFixedassetstatusService.selectCmfFixedassetstatusById(id));
    }

    /**
     * 新增固定资产状态
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetstatus:add')")
    @Log(title = "固定资产状态", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfFixedassetstatus cmfFixedassetstatus)
    {
        return toAjax(cmfFixedassetstatusService.insertCmfFixedassetstatus(cmfFixedassetstatus));
    }

    /**
     * 修改固定资产状态
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetstatus:edit')")
    @Log(title = "固定资产状态", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfFixedassetstatus cmfFixedassetstatus)
    {
        return toAjax(cmfFixedassetstatusService.updateCmfFixedassetstatus(cmfFixedassetstatus));
    }

    /**
     * 删除固定资产状态
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetstatus:remove')")
    @Log(title = "固定资产状态", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfFixedassetstatusService.deleteCmfFixedassetstatusByIds(ids));
    }
}
