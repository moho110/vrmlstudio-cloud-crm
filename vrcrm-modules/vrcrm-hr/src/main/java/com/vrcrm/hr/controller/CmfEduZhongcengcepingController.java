package com.vrcrm.hr.controller;

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
import com.vrcrm.hr.domain.CmfEduZhongcengceping;
import com.vrcrm.hr.service.ICmfEduZhongcengcepingService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 中层测评Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/eduzhongcengceping")
public class CmfEduZhongcengcepingController extends BaseController
{
    @Autowired
    private ICmfEduZhongcengcepingService cmfEduZhongcengcepingService;

    /**
     * 查询中层测评列表
     */
    @PreAuthorize("@ss.hasPermi('hr:zhongcengceping:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfEduZhongcengceping cmfEduZhongcengceping)
    {
        startPage();
        List<CmfEduZhongcengceping> list = cmfEduZhongcengcepingService.selectCmfEduZhongcengcepingList(cmfEduZhongcengceping);
        return getDataTable(list);
    }

    /**
     * 导出中层测评列表
     */
    @PreAuthorize("@ss.hasPermi('hr:zhongcengceping:export')")
    @Log(title = "中层测评", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfEduZhongcengceping cmfEduZhongcengceping)
    {
        List<CmfEduZhongcengceping> list = cmfEduZhongcengcepingService.selectCmfEduZhongcengcepingList(cmfEduZhongcengceping);
        ExcelUtil<CmfEduZhongcengceping> util = new ExcelUtil<CmfEduZhongcengceping>(CmfEduZhongcengceping.class);
        util.exportExcel(response, list, "中层测评数据");
    }

    /**
     * 获取中层测评详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:zhongcengceping:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfEduZhongcengcepingService.selectCmfEduZhongcengcepingById(id));
    }

    /**
     * 新增中层测评
     */
    @PreAuthorize("@ss.hasPermi('hr:zhongcengceping:add')")
    @Log(title = "中层测评", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfEduZhongcengceping cmfEduZhongcengceping)
    {
        return toAjax(cmfEduZhongcengcepingService.insertCmfEduZhongcengceping(cmfEduZhongcengceping));
    }

    /**
     * 修改中层测评
     */
    @PreAuthorize("@ss.hasPermi('hr:zhongcengceping:edit')")
    @Log(title = "中层测评", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfEduZhongcengceping cmfEduZhongcengceping)
    {
        return toAjax(cmfEduZhongcengcepingService.updateCmfEduZhongcengceping(cmfEduZhongcengceping));
    }

    /**
     * 删除中层测评
     */
    @PreAuthorize("@ss.hasPermi('hr:zhongcengceping:remove')")
    @Log(title = "中层测评", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfEduZhongcengcepingService.deleteCmfEduZhongcengcepingByIds(ids));
    }
}
