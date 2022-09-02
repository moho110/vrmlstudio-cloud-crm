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
import com.vrcrm.political.domain.CmfDormBuilding;
import com.vrcrm.political.service.ICmfDormBuildingService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 宿舍楼Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/dormbuilding")
public class CmfDormBuildingController extends BaseController
{
    @Autowired
    private ICmfDormBuildingService cmfDormBuildingService;

    /**
     * 查询宿舍楼列表
     */
    @PreAuthorize("@ss.hasPermi('political:building:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfDormBuilding cmfDormBuilding)
    {
        startPage();
        List<CmfDormBuilding> list = cmfDormBuildingService.selectCmfDormBuildingList(cmfDormBuilding);
        return getDataTable(list);
    }

    /**
     * 导出宿舍楼列表
     */
    @PreAuthorize("@ss.hasPermi('political:building:export')")
    @Log(title = "宿舍楼", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfDormBuilding cmfDormBuilding)
    {
        List<CmfDormBuilding> list = cmfDormBuildingService.selectCmfDormBuildingList(cmfDormBuilding);
        ExcelUtil<CmfDormBuilding> util = new ExcelUtil<CmfDormBuilding>(CmfDormBuilding.class);
        util.exportExcel(response, list, "宿舍楼数据");
    }

    /**
     * 获取宿舍楼详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:building:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfDormBuildingService.selectCmfDormBuildingById(id));
    }

    /**
     * 新增宿舍楼
     */
    @PreAuthorize("@ss.hasPermi('political:building:add')")
    @Log(title = "宿舍楼", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfDormBuilding cmfDormBuilding)
    {
        return toAjax(cmfDormBuildingService.insertCmfDormBuilding(cmfDormBuilding));
    }

    /**
     * 修改宿舍楼
     */
    @PreAuthorize("@ss.hasPermi('political:building:edit')")
    @Log(title = "宿舍楼", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfDormBuilding cmfDormBuilding)
    {
        return toAjax(cmfDormBuildingService.updateCmfDormBuilding(cmfDormBuilding));
    }

    /**
     * 删除宿舍楼
     */
    @PreAuthorize("@ss.hasPermi('political:building:remove')")
    @Log(title = "宿舍楼", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfDormBuildingService.deleteCmfDormBuildingByIds(ids));
    }
}
