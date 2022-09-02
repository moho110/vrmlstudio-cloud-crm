package com.vrcrm.mytable.controller;

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
import com.vrcrm.mytable.domain.CmfCallertype;
import com.vrcrm.mytable.service.ICmfCallertypeService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 呼叫人类型Controller
 * 
 * @author VRer
 * @date 2022-04-14
 */
@RestController
@RequestMapping("/callertype")
public class CmfCallertypeController extends BaseController
{
    @Autowired
    private ICmfCallertypeService cmfCallertypeService;

    /**
     * 查询呼叫人类型列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:callertype:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfCallertype cmfCallertype)
    {
        startPage();
        List<CmfCallertype> list = cmfCallertypeService.selectCmfCallertypeList(cmfCallertype);
        return getDataTable(list);
    }

    /**
     * 导出呼叫人类型列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:callertype:export')")
    @Log(title = "呼叫人类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfCallertype cmfCallertype)
    {
        List<CmfCallertype> list = cmfCallertypeService.selectCmfCallertypeList(cmfCallertype);
        ExcelUtil<CmfCallertype> util = new ExcelUtil<CmfCallertype>(CmfCallertype.class);
        util.exportExcel(response, list, "呼叫人类型数据");
    }

    /**
     * 获取呼叫人类型详细信息
     */
    @PreAuthorize("@ss.hasPermi('mytable:callertype:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfCallertypeService.selectCmfCallertypeById(id));
    }

    /**
     * 新增呼叫人类型
     */
    @PreAuthorize("@ss.hasPermi('mytable:callertype:add')")
    @Log(title = "呼叫人类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfCallertype cmfCallertype)
    {
        return toAjax(cmfCallertypeService.insertCmfCallertype(cmfCallertype));
    }

    /**
     * 修改呼叫人类型
     */
    @PreAuthorize("@ss.hasPermi('mytable:callertype:edit')")
    @Log(title = "呼叫人类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfCallertype cmfCallertype)
    {
        return toAjax(cmfCallertypeService.updateCmfCallertype(cmfCallertype));
    }

    /**
     * 删除呼叫人类型
     */
    @PreAuthorize("@ss.hasPermi('mytable:callertype:remove')")
    @Log(title = "呼叫人类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfCallertypeService.deleteCmfCallertypeByIds(ids));
    }
}
