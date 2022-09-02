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
import com.vrcrm.hr.domain.CmfDictXingzhengQingjia;
import com.vrcrm.hr.service.ICmfDictXingzhengQingjiaService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 行政请假Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/xingzhengqingjia")
public class CmfDictXingzhengQingjiaController extends BaseController
{
    @Autowired
    private ICmfDictXingzhengQingjiaService cmfDictXingzhengQingjiaService;

    /**
     * 查询行政请假列表
     */
    @PreAuthorize("@ss.hasPermi('hr:xingzhengqingjia:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfDictXingzhengQingjia cmfDictXingzhengQingjia)
    {
        startPage();
        List<CmfDictXingzhengQingjia> list = cmfDictXingzhengQingjiaService.selectCmfDictXingzhengQingjiaList(cmfDictXingzhengQingjia);
        return getDataTable(list);
    }

    /**
     * 导出行政请假列表
     */
    @PreAuthorize("@ss.hasPermi('hr:xingzhengqingjia:export')")
    @Log(title = "行政请假", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfDictXingzhengQingjia cmfDictXingzhengQingjia)
    {
        List<CmfDictXingzhengQingjia> list = cmfDictXingzhengQingjiaService.selectCmfDictXingzhengQingjiaList(cmfDictXingzhengQingjia);
        ExcelUtil<CmfDictXingzhengQingjia> util = new ExcelUtil<CmfDictXingzhengQingjia>(CmfDictXingzhengQingjia.class);
        util.exportExcel(response, list, "行政请假数据");
    }

    /**
     * 获取行政请假详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:xingzhengqingjia:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfDictXingzhengQingjiaService.selectCmfDictXingzhengQingjiaById(id));
    }

    /**
     * 新增行政请假
     */
    @PreAuthorize("@ss.hasPermi('hr:xingzhengqingjia:add')")
    @Log(title = "行政请假", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfDictXingzhengQingjia cmfDictXingzhengQingjia)
    {
        return toAjax(cmfDictXingzhengQingjiaService.insertCmfDictXingzhengQingjia(cmfDictXingzhengQingjia));
    }

    /**
     * 修改行政请假
     */
    @PreAuthorize("@ss.hasPermi('hr:xingzhengqingjia:edit')")
    @Log(title = "行政请假", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfDictXingzhengQingjia cmfDictXingzhengQingjia)
    {
        return toAjax(cmfDictXingzhengQingjiaService.updateCmfDictXingzhengQingjia(cmfDictXingzhengQingjia));
    }

    /**
     * 删除行政请假
     */
    @PreAuthorize("@ss.hasPermi('hr:xingzhengqingjia:remove')")
    @Log(title = "行政请假", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfDictXingzhengQingjiaService.deleteCmfDictXingzhengQingjiaByIds(ids));
    }
}
