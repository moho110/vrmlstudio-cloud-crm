package com.vrcrm.customer.controller;

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
import com.vrcrm.customer.domain.CmfContractFlag;
import com.vrcrm.customer.service.ICmfContractFlagService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 合同标识Controller
 * 
 * @author VRer
 * @date 2022-04-14
 */
@RestController
@RequestMapping("/contractflag")
public class CmfContractFlagController extends BaseController
{
    @Autowired
    private ICmfContractFlagService cmfContractFlagService;

    /**
     * 查询合同标识列表
     */
    @PreAuthorize("@ss.hasPermi('customer:contractflag:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfContractFlag cmfContractFlag)
    {
        startPage();
        List<CmfContractFlag> list = cmfContractFlagService.selectCmfContractFlagList(cmfContractFlag);
        return getDataTable(list);
    }

    /**
     * 导出合同标识列表
     */
    @PreAuthorize("@ss.hasPermi('customer:contractflag:export')")
    @Log(title = "合同标识", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfContractFlag cmfContractFlag)
    {
        List<CmfContractFlag> list = cmfContractFlagService.selectCmfContractFlagList(cmfContractFlag);
        ExcelUtil<CmfContractFlag> util = new ExcelUtil<CmfContractFlag>(CmfContractFlag.class);
        util.exportExcel(response, list, "合同标识数据");
    }

    /**
     * 获取合同标识详细信息
     */
    @PreAuthorize("@ss.hasPermi('customer:contractflag:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfContractFlagService.selectCmfContractFlagById(id));
    }

    /**
     * 新增合同标识
     */
    @PreAuthorize("@ss.hasPermi('customer:contractflag:add')")
    @Log(title = "合同标识", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfContractFlag cmfContractFlag)
    {
        return toAjax(cmfContractFlagService.insertCmfContractFlag(cmfContractFlag));
    }

    /**
     * 修改合同标识
     */
    @PreAuthorize("@ss.hasPermi('customer:contractflag:edit')")
    @Log(title = "合同标识", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfContractFlag cmfContractFlag)
    {
        return toAjax(cmfContractFlagService.updateCmfContractFlag(cmfContractFlag));
    }

    /**
     * 删除合同标识
     */
    @PreAuthorize("@ss.hasPermi('customer:contractflag:remove')")
    @Log(title = "合同标识", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfContractFlagService.deleteCmfContractFlagByIds(ids));
    }
}
