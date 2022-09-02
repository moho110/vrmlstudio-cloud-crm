package com.vrcrm.sales.controller;

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
import com.vrcrm.sales.domain.CmfFahuodan;
import com.vrcrm.sales.service.ICmfFahuodanService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 发货单Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/fahuodan")
public class CmfFahuodanController extends BaseController
{
    @Autowired
    private ICmfFahuodanService cmfFahuodanService;

    /**
     * 查询发货单列表
     */
    @PreAuthorize("@ss.hasPermi('sales:fahuodan:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfFahuodan cmfFahuodan)
    {
        startPage();
        List<CmfFahuodan> list = cmfFahuodanService.selectCmfFahuodanList(cmfFahuodan);
        return getDataTable(list);
    }

    /**
     * 导出发货单列表
     */
    @PreAuthorize("@ss.hasPermi('sales:fahuodan:export')")
    @Log(title = "发货单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfFahuodan cmfFahuodan)
    {
        List<CmfFahuodan> list = cmfFahuodanService.selectCmfFahuodanList(cmfFahuodan);
        ExcelUtil<CmfFahuodan> util = new ExcelUtil<CmfFahuodan>(CmfFahuodan.class);
        util.exportExcel(response, list, "发货单数据");
    }

    /**
     * 获取发货单详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:fahuodan:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfFahuodanService.selectCmfFahuodanById(id));
    }

    /**
     * 新增发货单
     */
    @PreAuthorize("@ss.hasPermi('sales:fahuodan:add')")
    @Log(title = "发货单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfFahuodan cmfFahuodan)
    {
        return toAjax(cmfFahuodanService.insertCmfFahuodan(cmfFahuodan));
    }

    /**
     * 修改发货单
     */
    @PreAuthorize("@ss.hasPermi('sales:fahuodan:edit')")
    @Log(title = "发货单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfFahuodan cmfFahuodan)
    {
        return toAjax(cmfFahuodanService.updateCmfFahuodan(cmfFahuodan));
    }

    /**
     * 删除发货单
     */
    @PreAuthorize("@ss.hasPermi('sales:fahuodan:remove')")
    @Log(title = "发货单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfFahuodanService.deleteCmfFahuodanByIds(ids));
    }
}
