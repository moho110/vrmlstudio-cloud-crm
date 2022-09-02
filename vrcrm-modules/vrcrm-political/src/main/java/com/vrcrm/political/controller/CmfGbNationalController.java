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
import com.vrcrm.political.domain.CmfGbNational;
import com.vrcrm.political.service.ICmfGbNationalService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 国籍Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/national")
public class CmfGbNationalController extends BaseController
{
    @Autowired
    private ICmfGbNationalService cmfGbNationalService;

    /**
     * 查询国籍列表
     */
    @PreAuthorize("@ss.hasPermi('political:national:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfGbNational cmfGbNational)
    {
        startPage();
        List<CmfGbNational> list = cmfGbNationalService.selectCmfGbNationalList(cmfGbNational);
        return getDataTable(list);
    }

    /**
     * 导出国籍列表
     */
    @PreAuthorize("@ss.hasPermi('political:national:export')")
    @Log(title = "国籍", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfGbNational cmfGbNational)
    {
        List<CmfGbNational> list = cmfGbNationalService.selectCmfGbNationalList(cmfGbNational);
        ExcelUtil<CmfGbNational> util = new ExcelUtil<CmfGbNational>(CmfGbNational.class);
        util.exportExcel(response, list, "国籍数据");
    }

    /**
     * 获取国籍详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:national:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfGbNationalService.selectCmfGbNationalById(id));
    }

    /**
     * 新增国籍
     */
    @PreAuthorize("@ss.hasPermi('political:national:add')")
    @Log(title = "国籍", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfGbNational cmfGbNational)
    {
        return toAjax(cmfGbNationalService.insertCmfGbNational(cmfGbNational));
    }

    /**
     * 修改国籍
     */
    @PreAuthorize("@ss.hasPermi('political:national:edit')")
    @Log(title = "国籍", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfGbNational cmfGbNational)
    {
        return toAjax(cmfGbNationalService.updateCmfGbNational(cmfGbNational));
    }

    /**
     * 删除国籍
     */
    @PreAuthorize("@ss.hasPermi('political:national:remove')")
    @Log(title = "国籍", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfGbNationalService.deleteCmfGbNationalByIds(ids));
    }
}
