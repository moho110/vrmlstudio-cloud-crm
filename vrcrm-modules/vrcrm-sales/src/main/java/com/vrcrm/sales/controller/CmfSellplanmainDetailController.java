package com.vrcrm.sales.controller;

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
import com.vrcrm.sales.domain.CmfSellplanmainDetail;
import com.vrcrm.sales.service.ICmfSellplanmainDetailService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 销售计划明细Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/sellplanmaindetail")
public class CmfSellplanmainDetailController extends BaseController
{
    @Autowired
    private ICmfSellplanmainDetailService cmfSellplanmainDetailService;

    /**
     * 查询销售计划明细列表
     */
    @PreAuthorize("@ss.hasPermi('sales:salesdetail:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfSellplanmainDetail cmfSellplanmainDetail)
    {
        startPage();
        List<CmfSellplanmainDetail> list = cmfSellplanmainDetailService.selectCmfSellplanmainDetailList(cmfSellplanmainDetail);
        return getDataTable(list);
    }

    /**
     * 导出销售计划明细列表
     */
    @PreAuthorize("@ss.hasPermi('sales:salesdetail:export')")
    @Log(title = "销售计划明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfSellplanmainDetail cmfSellplanmainDetail)
    {
        List<CmfSellplanmainDetail> list = cmfSellplanmainDetailService.selectCmfSellplanmainDetailList(cmfSellplanmainDetail);
        ExcelUtil<CmfSellplanmainDetail> util = new ExcelUtil<CmfSellplanmainDetail>(CmfSellplanmainDetail.class);
        util.exportExcel(response, list, "销售计划明细数据");
    }

    /**
     * 获取销售计划明细详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:salesdetail:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfSellplanmainDetailService.selectCmfSellplanmainDetailById(id));
    }

    /**
     * 新增销售计划明细
     */
    @PreAuthorize("@ss.hasPermi('sales:salesdetail:add')")
    @Log(title = "销售计划明细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfSellplanmainDetail cmfSellplanmainDetail)
    {
        return toAjax(cmfSellplanmainDetailService.insertCmfSellplanmainDetail(cmfSellplanmainDetail));
    }

    /**
     * 修改销售计划明细
     */
    @PreAuthorize("@ss.hasPermi('sales:salesdetail:edit')")
    @Log(title = "销售计划明细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfSellplanmainDetail cmfSellplanmainDetail)
    {
        return toAjax(cmfSellplanmainDetailService.updateCmfSellplanmainDetail(cmfSellplanmainDetail));
    }

    /**
     * 删除销售计划明细
     */
    @PreAuthorize("@ss.hasPermi('sales:salesdetail:remove')")
    @Log(title = "销售计划明细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfSellplanmainDetailService.deleteCmfSellplanmainDetailByIds(ids));
    }
}
