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
import com.vrcrm.hr.domain.CmfHrmsTransfer;
import com.vrcrm.hr.service.ICmfHrmsTransferService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 转职明细Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/hrmstransfer")
public class CmfHrmsTransferController extends BaseController
{
    @Autowired
    private ICmfHrmsTransferService cmfHrmsTransferService;

    /**
     * 查询转职明细列表
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmstransfer:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfHrmsTransfer cmfHrmsTransfer)
    {
        startPage();
        List<CmfHrmsTransfer> list = cmfHrmsTransferService.selectCmfHrmsTransferList(cmfHrmsTransfer);
        return getDataTable(list);
    }

    /**
     * 导出转职明细列表
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmstransfer:export')")
    @Log(title = "转职明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfHrmsTransfer cmfHrmsTransfer)
    {
        List<CmfHrmsTransfer> list = cmfHrmsTransferService.selectCmfHrmsTransferList(cmfHrmsTransfer);
        ExcelUtil<CmfHrmsTransfer> util = new ExcelUtil<CmfHrmsTransfer>(CmfHrmsTransfer.class);
        util.exportExcel(response, list, "转职明细数据");
    }

    /**
     * 获取转职明细详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmstransfer:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfHrmsTransferService.selectCmfHrmsTransferById(id));
    }

    /**
     * 新增转职明细
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmstransfer:add')")
    @Log(title = "转职明细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfHrmsTransfer cmfHrmsTransfer)
    {
        return toAjax(cmfHrmsTransferService.insertCmfHrmsTransfer(cmfHrmsTransfer));
    }

    /**
     * 修改转职明细
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmstransfer:edit')")
    @Log(title = "转职明细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfHrmsTransfer cmfHrmsTransfer)
    {
        return toAjax(cmfHrmsTransferService.updateCmfHrmsTransfer(cmfHrmsTransfer));
    }

    /**
     * 删除转职明细
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmstransfer:remove')")
    @Log(title = "转职明细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfHrmsTransferService.deleteCmfHrmsTransferByIds(ids));
    }
}
