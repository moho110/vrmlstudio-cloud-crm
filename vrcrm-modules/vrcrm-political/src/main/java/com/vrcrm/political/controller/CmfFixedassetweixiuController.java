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
import com.vrcrm.political.domain.CmfFixedassetweixiu;
import com.vrcrm.political.service.ICmfFixedassetweixiuService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 固定资产维修Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/fixedassetweixiu")
public class CmfFixedassetweixiuController extends BaseController
{
    @Autowired
    private ICmfFixedassetweixiuService cmfFixedassetweixiuService;

    /**
     * 查询固定资产维修列表
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetweixiu:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfFixedassetweixiu cmfFixedassetweixiu)
    {
        startPage();
        List<CmfFixedassetweixiu> list = cmfFixedassetweixiuService.selectCmfFixedassetweixiuList(cmfFixedassetweixiu);
        return getDataTable(list);
    }

    /**
     * 导出固定资产维修列表
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetweixiu:export')")
    @Log(title = "固定资产维修", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfFixedassetweixiu cmfFixedassetweixiu)
    {
        List<CmfFixedassetweixiu> list = cmfFixedassetweixiuService.selectCmfFixedassetweixiuList(cmfFixedassetweixiu);
        ExcelUtil<CmfFixedassetweixiu> util = new ExcelUtil<CmfFixedassetweixiu>(CmfFixedassetweixiu.class);
        util.exportExcel(response, list, "固定资产维修数据");
    }

    /**
     * 获取固定资产维修详细信息
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetweixiu:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfFixedassetweixiuService.selectCmfFixedassetweixiuById(id));
    }

    /**
     * 新增固定资产维修
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetweixiu:add')")
    @Log(title = "固定资产维修", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfFixedassetweixiu cmfFixedassetweixiu)
    {
        return toAjax(cmfFixedassetweixiuService.insertCmfFixedassetweixiu(cmfFixedassetweixiu));
    }

    /**
     * 修改固定资产维修
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetweixiu:edit')")
    @Log(title = "固定资产维修", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfFixedassetweixiu cmfFixedassetweixiu)
    {
        return toAjax(cmfFixedassetweixiuService.updateCmfFixedassetweixiu(cmfFixedassetweixiu));
    }

    /**
     * 删除固定资产维修
     */
    @PreAuthorize("@ss.hasPermi('political:fixedassetweixiu:remove')")
    @Log(title = "固定资产维修", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfFixedassetweixiuService.deleteCmfFixedassetweixiuByIds(ids));
    }
}
