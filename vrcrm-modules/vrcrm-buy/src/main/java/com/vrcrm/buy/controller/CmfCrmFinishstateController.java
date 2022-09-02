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
import com.vrcrm.buy.domain.CmfCrmFinishstate;
import com.vrcrm.buy.service.ICmfCrmFinishstateService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 完成状态Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/finishstate")
public class CmfCrmFinishstateController extends BaseController
{
    @Autowired
    private ICmfCrmFinishstateService cmfCrmFinishstateService;

    /**
     * 查询完成状态列表
     */
    @PreAuthorize("@ss.hasPermi('buy:finishstate:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfCrmFinishstate cmfCrmFinishstate)
    {
        startPage();
        List<CmfCrmFinishstate> list = cmfCrmFinishstateService.selectCmfCrmFinishstateList(cmfCrmFinishstate);
        return getDataTable(list);
    }

    /**
     * 导出完成状态列表
     */
    @PreAuthorize("@ss.hasPermi('buy:finishstate:export')")
    @Log(title = "完成状态", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfCrmFinishstate cmfCrmFinishstate)
    {
        List<CmfCrmFinishstate> list = cmfCrmFinishstateService.selectCmfCrmFinishstateList(cmfCrmFinishstate);
        ExcelUtil<CmfCrmFinishstate> util = new ExcelUtil<CmfCrmFinishstate>(CmfCrmFinishstate.class);
        util.exportExcel(response, list, "完成状态数据");
    }

    /**
     * 获取完成状态详细信息
     */
    @PreAuthorize("@ss.hasPermi('buy:finishstate:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfCrmFinishstateService.selectCmfCrmFinishstateById(id));
    }

    /**
     * 新增完成状态
     */
    @PreAuthorize("@ss.hasPermi('buy:finishstate:add')")
    @Log(title = "完成状态", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfCrmFinishstate cmfCrmFinishstate)
    {
        return toAjax(cmfCrmFinishstateService.insertCmfCrmFinishstate(cmfCrmFinishstate));
    }

    /**
     * 修改完成状态
     */
    @PreAuthorize("@ss.hasPermi('buy:finishstate:edit')")
    @Log(title = "完成状态", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfCrmFinishstate cmfCrmFinishstate)
    {
        return toAjax(cmfCrmFinishstateService.updateCmfCrmFinishstate(cmfCrmFinishstate));
    }

    /**
     * 删除完成状态
     */
    @PreAuthorize("@ss.hasPermi('buy:finishstate:remove')")
    @Log(title = "完成状态", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfCrmFinishstateService.deleteCmfCrmFinishstateByIds(ids));
    }
}
