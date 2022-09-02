package com.vrcrm.customer.controller;

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
import com.vrcrm.customer.domain.CmfCompeteproduct;
import com.vrcrm.customer.service.ICmfCompeteproductService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 竞争对手Controller
 * 
 * @author VRer
 * @date 2022-04-14
 */
@RestController
@RequestMapping("/competeproduct")
public class CmfCompeteproductController extends BaseController
{
    @Autowired
    private ICmfCompeteproductService cmfCompeteproductService;

    /**
     * 查询竞争对手列表
     */
    @PreAuthorize("@ss.hasPermi('customer:competeproduct:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfCompeteproduct cmfCompeteproduct)
    {
        startPage();
        List<CmfCompeteproduct> list = cmfCompeteproductService.selectCmfCompeteproductList(cmfCompeteproduct);
        return getDataTable(list);
    }

    /**
     * 导出竞争对手列表
     */
    @PreAuthorize("@ss.hasPermi('customer:competeproduct:export')")
    @Log(title = "竞争对手", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfCompeteproduct cmfCompeteproduct)
    {
        List<CmfCompeteproduct> list = cmfCompeteproductService.selectCmfCompeteproductList(cmfCompeteproduct);
        ExcelUtil<CmfCompeteproduct> util = new ExcelUtil<CmfCompeteproduct>(CmfCompeteproduct.class);
        util.exportExcel(response, list, "竞争对手数据");
    }

    /**
     * 获取竞争对手详细信息
     */
    @PreAuthorize("@ss.hasPermi('customer:competeproduct:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfCompeteproductService.selectCmfCompeteproductById(id));
    }

    /**
     * 新增竞争对手
     */
    @PreAuthorize("@ss.hasPermi('customer:competeproduct:add')")
    @Log(title = "竞争对手", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfCompeteproduct cmfCompeteproduct)
    {
        return toAjax(cmfCompeteproductService.insertCmfCompeteproduct(cmfCompeteproduct));
    }

    /**
     * 修改竞争对手
     */
    @PreAuthorize("@ss.hasPermi('customer:competeproduct:edit')")
    @Log(title = "竞争对手", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfCompeteproduct cmfCompeteproduct)
    {
        return toAjax(cmfCompeteproductService.updateCmfCompeteproduct(cmfCompeteproduct));
    }

    /**
     * 删除竞争对手
     */
    @PreAuthorize("@ss.hasPermi('customer:competeproduct:remove')")
    @Log(title = "竞争对手", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfCompeteproductService.deleteCmfCompeteproductByIds(ids));
    }
}
