package com.vrcrm.basicdata.controller;

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
import com.vrcrm.basicdata.domain.CmfLinkman;
import com.vrcrm.basicdata.service.ICmfLinkmanService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 联系人Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/linkman")
public class CmfLinkmanController extends BaseController
{
    @Autowired
    private ICmfLinkmanService cmfLinkmanService;

    /**
     * 查询联系人列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:linkman:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfLinkman cmfLinkman)
    {
        startPage();
        List<CmfLinkman> list = cmfLinkmanService.selectCmfLinkmanList(cmfLinkman);
        return getDataTable(list);
    }

    /**
     * 导出联系人列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:linkman:export')")
    @Log(title = "联系人", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfLinkman cmfLinkman)
    {
        List<CmfLinkman> list = cmfLinkmanService.selectCmfLinkmanList(cmfLinkman);
        ExcelUtil<CmfLinkman> util = new ExcelUtil<CmfLinkman>(CmfLinkman.class);
        util.exportExcel(response, list, "联系人数据");
    }

    /**
     * 获取联系人详细信息
     */
    @PreAuthorize("@ss.hasPermi('basicdata:linkman:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfLinkmanService.selectCmfLinkmanById(id));
    }

    /**
     * 新增联系人
     */
    @PreAuthorize("@ss.hasPermi('basicdata:linkman:add')")
    @Log(title = "联系人", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfLinkman cmfLinkman)
    {
        return toAjax(cmfLinkmanService.insertCmfLinkman(cmfLinkman));
    }

    /**
     * 修改联系人
     */
    @PreAuthorize("@ss.hasPermi('basicdata:linkman:edit')")
    @Log(title = "联系人", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfLinkman cmfLinkman)
    {
        return toAjax(cmfLinkmanService.updateCmfLinkman(cmfLinkman));
    }

    /**
     * 删除联系人
     */
    @PreAuthorize("@ss.hasPermi('basicdata:linkman:remove')")
    @Log(title = "联系人", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfLinkmanService.deleteCmfLinkmanByIds(ids));
    }
}
