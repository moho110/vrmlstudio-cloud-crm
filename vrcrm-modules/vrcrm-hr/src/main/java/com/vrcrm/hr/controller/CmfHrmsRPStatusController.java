package com.vrcrm.hr.controller;

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
import com.vrcrm.hr.domain.CmfHrmsRPStatus;
import com.vrcrm.hr.service.ICmfHrmsRPStatusService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 奖惩状态Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/hrmsrpstatus")
public class CmfHrmsRPStatusController extends BaseController
{
    @Autowired
    private ICmfHrmsRPStatusService cmfHrmsRPStatusService;

    /**
     * 查询奖惩状态列表
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsrpstatus:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfHrmsRPStatus cmfHrmsRPStatus)
    {
        startPage();
        List<CmfHrmsRPStatus> list = cmfHrmsRPStatusService.selectCmfHrmsRPStatusList(cmfHrmsRPStatus);
        return getDataTable(list);
    }

    /**
     * 导出奖惩状态列表
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsrpstatus:export')")
    @Log(title = "奖惩状态", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfHrmsRPStatus cmfHrmsRPStatus)
    {
        List<CmfHrmsRPStatus> list = cmfHrmsRPStatusService.selectCmfHrmsRPStatusList(cmfHrmsRPStatus);
        ExcelUtil<CmfHrmsRPStatus> util = new ExcelUtil<CmfHrmsRPStatus>(CmfHrmsRPStatus.class);
        util.exportExcel(response, list, "奖惩状态数据");
    }

    /**
     * 获取奖惩状态详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsrpstatus:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfHrmsRPStatusService.selectCmfHrmsRPStatusById(id));
    }

    /**
     * 新增奖惩状态
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsrpstatus:add')")
    @Log(title = "奖惩状态", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfHrmsRPStatus cmfHrmsRPStatus)
    {
        return toAjax(cmfHrmsRPStatusService.insertCmfHrmsRPStatus(cmfHrmsRPStatus));
    }

    /**
     * 修改奖惩状态
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsrpstatus:edit')")
    @Log(title = "奖惩状态", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfHrmsRPStatus cmfHrmsRPStatus)
    {
        return toAjax(cmfHrmsRPStatusService.updateCmfHrmsRPStatus(cmfHrmsRPStatus));
    }

    /**
     * 删除奖惩状态
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsrpstatus:remove')")
    @Log(title = "奖惩状态", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfHrmsRPStatusService.deleteCmfHrmsRPStatusByIds(ids));
    }
}
