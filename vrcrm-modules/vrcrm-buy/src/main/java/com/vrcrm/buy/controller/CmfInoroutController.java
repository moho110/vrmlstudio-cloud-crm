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
import com.vrcrm.buy.domain.CmfInorout;
import com.vrcrm.buy.service.ICmfInoroutService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 输入输出Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/inorout")
public class CmfInoroutController extends BaseController
{
    @Autowired
    private ICmfInoroutService cmfInoroutService;

    /**
     * 查询输入输出列表
     */
    @PreAuthorize("@ss.hasPermi('buy:inorout:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfInorout cmfInorout)
    {
        startPage();
        List<CmfInorout> list = cmfInoroutService.selectCmfInoroutList(cmfInorout);
        return getDataTable(list);
    }

    /**
     * 导出输入输出列表
     */
    @PreAuthorize("@ss.hasPermi('buy:inorout:export')")
    @Log(title = "输入输出", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfInorout cmfInorout)
    {
        List<CmfInorout> list = cmfInoroutService.selectCmfInoroutList(cmfInorout);
        ExcelUtil<CmfInorout> util = new ExcelUtil<CmfInorout>(CmfInorout.class);
        util.exportExcel(response, list, "输入输出数据");
    }

    /**
     * 获取输入输出详细信息
     */
    @PreAuthorize("@ss.hasPermi('buy:inorout:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfInoroutService.selectCmfInoroutById(id));
    }

    /**
     * 新增输入输出
     */
    @PreAuthorize("@ss.hasPermi('buy:inorout:add')")
    @Log(title = "输入输出", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfInorout cmfInorout)
    {
        return toAjax(cmfInoroutService.insertCmfInorout(cmfInorout));
    }

    /**
     * 修改输入输出
     */
    @PreAuthorize("@ss.hasPermi('buy:inorout:edit')")
    @Log(title = "输入输出", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfInorout cmfInorout)
    {
        return toAjax(cmfInoroutService.updateCmfInorout(cmfInorout));
    }

    /**
     * 删除输入输出
     */
    @PreAuthorize("@ss.hasPermi('buy:inorout:remove')")
    @Log(title = "输入输出", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfInoroutService.deleteCmfInoroutByIds(ids));
    }
}
