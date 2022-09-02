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
import com.vrcrm.mytable.domain.CmfWorkplanmainDetail;
import com.vrcrm.mytable.service.ICmfWorkplanmainDetailService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 工作计划明细Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/workplanmaindetail")
public class CmfWorkplanmainDetailController extends BaseController
{
    @Autowired
    private ICmfWorkplanmainDetailService cmfWorkplanmainDetailService;

    /**
     * 查询工作计划明细列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanmaindetail:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfWorkplanmainDetail cmfWorkplanmainDetail)
    {
        startPage();
        List<CmfWorkplanmainDetail> list = cmfWorkplanmainDetailService.selectCmfWorkplanmainDetailList(cmfWorkplanmainDetail);
        return getDataTable(list);
    }

    /**
     * 导出工作计划明细列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanmaindetail:export')")
    @Log(title = "工作计划明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfWorkplanmainDetail cmfWorkplanmainDetail)
    {
        List<CmfWorkplanmainDetail> list = cmfWorkplanmainDetailService.selectCmfWorkplanmainDetailList(cmfWorkplanmainDetail);
        ExcelUtil<CmfWorkplanmainDetail> util = new ExcelUtil<CmfWorkplanmainDetail>(CmfWorkplanmainDetail.class);
        util.exportExcel(response, list, "工作计划明细数据");
    }

    /**
     * 获取工作计划明细详细信息
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanmaindetail:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfWorkplanmainDetailService.selectCmfWorkplanmainDetailById(id));
    }

    /**
     * 新增工作计划明细
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanmaindetail:add')")
    @Log(title = "工作计划明细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfWorkplanmainDetail cmfWorkplanmainDetail)
    {
        return toAjax(cmfWorkplanmainDetailService.insertCmfWorkplanmainDetail(cmfWorkplanmainDetail));
    }

    /**
     * 修改工作计划明细
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanmaindetail:edit')")
    @Log(title = "工作计划明细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfWorkplanmainDetail cmfWorkplanmainDetail)
    {
        return toAjax(cmfWorkplanmainDetailService.updateCmfWorkplanmainDetail(cmfWorkplanmainDetail));
    }

    /**
     * 删除工作计划明细
     */
    @PreAuthorize("@ss.hasPermi('mytable:workplanmaindetail:remove')")
    @Log(title = "工作计划明细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfWorkplanmainDetailService.deleteCmfWorkplanmainDetailByIds(ids));
    }
}
