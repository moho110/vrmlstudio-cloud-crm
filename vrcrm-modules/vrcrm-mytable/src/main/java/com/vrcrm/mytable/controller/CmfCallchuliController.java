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
import com.vrcrm.mytable.domain.CmfCallchuli;
import com.vrcrm.mytable.service.ICmfCallchuliService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 来电处理Controller
 * 
 * @author VRer
 * @date 2022-04-14
 */
@RestController
@RequestMapping("/callchuli")
public class CmfCallchuliController extends BaseController
{
    @Autowired
    private ICmfCallchuliService cmfCallchuliService;

    /**
     * 查询来电处理列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:callchuli:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfCallchuli cmfCallchuli)
    {
        startPage();
        List<CmfCallchuli> list = cmfCallchuliService.selectCmfCallchuliList(cmfCallchuli);
        return getDataTable(list);
    }

    /**
     * 导出来电处理列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:callchuli:export')")
    @Log(title = "来电处理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfCallchuli cmfCallchuli)
    {
        List<CmfCallchuli> list = cmfCallchuliService.selectCmfCallchuliList(cmfCallchuli);
        ExcelUtil<CmfCallchuli> util = new ExcelUtil<CmfCallchuli>(CmfCallchuli.class);
        util.exportExcel(response, list, "来电处理数据");
    }

    /**
     * 获取来电处理详细信息
     */
    @PreAuthorize("@ss.hasPermi('mytable:callchuli:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfCallchuliService.selectCmfCallchuliById(id));
    }

    /**
     * 新增来电处理
     */
    @PreAuthorize("@ss.hasPermi('mytable:callchuli:add')")
    @Log(title = "来电处理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfCallchuli cmfCallchuli)
    {
        return toAjax(cmfCallchuliService.insertCmfCallchuli(cmfCallchuli));
    }

    /**
     * 修改来电处理
     */
    @PreAuthorize("@ss.hasPermi('mytable:callchuli:edit')")
    @Log(title = "来电处理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfCallchuli cmfCallchuli)
    {
        return toAjax(cmfCallchuliService.updateCmfCallchuli(cmfCallchuli));
    }

    /**
     * 删除来电处理
     */
    @PreAuthorize("@ss.hasPermi('mytable:callchuli:remove')")
    @Log(title = "来电处理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfCallchuliService.deleteCmfCallchuliByIds(ids));
    }
}
