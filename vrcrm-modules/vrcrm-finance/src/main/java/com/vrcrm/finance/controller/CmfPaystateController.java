package com.vrcrm.finance.controller;

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
import com.vrcrm.finance.domain.CmfPaystate;
import com.vrcrm.finance.service.ICmfPaystateService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 支付状态Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/paystate")
public class CmfPaystateController extends BaseController
{
    @Autowired
    private ICmfPaystateService cmfPaystateService;

    /**
     * 查询支付状态列表
     */
    @PreAuthorize("@ss.hasPermi('finance:paystate:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfPaystate cmfPaystate)
    {
        startPage();
        List<CmfPaystate> list = cmfPaystateService.selectCmfPaystateList(cmfPaystate);
        return getDataTable(list);
    }

    /**
     * 导出支付状态列表
     */
    @PreAuthorize("@ss.hasPermi('finance:paystate:export')")
    @Log(title = "支付状态", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfPaystate cmfPaystate)
    {
        List<CmfPaystate> list = cmfPaystateService.selectCmfPaystateList(cmfPaystate);
        ExcelUtil<CmfPaystate> util = new ExcelUtil<CmfPaystate>(CmfPaystate.class);
        util.exportExcel(response, list, "支付状态数据");
    }

    /**
     * 获取支付状态详细信息
     */
    @PreAuthorize("@ss.hasPermi('finance:paystate:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfPaystateService.selectCmfPaystateById(id));
    }

    /**
     * 新增支付状态
     */
    @PreAuthorize("@ss.hasPermi('finance:paystate:add')")
    @Log(title = "支付状态", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfPaystate cmfPaystate)
    {
        return toAjax(cmfPaystateService.insertCmfPaystate(cmfPaystate));
    }

    /**
     * 修改支付状态
     */
    @PreAuthorize("@ss.hasPermi('finance:paystate:edit')")
    @Log(title = "支付状态", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfPaystate cmfPaystate)
    {
        return toAjax(cmfPaystateService.updateCmfPaystate(cmfPaystate));
    }

    /**
     * 删除支付状态
     */
    @PreAuthorize("@ss.hasPermi('finance:paystate:remove')")
    @Log(title = "支付状态", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfPaystateService.deleteCmfPaystateByIds(ids));
    }
}
