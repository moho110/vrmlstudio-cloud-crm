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
import com.vrcrm.finance.domain.CmfBankzhuru;
import com.vrcrm.finance.service.ICmfBankzhuruService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 帐户注入Controller
 * 
 * @author VRer
 * @date 2022-04-14
 */
@RestController
@RequestMapping("/bankzhuru")
public class CmfBankzhuruController extends BaseController
{
    @Autowired
    private ICmfBankzhuruService cmfBankzhuruService;

    /**
     * 查询帐户注入列表
     */
    @PreAuthorize("@ss.hasPermi('finance:bankzhuru:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfBankzhuru cmfBankzhuru)
    {
        startPage();
        List<CmfBankzhuru> list = cmfBankzhuruService.selectCmfBankzhuruList(cmfBankzhuru);
        return getDataTable(list);
    }

    /**
     * 导出帐户注入列表
     */
    @PreAuthorize("@ss.hasPermi('finance:bankzhuru:export')")
    @Log(title = "帐户注入", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfBankzhuru cmfBankzhuru)
    {
        List<CmfBankzhuru> list = cmfBankzhuruService.selectCmfBankzhuruList(cmfBankzhuru);
        ExcelUtil<CmfBankzhuru> util = new ExcelUtil<CmfBankzhuru>(CmfBankzhuru.class);
        util.exportExcel(response, list, "帐户注入数据");
    }

    /**
     * 获取帐户注入详细信息
     */
    @PreAuthorize("@ss.hasPermi('finance:bankzhuru:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfBankzhuruService.selectCmfBankzhuruById(id));
    }

    /**
     * 新增帐户注入
     */
    @PreAuthorize("@ss.hasPermi('finance:bankzhuru:add')")
    @Log(title = "帐户注入", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfBankzhuru cmfBankzhuru)
    {
        return toAjax(cmfBankzhuruService.insertCmfBankzhuru(cmfBankzhuru));
    }

    /**
     * 修改帐户注入
     */
    @PreAuthorize("@ss.hasPermi('finance:bankzhuru:edit')")
    @Log(title = "帐户注入", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfBankzhuru cmfBankzhuru)
    {
        return toAjax(cmfBankzhuruService.updateCmfBankzhuru(cmfBankzhuru));
    }

    /**
     * 删除帐户注入
     */
    @PreAuthorize("@ss.hasPermi('finance:bankzhuru:remove')")
    @Log(title = "帐户注入", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfBankzhuruService.deleteCmfBankzhuruByIds(ids));
    }
}
