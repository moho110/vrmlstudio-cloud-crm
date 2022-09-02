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
import com.vrcrm.hr.domain.CmfHrmsFileLuyong;
import com.vrcrm.hr.service.ICmfHrmsFileLuyongService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 人员录用Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/hrmsfileluyong")
public class CmfHrmsFileLuyongController extends BaseController
{
    @Autowired
    private ICmfHrmsFileLuyongService cmfHrmsFileLuyongService;

    /**
     * 查询人员录用列表
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfileluyong:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfHrmsFileLuyong cmfHrmsFileLuyong)
    {
        startPage();
        List<CmfHrmsFileLuyong> list = cmfHrmsFileLuyongService.selectCmfHrmsFileLuyongList(cmfHrmsFileLuyong);
        return getDataTable(list);
    }

    /**
     * 导出人员录用列表
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfileluyong:export')")
    @Log(title = "人员录用", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfHrmsFileLuyong cmfHrmsFileLuyong)
    {
        List<CmfHrmsFileLuyong> list = cmfHrmsFileLuyongService.selectCmfHrmsFileLuyongList(cmfHrmsFileLuyong);
        ExcelUtil<CmfHrmsFileLuyong> util = new ExcelUtil<CmfHrmsFileLuyong>(CmfHrmsFileLuyong.class);
        util.exportExcel(response, list, "人员录用数据");
    }

    /**
     * 获取人员录用详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfileluyong:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfHrmsFileLuyongService.selectCmfHrmsFileLuyongById(id));
    }

    /**
     * 新增人员录用
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfileluyong:add')")
    @Log(title = "人员录用", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfHrmsFileLuyong cmfHrmsFileLuyong)
    {
        return toAjax(cmfHrmsFileLuyongService.insertCmfHrmsFileLuyong(cmfHrmsFileLuyong));
    }

    /**
     * 修改人员录用
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfileluyong:edit')")
    @Log(title = "人员录用", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfHrmsFileLuyong cmfHrmsFileLuyong)
    {
        return toAjax(cmfHrmsFileLuyongService.updateCmfHrmsFileLuyong(cmfHrmsFileLuyong));
    }

    /**
     * 删除人员录用
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfileluyong:remove')")
    @Log(title = "人员录用", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfHrmsFileLuyongService.deleteCmfHrmsFileLuyongByIds(ids));
    }
}
