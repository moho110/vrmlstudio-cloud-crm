package com.vrcrm.political.controller;

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
import com.vrcrm.political.domain.CmfDormArea;
import com.vrcrm.political.service.ICmfDormAreaService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 宿舍区域Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/dormarea")
public class CmfDormAreaController extends BaseController
{
    @Autowired
    private ICmfDormAreaService cmfDormAreaService;

    /**
     * 查询宿舍区域列表
     */
    @PreAuthorize("@ss.hasPermi('political:area:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfDormArea cmfDormArea)
    {
        startPage();
        List<CmfDormArea> list = cmfDormAreaService.selectCmfDormAreaList(cmfDormArea);
        return getDataTable(list);
    }

    /**
     * 导出宿舍区域列表
     */
    @PreAuthorize("@ss.hasPermi('political:area:export')")
    @Log(title = "宿舍区域", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfDormArea cmfDormArea)
    {
        List<CmfDormArea> list = cmfDormAreaService.selectCmfDormAreaList(cmfDormArea);
        ExcelUtil<CmfDormArea> util = new ExcelUtil<CmfDormArea>(CmfDormArea.class);
        util.exportExcel(response, list, "宿舍区域数据");
    }

    /**
     * 获取宿舍区域详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:area:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfDormAreaService.selectCmfDormAreaById(id));
    }

    /**
     * 新增宿舍区域
     */
    @PreAuthorize("@ss.hasPermi('political:area:add')")
    @Log(title = "宿舍区域", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfDormArea cmfDormArea)
    {
        return toAjax(cmfDormAreaService.insertCmfDormArea(cmfDormArea));
    }

    /**
     * 修改宿舍区域
     */
    @PreAuthorize("@ss.hasPermi('political:area:edit')")
    @Log(title = "宿舍区域", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfDormArea cmfDormArea)
    {
        return toAjax(cmfDormAreaService.updateCmfDormArea(cmfDormArea));
    }

    /**
     * 删除宿舍区域
     */
    @PreAuthorize("@ss.hasPermi('political:area:remove')")
    @Log(title = "宿舍区域", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfDormAreaService.deleteCmfDormAreaByIds(ids));
    }
}
