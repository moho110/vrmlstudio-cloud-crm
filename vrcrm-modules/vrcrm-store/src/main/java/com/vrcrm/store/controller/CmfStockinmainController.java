package com.vrcrm.store.controller;

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
import com.vrcrm.store.domain.CmfStockinmain;
import com.vrcrm.store.service.ICmfStockinmainService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 仓库管理入库Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/stockinmain")
public class CmfStockinmainController extends BaseController
{
    @Autowired
    private ICmfStockinmainService cmfStockinmainService;

    /**
     * 查询仓库管理入库列表
     */
    @PreAuthorize("@ss.hasPermi('store:stockinmain:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfStockinmain cmfStockinmain)
    {
        startPage();
        List<CmfStockinmain> list = cmfStockinmainService.selectCmfStockinmainList(cmfStockinmain);
        return getDataTable(list);
    }

    /**
     * 导出仓库管理入库列表
     */
    @PreAuthorize("@ss.hasPermi('store:stockinmain:export')")
    @Log(title = "仓库管理入库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfStockinmain cmfStockinmain)
    {
        List<CmfStockinmain> list = cmfStockinmainService.selectCmfStockinmainList(cmfStockinmain);
        ExcelUtil<CmfStockinmain> util = new ExcelUtil<CmfStockinmain>(CmfStockinmain.class);
        util.exportExcel(response, list, "仓库管理入库数据");
    }

    /**
     * 获取仓库管理入库详细信息
     */
    @PreAuthorize("@ss.hasPermi('store:stockinmain:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfStockinmainService.selectCmfStockinmainById(id));
    }

    /**
     * 新增仓库管理入库
     */
    @PreAuthorize("@ss.hasPermi('store:stockinmain:add')")
    @Log(title = "仓库管理入库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfStockinmain cmfStockinmain)
    {
        return toAjax(cmfStockinmainService.insertCmfStockinmain(cmfStockinmain));
    }

    /**
     * 修改仓库管理入库
     */
    @PreAuthorize("@ss.hasPermi('store:stockinmain:edit')")
    @Log(title = "仓库管理入库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfStockinmain cmfStockinmain)
    {
        return toAjax(cmfStockinmainService.updateCmfStockinmain(cmfStockinmain));
    }

    /**
     * 删除仓库管理入库
     */
    @PreAuthorize("@ss.hasPermi('store:stockinmain:remove')")
    @Log(title = "仓库管理入库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfStockinmainService.deleteCmfStockinmainByIds(ids));
    }
}
