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
import com.vrcrm.hr.domain.CmfEduXingzhengJiabanbuxiu;
import com.vrcrm.hr.service.ICmfEduXingzhengJiabanbuxiuService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;


/**
 * 行政加班补休Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/jiabanbuxiu")
public class CmfEduXingzhengJiabanbuxiuController extends BaseController
{
    @Autowired
    private ICmfEduXingzhengJiabanbuxiuService cmfEduXingzhengJiabanbuxiuService;

    /**
     * 查询行政加班补休列表
     */
    @PreAuthorize("@ss.hasPermi('hr:jiabanbuxiu:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfEduXingzhengJiabanbuxiu cmfEduXingzhengJiabanbuxiu)
    {
        startPage();
        List<CmfEduXingzhengJiabanbuxiu> list = cmfEduXingzhengJiabanbuxiuService.selectCmfEduXingzhengJiabanbuxiuList(cmfEduXingzhengJiabanbuxiu);
        return getDataTable(list);
    }

    /**
     * 导出行政加班补休列表
     */
    @PreAuthorize("@ss.hasPermi('hr:jiabanbuxiu:export')")
    @Log(title = "行政加班补休", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfEduXingzhengJiabanbuxiu cmfEduXingzhengJiabanbuxiu)
    {
        List<CmfEduXingzhengJiabanbuxiu> list = cmfEduXingzhengJiabanbuxiuService.selectCmfEduXingzhengJiabanbuxiuList(cmfEduXingzhengJiabanbuxiu);
        ExcelUtil<CmfEduXingzhengJiabanbuxiu> util = new ExcelUtil<CmfEduXingzhengJiabanbuxiu>(CmfEduXingzhengJiabanbuxiu.class);
        util.exportExcel(response, list, "行政加班补休数据");
    }

    /**
     * 获取行政加班补休详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:jiabanbuxiu:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfEduXingzhengJiabanbuxiuService.selectCmfEduXingzhengJiabanbuxiuById(id));
    }

    /**
     * 新增行政加班补休
     */
    @PreAuthorize("@ss.hasPermi('hr:jiabanbuxiu:add')")
    @Log(title = "行政加班补休", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfEduXingzhengJiabanbuxiu cmfEduXingzhengJiabanbuxiu)
    {
        return toAjax(cmfEduXingzhengJiabanbuxiuService.insertCmfEduXingzhengJiabanbuxiu(cmfEduXingzhengJiabanbuxiu));
    }

    /**
     * 修改行政加班补休
     */
    @PreAuthorize("@ss.hasPermi('hr:jiabanbuxiu:edit')")
    @Log(title = "行政加班补休", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfEduXingzhengJiabanbuxiu cmfEduXingzhengJiabanbuxiu)
    {
        return toAjax(cmfEduXingzhengJiabanbuxiuService.updateCmfEduXingzhengJiabanbuxiu(cmfEduXingzhengJiabanbuxiu));
    }

    /**
     * 删除行政加班补休
     */
    @PreAuthorize("@ss.hasPermi('hr:jiabanbuxiu:remove')")
    @Log(title = "行政加班补休", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfEduXingzhengJiabanbuxiuService.deleteCmfEduXingzhengJiabanbuxiuByIds(ids));
    }
}
