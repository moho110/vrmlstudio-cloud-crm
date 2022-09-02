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
import com.vrcrm.hr.domain.CmfHrmsBoolean;
import com.vrcrm.hr.service.ICmfHrmsBooleanService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 同意与否Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/hrboolean")
public class CmfHrmsBooleanController extends BaseController
{
    @Autowired
    private ICmfHrmsBooleanService cmfHrmsBooleanService;

    /**
     * 查询同意与否列表
     */
    @PreAuthorize("@ss.hasPermi('hr:hrboolean:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfHrmsBoolean cmfHrmsBoolean)
    {
        startPage();
        List<CmfHrmsBoolean> list = cmfHrmsBooleanService.selectCmfHrmsBooleanList(cmfHrmsBoolean);
        return getDataTable(list);
    }

    /**
     * 导出同意与否列表
     */
    @PreAuthorize("@ss.hasPermi('hr:hrboolean:export')")
    @Log(title = "同意与否", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfHrmsBoolean cmfHrmsBoolean)
    {
        List<CmfHrmsBoolean> list = cmfHrmsBooleanService.selectCmfHrmsBooleanList(cmfHrmsBoolean);
        ExcelUtil<CmfHrmsBoolean> util = new ExcelUtil<CmfHrmsBoolean>(CmfHrmsBoolean.class);
        util.exportExcel(response, list, "同意与否数据");
    }

    /**
     * 获取同意与否详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:hrboolean:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfHrmsBooleanService.selectCmfHrmsBooleanById(id));
    }

    /**
     * 新增同意与否
     */
    @PreAuthorize("@ss.hasPermi('hr:hrboolean:add')")
    @Log(title = "同意与否", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfHrmsBoolean cmfHrmsBoolean)
    {
        return toAjax(cmfHrmsBooleanService.insertCmfHrmsBoolean(cmfHrmsBoolean));
    }

    /**
     * 修改同意与否
     */
    @PreAuthorize("@ss.hasPermi('hr:hrboolean:edit')")
    @Log(title = "同意与否", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfHrmsBoolean cmfHrmsBoolean)
    {
        return toAjax(cmfHrmsBooleanService.updateCmfHrmsBoolean(cmfHrmsBoolean));
    }

    /**
     * 删除同意与否
     */
    @PreAuthorize("@ss.hasPermi('hr:hrboolean:remove')")
    @Log(title = "同意与否", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfHrmsBooleanService.deleteCmfHrmsBooleanByIds(ids));
    }
}
