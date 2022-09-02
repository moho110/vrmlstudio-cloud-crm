package com.vrcrm.buy.controller;

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
import com.vrcrm.buy.domain.CmfCrmFeiyongSq;
import com.vrcrm.buy.service.ICmfCrmFeiyongSqService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 费用申请Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/feiyongsq")
public class CmfCrmFeiyongSqController extends BaseController
{
    @Autowired
    private ICmfCrmFeiyongSqService cmfCrmFeiyongSqService;

    /**
     * 查询费用申请列表
     */
    @PreAuthorize("@ss.hasPermi('buy:feiyongsq:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfCrmFeiyongSq cmfCrmFeiyongSq)
    {
        startPage();
        List<CmfCrmFeiyongSq> list = cmfCrmFeiyongSqService.selectCmfCrmFeiyongSqList(cmfCrmFeiyongSq);
        return getDataTable(list);
    }

    /**
     * 导出费用申请列表
     */
    @PreAuthorize("@ss.hasPermi('buy:feiyongsq:export')")
    @Log(title = "费用申请", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfCrmFeiyongSq cmfCrmFeiyongSq)
    {
        List<CmfCrmFeiyongSq> list = cmfCrmFeiyongSqService.selectCmfCrmFeiyongSqList(cmfCrmFeiyongSq);
        ExcelUtil<CmfCrmFeiyongSq> util = new ExcelUtil<CmfCrmFeiyongSq>(CmfCrmFeiyongSq.class);
        util.exportExcel(response, list, "费用申请数据");
    }

    /**
     * 获取费用申请详细信息
     */
    @PreAuthorize("@ss.hasPermi('buy:feiyongsq:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfCrmFeiyongSqService.selectCmfCrmFeiyongSqById(id));
    }

    /**
     * 新增费用申请
     */
    @PreAuthorize("@ss.hasPermi('buy:feiyongsq:add')")
    @Log(title = "费用申请", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfCrmFeiyongSq cmfCrmFeiyongSq)
    {
        return toAjax(cmfCrmFeiyongSqService.insertCmfCrmFeiyongSq(cmfCrmFeiyongSq));
    }

    /**
     * 修改费用申请
     */
    @PreAuthorize("@ss.hasPermi('buy:feiyongsq:edit')")
    @Log(title = "费用申请", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfCrmFeiyongSq cmfCrmFeiyongSq)
    {
        return toAjax(cmfCrmFeiyongSqService.updateCmfCrmFeiyongSq(cmfCrmFeiyongSq));
    }

    /**
     * 删除费用申请
     */
    @PreAuthorize("@ss.hasPermi('buy:feiyongsq:remove')")
    @Log(title = "费用申请", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfCrmFeiyongSqService.deleteCmfCrmFeiyongSqByIds(ids));
    }
}
