package com.vrcrm.mytable.controller;

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
import com.vrcrm.mytable.domain.CmfDictNotify;
import com.vrcrm.mytable.service.ICmfDictNotifyService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 紧急程度Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/dictnotify")
public class CmfDictNotifyController extends BaseController
{
    @Autowired
    private ICmfDictNotifyService cmfDictNotifyService;

    /**
     * 查询紧急程度列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:dictnotify:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfDictNotify cmfDictNotify)
    {
        startPage();
        List<CmfDictNotify> list = cmfDictNotifyService.selectCmfDictNotifyList(cmfDictNotify);
        return getDataTable(list);
    }

    /**
     * 导出紧急程度列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:dictnotify:export')")
    @Log(title = "紧急程度", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfDictNotify cmfDictNotify)
    {
        List<CmfDictNotify> list = cmfDictNotifyService.selectCmfDictNotifyList(cmfDictNotify);
        ExcelUtil<CmfDictNotify> util = new ExcelUtil<CmfDictNotify>(CmfDictNotify.class);
        util.exportExcel(response, list, "紧急程度数据");
    }

    /**
     * 获取紧急程度详细信息
     */
    @PreAuthorize("@ss.hasPermi('mytable:dictnotify:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfDictNotifyService.selectCmfDictNotifyById(id));
    }

    /**
     * 新增紧急程度
     */
    @PreAuthorize("@ss.hasPermi('mytable:dictnotify:add')")
    @Log(title = "紧急程度", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfDictNotify cmfDictNotify)
    {
        return toAjax(cmfDictNotifyService.insertCmfDictNotify(cmfDictNotify));
    }

    /**
     * 修改紧急程度
     */
    @PreAuthorize("@ss.hasPermi('mytable:dictnotify:edit')")
    @Log(title = "紧急程度", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfDictNotify cmfDictNotify)
    {
        return toAjax(cmfDictNotifyService.updateCmfDictNotify(cmfDictNotify));
    }

    /**
     * 删除紧急程度
     */
    @PreAuthorize("@ss.hasPermi('mytable:dictnotify:remove')")
    @Log(title = "紧急程度", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfDictNotifyService.deleteCmfDictNotifyByIds(ids));
    }
}
