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
import com.vrcrm.hr.domain.CmfHrmsFileFuzhi;
import com.vrcrm.hr.service.ICmfHrmsFileFuzhiService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 人员复职Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/hrmsfilefuzhi")
public class CmfHrmsFileFuzhiController extends BaseController
{
    @Autowired
    private ICmfHrmsFileFuzhiService cmfHrmsFileFuzhiService;

    /**
     * 查询人员复职列表
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfilefuzhi:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfHrmsFileFuzhi cmfHrmsFileFuzhi)
    {
        startPage();
        List<CmfHrmsFileFuzhi> list = cmfHrmsFileFuzhiService.selectCmfHrmsFileFuzhiList(cmfHrmsFileFuzhi);
        return getDataTable(list);
    }

    /**
     * 导出人员复职列表
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfilefuzhi:export')")
    @Log(title = "人员复职", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfHrmsFileFuzhi cmfHrmsFileFuzhi)
    {
        List<CmfHrmsFileFuzhi> list = cmfHrmsFileFuzhiService.selectCmfHrmsFileFuzhiList(cmfHrmsFileFuzhi);
        ExcelUtil<CmfHrmsFileFuzhi> util = new ExcelUtil<CmfHrmsFileFuzhi>(CmfHrmsFileFuzhi.class);
        util.exportExcel(response, list, "人员复职数据");
    }

    /**
     * 获取人员复职详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfilefuzhi:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfHrmsFileFuzhiService.selectCmfHrmsFileFuzhiById(id));
    }

    /**
     * 新增人员复职
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfilefuzhi:add')")
    @Log(title = "人员复职", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfHrmsFileFuzhi cmfHrmsFileFuzhi)
    {
        return toAjax(cmfHrmsFileFuzhiService.insertCmfHrmsFileFuzhi(cmfHrmsFileFuzhi));
    }

    /**
     * 修改人员复职
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfilefuzhi:edit')")
    @Log(title = "人员复职", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfHrmsFileFuzhi cmfHrmsFileFuzhi)
    {
        return toAjax(cmfHrmsFileFuzhiService.updateCmfHrmsFileFuzhi(cmfHrmsFileFuzhi));
    }

    /**
     * 删除人员复职
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfilefuzhi:remove')")
    @Log(title = "人员复职", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfHrmsFileFuzhiService.deleteCmfHrmsFileFuzhiByIds(ids));
    }
}
