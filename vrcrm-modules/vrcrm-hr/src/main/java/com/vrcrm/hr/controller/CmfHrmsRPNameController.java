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
import com.vrcrm.hr.domain.CmfHrmsRPName;
import com.vrcrm.hr.service.ICmfHrmsRPNameService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 奖惩名称Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/hrmsrpname")
public class CmfHrmsRPNameController extends BaseController
{
    @Autowired
    private ICmfHrmsRPNameService cmfHrmsRPNameService;

    /**
     * 查询奖惩名称列表
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsrpname:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfHrmsRPName cmfHrmsRPName)
    {
        startPage();
        List<CmfHrmsRPName> list = cmfHrmsRPNameService.selectCmfHrmsRPNameList(cmfHrmsRPName);
        return getDataTable(list);
    }

    /**
     * 导出奖惩名称列表
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsrpname:export')")
    @Log(title = "奖惩名称", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfHrmsRPName cmfHrmsRPName)
    {
        List<CmfHrmsRPName> list = cmfHrmsRPNameService.selectCmfHrmsRPNameList(cmfHrmsRPName);
        ExcelUtil<CmfHrmsRPName> util = new ExcelUtil<CmfHrmsRPName>(CmfHrmsRPName.class);
        util.exportExcel(response, list, "奖惩名称数据");
    }

    /**
     * 获取奖惩名称详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsrpname:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfHrmsRPNameService.selectCmfHrmsRPNameById(id));
    }

    /**
     * 新增奖惩名称
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsrpname:add')")
    @Log(title = "奖惩名称", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfHrmsRPName cmfHrmsRPName)
    {
        return toAjax(cmfHrmsRPNameService.insertCmfHrmsRPName(cmfHrmsRPName));
    }

    /**
     * 修改奖惩名称
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsrpname:edit')")
    @Log(title = "奖惩名称", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfHrmsRPName cmfHrmsRPName)
    {
        return toAjax(cmfHrmsRPNameService.updateCmfHrmsRPName(cmfHrmsRPName));
    }

    /**
     * 删除奖惩名称
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsrpname:remove')")
    @Log(title = "奖惩名称", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfHrmsRPNameService.deleteCmfHrmsRPNameByIds(ids));
    }
}
