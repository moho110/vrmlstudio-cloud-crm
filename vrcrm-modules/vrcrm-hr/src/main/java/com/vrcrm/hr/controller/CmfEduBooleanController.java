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
import com.vrcrm.hr.domain.CmfEduBoolean;
import com.vrcrm.hr.service.ICmfEduBooleanService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 是否教育Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/eduboolean")
public class CmfEduBooleanController extends BaseController
{
    @Autowired
    private ICmfEduBooleanService cmfEduBooleanService;

    /**
     * 查询是否教育列表
     */
    @PreAuthorize("@ss.hasPermi('hr:eduboolean:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfEduBoolean cmfEduBoolean)
    {
        startPage();
        List<CmfEduBoolean> list = cmfEduBooleanService.selectCmfEduBooleanList(cmfEduBoolean);
        return getDataTable(list);
    }

    /**
     * 导出是否教育列表
     */
    @PreAuthorize("@ss.hasPermi('hr:eduboolean:export')")
    @Log(title = "是否教育", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfEduBoolean cmfEduBoolean)
    {
        List<CmfEduBoolean> list = cmfEduBooleanService.selectCmfEduBooleanList(cmfEduBoolean);
        ExcelUtil<CmfEduBoolean> util = new ExcelUtil<CmfEduBoolean>(CmfEduBoolean.class);
        util.exportExcel(response, list, "是否教育数据");
    }

    /**
     * 获取是否教育详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:eduboolean:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfEduBooleanService.selectCmfEduBooleanById(id));
    }

    /**
     * 新增是否教育
     */
    @PreAuthorize("@ss.hasPermi('hr:eduboolean:add')")
    @Log(title = "是否教育", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfEduBoolean cmfEduBoolean)
    {
        return toAjax(cmfEduBooleanService.insertCmfEduBoolean(cmfEduBoolean));
    }

    /**
     * 修改是否教育
     */
    @PreAuthorize("@ss.hasPermi('hr:eduboolean:edit')")
    @Log(title = "是否教育", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfEduBoolean cmfEduBoolean)
    {
        return toAjax(cmfEduBooleanService.updateCmfEduBoolean(cmfEduBoolean));
    }

    /**
     * 删除是否教育
     */
    @PreAuthorize("@ss.hasPermi('hr:eduboolean:remove')")
    @Log(title = "是否教育", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfEduBooleanService.deleteCmfEduBooleanByIds(ids));
    }
}
