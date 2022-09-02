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
import com.vrcrm.buy.domain.CmfBuyplanmain;
import com.vrcrm.buy.service.ICmfBuyplanmainService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 采购计划Controller
 * 
 * @author VRer
 * @date 2022-04-14
 */
@RestController
@RequestMapping("/buyplanmain")
public class CmfBuyplanmainController extends BaseController
{
    @Autowired
    private ICmfBuyplanmainService cmfBuyplanmainService;

    /**
     * 查询采购计划列表
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanmain:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfBuyplanmain cmfBuyplanmain)
    {
        startPage();
        List<CmfBuyplanmain> list = cmfBuyplanmainService.selectCmfBuyplanmainList(cmfBuyplanmain);
        return getDataTable(list);
    }

    /**
     * 导出采购计划列表
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanmain:export')")
    @Log(title = "采购计划", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfBuyplanmain cmfBuyplanmain)
    {
        List<CmfBuyplanmain> list = cmfBuyplanmainService.selectCmfBuyplanmainList(cmfBuyplanmain);
        ExcelUtil<CmfBuyplanmain> util = new ExcelUtil<CmfBuyplanmain>(CmfBuyplanmain.class);
        util.exportExcel(response, list, "采购计划数据");
    }

    /**
     * 获取采购计划详细信息
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanmain:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfBuyplanmainService.selectCmfBuyplanmainById(id));
    }

    /**
     * 新增采购计划
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanmain:add')")
    @Log(title = "采购计划", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfBuyplanmain cmfBuyplanmain)
    {
        return toAjax(cmfBuyplanmainService.insertCmfBuyplanmain(cmfBuyplanmain));
    }

    /**
     * 修改采购计划
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanmain:edit')")
    @Log(title = "采购计划", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfBuyplanmain cmfBuyplanmain)
    {
        return toAjax(cmfBuyplanmainService.updateCmfBuyplanmain(cmfBuyplanmain));
    }

    /**
     * 删除采购计划
     */
    @PreAuthorize("@ss.hasPermi('buy:buyplanmain:remove')")
    @Log(title = "采购计划", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfBuyplanmainService.deleteCmfBuyplanmainByIds(ids));
    }
}
