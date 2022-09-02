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
import com.vrcrm.hr.domain.CmfEduZhongcengxingmu;
import com.vrcrm.hr.service.ICmfEduZhongcengxingmuService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 中层干部测评项目明细Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/zhongcengxingmu")
public class CmfEduZhongcengxingmuController extends BaseController
{
    @Autowired
    private ICmfEduZhongcengxingmuService cmfEduZhongcengxingmuService;

    /**
     * 查询中层干部测评项目明细列表
     */
    @PreAuthorize("@ss.hasPermi('hr:zhongcengxingmu:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfEduZhongcengxingmu cmfEduZhongcengxingmu)
    {
        startPage();
        List<CmfEduZhongcengxingmu> list = cmfEduZhongcengxingmuService.selectCmfEduZhongcengxingmuList(cmfEduZhongcengxingmu);
        return getDataTable(list);
    }

    /**
     * 导出中层干部测评项目明细列表
     */
    @PreAuthorize("@ss.hasPermi('hr:zhongcengxingmu:export')")
    @Log(title = "中层干部测评项目明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfEduZhongcengxingmu cmfEduZhongcengxingmu)
    {
        List<CmfEduZhongcengxingmu> list = cmfEduZhongcengxingmuService.selectCmfEduZhongcengxingmuList(cmfEduZhongcengxingmu);
        ExcelUtil<CmfEduZhongcengxingmu> util = new ExcelUtil<CmfEduZhongcengxingmu>(CmfEduZhongcengxingmu.class);
        util.exportExcel(response, list, "中层干部测评项目明细数据");
    }

    /**
     * 获取中层干部测评项目明细详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:zhongcengxingmu:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfEduZhongcengxingmuService.selectCmfEduZhongcengxingmuById(id));
    }

    /**
     * 新增中层干部测评项目明细
     */
    @PreAuthorize("@ss.hasPermi('hr:zhongcengxingmu:add')")
    @Log(title = "中层干部测评项目明细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfEduZhongcengxingmu cmfEduZhongcengxingmu)
    {
        return toAjax(cmfEduZhongcengxingmuService.insertCmfEduZhongcengxingmu(cmfEduZhongcengxingmu));
    }

    /**
     * 修改中层干部测评项目明细
     */
    @PreAuthorize("@ss.hasPermi('hr:zhongcengxingmu:edit')")
    @Log(title = "中层干部测评项目明细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfEduZhongcengxingmu cmfEduZhongcengxingmu)
    {
        return toAjax(cmfEduZhongcengxingmuService.updateCmfEduZhongcengxingmu(cmfEduZhongcengxingmu));
    }

    /**
     * 删除中层干部测评项目明细
     */
    @PreAuthorize("@ss.hasPermi('hr:zhongcengxingmu:remove')")
    @Log(title = "中层干部测评项目明细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfEduZhongcengxingmuService.deleteCmfEduZhongcengxingmuByIds(ids));
    }
}
