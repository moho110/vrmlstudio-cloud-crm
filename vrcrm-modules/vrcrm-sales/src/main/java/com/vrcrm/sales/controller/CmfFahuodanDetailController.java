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
import com.vrcrm.sales.domain.CmfFahuodanDetail;
import com.vrcrm.sales.service.ICmfFahuodanDetailService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 发货单明细Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/fahuodanfhdetail")
public class CmfFahuodanDetailController extends BaseController
{
    @Autowired
    private ICmfFahuodanDetailService cmfFahuodanDetailService;

    /**
     * 查询发货单明细列表
     */
    @PreAuthorize("@ss.hasPermi('sales:fhdetail:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfFahuodanDetail cmfFahuodanDetail)
    {
        startPage();
        List<CmfFahuodanDetail> list = cmfFahuodanDetailService.selectCmfFahuodanDetailList(cmfFahuodanDetail);
        return getDataTable(list);
    }

    /**
     * 导出发货单明细列表
     */
    @PreAuthorize("@ss.hasPermi('sales:fhdetail:export')")
    @Log(title = "发货单明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfFahuodanDetail cmfFahuodanDetail)
    {
        List<CmfFahuodanDetail> list = cmfFahuodanDetailService.selectCmfFahuodanDetailList(cmfFahuodanDetail);
        ExcelUtil<CmfFahuodanDetail> util = new ExcelUtil<CmfFahuodanDetail>(CmfFahuodanDetail.class);
        util.exportExcel(response, list, "发货单明细数据");
    }

    /**
     * 获取发货单明细详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:fhdetail:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfFahuodanDetailService.selectCmfFahuodanDetailById(id));
    }

    /**
     * 新增发货单明细
     */
    @PreAuthorize("@ss.hasPermi('sales:fhdetail:add')")
    @Log(title = "发货单明细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfFahuodanDetail cmfFahuodanDetail)
    {
        return toAjax(cmfFahuodanDetailService.insertCmfFahuodanDetail(cmfFahuodanDetail));
    }

    /**
     * 修改发货单明细
     */
    @PreAuthorize("@ss.hasPermi('sales:fhdetail:edit')")
    @Log(title = "发货单明细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfFahuodanDetail cmfFahuodanDetail)
    {
        return toAjax(cmfFahuodanDetailService.updateCmfFahuodanDetail(cmfFahuodanDetail));
    }

    /**
     * 删除发货单明细
     */
    @PreAuthorize("@ss.hasPermi('sales:fhdetail:remove')")
    @Log(title = "发货单明细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfFahuodanDetailService.deleteCmfFahuodanDetailByIds(ids));
    }
}
