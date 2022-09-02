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
import com.vrcrm.hr.domain.CmfHrmsFile;
import com.vrcrm.hr.service.ICmfHrmsFileService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 人事档案Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/hrmsfile")
public class CmfHrmsFileController extends BaseController
{
    @Autowired
    private ICmfHrmsFileService cmfHrmsFileService;

    /**
     * 查询人事档案列表
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfile:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfHrmsFile cmfHrmsFile)
    {
        startPage();
        List<CmfHrmsFile> list = cmfHrmsFileService.selectCmfHrmsFileList(cmfHrmsFile);
        return getDataTable(list);
    }

    /**
     * 导出人事档案列表
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfile:export')")
    @Log(title = "人事档案", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfHrmsFile cmfHrmsFile)
    {
        List<CmfHrmsFile> list = cmfHrmsFileService.selectCmfHrmsFileList(cmfHrmsFile);
        ExcelUtil<CmfHrmsFile> util = new ExcelUtil<CmfHrmsFile>(CmfHrmsFile.class);
        util.exportExcel(response, list, "人事档案数据");
    }

    /**
     * 获取人事档案详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfile:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfHrmsFileService.selectCmfHrmsFileById(id));
    }

    /**
     * 新增人事档案
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfile:add')")
    @Log(title = "人事档案", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfHrmsFile cmfHrmsFile)
    {
        return toAjax(cmfHrmsFileService.insertCmfHrmsFile(cmfHrmsFile));
    }

    /**
     * 修改人事档案
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfile:edit')")
    @Log(title = "人事档案", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfHrmsFile cmfHrmsFile)
    {
        return toAjax(cmfHrmsFileService.updateCmfHrmsFile(cmfHrmsFile));
    }

    /**
     * 删除人事档案
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfile:remove')")
    @Log(title = "人事档案", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfHrmsFileService.deleteCmfHrmsFileByIds(ids));
    }
}
