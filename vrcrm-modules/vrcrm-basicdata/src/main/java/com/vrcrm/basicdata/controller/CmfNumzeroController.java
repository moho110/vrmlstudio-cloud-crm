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
import com.vrcrm.basicdata.domain.CmfNumzero;
import com.vrcrm.basicdata.service.ICmfNumzeroService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * ZeroController
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/numzero")
public class CmfNumzeroController extends BaseController
{
    @Autowired
    private ICmfNumzeroService cmfNumzeroService;

    /**
     * 查询Zero列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:numzero:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfNumzero cmfNumzero)
    {
        startPage();
        List<CmfNumzero> list = cmfNumzeroService.selectCmfNumzeroList(cmfNumzero);
        return getDataTable(list);
    }

    /**
     * 导出Zero列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:numzero:export')")
    @Log(title = "Zero", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfNumzero cmfNumzero)
    {
        List<CmfNumzero> list = cmfNumzeroService.selectCmfNumzeroList(cmfNumzero);
        ExcelUtil<CmfNumzero> util = new ExcelUtil<CmfNumzero>(CmfNumzero.class);
        util.exportExcel(response, list, "Zero数据");
    }

    /**
     * 获取Zero详细信息
     */
    @PreAuthorize("@ss.hasPermi('basicdata:numzero:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfNumzeroService.selectCmfNumzeroById(id));
    }

    /**
     * 新增Zero
     */
    @PreAuthorize("@ss.hasPermi('basicdata:numzero:add')")
    @Log(title = "Zero", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfNumzero cmfNumzero)
    {
        return toAjax(cmfNumzeroService.insertCmfNumzero(cmfNumzero));
    }

    /**
     * 修改Zero
     */
    @PreAuthorize("@ss.hasPermi('basicdata:numzero:edit')")
    @Log(title = "Zero", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfNumzero cmfNumzero)
    {
        return toAjax(cmfNumzeroService.updateCmfNumzero(cmfNumzero));
    }

    /**
     * 删除Zero
     */
    @PreAuthorize("@ss.hasPermi('basicdata:numzero:remove')")
    @Log(title = "Zero", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfNumzeroService.deleteCmfNumzeroByIds(ids));
    }
}
