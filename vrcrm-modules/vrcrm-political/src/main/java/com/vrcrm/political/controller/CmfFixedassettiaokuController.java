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
import com.vrcrm.political.domain.CmfFixedassettiaoku;
import com.vrcrm.political.service.ICmfFixedassettiaokuService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 固定资产调库Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/fixedassettiaoku")
public class CmfFixedassettiaokuController extends BaseController
{
    @Autowired
    private ICmfFixedassettiaokuService cmfFixedassettiaokuService;

    /**
     * 查询固定资产调库列表
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassettiaoku:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfFixedassettiaoku cmfFixedassettiaoku)
    {
        startPage();
        List<CmfFixedassettiaoku> list = cmfFixedassettiaokuService.selectCmfFixedassettiaokuList(cmfFixedassettiaoku);
        return getDataTable(list);
    }

    /**
     * 导出固定资产调库列表
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassettiaoku:export')")
    @Log(title = "固定资产调库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfFixedassettiaoku cmfFixedassettiaoku)
    {
        List<CmfFixedassettiaoku> list = cmfFixedassettiaokuService.selectCmfFixedassettiaokuList(cmfFixedassettiaoku);
        ExcelUtil<CmfFixedassettiaoku> util = new ExcelUtil<CmfFixedassettiaoku>(CmfFixedassettiaoku.class);
        util.exportExcel(response, list, "固定资产调库数据");
    }

    /**
     * 获取固定资产调库详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassettiaoku:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfFixedassettiaokuService.selectCmfFixedassettiaokuById(id));
    }

    /**
     * 新增固定资产调库
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassettiaoku:add')")
    @Log(title = "固定资产调库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfFixedassettiaoku cmfFixedassettiaoku)
    {
        return toAjax(cmfFixedassettiaokuService.insertCmfFixedassettiaoku(cmfFixedassettiaoku));
    }

    /**
     * 修改固定资产调库
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassettiaoku:edit')")
    @Log(title = "固定资产调库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfFixedassettiaoku cmfFixedassettiaoku)
    {
        return toAjax(cmfFixedassettiaokuService.updateCmfFixedassettiaoku(cmfFixedassettiaoku));
    }

    /**
     * 删除固定资产调库
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassettiaoku:remove')")
    @Log(title = "固定资产调库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfFixedassettiaokuService.deleteCmfFixedassettiaokuByIds(ids));
    }
}
