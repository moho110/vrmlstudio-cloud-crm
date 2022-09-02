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
import com.vrcrm.hr.domain.CmfEduXingzhengTiaoban;
import com.vrcrm.hr.service.ICmfEduXingzhengTiaobanService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 行政调班Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/xingzhengtiaoban")
public class CmfEduXingzhengTiaobanController extends BaseController
{
    @Autowired
    private ICmfEduXingzhengTiaobanService cmfEduXingzhengTiaobanService;

    /**
     * 查询行政调班列表
     */
    @PreAuthorize("@ss.hasPermi('hr:xingzhengtiaoban:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfEduXingzhengTiaoban cmfEduXingzhengTiaoban)
    {
        startPage();
        List<CmfEduXingzhengTiaoban> list = cmfEduXingzhengTiaobanService.selectCmfEduXingzhengTiaobanList(cmfEduXingzhengTiaoban);
        return getDataTable(list);
    }

    /**
     * 导出行政调班列表
     */
    @PreAuthorize("@ss.hasPermi('hr:xingzhengtiaoban:export')")
    @Log(title = "行政调班", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfEduXingzhengTiaoban cmfEduXingzhengTiaoban)
    {
        List<CmfEduXingzhengTiaoban> list = cmfEduXingzhengTiaobanService.selectCmfEduXingzhengTiaobanList(cmfEduXingzhengTiaoban);
        ExcelUtil<CmfEduXingzhengTiaoban> util = new ExcelUtil<CmfEduXingzhengTiaoban>(CmfEduXingzhengTiaoban.class);
        util.exportExcel(response, list, "行政调班数据");
    }

    /**
     * 获取行政调班详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:xingzhengtiaoban:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfEduXingzhengTiaobanService.selectCmfEduXingzhengTiaobanById(id));
    }

    /**
     * 新增行政调班
     */
    @PreAuthorize("@ss.hasPermi('hr:xingzhengtiaoban:add')")
    @Log(title = "行政调班", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfEduXingzhengTiaoban cmfEduXingzhengTiaoban)
    {
        return toAjax(cmfEduXingzhengTiaobanService.insertCmfEduXingzhengTiaoban(cmfEduXingzhengTiaoban));
    }

    /**
     * 修改行政调班
     */
    @PreAuthorize("@ss.hasPermi('hr:xingzhengtiaoban:edit')")
    @Log(title = "行政调班", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfEduXingzhengTiaoban cmfEduXingzhengTiaoban)
    {
        return toAjax(cmfEduXingzhengTiaobanService.updateCmfEduXingzhengTiaoban(cmfEduXingzhengTiaoban));
    }

    /**
     * 删除行政调班
     */
    @PreAuthorize("@ss.hasPermi('hr:xingzhengtiaoban:remove')")
    @Log(title = "行政调班", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfEduXingzhengTiaobanService.deleteCmfEduXingzhengTiaobanByIds(ids));
    }
}
