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
import com.vrcrm.mytable.domain.CmfWorkplanshenhe;
import com.vrcrm.mytable.service.ICmfWorkplanshenheService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 工作计划审核Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/workplanshenhe")
public class CmfWorkplanshenheController extends BaseController
{
    @Autowired
    private ICmfWorkplanshenheService cmfWorkplanshenheService;

    /**
     * 查询工作计划审核列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanshenhe:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfWorkplanshenhe cmfWorkplanshenhe)
    {
        startPage();
        List<CmfWorkplanshenhe> list = cmfWorkplanshenheService.selectCmfWorkplanshenheList(cmfWorkplanshenhe);
        return getDataTable(list);
    }

    /**
     * 导出工作计划审核列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanshenhe:export')")
    @Log(title = "工作计划审核", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfWorkplanshenhe cmfWorkplanshenhe)
    {
        List<CmfWorkplanshenhe> list = cmfWorkplanshenheService.selectCmfWorkplanshenheList(cmfWorkplanshenhe);
        ExcelUtil<CmfWorkplanshenhe> util = new ExcelUtil<CmfWorkplanshenhe>(CmfWorkplanshenhe.class);
        util.exportExcel(response, list, "工作计划审核数据");
    }

    /**
     * 获取工作计划审核详细信息
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanshenhe:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfWorkplanshenheService.selectCmfWorkplanshenheById(id));
    }

    /**
     * 新增工作计划审核
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanshenhe:add')")
    @Log(title = "工作计划审核", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfWorkplanshenhe cmfWorkplanshenhe)
    {
        return toAjax(cmfWorkplanshenheService.insertCmfWorkplanshenhe(cmfWorkplanshenhe));
    }

    /**
     * 修改工作计划审核
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanshenhe:edit')")
    @Log(title = "工作计划审核", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfWorkplanshenhe cmfWorkplanshenhe)
    {
        return toAjax(cmfWorkplanshenheService.updateCmfWorkplanshenhe(cmfWorkplanshenhe));
    }

    /**
     * 删除工作计划审核
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanshenhe:remove')")
    @Log(title = "工作计划审核", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfWorkplanshenheService.deleteCmfWorkplanshenheByIds(ids));
    }
}
