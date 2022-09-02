package com.vrcrm.political.controller;

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
import com.vrcrm.political.domain.CmfWuBuildinginformation;
import com.vrcrm.political.service.ICmfWuBuildinginformationService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 房产信息Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/buildinginformation")
public class CmfWuBuildinginformationController extends BaseController
{
    @Autowired
    private ICmfWuBuildinginformationService cmfWuBuildinginformationService;

    /**
     * 查询房产信息列表
     */
    @PreAuthorize("@ss.hasPermi('political:buildinginformation:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfWuBuildinginformation cmfWuBuildinginformation)
    {
        startPage();
        List<CmfWuBuildinginformation> list = cmfWuBuildinginformationService.selectCmfWuBuildinginformationList(cmfWuBuildinginformation);
        return getDataTable(list);
    }

    /**
     * 导出房产信息列表
     */
    @PreAuthorize("@ss.hasPermi('political:buildinginformation:export')")
    @Log(title = "房产信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfWuBuildinginformation cmfWuBuildinginformation)
    {
        List<CmfWuBuildinginformation> list = cmfWuBuildinginformationService.selectCmfWuBuildinginformationList(cmfWuBuildinginformation);
        ExcelUtil<CmfWuBuildinginformation> util = new ExcelUtil<CmfWuBuildinginformation>(CmfWuBuildinginformation.class);
        util.exportExcel(response, list, "房产信息数据");
    }

    /**
     * 获取房产信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:buildinginformation:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfWuBuildinginformationService.selectCmfWuBuildinginformationById(id));
    }

    /**
     * 新增房产信息
     */
    @PreAuthorize("@ss.hasPermi('political:buildinginformation:add')")
    @Log(title = "房产信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfWuBuildinginformation cmfWuBuildinginformation)
    {
        return toAjax(cmfWuBuildinginformationService.insertCmfWuBuildinginformation(cmfWuBuildinginformation));
    }

    /**
     * 修改房产信息
     */
    @PreAuthorize("@ss.hasPermi('political:buildinginformation:edit')")
    @Log(title = "房产信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfWuBuildinginformation cmfWuBuildinginformation)
    {
        return toAjax(cmfWuBuildinginformationService.updateCmfWuBuildinginformation(cmfWuBuildinginformation));
    }

    /**
     * 删除房产信息
     */
    @PreAuthorize("@ss.hasPermi('political:buildinginformation:remove')")
    @Log(title = "房产信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfWuBuildinginformationService.deleteCmfWuBuildinginformationByIds(ids));
    }
}
