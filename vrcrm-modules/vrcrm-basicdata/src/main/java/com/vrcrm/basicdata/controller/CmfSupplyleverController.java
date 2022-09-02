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
import com.vrcrm.basicdata.domain.CmfSupplylever;
import com.vrcrm.basicdata.service.ICmfSupplyleverService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 供应商等级Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/supplylever")
public class CmfSupplyleverController extends BaseController
{
    @Autowired
    private ICmfSupplyleverService cmfSupplyleverService;

    /**
     * 查询供应商等级列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:supplylever:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfSupplylever cmfSupplylever)
    {
        startPage();
        List<CmfSupplylever> list = cmfSupplyleverService.selectCmfSupplyleverList(cmfSupplylever);
        return getDataTable(list);
    }

    /**
     * 导出供应商等级列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:supplylever:export')")
    @Log(title = "供应商等级", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfSupplylever cmfSupplylever)
    {
        List<CmfSupplylever> list = cmfSupplyleverService.selectCmfSupplyleverList(cmfSupplylever);
        ExcelUtil<CmfSupplylever> util = new ExcelUtil<CmfSupplylever>(CmfSupplylever.class);
        util.exportExcel(response, list, "供应商等级数据");
    }

    /**
     * 获取供应商等级详细信息
     */
    @PreAuthorize("@ss.hasPermi('basicdata:supplylever:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfSupplyleverService.selectCmfSupplyleverById(id));
    }

    /**
     * 新增供应商等级
     */
    @PreAuthorize("@ss.hasPermi('basicdata:supplylever:add')")
    @Log(title = "供应商等级", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfSupplylever cmfSupplylever)
    {
        return toAjax(cmfSupplyleverService.insertCmfSupplylever(cmfSupplylever));
    }

    /**
     * 修改供应商等级
     */
    @PreAuthorize("@ss.hasPermi('basicdata:supplylever:edit')")
    @Log(title = "供应商等级", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfSupplylever cmfSupplylever)
    {
        return toAjax(cmfSupplyleverService.updateCmfSupplylever(cmfSupplylever));
    }

    /**
     * 删除供应商等级
     */
    @PreAuthorize("@ss.hasPermi('basicdata:supplylever:remove')")
    @Log(title = "供应商等级", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfSupplyleverService.deleteCmfSupplyleverByIds(ids));
    }
}
