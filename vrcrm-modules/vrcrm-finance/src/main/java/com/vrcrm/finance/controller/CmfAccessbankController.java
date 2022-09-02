package com.vrcrm.finance.controller;

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
import com.vrcrm.finance.domain.CmfAccessbank;
import com.vrcrm.finance.service.ICmfAccessbankService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 帐号操作Controller
 * 
 * @author VRer
 * @date 2022-04-13
 */
@RestController
@RequestMapping("/accessbank")
public class CmfAccessbankController extends BaseController
{
    @Autowired
    private ICmfAccessbankService cmfAccessbankService;

    /**
     * 查询帐号操作列表
     */
    @PreAuthorize("@ss.hasPermi('finance:accessbank:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfAccessbank cmfAccessbank)
    {
        startPage();
        List<CmfAccessbank> list = cmfAccessbankService.selectCmfAccessbankList(cmfAccessbank);
        return getDataTable(list);
    }

    /**
     * 导出帐号操作列表
     */
    @PreAuthorize("@ss.hasPermi('finance:accessbank:export')")
    @Log(title = "帐号操作", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfAccessbank cmfAccessbank)
    {
        List<CmfAccessbank> list = cmfAccessbankService.selectCmfAccessbankList(cmfAccessbank);
        ExcelUtil<CmfAccessbank> util = new ExcelUtil<CmfAccessbank>(CmfAccessbank.class);
        util.exportExcel(response, list, "帐号操作数据");
    }

    /**
     * 获取帐号操作详细信息
     */
    @PreAuthorize("@ss.hasPermi('finance:accessbank:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfAccessbankService.selectCmfAccessbankById(id));
    }

    /**
     * 新增帐号操作
     */
    @PreAuthorize("@ss.hasPermi('finance:accessbank:add')")
    @Log(title = "帐号操作", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfAccessbank cmfAccessbank)
    {
        return toAjax(cmfAccessbankService.insertCmfAccessbank(cmfAccessbank));
    }

    /**
     * 修改帐号操作
     */
    @PreAuthorize("@ss.hasPermi('finance:accessbank:edit')")
    @Log(title = "帐号操作", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfAccessbank cmfAccessbank)
    {
        return toAjax(cmfAccessbankService.updateCmfAccessbank(cmfAccessbank));
    }

    /**
     * 删除帐号操作
     */
    @PreAuthorize("@ss.hasPermi('finance:accessbank:remove')")
    @Log(title = "帐号操作", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfAccessbankService.deleteCmfAccessbankByIds(ids));
    }
}
