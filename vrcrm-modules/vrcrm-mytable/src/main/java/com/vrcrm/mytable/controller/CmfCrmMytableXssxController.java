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
import com.vrcrm.mytable.domain.CmfCrmMytableXssx;
import com.vrcrm.mytable.service.ICmfCrmMytableXssxService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 显示属性Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/mytablexssx")
public class CmfCrmMytableXssxController extends BaseController
{
    @Autowired
    private ICmfCrmMytableXssxService cmfCrmMytableXssxService;

    /**
     * 查询显示属性列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:mytablexssx:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfCrmMytableXssx cmfCrmMytableXssx)
    {
        startPage();
        List<CmfCrmMytableXssx> list = cmfCrmMytableXssxService.selectCmfCrmMytableXssxList(cmfCrmMytableXssx);
        return getDataTable(list);
    }

    /**
     * 导出显示属性列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:mytablexssx:export')")
    @Log(title = "显示属性", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfCrmMytableXssx cmfCrmMytableXssx)
    {
        List<CmfCrmMytableXssx> list = cmfCrmMytableXssxService.selectCmfCrmMytableXssxList(cmfCrmMytableXssx);
        ExcelUtil<CmfCrmMytableXssx> util = new ExcelUtil<CmfCrmMytableXssx>(CmfCrmMytableXssx.class);
        util.exportExcel(response, list, "显示属性数据");
    }

    /**
     * 获取显示属性详细信息
     */
    @PreAuthorize("@ss.hasPermi('mytable:mytablexssx:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfCrmMytableXssxService.selectCmfCrmMytableXssxById(id));
    }

    /**
     * 新增显示属性
     */
    @PreAuthorize("@ss.hasPermi('mytable:mytablexssx:add')")
    @Log(title = "显示属性", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfCrmMytableXssx cmfCrmMytableXssx)
    {
        return toAjax(cmfCrmMytableXssxService.insertCmfCrmMytableXssx(cmfCrmMytableXssx));
    }

    /**
     * 修改显示属性
     */
    @PreAuthorize("@ss.hasPermi('mytable:mytablexssx:edit')")
    @Log(title = "显示属性", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfCrmMytableXssx cmfCrmMytableXssx)
    {
        return toAjax(cmfCrmMytableXssxService.updateCmfCrmMytableXssx(cmfCrmMytableXssx));
    }

    /**
     * 删除显示属性
     */
    @PreAuthorize("@ss.hasPermi('mytable:mytablexssx:remove')")
    @Log(title = "显示属性", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfCrmMytableXssxService.deleteCmfCrmMytableXssxByIds(ids));
    }
}
