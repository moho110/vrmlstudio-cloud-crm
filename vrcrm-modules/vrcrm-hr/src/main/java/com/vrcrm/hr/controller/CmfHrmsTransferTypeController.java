package com.vrcrm.hr.controller;

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
import com.vrcrm.hr.domain.CmfHrmsTransferType;
import com.vrcrm.hr.service.ICmfHrmsTransferTypeService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 转职类型Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/hrmstransfertype")
public class CmfHrmsTransferTypeController extends BaseController
{
    @Autowired
    private ICmfHrmsTransferTypeService cmfHrmsTransferTypeService;

    /**
     * 查询转职类型列表
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmstransfertype:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfHrmsTransferType cmfHrmsTransferType)
    {
        startPage();
        List<CmfHrmsTransferType> list = cmfHrmsTransferTypeService.selectCmfHrmsTransferTypeList(cmfHrmsTransferType);
        return getDataTable(list);
    }

    /**
     * 导出转职类型列表
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmstransfertype:export')")
    @Log(title = "转职类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfHrmsTransferType cmfHrmsTransferType)
    {
        List<CmfHrmsTransferType> list = cmfHrmsTransferTypeService.selectCmfHrmsTransferTypeList(cmfHrmsTransferType);
        ExcelUtil<CmfHrmsTransferType> util = new ExcelUtil<CmfHrmsTransferType>(CmfHrmsTransferType.class);
        util.exportExcel(response, list, "转职类型数据");
    }

    /**
     * 获取转职类型详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmstransfertype:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfHrmsTransferTypeService.selectCmfHrmsTransferTypeById(id));
    }

    /**
     * 新增转职类型
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmstransfertype:add')")
    @Log(title = "转职类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfHrmsTransferType cmfHrmsTransferType)
    {
        return toAjax(cmfHrmsTransferTypeService.insertCmfHrmsTransferType(cmfHrmsTransferType));
    }

    /**
     * 修改转职类型
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmstransfertype:edit')")
    @Log(title = "转职类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfHrmsTransferType cmfHrmsTransferType)
    {
        return toAjax(cmfHrmsTransferTypeService.updateCmfHrmsTransferType(cmfHrmsTransferType));
    }

    /**
     * 删除转职类型
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmstransfertype:remove')")
    @Log(title = "转职类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfHrmsTransferTypeService.deleteCmfHrmsTransferTypeByIds(ids));
    }
}
