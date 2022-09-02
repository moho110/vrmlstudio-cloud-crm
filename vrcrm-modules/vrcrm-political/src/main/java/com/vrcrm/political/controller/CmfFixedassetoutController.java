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
import com.vrcrm.political.domain.CmfFixedassetout;
import com.vrcrm.political.service.ICmfFixedassetoutService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 固定资产出库Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/fixedassetout")
public class CmfFixedassetoutController extends BaseController
{
    @Autowired
    private ICmfFixedassetoutService cmfFixedassetoutService;

    /**
     * 查询固定资产出库列表
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetout:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfFixedassetout cmfFixedassetout)
    {
        startPage();
        List<CmfFixedassetout> list = cmfFixedassetoutService.selectCmfFixedassetoutList(cmfFixedassetout);
        return getDataTable(list);
    }

    /**
     * 导出固定资产出库列表
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetout:export')")
    @Log(title = "固定资产出库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfFixedassetout cmfFixedassetout)
    {
        List<CmfFixedassetout> list = cmfFixedassetoutService.selectCmfFixedassetoutList(cmfFixedassetout);
        ExcelUtil<CmfFixedassetout> util = new ExcelUtil<CmfFixedassetout>(CmfFixedassetout.class);
        util.exportExcel(response, list, "固定资产出库数据");
    }

    /**
     * 获取固定资产出库详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetout:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfFixedassetoutService.selectCmfFixedassetoutById(id));
    }

    /**
     * 新增固定资产出库
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetout:add')")
    @Log(title = "固定资产出库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfFixedassetout cmfFixedassetout)
    {
        return toAjax(cmfFixedassetoutService.insertCmfFixedassetout(cmfFixedassetout));
    }

    /**
     * 修改固定资产出库
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetout:edit')")
    @Log(title = "固定资产出库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfFixedassetout cmfFixedassetout)
    {
        return toAjax(cmfFixedassetoutService.updateCmfFixedassetout(cmfFixedassetout));
    }

    /**
     * 删除固定资产出库
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetout:remove')")
    @Log(title = "固定资产出库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfFixedassetoutService.deleteCmfFixedassetoutByIds(ids));
    }
}
