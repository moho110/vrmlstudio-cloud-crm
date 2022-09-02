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
import com.vrcrm.political.domain.CmfOfficeguihuanstate;
import com.vrcrm.political.service.ICmfOfficeguihuanstateService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 办公用品归还状态Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/officeguihuanstate")
public class CmfOfficeguihuanstateController extends BaseController
{
    @Autowired
    private ICmfOfficeguihuanstateService cmfOfficeguihuanstateService;

    /**
     * 查询办公用品归还状态列表
     */
    @PreAuthorize("@ss.hasPermi('political:officeguihuanstate:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfOfficeguihuanstate cmfOfficeguihuanstate)
    {
        startPage();
        List<CmfOfficeguihuanstate> list = cmfOfficeguihuanstateService.selectCmfOfficeguihuanstateList(cmfOfficeguihuanstate);
        return getDataTable(list);
    }

    /**
     * 导出办公用品归还状态列表
     */
    @PreAuthorize("@ss.hasPermi('political:officeguihuanstate:export')")
    @Log(title = "办公用品归还状态", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfOfficeguihuanstate cmfOfficeguihuanstate)
    {
        List<CmfOfficeguihuanstate> list = cmfOfficeguihuanstateService.selectCmfOfficeguihuanstateList(cmfOfficeguihuanstate);
        ExcelUtil<CmfOfficeguihuanstate> util = new ExcelUtil<CmfOfficeguihuanstate>(CmfOfficeguihuanstate.class);
        util.exportExcel(response, list, "办公用品归还状态数据");
    }

    /**
     * 获取办公用品归还状态详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:officeguihuanstate:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfOfficeguihuanstateService.selectCmfOfficeguihuanstateById(id));
    }

    /**
     * 新增办公用品归还状态
     */
    @PreAuthorize("@ss.hasPermi('political:officeguihuanstate:add')")
    @Log(title = "办公用品归还状态", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfOfficeguihuanstate cmfOfficeguihuanstate)
    {
        return toAjax(cmfOfficeguihuanstateService.insertCmfOfficeguihuanstate(cmfOfficeguihuanstate));
    }

    /**
     * 修改办公用品归还状态
     */
    @PreAuthorize("@ss.hasPermi('political:officeguihuanstate:edit')")
    @Log(title = "办公用品归还状态", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfOfficeguihuanstate cmfOfficeguihuanstate)
    {
        return toAjax(cmfOfficeguihuanstateService.updateCmfOfficeguihuanstate(cmfOfficeguihuanstate));
    }

    /**
     * 删除办公用品归还状态
     */
    @PreAuthorize("@ss.hasPermi('political:officeguihuanstate:remove')")
    @Log(title = "办公用品归还状态", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfOfficeguihuanstateService.deleteCmfOfficeguihuanstateByIds(ids));
    }
}
