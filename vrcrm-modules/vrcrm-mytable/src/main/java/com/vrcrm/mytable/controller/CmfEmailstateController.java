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
import com.vrcrm.mytable.domain.CmfEmailstate;
import com.vrcrm.mytable.service.ICmfEmailstateService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 邮件状态Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/emailstate")
public class CmfEmailstateController extends BaseController
{
    @Autowired
    private ICmfEmailstateService cmfEmailstateService;

    /**
     * 查询邮件状态列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:emailstate:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfEmailstate cmfEmailstate)
    {
        startPage();
        List<CmfEmailstate> list = cmfEmailstateService.selectCmfEmailstateList(cmfEmailstate);
        return getDataTable(list);
    }

    /**
     * 导出邮件状态列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:emailstate:export')")
    @Log(title = "邮件状态", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfEmailstate cmfEmailstate)
    {
        List<CmfEmailstate> list = cmfEmailstateService.selectCmfEmailstateList(cmfEmailstate);
        ExcelUtil<CmfEmailstate> util = new ExcelUtil<CmfEmailstate>(CmfEmailstate.class);
        util.exportExcel(response, list, "邮件状态数据");
    }

    /**
     * 获取邮件状态详细信息
     */
    @PreAuthorize("@ss.hasPermi('mytable:emailstate:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfEmailstateService.selectCmfEmailstateById(id));
    }

    /**
     * 新增邮件状态
     */
    @PreAuthorize("@ss.hasPermi('mytable:emailstate:add')")
    @Log(title = "邮件状态", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfEmailstate cmfEmailstate)
    {
        return toAjax(cmfEmailstateService.insertCmfEmailstate(cmfEmailstate));
    }

    /**
     * 修改邮件状态
     */
    @PreAuthorize("@ss.hasPermi('mytable:emailstate:edit')")
    @Log(title = "邮件状态", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfEmailstate cmfEmailstate)
    {
        return toAjax(cmfEmailstateService.updateCmfEmailstate(cmfEmailstate));
    }

    /**
     * 删除邮件状态
     */
    @PreAuthorize("@ss.hasPermi('mytable:emailstate:remove')")
    @Log(title = "邮件状态", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfEmailstateService.deleteCmfEmailstateByIds(ids));
    }
}
