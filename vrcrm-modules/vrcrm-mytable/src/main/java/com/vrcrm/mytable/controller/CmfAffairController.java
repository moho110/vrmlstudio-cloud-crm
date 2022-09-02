package com.vrcrm.mytable.controller;

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
import com.vrcrm.mytable.domain.CmfAffair;
import com.vrcrm.mytable.service.ICmfAffairService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 事务Controller
 * 
 * @author VRer
 * @date 2022-04-14
 */
@RestController
@RequestMapping("/affair")
public class CmfAffairController extends BaseController
{
    @Autowired
    private ICmfAffairService cmfAffairService;

    /**
     * 查询事务列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:affair:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfAffair cmfAffair)
    {
        startPage();
        List<CmfAffair> list = cmfAffairService.selectCmfAffairList(cmfAffair);
        return getDataTable(list);
    }

    /**
     * 导出事务列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:affair:export')")
    @Log(title = "事务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfAffair cmfAffair)
    {
        List<CmfAffair> list = cmfAffairService.selectCmfAffairList(cmfAffair);
        ExcelUtil<CmfAffair> util = new ExcelUtil<CmfAffair>(CmfAffair.class);
        util.exportExcel(response, list, "事务数据");
    }

    /**
     * 获取事务详细信息
     */
    @PreAuthorize("@ss.hasPermi('mytable:affair:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfAffairService.selectCmfAffairById(id));
    }

    /**
     * 新增事务
     */
    @PreAuthorize("@ss.hasPermi('mytable:affair:add')")
    @Log(title = "事务", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfAffair cmfAffair)
    {
        return toAjax(cmfAffairService.insertCmfAffair(cmfAffair));
    }

    /**
     * 修改事务
     */
    @PreAuthorize("@ss.hasPermi('mytable:affair:edit')")
    @Log(title = "事务", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfAffair cmfAffair)
    {
        return toAjax(cmfAffairService.updateCmfAffair(cmfAffair));
    }

    /**
     * 删除事务
     */
    @PreAuthorize("@ss.hasPermi('mytable:affair:remove')")
    @Log(title = "事务", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfAffairService.deleteCmfAffairByIds(ids));
    }
}
