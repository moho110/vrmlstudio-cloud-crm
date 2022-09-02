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
import com.vrcrm.basicdata.domain.CmfCertificatetype;
import com.vrcrm.basicdata.service.ICmfCertificatetypeService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 认证类型Controller
 * 
 * @author VRer
 * @date 2022-04-14
 */
@RestController
@RequestMapping("/certificatetype")
public class CmfCertificatetypeController extends BaseController
{
    @Autowired
    private ICmfCertificatetypeService cmfCertificatetypeService;

    /**
     * 查询认证类型列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:certificatetype:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfCertificatetype cmfCertificatetype)
    {
        startPage();
        List<CmfCertificatetype> list = cmfCertificatetypeService.selectCmfCertificatetypeList(cmfCertificatetype);
        return getDataTable(list);
    }

    /**
     * 导出认证类型列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:certificatetype:export')")
    @Log(title = "认证类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfCertificatetype cmfCertificatetype)
    {
        List<CmfCertificatetype> list = cmfCertificatetypeService.selectCmfCertificatetypeList(cmfCertificatetype);
        ExcelUtil<CmfCertificatetype> util = new ExcelUtil<CmfCertificatetype>(CmfCertificatetype.class);
        util.exportExcel(response, list, "认证类型数据");
    }

    /**
     * 获取认证类型详细信息
     */
    @PreAuthorize("@ss.hasPermi('basicdata:certificatetype:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfCertificatetypeService.selectCmfCertificatetypeById(id));
    }

    /**
     * 新增认证类型
     */
    @PreAuthorize("@ss.hasPermi('basicdata:certificatetype:add')")
    @Log(title = "认证类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfCertificatetype cmfCertificatetype)
    {
        return toAjax(cmfCertificatetypeService.insertCmfCertificatetype(cmfCertificatetype));
    }

    /**
     * 修改认证类型
     */
    @PreAuthorize("@ss.hasPermi('basicdata:certificatetype:edit')")
    @Log(title = "认证类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfCertificatetype cmfCertificatetype)
    {
        return toAjax(cmfCertificatetypeService.updateCmfCertificatetype(cmfCertificatetype));
    }

    /**
     * 删除认证类型
     */
    @PreAuthorize("@ss.hasPermi('basicdata:certificatetype:remove')")
    @Log(title = "认证类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfCertificatetypeService.deleteCmfCertificatetypeByIds(ids));
    }
}
