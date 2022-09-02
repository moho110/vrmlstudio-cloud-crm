package com.vrcrm.buy.controller;

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
import com.vrcrm.buy.domain.CmfHuikuanplan;
import com.vrcrm.buy.service.ICmfHuikuanplanService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 汇款计划Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/huikuanplan")
public class CmfHuikuanplanController extends BaseController
{
    @Autowired
    private ICmfHuikuanplanService cmfHuikuanplanService;

    /**
     * 查询汇款计划列表
     */
    @PreAuthorize("@ss.hasPermi('buy:huikuanplan:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfHuikuanplan cmfHuikuanplan)
    {
        startPage();
        List<CmfHuikuanplan> list = cmfHuikuanplanService.selectCmfHuikuanplanList(cmfHuikuanplan);
        return getDataTable(list);
    }

    /**
     * 导出汇款计划列表
     */
    @PreAuthorize("@ss.hasPermi('buy:huikuanplan:export')")
    @Log(title = "汇款计划", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfHuikuanplan cmfHuikuanplan)
    {
        List<CmfHuikuanplan> list = cmfHuikuanplanService.selectCmfHuikuanplanList(cmfHuikuanplan);
        ExcelUtil<CmfHuikuanplan> util = new ExcelUtil<CmfHuikuanplan>(CmfHuikuanplan.class);
        util.exportExcel(response, list, "汇款计划数据");
    }

    /**
     * 获取汇款计划详细信息
     */
    @PreAuthorize("@ss.hasPermi('buy:huikuanplan:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfHuikuanplanService.selectCmfHuikuanplanById(id));
    }

    /**
     * 新增汇款计划
     */
    @PreAuthorize("@ss.hasPermi('buy:huikuanplan:add')")
    @Log(title = "汇款计划", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfHuikuanplan cmfHuikuanplan)
    {
        return toAjax(cmfHuikuanplanService.insertCmfHuikuanplan(cmfHuikuanplan));
    }

    /**
     * 修改汇款计划
     */
    @PreAuthorize("@ss.hasPermi('buy:huikuanplan:edit')")
    @Log(title = "汇款计划", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfHuikuanplan cmfHuikuanplan)
    {
        return toAjax(cmfHuikuanplanService.updateCmfHuikuanplan(cmfHuikuanplan));
    }

    /**
     * 删除汇款计划
     */
    @PreAuthorize("@ss.hasPermi('buy:huikuanplan:remove')")
    @Log(title = "汇款计划", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfHuikuanplanService.deleteCmfHuikuanplanByIds(ids));
    }
}
