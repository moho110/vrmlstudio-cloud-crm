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
import com.vrcrm.hr.domain.CmfEduXingzhengKaoqinbudeng;
import com.vrcrm.hr.service.ICmfEduXingzhengKaoqinbudengService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 行政考勤补登Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/kaoqinbudeng")
public class CmfEduXingzhengKaoqinbudengController extends BaseController
{
    @Autowired
    private ICmfEduXingzhengKaoqinbudengService cmfEduXingzhengKaoqinbudengService;

    /**
     * 查询行政考勤补登列表
     */
    @PreAuthorize("@ss.hasPermi('hr:kaoqinbudeng:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfEduXingzhengKaoqinbudeng cmfEduXingzhengKaoqinbudeng)
    {
        startPage();
        List<CmfEduXingzhengKaoqinbudeng> list = cmfEduXingzhengKaoqinbudengService.selectCmfEduXingzhengKaoqinbudengList(cmfEduXingzhengKaoqinbudeng);
        return getDataTable(list);
    }

    /**
     * 导出行政考勤补登列表
     */
    @PreAuthorize("@ss.hasPermi('hr:kaoqinbudeng:export')")
    @Log(title = "行政考勤补登", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfEduXingzhengKaoqinbudeng cmfEduXingzhengKaoqinbudeng)
    {
        List<CmfEduXingzhengKaoqinbudeng> list = cmfEduXingzhengKaoqinbudengService.selectCmfEduXingzhengKaoqinbudengList(cmfEduXingzhengKaoqinbudeng);
        ExcelUtil<CmfEduXingzhengKaoqinbudeng> util = new ExcelUtil<CmfEduXingzhengKaoqinbudeng>(CmfEduXingzhengKaoqinbudeng.class);
        util.exportExcel(response, list, "行政考勤补登数据");
    }

    /**
     * 获取行政考勤补登详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:kaoqinbudeng:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfEduXingzhengKaoqinbudengService.selectCmfEduXingzhengKaoqinbudengById(id));
    }

    /**
     * 新增行政考勤补登
     */
    @PreAuthorize("@ss.hasPermi('hr:kaoqinbudeng:add')")
    @Log(title = "行政考勤补登", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfEduXingzhengKaoqinbudeng cmfEduXingzhengKaoqinbudeng)
    {
        return toAjax(cmfEduXingzhengKaoqinbudengService.insertCmfEduXingzhengKaoqinbudeng(cmfEduXingzhengKaoqinbudeng));
    }

    /**
     * 修改行政考勤补登
     */
    @PreAuthorize("@ss.hasPermi('hr:kaoqinbudeng:edit')")
    @Log(title = "行政考勤补登", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfEduXingzhengKaoqinbudeng cmfEduXingzhengKaoqinbudeng)
    {
        return toAjax(cmfEduXingzhengKaoqinbudengService.updateCmfEduXingzhengKaoqinbudeng(cmfEduXingzhengKaoqinbudeng));
    }

    /**
     * 删除行政考勤补登
     */
    @PreAuthorize("@ss.hasPermi('hr:kaoqinbudeng:remove')")
    @Log(title = "行政考勤补登", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfEduXingzhengKaoqinbudengService.deleteCmfEduXingzhengKaoqinbudengByIds(ids));
    }
}
