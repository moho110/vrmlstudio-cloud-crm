package com.vrcrm.system.controller;

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
import com.vrcrm.system.domain.CmfStorecheckDetail;
import com.vrcrm.system.service.ICmfStorecheckDetailService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 库存盘点明细Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/storecheckdetail")
public class CmfStorecheckDetailController extends BaseController
{
    @Autowired
    private ICmfStorecheckDetailService cmfStorecheckDetailService;

    /**
     * 查询库存盘点明细列表
     */
    @PreAuthorize("@ss.hasPermi('system:detail:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfStorecheckDetail cmfStorecheckDetail)
    {
        startPage();
        List<CmfStorecheckDetail> list = cmfStorecheckDetailService.selectCmfStorecheckDetailList(cmfStorecheckDetail);
        return getDataTable(list);
    }

    /**
     * 导出库存盘点明细列表
     */
    @PreAuthorize("@ss.hasPermi('system:detail:export')")
    @Log(title = "库存盘点明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfStorecheckDetail cmfStorecheckDetail)
    {
        List<CmfStorecheckDetail> list = cmfStorecheckDetailService.selectCmfStorecheckDetailList(cmfStorecheckDetail);
        ExcelUtil<CmfStorecheckDetail> util = new ExcelUtil<CmfStorecheckDetail>(CmfStorecheckDetail.class);
        util.exportExcel(response, list, "库存盘点明细数据");
    }

    /**
     * 获取库存盘点明细详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:detail:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfStorecheckDetailService.selectCmfStorecheckDetailById(id));
    }

    /**
     * 新增库存盘点明细
     */
    @PreAuthorize("@ss.hasPermi('system:detail:add')")
    @Log(title = "库存盘点明细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfStorecheckDetail cmfStorecheckDetail)
    {
        return toAjax(cmfStorecheckDetailService.insertCmfStorecheckDetail(cmfStorecheckDetail));
    }

    /**
     * 修改库存盘点明细
     */
    @PreAuthorize("@ss.hasPermi('system:detail:edit')")
    @Log(title = "库存盘点明细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfStorecheckDetail cmfStorecheckDetail)
    {
        return toAjax(cmfStorecheckDetailService.updateCmfStorecheckDetail(cmfStorecheckDetail));
    }

    /**
     * 删除库存盘点明细
     */
    @PreAuthorize("@ss.hasPermi('system:detail:remove')")
    @Log(title = "库存盘点明细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfStorecheckDetailService.deleteCmfStorecheckDetailByIds(ids));
    }
}
