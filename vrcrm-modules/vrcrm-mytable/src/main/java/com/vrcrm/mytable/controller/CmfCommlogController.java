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
import com.vrcrm.mytable.domain.CmfCommlog;
import com.vrcrm.mytable.service.ICmfCommlogService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 通用日志Controller
 * 
 * @author VRer
 * @date 2022-04-14
 */
@RestController
@RequestMapping("/commlog")
public class CmfCommlogController extends BaseController
{
    @Autowired
    private ICmfCommlogService cmfCommlogService;

    /**
     * 查询通用日志列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:commlog:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfCommlog cmfCommlog)
    {
        startPage();
        List<CmfCommlog> list = cmfCommlogService.selectCmfCommlogList(cmfCommlog);
        return getDataTable(list);
    }

    /**
     * 导出通用日志列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:commlog:export')")
    @Log(title = "通用日志", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfCommlog cmfCommlog)
    {
        List<CmfCommlog> list = cmfCommlogService.selectCmfCommlogList(cmfCommlog);
        ExcelUtil<CmfCommlog> util = new ExcelUtil<CmfCommlog>(CmfCommlog.class);
        util.exportExcel(response, list, "通用日志数据");
    }

    /**
     * 获取通用日志详细信息
     */
    @PreAuthorize("@ss.hasPermi('mytable:commlog:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfCommlogService.selectCmfCommlogById(id));
    }

    /**
     * 新增通用日志
     */
    @PreAuthorize("@ss.hasPermi('mytable:commlog:add')")
    @Log(title = "通用日志", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfCommlog cmfCommlog)
    {
        return toAjax(cmfCommlogService.insertCmfCommlog(cmfCommlog));
    }

    /**
     * 修改通用日志
     */
    @PreAuthorize("@ss.hasPermi('mytable:commlog:edit')")
    @Log(title = "通用日志", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfCommlog cmfCommlog)
    {
        return toAjax(cmfCommlogService.updateCmfCommlog(cmfCommlog));
    }

    /**
     * 删除通用日志
     */
    @PreAuthorize("@ss.hasPermi('mytable:commlog:remove')")
    @Log(title = "通用日志", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfCommlogService.deleteCmfCommlogByIds(ids));
    }
}
