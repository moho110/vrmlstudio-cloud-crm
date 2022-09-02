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
import com.vrcrm.hr.domain.CmfDictXingbie;
import com.vrcrm.hr.service.ICmfDictXingbieService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 性别Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/xingbie")
public class CmfDictXingbieController extends BaseController
{
    @Autowired
    private ICmfDictXingbieService cmfDictXingbieService;

    /**
     * 查询性别列表
     */
    @PreAuthorize("@ss.hasPermi('hr:xingbie:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfDictXingbie cmfDictXingbie)
    {
        startPage();
        List<CmfDictXingbie> list = cmfDictXingbieService.selectCmfDictXingbieList(cmfDictXingbie);
        return getDataTable(list);
    }

    /**
     * 导出性别列表
     */
    @PreAuthorize("@ss.hasPermi('hr:xingbie:export')")
    @Log(title = "性别", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfDictXingbie cmfDictXingbie)
    {
        List<CmfDictXingbie> list = cmfDictXingbieService.selectCmfDictXingbieList(cmfDictXingbie);
        ExcelUtil<CmfDictXingbie> util = new ExcelUtil<CmfDictXingbie>(CmfDictXingbie.class);
        util.exportExcel(response, list, "性别数据");
    }

    /**
     * 获取性别详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:xingbie:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfDictXingbieService.selectCmfDictXingbieById(id));
    }

    /**
     * 新增性别
     */
    @PreAuthorize("@ss.hasPermi('hr:xingbie:add')")
    @Log(title = "性别", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfDictXingbie cmfDictXingbie)
    {
        return toAjax(cmfDictXingbieService.insertCmfDictXingbie(cmfDictXingbie));
    }

    /**
     * 修改性别
     */
    @PreAuthorize("@ss.hasPermi('hr:xingbie:edit')")
    @Log(title = "性别", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfDictXingbie cmfDictXingbie)
    {
        return toAjax(cmfDictXingbieService.updateCmfDictXingbie(cmfDictXingbie));
    }

    /**
     * 删除性别
     */
    @PreAuthorize("@ss.hasPermi('hr:xingbie:remove')")
    @Log(title = "性别", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfDictXingbieService.deleteCmfDictXingbieByIds(ids));
    }
}
