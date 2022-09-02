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
import com.vrcrm.mytable.domain.CmfWorkreport;
import com.vrcrm.mytable.service.ICmfWorkreportService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 工作报告Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/workreport")
public class CmfWorkreportController extends BaseController
{
    @Autowired
    private ICmfWorkreportService cmfWorkreportService;

    /**
     * 查询工作报告列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:workreport:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfWorkreport cmfWorkreport)
    {
        startPage();
        List<CmfWorkreport> list = cmfWorkreportService.selectCmfWorkreportList(cmfWorkreport);
        return getDataTable(list);
    }

    /**
     * 导出工作报告列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:workreport:export')")
    @Log(title = "工作报告", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfWorkreport cmfWorkreport)
    {
        List<CmfWorkreport> list = cmfWorkreportService.selectCmfWorkreportList(cmfWorkreport);
        ExcelUtil<CmfWorkreport> util = new ExcelUtil<CmfWorkreport>(CmfWorkreport.class);
        util.exportExcel(response, list, "工作报告数据");
    }

    /**
     * 获取工作报告详细信息
     */
    @PreAuthorize("@ss.hasPermi('mytable:workreport:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfWorkreportService.selectCmfWorkreportById(id));
    }

    /**
     * 新增工作报告
     */
    @PreAuthorize("@ss.hasPermi('mytable:workreport:add')")
    @Log(title = "工作报告", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfWorkreport cmfWorkreport)
    {
        return toAjax(cmfWorkreportService.insertCmfWorkreport(cmfWorkreport));
    }

    /**
     * 修改工作报告
     */
    @PreAuthorize("@ss.hasPermi('mytable:workreport:edit')")
    @Log(title = "工作报告", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfWorkreport cmfWorkreport)
    {
        return toAjax(cmfWorkreportService.updateCmfWorkreport(cmfWorkreport));
    }

    /**
     * 删除工作报告
     */
    @PreAuthorize("@ss.hasPermi('mytable:workreport:remove')")
    @Log(title = "工作报告", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfWorkreportService.deleteCmfWorkreportByIds(ids));
    }
}
