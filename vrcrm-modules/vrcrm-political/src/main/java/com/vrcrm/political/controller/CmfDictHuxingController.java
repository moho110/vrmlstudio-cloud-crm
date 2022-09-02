package com.vrcrm.political.controller;

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
import com.vrcrm.political.domain.CmfDictHuxing;
import com.vrcrm.political.service.ICmfDictHuxingService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 户型Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/dicthuxing")
public class CmfDictHuxingController extends BaseController
{
    @Autowired
    private ICmfDictHuxingService cmfDictHuxingService;

    /**
     * 查询户型列表
     */
    @PreAuthorize("@ss.hasPermi('political:huxing:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfDictHuxing cmfDictHuxing)
    {
        startPage();
        List<CmfDictHuxing> list = cmfDictHuxingService.selectCmfDictHuxingList(cmfDictHuxing);
        return getDataTable(list);
    }

    /**
     * 导出户型列表
     */
    @PreAuthorize("@ss.hasPermi('political:huxing:export')")
    @Log(title = "户型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfDictHuxing cmfDictHuxing)
    {
        List<CmfDictHuxing> list = cmfDictHuxingService.selectCmfDictHuxingList(cmfDictHuxing);
        ExcelUtil<CmfDictHuxing> util = new ExcelUtil<CmfDictHuxing>(CmfDictHuxing.class);
        util.exportExcel(response, list, "户型数据");
    }

    /**
     * 获取户型详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:huxing:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfDictHuxingService.selectCmfDictHuxingById(id));
    }

    /**
     * 新增户型
     */
    @PreAuthorize("@ss.hasPermi('political:huxing:add')")
    @Log(title = "户型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfDictHuxing cmfDictHuxing)
    {
        return toAjax(cmfDictHuxingService.insertCmfDictHuxing(cmfDictHuxing));
    }

    /**
     * 修改户型
     */
    @PreAuthorize("@ss.hasPermi('political:huxing:edit')")
    @Log(title = "户型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfDictHuxing cmfDictHuxing)
    {
        return toAjax(cmfDictHuxingService.updateCmfDictHuxing(cmfDictHuxing));
    }

    /**
     * 删除户型
     */
    @PreAuthorize("@ss.hasPermi('political:huxing:remove')")
    @Log(title = "户型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfDictHuxingService.deleteCmfDictHuxingByIds(ids));
    }
}
