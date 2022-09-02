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
import com.vrcrm.sales.domain.CmfSellcontractJiaofu;
import com.vrcrm.sales.service.ICmfSellcontractJiaofuService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 销售合同交付管理Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/sellcontractjiaofu")
public class CmfSellcontractJiaofuController extends BaseController
{
    @Autowired
    private ICmfSellcontractJiaofuService cmfSellcontractJiaofuService;

    /**
     * 查询销售合同交付管理列表
     */
    @PreAuthorize("@ss.hasPermi('sales:jiaofu:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfSellcontractJiaofu cmfSellcontractJiaofu)
    {
        startPage();
        List<CmfSellcontractJiaofu> list = cmfSellcontractJiaofuService.selectCmfSellcontractJiaofuList(cmfSellcontractJiaofu);
        return getDataTable(list);
    }

    /**
     * 导出销售合同交付管理列表
     */
    @PreAuthorize("@ss.hasPermi('sales:jiaofu:export')")
    @Log(title = "销售合同交付管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfSellcontractJiaofu cmfSellcontractJiaofu)
    {
        List<CmfSellcontractJiaofu> list = cmfSellcontractJiaofuService.selectCmfSellcontractJiaofuList(cmfSellcontractJiaofu);
        ExcelUtil<CmfSellcontractJiaofu> util = new ExcelUtil<CmfSellcontractJiaofu>(CmfSellcontractJiaofu.class);
        util.exportExcel(response, list, "销售合同交付管理数据");
    }

    /**
     * 获取销售合同交付管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('sales:jiaofu:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfSellcontractJiaofuService.selectCmfSellcontractJiaofuById(id));
    }

    /**
     * 新增销售合同交付管理
     */
    @PreAuthorize("@ss.hasPermi('sales:jiaofu:add')")
    @Log(title = "销售合同交付管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfSellcontractJiaofu cmfSellcontractJiaofu)
    {
        return toAjax(cmfSellcontractJiaofuService.insertCmfSellcontractJiaofu(cmfSellcontractJiaofu));
    }

    /**
     * 修改销售合同交付管理
     */
    @PreAuthorize("@ss.hasPermi('sales:jiaofu:edit')")
    @Log(title = "销售合同交付管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfSellcontractJiaofu cmfSellcontractJiaofu)
    {
        return toAjax(cmfSellcontractJiaofuService.updateCmfSellcontractJiaofu(cmfSellcontractJiaofu));
    }

    /**
     * 删除销售合同交付管理
     */
    @PreAuthorize("@ss.hasPermi('sales:jiaofu:remove')")
    @Log(title = "销售合同交付管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfSellcontractJiaofuService.deleteCmfSellcontractJiaofuByIds(ids));
    }
}
