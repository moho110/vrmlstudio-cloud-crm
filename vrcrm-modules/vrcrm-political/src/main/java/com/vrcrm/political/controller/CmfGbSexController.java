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
import com.vrcrm.political.domain.CmfGbSex;
import com.vrcrm.political.service.ICmfGbSexService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 性别Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/gbsex")
public class CmfGbSexController extends BaseController
{
    @Autowired
    private ICmfGbSexService cmfGbSexService;

    /**
     * 查询性别列表
     */
    @PreAuthorize("@ss.hasPermi('political:sex:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfGbSex cmfGbSex)
    {
        startPage();
        List<CmfGbSex> list = cmfGbSexService.selectCmfGbSexList(cmfGbSex);
        return getDataTable(list);
    }

    /**
     * 导出性别列表
     */
    @PreAuthorize("@ss.hasPermi('political:sex:export')")
    @Log(title = "性别", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfGbSex cmfGbSex)
    {
        List<CmfGbSex> list = cmfGbSexService.selectCmfGbSexList(cmfGbSex);
        ExcelUtil<CmfGbSex> util = new ExcelUtil<CmfGbSex>(CmfGbSex.class);
        util.exportExcel(response, list, "性别数据");
    }

    /**
     * 获取性别详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:sex:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfGbSexService.selectCmfGbSexById(id));
    }

    /**
     * 新增性别
     */
    @PreAuthorize("@ss.hasPermi('political:sex:add')")
    @Log(title = "性别", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfGbSex cmfGbSex)
    {
        return toAjax(cmfGbSexService.insertCmfGbSex(cmfGbSex));
    }

    /**
     * 修改性别
     */
    @PreAuthorize("@ss.hasPermi('political:sex:edit')")
    @Log(title = "性别", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfGbSex cmfGbSex)
    {
        return toAjax(cmfGbSexService.updateCmfGbSex(cmfGbSex));
    }

    /**
     * 删除性别
     */
    @PreAuthorize("@ss.hasPermi('political:sex:remove')")
    @Log(title = "性别", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfGbSexService.deleteCmfGbSexByIds(ids));
    }
}
