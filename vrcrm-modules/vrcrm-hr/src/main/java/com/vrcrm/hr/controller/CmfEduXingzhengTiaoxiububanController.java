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
import com.vrcrm.hr.domain.CmfEduXingzhengTiaoxiububan;
import com.vrcrm.hr.service.ICmfEduXingzhengTiaoxiububanService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 行政调休补班Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/tiaoxiububan")
public class CmfEduXingzhengTiaoxiububanController extends BaseController
{
    @Autowired
    private ICmfEduXingzhengTiaoxiububanService cmfEduXingzhengTiaoxiububanService;

    /**
     * 查询行政调休补班列表
     */
    @PreAuthorize("@ss.hasPermi('hr:tiaoxiububan:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfEduXingzhengTiaoxiububan cmfEduXingzhengTiaoxiububan)
    {
        startPage();
        List<CmfEduXingzhengTiaoxiububan> list = cmfEduXingzhengTiaoxiububanService.selectCmfEduXingzhengTiaoxiububanList(cmfEduXingzhengTiaoxiububan);
        return getDataTable(list);
    }

    /**
     * 导出行政调休补班列表
     */
    @PreAuthorize("@ss.hasPermi('hr:tiaoxiububan:export')")
    @Log(title = "行政调休补班", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfEduXingzhengTiaoxiububan cmfEduXingzhengTiaoxiububan)
    {
        List<CmfEduXingzhengTiaoxiububan> list = cmfEduXingzhengTiaoxiububanService.selectCmfEduXingzhengTiaoxiububanList(cmfEduXingzhengTiaoxiububan);
        ExcelUtil<CmfEduXingzhengTiaoxiububan> util = new ExcelUtil<CmfEduXingzhengTiaoxiububan>(CmfEduXingzhengTiaoxiububan.class);
        util.exportExcel(response, list, "行政调休补班数据");
    }

    /**
     * 获取行政调休补班详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:tiaoxiububan:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfEduXingzhengTiaoxiububanService.selectCmfEduXingzhengTiaoxiububanById(id));
    }

    /**
     * 新增行政调休补班
     */
    @PreAuthorize("@ss.hasPermi('hr:tiaoxiububan:add')")
    @Log(title = "行政调休补班", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfEduXingzhengTiaoxiububan cmfEduXingzhengTiaoxiububan)
    {
        return toAjax(cmfEduXingzhengTiaoxiububanService.insertCmfEduXingzhengTiaoxiububan(cmfEduXingzhengTiaoxiububan));
    }

    /**
     * 修改行政调休补班
     */
    @PreAuthorize("@ss.hasPermi('hr:tiaoxiububan:edit')")
    @Log(title = "行政调休补班", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfEduXingzhengTiaoxiububan cmfEduXingzhengTiaoxiububan)
    {
        return toAjax(cmfEduXingzhengTiaoxiububanService.updateCmfEduXingzhengTiaoxiububan(cmfEduXingzhengTiaoxiububan));
    }

    /**
     * 删除行政调休补班
     */
    @PreAuthorize("@ss.hasPermi('hr:tiaoxiububan:remove')")
    @Log(title = "行政调休补班", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfEduXingzhengTiaoxiububanService.deleteCmfEduXingzhengTiaoxiububanByIds(ids));
    }
}
