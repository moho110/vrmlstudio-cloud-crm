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
import com.vrcrm.sales.domain.CmfSellplanstate;
import com.vrcrm.sales.service.ICmfSellplanstateService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 销售计划状态Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/sellplanstate")
public class CmfSellplanstateController extends BaseController
{
    @Autowired
    private ICmfSellplanstateService cmfSellplanstateService;

    /**
     * 查询销售计划状态列表
     */
    @PreAuthorize("@ss.hasPermi('sales:sellplanstate:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfSellplanstate cmfSellplanstate)
    {
        startPage();
        List<CmfSellplanstate> list = cmfSellplanstateService.selectCmfSellplanstateList(cmfSellplanstate);
        return getDataTable(list);
    }

    /**
     * 导出销售计划状态列表
     */
    @PreAuthorize("@ss.hasPermi('sales:sellplanstate:export')")
    @Log(title = "销售计划状态", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfSellplanstate cmfSellplanstate)
    {
        List<CmfSellplanstate> list = cmfSellplanstateService.selectCmfSellplanstateList(cmfSellplanstate);
        ExcelUtil<CmfSellplanstate> util = new ExcelUtil<CmfSellplanstate>(CmfSellplanstate.class);
        util.exportExcel(response, list, "销售计划状态数据");
    }

    /**
     * 获取销售计划状态详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:sellplanstate:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfSellplanstateService.selectCmfSellplanstateById(id));
    }

    /**
     * 新增销售计划状态
     */
    @PreAuthorize("@ss.hasPermi('sales:sellplanstate:add')")
    @Log(title = "销售计划状态", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfSellplanstate cmfSellplanstate)
    {
        return toAjax(cmfSellplanstateService.insertCmfSellplanstate(cmfSellplanstate));
    }

    /**
     * 修改销售计划状态
     */
    @PreAuthorize("@ss.hasPermi('sales:sellplanstate:edit')")
    @Log(title = "销售计划状态", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfSellplanstate cmfSellplanstate)
    {
        return toAjax(cmfSellplanstateService.updateCmfSellplanstate(cmfSellplanstate));
    }

    /**
     * 删除销售计划状态
     */
    @PreAuthorize("@ss.hasPermi('sales:sellplanstate:remove')")
    @Log(title = "销售计划状态", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfSellplanstateService.deleteCmfSellplanstateByIds(ids));
    }
}
