package com.vrcrm.basicdata.controller;

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
import com.vrcrm.basicdata.domain.CmfNotify;
import com.vrcrm.basicdata.service.ICmfNotifyService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 公告通知Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/basicnotify")
public class CmfNotifyController extends BaseController
{
    @Autowired
    private ICmfNotifyService cmfNotifyService;

    /**
     * 查询公告通知列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:basicnotify:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfNotify cmfNotify)
    {
        startPage();
        List<CmfNotify> list = cmfNotifyService.selectCmfNotifyList(cmfNotify);
        return getDataTable(list);
    }

    /**
     * 导出公告通知列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:basicnotify:export')")
    @Log(title = "公告通知", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfNotify cmfNotify)
    {
        List<CmfNotify> list = cmfNotifyService.selectCmfNotifyList(cmfNotify);
        ExcelUtil<CmfNotify> util = new ExcelUtil<CmfNotify>(CmfNotify.class);
        util.exportExcel(response, list, "公告通知数据");
    }

    /**
     * 获取公告通知详细信息
     */
    @PreAuthorize("@ss.hasPermi('basicdata:basicnotify:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfNotifyService.selectCmfNotifyById(id));
    }

    /**
     * 新增公告通知
     */
    @PreAuthorize("@ss.hasPermi('basicdata:basicnotify:add')")
    @Log(title = "公告通知", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfNotify cmfNotify)
    {
        return toAjax(cmfNotifyService.insertCmfNotify(cmfNotify));
    }

    /**
     * 修改公告通知
     */
    @PreAuthorize("@ss.hasPermi('basicdata:basicnotify:edit')")
    @Log(title = "公告通知", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfNotify cmfNotify)
    {
        return toAjax(cmfNotifyService.updateCmfNotify(cmfNotify));
    }

    /**
     * 删除公告通知
     */
    @PreAuthorize("@ss.hasPermi('basicdata:basicnotify:remove')")
    @Log(title = "公告通知", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfNotifyService.deleteCmfNotifyByIds(ids));
    }
}
