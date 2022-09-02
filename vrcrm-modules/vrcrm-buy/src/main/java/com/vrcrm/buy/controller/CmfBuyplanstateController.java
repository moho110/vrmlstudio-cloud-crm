package com.vrcrm.buy.controller;

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
import com.vrcrm.buy.domain.CmfBuyplanstate;
import com.vrcrm.buy.service.ICmfBuyplanstateService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 采购计划状态Controller
 * 
 * @author VRer
 * @date 2022-04-14
 */
@RestController
@RequestMapping("/buyplanstate")
public class CmfBuyplanstateController extends BaseController
{
    @Autowired
    private ICmfBuyplanstateService cmfBuyplanstateService;

    /**
     * 查询采购计划状态列表
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanstate:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfBuyplanstate cmfBuyplanstate)
    {
        startPage();
        List<CmfBuyplanstate> list = cmfBuyplanstateService.selectCmfBuyplanstateList(cmfBuyplanstate);
        return getDataTable(list);
    }

    /**
     * 导出采购计划状态列表
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanstate:export')")
    @Log(title = "采购计划状态", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfBuyplanstate cmfBuyplanstate)
    {
        List<CmfBuyplanstate> list = cmfBuyplanstateService.selectCmfBuyplanstateList(cmfBuyplanstate);
        ExcelUtil<CmfBuyplanstate> util = new ExcelUtil<CmfBuyplanstate>(CmfBuyplanstate.class);
        util.exportExcel(response, list, "采购计划状态数据");
    }

    /**
     * 获取采购计划状态详细信息
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanstate:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfBuyplanstateService.selectCmfBuyplanstateById(id));
    }

    /**
     * 新增采购计划状态
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanstate:add')")
    @Log(title = "采购计划状态", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfBuyplanstate cmfBuyplanstate)
    {
        return toAjax(cmfBuyplanstateService.insertCmfBuyplanstate(cmfBuyplanstate));
    }

    /**
     * 修改采购计划状态
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanstate:edit')")
    @Log(title = "采购计划状态", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfBuyplanstate cmfBuyplanstate)
    {
        return toAjax(cmfBuyplanstateService.updateCmfBuyplanstate(cmfBuyplanstate));
    }

    /**
     * 删除采购计划状态
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanstate:remove')")
    @Log(title = "采购计划状态", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfBuyplanstateService.deleteCmfBuyplanstateByIds(ids));
    }
}
