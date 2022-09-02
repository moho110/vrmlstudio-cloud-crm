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
import com.vrcrm.buy.domain.CmfHuikuanrecord;
import com.vrcrm.buy.service.ICmfHuikuanrecordService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 汇款记录Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/huikuanrecord")
public class CmfHuikuanrecordController extends BaseController
{
    @Autowired
    private ICmfHuikuanrecordService cmfHuikuanrecordService;

    /**
     * 查询汇款记录列表
     */
    @PreAuthorize("@ss.hasPermi('buy:huikuanrecord:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfHuikuanrecord cmfHuikuanrecord)
    {
        startPage();
        List<CmfHuikuanrecord> list = cmfHuikuanrecordService.selectCmfHuikuanrecordList(cmfHuikuanrecord);
        return getDataTable(list);
    }

    /**
     * 导出汇款记录列表
     */
    @PreAuthorize("@ss.hasPermi('buy:huikuanrecord:export')")
    @Log(title = "汇款记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfHuikuanrecord cmfHuikuanrecord)
    {
        List<CmfHuikuanrecord> list = cmfHuikuanrecordService.selectCmfHuikuanrecordList(cmfHuikuanrecord);
        ExcelUtil<CmfHuikuanrecord> util = new ExcelUtil<CmfHuikuanrecord>(CmfHuikuanrecord.class);
        util.exportExcel(response, list, "汇款记录数据");
    }

    /**
     * 获取汇款记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('buy:huikuanrecord:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfHuikuanrecordService.selectCmfHuikuanrecordById(id));
    }

    /**
     * 新增汇款记录
     */
    @PreAuthorize("@ss.hasPermi('buy:huikuanrecord:add')")
    @Log(title = "汇款记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfHuikuanrecord cmfHuikuanrecord)
    {
        return toAjax(cmfHuikuanrecordService.insertCmfHuikuanrecord(cmfHuikuanrecord));
    }

    /**
     * 修改汇款记录
     */
    @PreAuthorize("@ss.hasPermi('buy:huikuanrecord:edit')")
    @Log(title = "汇款记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfHuikuanrecord cmfHuikuanrecord)
    {
        return toAjax(cmfHuikuanrecordService.updateCmfHuikuanrecord(cmfHuikuanrecord));
    }

    /**
     * 删除汇款记录
     */
    @PreAuthorize("@ss.hasPermi('buy:huikuanrecord:remove')")
    @Log(title = "汇款记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfHuikuanrecordService.deleteCmfHuikuanrecordByIds(ids));
    }
}
