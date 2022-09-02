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
import com.vrcrm.customer.domain.CmfCrmZhuangtai;
import com.vrcrm.customer.service.ICmfCrmZhuangtaiService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 状态Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/zhuangtai")
public class CmfCrmZhuangtaiController extends BaseController
{
    @Autowired
    private ICmfCrmZhuangtaiService cmfCrmZhuangtaiService;

    /**
     * 查询状态列表
     */
    @PreAuthorize("@ss.hasPermi('customer:zhuangtai:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfCrmZhuangtai cmfCrmZhuangtai)
    {
        startPage();
        List<CmfCrmZhuangtai> list = cmfCrmZhuangtaiService.selectCmfCrmZhuangtaiList(cmfCrmZhuangtai);
        return getDataTable(list);
    }

    /**
     * 导出状态列表
     */
    @PreAuthorize("@ss.hasPermi('customer:zhuangtai:export')")
    @Log(title = "状态", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfCrmZhuangtai cmfCrmZhuangtai)
    {
        List<CmfCrmZhuangtai> list = cmfCrmZhuangtaiService.selectCmfCrmZhuangtaiList(cmfCrmZhuangtai);
        ExcelUtil<CmfCrmZhuangtai> util = new ExcelUtil<CmfCrmZhuangtai>(CmfCrmZhuangtai.class);
        util.exportExcel(response, list, "状态数据");
    }

    /**
     * 获取状态详细信息
     */
    @PreAuthorize("@ss.hasPermi('customer:zhuangtai:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfCrmZhuangtaiService.selectCmfCrmZhuangtaiById(id));
    }

    /**
     * 新增状态
     */
    @PreAuthorize("@ss.hasPermi('customer:zhuangtai:add')")
    @Log(title = "状态", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfCrmZhuangtai cmfCrmZhuangtai)
    {
        return toAjax(cmfCrmZhuangtaiService.insertCmfCrmZhuangtai(cmfCrmZhuangtai));
    }

    /**
     * 修改状态
     */
    @PreAuthorize("@ss.hasPermi('customer:zhuangtai:edit')")
    @Log(title = "状态", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfCrmZhuangtai cmfCrmZhuangtai)
    {
        return toAjax(cmfCrmZhuangtaiService.updateCmfCrmZhuangtai(cmfCrmZhuangtai));
    }

    /**
     * 删除状态
     */
    @PreAuthorize("@ss.hasPermi('customer:zhuangtai:remove')")
    @Log(title = "状态", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfCrmZhuangtaiService.deleteCmfCrmZhuangtaiByIds(ids));
    }
}
