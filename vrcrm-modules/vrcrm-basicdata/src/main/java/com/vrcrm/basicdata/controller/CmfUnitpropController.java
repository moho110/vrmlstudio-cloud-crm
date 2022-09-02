package com.vrcrm.basicdata.controller;

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
import com.vrcrm.basicdata.domain.CmfUnitprop;
import com.vrcrm.basicdata.service.ICmfUnitpropService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 单位属性Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/unitprop")
public class CmfUnitpropController extends BaseController
{
    @Autowired
    private ICmfUnitpropService cmfUnitpropService;

    /**
     * 查询单位属性列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:unitprop:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfUnitprop cmfUnitprop)
    {
        startPage();
        List<CmfUnitprop> list = cmfUnitpropService.selectCmfUnitpropList(cmfUnitprop);
        return getDataTable(list);
    }

    /**
     * 导出单位属性列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:unitprop:export')")
    @Log(title = "单位属性", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfUnitprop cmfUnitprop)
    {
        List<CmfUnitprop> list = cmfUnitpropService.selectCmfUnitpropList(cmfUnitprop);
        ExcelUtil<CmfUnitprop> util = new ExcelUtil<CmfUnitprop>(CmfUnitprop.class);
        util.exportExcel(response, list, "单位属性数据");
    }

    /**
     * 获取单位属性详细信息
     */
    @PreAuthorize("@ss.hasPermi('basicdata:unitprop:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfUnitpropService.selectCmfUnitpropById(id));
    }

    /**
     * 新增单位属性
     */
    @PreAuthorize("@ss.hasPermi('basicdata:unitprop:add')")
    @Log(title = "单位属性", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfUnitprop cmfUnitprop)
    {
        return toAjax(cmfUnitpropService.insertCmfUnitprop(cmfUnitprop));
    }

    /**
     * 修改单位属性
     */
    @PreAuthorize("@ss.hasPermi('basicdata:unitprop:edit')")
    @Log(title = "单位属性", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfUnitprop cmfUnitprop)
    {
        return toAjax(cmfUnitpropService.updateCmfUnitprop(cmfUnitprop));
    }

    /**
     * 删除单位属性
     */
    @PreAuthorize("@ss.hasPermi('basicdata:unitprop:remove')")
    @Log(title = "单位属性", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfUnitpropService.deleteCmfUnitpropByIds(ids));
    }
}
