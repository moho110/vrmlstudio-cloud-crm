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
import com.vrcrm.hr.domain.CmfHrmsFileLizhi;
import com.vrcrm.hr.service.ICmfHrmsFileLizhiService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 人员离职Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/hrmsfilelizhi")
public class CmfHrmsFileLizhiController extends BaseController
{
    @Autowired
    private ICmfHrmsFileLizhiService cmfHrmsFileLizhiService;

    /**
     * 查询人员离职列表
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfilelizhi:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfHrmsFileLizhi cmfHrmsFileLizhi)
    {
        startPage();
        List<CmfHrmsFileLizhi> list = cmfHrmsFileLizhiService.selectCmfHrmsFileLizhiList(cmfHrmsFileLizhi);
        return getDataTable(list);
    }

    /**
     * 导出人员离职列表
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfilelizhi:export')")
    @Log(title = "人员离职", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfHrmsFileLizhi cmfHrmsFileLizhi)
    {
        List<CmfHrmsFileLizhi> list = cmfHrmsFileLizhiService.selectCmfHrmsFileLizhiList(cmfHrmsFileLizhi);
        ExcelUtil<CmfHrmsFileLizhi> util = new ExcelUtil<CmfHrmsFileLizhi>(CmfHrmsFileLizhi.class);
        util.exportExcel(response, list, "人员离职数据");
    }

    /**
     * 获取人员离职详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfilelizhi:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfHrmsFileLizhiService.selectCmfHrmsFileLizhiById(id));
    }

    /**
     * 新增人员离职
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfilelizhi:add')")
    @Log(title = "人员离职", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfHrmsFileLizhi cmfHrmsFileLizhi)
    {
        return toAjax(cmfHrmsFileLizhiService.insertCmfHrmsFileLizhi(cmfHrmsFileLizhi));
    }

    /**
     * 修改人员离职
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfilelizhi:edit')")
    @Log(title = "人员离职", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfHrmsFileLizhi cmfHrmsFileLizhi)
    {
        return toAjax(cmfHrmsFileLizhiService.updateCmfHrmsFileLizhi(cmfHrmsFileLizhi));
    }

    /**
     * 删除人员离职
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsfilelizhi:remove')")
    @Log(title = "人员离职", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfHrmsFileLizhiService.deleteCmfHrmsFileLizhiByIds(ids));
    }
}
