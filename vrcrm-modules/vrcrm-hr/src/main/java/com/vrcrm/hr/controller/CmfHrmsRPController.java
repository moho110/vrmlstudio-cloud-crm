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
import com.vrcrm.hr.domain.CmfHrmsRP;
import com.vrcrm.hr.service.ICmfHrmsRPService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 是否奖惩Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/hrmsrp")
public class CmfHrmsRPController extends BaseController
{
    @Autowired
    private ICmfHrmsRPService cmfHrmsRPService;

    /**
     * 查询是否奖惩列表
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsrp:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfHrmsRP cmfHrmsRP)
    {
        startPage();
        List<CmfHrmsRP> list = cmfHrmsRPService.selectCmfHrmsRPList(cmfHrmsRP);
        return getDataTable(list);
    }

    /**
     * 导出是否奖惩列表
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsrp:export')")
    @Log(title = "是否奖惩", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfHrmsRP cmfHrmsRP)
    {
        List<CmfHrmsRP> list = cmfHrmsRPService.selectCmfHrmsRPList(cmfHrmsRP);
        ExcelUtil<CmfHrmsRP> util = new ExcelUtil<CmfHrmsRP>(CmfHrmsRP.class);
        util.exportExcel(response, list, "是否奖惩数据");
    }

    /**
     * 获取是否奖惩详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsrp:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfHrmsRPService.selectCmfHrmsRPById(id));
    }

    /**
     * 新增是否奖惩
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsrp:add')")
    @Log(title = "是否奖惩", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfHrmsRP cmfHrmsRP)
    {
        return toAjax(cmfHrmsRPService.insertCmfHrmsRP(cmfHrmsRP));
    }

    /**
     * 修改是否奖惩
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsrp:edit')")
    @Log(title = "是否奖惩", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfHrmsRP cmfHrmsRP)
    {
        return toAjax(cmfHrmsRPService.updateCmfHrmsRP(cmfHrmsRP));
    }

    /**
     * 删除是否奖惩
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsrp:remove')")
    @Log(title = "是否奖惩", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfHrmsRPService.deleteCmfHrmsRPByIds(ids));
    }
}
