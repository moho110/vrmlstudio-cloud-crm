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
import com.vrcrm.hr.domain.CmfHrmsWorkerZhengzhao;
import com.vrcrm.hr.service.ICmfHrmsWorkerZhengzhaoService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 工作人员证照Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/hrmsworkszhengzhao")
public class CmfHrmsWorkerZhengzhaoController extends BaseController
{
    @Autowired
    private ICmfHrmsWorkerZhengzhaoService cmfHrmsWorkerZhengzhaoService;

    /**
     * 查询工作人员证照列表
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsworkszhengzhao:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfHrmsWorkerZhengzhao cmfHrmsWorkerZhengzhao)
    {
        startPage();
        List<CmfHrmsWorkerZhengzhao> list = cmfHrmsWorkerZhengzhaoService.selectCmfHrmsWorkerZhengzhaoList(cmfHrmsWorkerZhengzhao);
        return getDataTable(list);
    }

    /**
     * 导出工作人员证照列表
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsworkszhengzhao:export')")
    @Log(title = "工作人员证照", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfHrmsWorkerZhengzhao cmfHrmsWorkerZhengzhao)
    {
        List<CmfHrmsWorkerZhengzhao> list = cmfHrmsWorkerZhengzhaoService.selectCmfHrmsWorkerZhengzhaoList(cmfHrmsWorkerZhengzhao);
        ExcelUtil<CmfHrmsWorkerZhengzhao> util = new ExcelUtil<CmfHrmsWorkerZhengzhao>(CmfHrmsWorkerZhengzhao.class);
        util.exportExcel(response, list, "工作人员证照数据");
    }

    /**
     * 获取工作人员证照详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsworkszhengzhao:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfHrmsWorkerZhengzhaoService.selectCmfHrmsWorkerZhengzhaoById(id));
    }

    /**
     * 新增工作人员证照
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsworkszhengzhao:add')")
    @Log(title = "工作人员证照", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfHrmsWorkerZhengzhao cmfHrmsWorkerZhengzhao)
    {
        return toAjax(cmfHrmsWorkerZhengzhaoService.insertCmfHrmsWorkerZhengzhao(cmfHrmsWorkerZhengzhao));
    }

    /**
     * 修改工作人员证照
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsworkszhengzhao:edit')")
    @Log(title = "工作人员证照", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfHrmsWorkerZhengzhao cmfHrmsWorkerZhengzhao)
    {
        return toAjax(cmfHrmsWorkerZhengzhaoService.updateCmfHrmsWorkerZhengzhao(cmfHrmsWorkerZhengzhao));
    }

    /**
     * 删除工作人员证照
     */
    @PreAuthorize("@ss.hasPermi('hr:hrmsworkszhengzhao:remove')")
    @Log(title = "工作人员证照", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfHrmsWorkerZhengzhaoService.deleteCmfHrmsWorkerZhengzhaoByIds(ids));
    }
}
