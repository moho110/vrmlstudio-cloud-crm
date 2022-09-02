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
import com.vrcrm.political.domain.CmfFixedassetleibie;
import com.vrcrm.political.service.ICmfFixedassetleibieService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 固定资产类别Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/fixedassetleibie")
public class CmfFixedassetleibieController extends BaseController
{
    @Autowired
    private ICmfFixedassetleibieService cmfFixedassetleibieService;

    /**
     * 查询固定资产类别列表
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetleibie:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfFixedassetleibie cmfFixedassetleibie)
    {
        startPage();
        List<CmfFixedassetleibie> list = cmfFixedassetleibieService.selectCmfFixedassetleibieList(cmfFixedassetleibie);
        return getDataTable(list);
    }

    /**
     * 导出固定资产类别列表
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetleibie:export')")
    @Log(title = "固定资产类别", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfFixedassetleibie cmfFixedassetleibie)
    {
        List<CmfFixedassetleibie> list = cmfFixedassetleibieService.selectCmfFixedassetleibieList(cmfFixedassetleibie);
        ExcelUtil<CmfFixedassetleibie> util = new ExcelUtil<CmfFixedassetleibie>(CmfFixedassetleibie.class);
        util.exportExcel(response, list, "固定资产类别数据");
    }

    /**
     * 获取固定资产类别详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetleibie:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfFixedassetleibieService.selectCmfFixedassetleibieById(id));
    }

    /**
     * 新增固定资产类别
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetleibie:add')")
    @Log(title = "固定资产类别", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfFixedassetleibie cmfFixedassetleibie)
    {
        return toAjax(cmfFixedassetleibieService.insertCmfFixedassetleibie(cmfFixedassetleibie));
    }

    /**
     * 修改固定资产类别
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetleibie:edit')")
    @Log(title = "固定资产类别", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfFixedassetleibie cmfFixedassetleibie)
    {
        return toAjax(cmfFixedassetleibieService.updateCmfFixedassetleibie(cmfFixedassetleibie));
    }

    /**
     * 删除固定资产类别
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetleibie:remove')")
    @Log(title = "固定资产类别", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfFixedassetleibieService.deleteCmfFixedassetleibieByIds(ids));
    }
}
