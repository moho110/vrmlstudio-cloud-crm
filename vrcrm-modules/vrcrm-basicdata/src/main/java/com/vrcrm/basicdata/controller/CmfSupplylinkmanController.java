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
import com.vrcrm.basicdata.domain.CmfSupplylinkman;
import com.vrcrm.basicdata.service.ICmfSupplylinkmanService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 供应商联系人Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/supplylinkman")
public class CmfSupplylinkmanController extends BaseController
{
    @Autowired
    private ICmfSupplylinkmanService cmfSupplylinkmanService;

    /**
     * 查询供应商联系人列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:supplylinkman:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfSupplylinkman cmfSupplylinkman)
    {
        startPage();
        List<CmfSupplylinkman> list = cmfSupplylinkmanService.selectCmfSupplylinkmanList(cmfSupplylinkman);
        return getDataTable(list);
    }

    /**
     * 导出供应商联系人列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:supplylinkman:export')")
    @Log(title = "供应商联系人", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfSupplylinkman cmfSupplylinkman)
    {
        List<CmfSupplylinkman> list = cmfSupplylinkmanService.selectCmfSupplylinkmanList(cmfSupplylinkman);
        ExcelUtil<CmfSupplylinkman> util = new ExcelUtil<CmfSupplylinkman>(CmfSupplylinkman.class);
        util.exportExcel(response, list, "供应商联系人数据");
    }

    /**
     * 获取供应商联系人详细信息
     */
    @PreAuthorize("@ss.hasPermi('basicdata:supplylinkman:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfSupplylinkmanService.selectCmfSupplylinkmanById(id));
    }

    /**
     * 新增供应商联系人
     */
    @PreAuthorize("@ss.hasPermi('basicdata:supplylinkman:add')")
    @Log(title = "供应商联系人", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfSupplylinkman cmfSupplylinkman)
    {
        return toAjax(cmfSupplylinkmanService.insertCmfSupplylinkman(cmfSupplylinkman));
    }

    /**
     * 修改供应商联系人
     */
    @PreAuthorize("@ss.hasPermi('basicdata:supplylinkman:edit')")
    @Log(title = "供应商联系人", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfSupplylinkman cmfSupplylinkman)
    {
        return toAjax(cmfSupplylinkmanService.updateCmfSupplylinkman(cmfSupplylinkman));
    }

    /**
     * 删除供应商联系人
     */
    @PreAuthorize("@ss.hasPermi('basicdata:supplylinkman:remove')")
    @Log(title = "供应商联系人", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfSupplylinkmanService.deleteCmfSupplylinkmanByIds(ids));
    }
}
