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
import com.vrcrm.hr.domain.CmfEduXingzhengTiaobanxianghu;
import com.vrcrm.hr.service.ICmfEduXingzhengTiaobanxianghuService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 行政调班项目Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/tiaobanxianghu")
public class CmfEduXingzhengTiaobanxianghuController extends BaseController
{
    @Autowired
    private ICmfEduXingzhengTiaobanxianghuService cmfEduXingzhengTiaobanxianghuService;

    /**
     * 查询行政调班项目列表
     */
    @PreAuthorize("@ss.hasPermi('hr:tiaobanxianghu:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfEduXingzhengTiaobanxianghu cmfEduXingzhengTiaobanxianghu)
    {
        startPage();
        List<CmfEduXingzhengTiaobanxianghu> list = cmfEduXingzhengTiaobanxianghuService.selectCmfEduXingzhengTiaobanxianghuList(cmfEduXingzhengTiaobanxianghu);
        return getDataTable(list);
    }

    /**
     * 导出行政调班项目列表
     */
    @PreAuthorize("@ss.hasPermi('hr:tiaobanxianghu:export')")
    @Log(title = "行政调班项目", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfEduXingzhengTiaobanxianghu cmfEduXingzhengTiaobanxianghu)
    {
        List<CmfEduXingzhengTiaobanxianghu> list = cmfEduXingzhengTiaobanxianghuService.selectCmfEduXingzhengTiaobanxianghuList(cmfEduXingzhengTiaobanxianghu);
        ExcelUtil<CmfEduXingzhengTiaobanxianghu> util = new ExcelUtil<CmfEduXingzhengTiaobanxianghu>(CmfEduXingzhengTiaobanxianghu.class);
        util.exportExcel(response, list, "行政调班项目数据");
    }

    /**
     * 获取行政调班项目详细信息
     */
    @PreAuthorize("@ss.hasPermi('hr:tiaobanxianghu:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfEduXingzhengTiaobanxianghuService.selectCmfEduXingzhengTiaobanxianghuById(id));
    }

    /**
     * 新增行政调班项目
     */
    @PreAuthorize("@ss.hasPermi('hr:tiaobanxianghu:add')")
    @Log(title = "行政调班项目", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfEduXingzhengTiaobanxianghu cmfEduXingzhengTiaobanxianghu)
    {
        return toAjax(cmfEduXingzhengTiaobanxianghuService.insertCmfEduXingzhengTiaobanxianghu(cmfEduXingzhengTiaobanxianghu));
    }

    /**
     * 修改行政调班项目
     */
    @PreAuthorize("@ss.hasPermi('hr:tiaobanxianghu:edit')")
    @Log(title = "行政调班项目", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfEduXingzhengTiaobanxianghu cmfEduXingzhengTiaobanxianghu)
    {
        return toAjax(cmfEduXingzhengTiaobanxianghuService.updateCmfEduXingzhengTiaobanxianghu(cmfEduXingzhengTiaobanxianghu));
    }

    /**
     * 删除行政调班项目
     */
    @PreAuthorize("@ss.hasPermi('hr:tiaobanxianghu:remove')")
    @Log(title = "行政调班项目", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfEduXingzhengTiaobanxianghuService.deleteCmfEduXingzhengTiaobanxianghuByIds(ids));
    }
}
