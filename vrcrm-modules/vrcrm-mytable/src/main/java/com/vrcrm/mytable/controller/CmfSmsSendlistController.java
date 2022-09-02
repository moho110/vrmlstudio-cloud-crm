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
import com.vrcrm.mytable.domain.CmfSmsSendlist;
import com.vrcrm.mytable.service.ICmfSmsSendlistService;

import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 短信发送清单Controller
 * 
 * @author VRer
 * @date 2022-04-18
 */
@RestController
@RequestMapping("/sendlist")
public class CmfSmsSendlistController extends BaseController
{
    @Autowired
    private ICmfSmsSendlistService cmfSmsSendlistService;

    /**
     * 查询短信发送清单列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:sendlist:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfSmsSendlist cmfSmsSendlist)
    {
        startPage();
        List<CmfSmsSendlist> list = cmfSmsSendlistService.selectCmfSmsSendlistList(cmfSmsSendlist);
        return getDataTable(list);
    }

    /**
     * 导出短信发送清单列表
     */
    @PreAuthorize("@ss.hasPermi('mytable:sendlist:export')")
    @Log(title = "短信发送清单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfSmsSendlist cmfSmsSendlist)
    {
        List<CmfSmsSendlist> list = cmfSmsSendlistService.selectCmfSmsSendlistList(cmfSmsSendlist);
        ExcelUtil<CmfSmsSendlist> util = new ExcelUtil<CmfSmsSendlist>(CmfSmsSendlist.class);
        util.exportExcel(response, list, "短信发送清单数据");
    }

    /**
     * 获取短信发送清单详细信息
     */
    @PreAuthorize("@ss.hasPermi('mytable:sendlist:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfSmsSendlistService.selectCmfSmsSendlistById(id));
    }

    /**
     * 新增短信发送清单
     */
    @PreAuthorize("@ss.hasPermi('mytable:sendlist:add')")
    @Log(title = "短信发送清单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfSmsSendlist cmfSmsSendlist)
    {
        return toAjax(cmfSmsSendlistService.insertCmfSmsSendlist(cmfSmsSendlist));
    }

    /**
     * 修改短信发送清单
     */
    @PreAuthorize("@ss.hasPermi('mytable:sendlist:edit')")
    @Log(title = "短信发送清单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfSmsSendlist cmfSmsSendlist)
    {
        return toAjax(cmfSmsSendlistService.updateCmfSmsSendlist(cmfSmsSendlist));
    }

    /**
     * 删除短信发送清单
     */
    @PreAuthorize("@ss.hasPermi('mytable:sendlist:remove')")
    @Log(title = "短信发送清单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfSmsSendlistService.deleteCmfSmsSendlistByIds(ids));
    }
}
