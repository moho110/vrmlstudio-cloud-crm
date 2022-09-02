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
import com.vrcrm.hr.domain.CmfEduXingzhengPaiban;
import com.vrcrm.hr.service.ICmfEduXingzhengPaibanService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 行政排班Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/xingzhengpaiban")
public class CmfEduXingzhengPaibanController extends BaseController
{
    @Autowired
    private ICmfEduXingzhengPaibanService cmfEduXingzhengPaibanService;

    /**
     * 查询行政排班列表
     */
    @PreAuthorize("@ss.hasPermi('hr:xingzhengpaiban:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfEduXingzhengPaiban cmfEduXingzhengPaiban)
    {
        startPage();
        List<CmfEduXingzhengPaiban> list = cmfEduXingzhengPaibanService.selectCmfEduXingzhengPaibanList(cmfEduXingzhengPaiban);
        return getDataTable(list);
    }

    /**
     * 导出行政排班列表
     */
    @PreAuthorize("@ss.hasPermi('hr:xingzhengpaiban:export')")
    @Log(title = "行政排班", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfEduXingzhengPaiban cmfEduXingzhengPaiban)
    {
        List<CmfEduXingzhengPaiban> list = cmfEduXingzhengPaibanService.selectCmfEduXingzhengPaibanList(cmfEduXingzhengPaiban);
        ExcelUtil<CmfEduXingzhengPaiban> util = new ExcelUtil<CmfEduXingzhengPaiban>(CmfEduXingzhengPaiban.class);
        util.exportExcel(response, list, "行政排班数据");
    }

    /**
     * 获取行政排班详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:xingzhengpaiban:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfEduXingzhengPaibanService.selectCmfEduXingzhengPaibanById(id));
    }

    /**
     * 新增行政排班
     */
    @PreAuthorize("@ss.hasPermi('hr:xingzhengpaiban:add')")
    @Log(title = "行政排班", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfEduXingzhengPaiban cmfEduXingzhengPaiban)
    {
        return toAjax(cmfEduXingzhengPaibanService.insertCmfEduXingzhengPaiban(cmfEduXingzhengPaiban));
    }

    /**
     * 修改行政排班
     */
    @PreAuthorize("@ss.hasPermi('hr:xingzhengpaiban:edit')")
    @Log(title = "行政排班", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfEduXingzhengPaiban cmfEduXingzhengPaiban)
    {
        return toAjax(cmfEduXingzhengPaibanService.updateCmfEduXingzhengPaiban(cmfEduXingzhengPaiban));
    }

    /**
     * 删除行政排班
     */
    @PreAuthorize("@ss.hasPermi('hr:xingzhengpaiban:remove')")
    @Log(title = "行政排班", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfEduXingzhengPaibanService.deleteCmfEduXingzhengPaibanByIds(ids));
    }
}
