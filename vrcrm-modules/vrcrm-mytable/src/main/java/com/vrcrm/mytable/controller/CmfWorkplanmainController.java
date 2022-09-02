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
import com.vrcrm.mytable.domain.CmfWorkplanmain;
import com.vrcrm.mytable.service.ICmfWorkplanmainService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 工作计划Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/workplanmain")
public class CmfWorkplanmainController extends BaseController
{
    @Autowired
    private ICmfWorkplanmainService cmfWorkplanmainService;

    /**
     * 查询工作计划列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanmain:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfWorkplanmain cmfWorkplanmain)
    {
        startPage();
        List<CmfWorkplanmain> list = cmfWorkplanmainService.selectCmfWorkplanmainList(cmfWorkplanmain);
        return getDataTable(list);
    }

    /**
     * 导出工作计划列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanmain:export')")
    @Log(title = "工作计划", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfWorkplanmain cmfWorkplanmain)
    {
        List<CmfWorkplanmain> list = cmfWorkplanmainService.selectCmfWorkplanmainList(cmfWorkplanmain);
        ExcelUtil<CmfWorkplanmain> util = new ExcelUtil<CmfWorkplanmain>(CmfWorkplanmain.class);
        util.exportExcel(response, list, "工作计划数据");
    }

    /**
     * 获取工作计划详细信息
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanmain:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfWorkplanmainService.selectCmfWorkplanmainById(id));
    }

    /**
     * 新增工作计划
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanmain:add')")
    @Log(title = "工作计划", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfWorkplanmain cmfWorkplanmain)
    {
        return toAjax(cmfWorkplanmainService.insertCmfWorkplanmain(cmfWorkplanmain));
    }

    /**
     * 修改工作计划
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanmain:edit')")
    @Log(title = "工作计划", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfWorkplanmain cmfWorkplanmain)
    {
        return toAjax(cmfWorkplanmainService.updateCmfWorkplanmain(cmfWorkplanmain));
    }

    /**
     * 删除工作计划
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanmain:remove')")
    @Log(title = "工作计划", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfWorkplanmainService.deleteCmfWorkplanmainByIds(ids));
    }
}
