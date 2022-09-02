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
import com.vrcrm.basicdata.domain.CmfFeiyongtype;
import com.vrcrm.basicdata.service.ICmfFeiyongtypeService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 费用类型Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/feiyongtype")
public class CmfFeiyongtypeController extends BaseController
{
    @Autowired
    private ICmfFeiyongtypeService cmfFeiyongtypeService;

    /**
     * 查询费用类型列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:feiyongtype:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfFeiyongtype cmfFeiyongtype)
    {
        startPage();
        List<CmfFeiyongtype> list = cmfFeiyongtypeService.selectCmfFeiyongtypeList(cmfFeiyongtype);
        return getDataTable(list);
    }

    /**
     * 导出费用类型列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:feiyongtype:export')")
    @Log(title = "费用类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfFeiyongtype cmfFeiyongtype)
    {
        List<CmfFeiyongtype> list = cmfFeiyongtypeService.selectCmfFeiyongtypeList(cmfFeiyongtype);
        ExcelUtil<CmfFeiyongtype> util = new ExcelUtil<CmfFeiyongtype>(CmfFeiyongtype.class);
        util.exportExcel(response, list, "费用类型数据");
    }

    /**
     * 获取费用类型详细信息
     */
    @PreAuthorize("@ss.hasPermi('basicdata:feiyongtype:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfFeiyongtypeService.selectCmfFeiyongtypeById(id));
    }

    /**
     * 新增费用类型
     */
    @PreAuthorize("@ss.hasPermi('basicdata:feiyongtype:add')")
    @Log(title = "费用类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfFeiyongtype cmfFeiyongtype)
    {
        return toAjax(cmfFeiyongtypeService.insertCmfFeiyongtype(cmfFeiyongtype));
    }

    /**
     * 修改费用类型
     */
    @PreAuthorize("@ss.hasPermi('basicdata:feiyongtype:edit')")
    @Log(title = "费用类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfFeiyongtype cmfFeiyongtype)
    {
        return toAjax(cmfFeiyongtypeService.updateCmfFeiyongtype(cmfFeiyongtype));
    }

    /**
     * 删除费用类型
     */
    @PreAuthorize("@ss.hasPermi('basicdata:feiyongtype:remove')")
    @Log(title = "费用类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfFeiyongtypeService.deleteCmfFeiyongtypeByIds(ids));
    }
}
