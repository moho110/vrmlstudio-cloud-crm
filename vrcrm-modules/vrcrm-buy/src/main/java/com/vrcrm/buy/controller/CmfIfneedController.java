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
import com.vrcrm.buy.domain.CmfIfneed;
import com.vrcrm.buy.service.ICmfIfneedService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 是否需求Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/ifneed")
public class CmfIfneedController extends BaseController
{
    @Autowired
    private ICmfIfneedService cmfIfneedService;

    /**
     * 查询是否需求列表
     */
    @PreAuthorize("@ss.hasPermi('buy:ifneed:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfIfneed cmfIfneed)
    {
        startPage();
        List<CmfIfneed> list = cmfIfneedService.selectCmfIfneedList(cmfIfneed);
        return getDataTable(list);
    }

    /**
     * 导出是否需求列表
     */
    @PreAuthorize("@ss.hasPermi('buy:ifneed:export')")
    @Log(title = "是否需求", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfIfneed cmfIfneed)
    {
        List<CmfIfneed> list = cmfIfneedService.selectCmfIfneedList(cmfIfneed);
        ExcelUtil<CmfIfneed> util = new ExcelUtil<CmfIfneed>(CmfIfneed.class);
        util.exportExcel(response, list, "是否需求数据");
    }

    /**
     * 获取是否需求详细信息
     */
    @PreAuthorize("@ss.hasPermi('buy:ifneed:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfIfneedService.selectCmfIfneedById(id));
    }

    /**
     * 新增是否需求
     */
    @PreAuthorize("@ss.hasPermi('buy:ifneed:add')")
    @Log(title = "是否需求", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfIfneed cmfIfneed)
    {
        return toAjax(cmfIfneedService.insertCmfIfneed(cmfIfneed));
    }

    /**
     * 修改是否需求
     */
    @PreAuthorize("@ss.hasPermi('buy:ifneed:edit')")
    @Log(title = "是否需求", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfIfneed cmfIfneed)
    {
        return toAjax(cmfIfneedService.updateCmfIfneed(cmfIfneed));
    }

    /**
     * 删除是否需求
     */
    @PreAuthorize("@ss.hasPermi('buy:ifneed:remove')")
    @Log(title = "是否需求", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfIfneedService.deleteCmfIfneedByIds(ids));
    }
}
