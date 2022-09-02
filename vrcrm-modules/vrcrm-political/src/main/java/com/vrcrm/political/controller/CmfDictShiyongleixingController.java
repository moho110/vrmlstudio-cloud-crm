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
import com.vrcrm.political.domain.CmfDictShiyongleixing;
import com.vrcrm.political.service.ICmfDictShiyongleixingService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 使用类型Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/dictshiyongleixing")
public class CmfDictShiyongleixingController extends BaseController
{
    @Autowired
    private ICmfDictShiyongleixingService cmfDictShiyongleixingService;

    /**
     * 查询使用类型列表
     */
    @PreAuthorize("@ss.hasPermi('political:shiyongleixing:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfDictShiyongleixing cmfDictShiyongleixing)
    {
        startPage();
        List<CmfDictShiyongleixing> list = cmfDictShiyongleixingService.selectCmfDictShiyongleixingList(cmfDictShiyongleixing);
        return getDataTable(list);
    }

    /**
     * 导出使用类型列表
     */
    @PreAuthorize("@ss.hasPermi('political:shiyongleixing:export')")
    @Log(title = "使用类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfDictShiyongleixing cmfDictShiyongleixing)
    {
        List<CmfDictShiyongleixing> list = cmfDictShiyongleixingService.selectCmfDictShiyongleixingList(cmfDictShiyongleixing);
        ExcelUtil<CmfDictShiyongleixing> util = new ExcelUtil<CmfDictShiyongleixing>(CmfDictShiyongleixing.class);
        util.exportExcel(response, list, "使用类型数据");
    }

    /**
     * 获取使用类型详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:shiyongleixing:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfDictShiyongleixingService.selectCmfDictShiyongleixingById(id));
    }

    /**
     * 新增使用类型
     */
    @PreAuthorize("@ss.hasPermi('political:shiyongleixing:add')")
    @Log(title = "使用类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfDictShiyongleixing cmfDictShiyongleixing)
    {
        return toAjax(cmfDictShiyongleixingService.insertCmfDictShiyongleixing(cmfDictShiyongleixing));
    }

    /**
     * 修改使用类型
     */
    @PreAuthorize("@ss.hasPermi('political:shiyongleixing:edit')")
    @Log(title = "使用类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfDictShiyongleixing cmfDictShiyongleixing)
    {
        return toAjax(cmfDictShiyongleixingService.updateCmfDictShiyongleixing(cmfDictShiyongleixing));
    }

    /**
     * 删除使用类型
     */
    @PreAuthorize("@ss.hasPermi('political:shiyongleixing:remove')")
    @Log(title = "使用类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfDictShiyongleixingService.deleteCmfDictShiyongleixingByIds(ids));
    }
}
