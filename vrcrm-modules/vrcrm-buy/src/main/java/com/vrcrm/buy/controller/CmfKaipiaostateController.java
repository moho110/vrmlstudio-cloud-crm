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
import com.vrcrm.buy.domain.CmfKaipiaostate;
import com.vrcrm.buy.service.ICmfKaipiaostateService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 开票状态Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/kaipiaostate")
public class CmfKaipiaostateController extends BaseController
{
    @Autowired
    private ICmfKaipiaostateService cmfKaipiaostateService;

    /**
     * 查询开票状态列表
     */
    @PreAuthorize("@ss.hasPermi('buy:kaipiaostate:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfKaipiaostate cmfKaipiaostate)
    {
        startPage();
        List<CmfKaipiaostate> list = cmfKaipiaostateService.selectCmfKaipiaostateList(cmfKaipiaostate);
        return getDataTable(list);
    }

    /**
     * 导出开票状态列表
     */
    @PreAuthorize("@ss.hasPermi('buy:kaipiaostate:export')")
    @Log(title = "开票状态", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfKaipiaostate cmfKaipiaostate)
    {
        List<CmfKaipiaostate> list = cmfKaipiaostateService.selectCmfKaipiaostateList(cmfKaipiaostate);
        ExcelUtil<CmfKaipiaostate> util = new ExcelUtil<CmfKaipiaostate>(CmfKaipiaostate.class);
        util.exportExcel(response, list, "开票状态数据");
    }

    /**
     * 获取开票状态详细信息
     */
    @PreAuthorize("@ss.hasPermi('buy:kaipiaostate:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfKaipiaostateService.selectCmfKaipiaostateById(id));
    }

    /**
     * 新增开票状态
     */
    @PreAuthorize("@ss.hasPermi('buy:kaipiaostate:add')")
    @Log(title = "开票状态", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfKaipiaostate cmfKaipiaostate)
    {
        return toAjax(cmfKaipiaostateService.insertCmfKaipiaostate(cmfKaipiaostate));
    }

    /**
     * 修改开票状态
     */
    @PreAuthorize("@ss.hasPermi('buy:kaipiaostate:edit')")
    @Log(title = "开票状态", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfKaipiaostate cmfKaipiaostate)
    {
        return toAjax(cmfKaipiaostateService.updateCmfKaipiaostate(cmfKaipiaostate));
    }

    /**
     * 删除开票状态
     */
    @PreAuthorize("@ss.hasPermi('buy:kaipiaostate:remove')")
    @Log(title = "开票状态", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfKaipiaostateService.deleteCmfKaipiaostateByIds(ids));
    }
}
