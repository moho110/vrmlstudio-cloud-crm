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
import com.vrcrm.basicdata.domain.CmfCrmJieduan;
import com.vrcrm.basicdata.service.ICmfCrmJieduanService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 阶段Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/jieduan")
public class CmfCrmJieduanController extends BaseController
{
    @Autowired
    private ICmfCrmJieduanService cmfCrmJieduanService;

    /**
     * 查询阶段列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:jieduan:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfCrmJieduan cmfCrmJieduan)
    {
        startPage();
        List<CmfCrmJieduan> list = cmfCrmJieduanService.selectCmfCrmJieduanList(cmfCrmJieduan);
        return getDataTable(list);
    }

    /**
     * 导出阶段列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:jieduan:export')")
    @Log(title = "阶段", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfCrmJieduan cmfCrmJieduan)
    {
        List<CmfCrmJieduan> list = cmfCrmJieduanService.selectCmfCrmJieduanList(cmfCrmJieduan);
        ExcelUtil<CmfCrmJieduan> util = new ExcelUtil<CmfCrmJieduan>(CmfCrmJieduan.class);
        util.exportExcel(response, list, "阶段数据");
    }

    /**
     * 获取阶段详细信息
     */
    @PreAuthorize("@ss.hasPermi('basicdata:jieduan:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfCrmJieduanService.selectCmfCrmJieduanById(id));
    }

    /**
     * 新增阶段
     */
    @PreAuthorize("@ss.hasPermi('basicdata:jieduan:add')")
    @Log(title = "阶段", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfCrmJieduan cmfCrmJieduan)
    {
        return toAjax(cmfCrmJieduanService.insertCmfCrmJieduan(cmfCrmJieduan));
    }

    /**
     * 修改阶段
     */
    @PreAuthorize("@ss.hasPermi('basicdata:jieduan:edit')")
    @Log(title = "阶段", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfCrmJieduan cmfCrmJieduan)
    {
        return toAjax(cmfCrmJieduanService.updateCmfCrmJieduan(cmfCrmJieduan));
    }

    /**
     * 删除阶段
     */
    @PreAuthorize("@ss.hasPermi('basicdata:jieduan:remove')")
    @Log(title = "阶段", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfCrmJieduanService.deleteCmfCrmJieduanByIds(ids));
    }
}
