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
import com.vrcrm.basicdata.domain.CmfFeiyongclasse;
import com.vrcrm.basicdata.service.ICmfFeiyongclasseService;
import com.vrcrm.common.core.utils.poi.ExcelUtil;
import com.vrcrm.common.core.web.page.TableDataInfo;

/**
 * 费用分类Controller
 * 
 * @author VRer
 * @date 2022-04-15
 */
@RestController
@RequestMapping("/feiyongclasse")
public class CmfFeiyongclasseController extends BaseController
{
    @Autowired
    private ICmfFeiyongclasseService cmfFeiyongclasseService;

    /**
     * 查询费用分类列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:feiyongclasse:list')")
    @GetMapping("/list")
    public TableDataInfo list(CmfFeiyongclasse cmfFeiyongclasse)
    {
        startPage();
        List<CmfFeiyongclasse> list = cmfFeiyongclasseService.selectCmfFeiyongclasseList(cmfFeiyongclasse);
        return getDataTable(list);
    }

    /**
     * 导出费用分类列表
     */
    @PreAuthorize("@ss.hasPermi('basicdata:feiyongclasse:export')")
    @Log(title = "费用分类", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CmfFeiyongclasse cmfFeiyongclasse)
    {
        List<CmfFeiyongclasse> list = cmfFeiyongclasseService.selectCmfFeiyongclasseList(cmfFeiyongclasse);
        ExcelUtil<CmfFeiyongclasse> util = new ExcelUtil<CmfFeiyongclasse>(CmfFeiyongclasse.class);
        util.exportExcel(response, list, "费用分类数据");
    }

    /**
     * 获取费用分类详细信息
     */
    @PreAuthorize("@ss.hasPermi('basicdata:feiyongclasse:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(cmfFeiyongclasseService.selectCmfFeiyongclasseById(id));
    }

    /**
     * 新增费用分类
     */
    @PreAuthorize("@ss.hasPermi('basicdata:feiyongclasse:add')")
    @Log(title = "费用分类", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmfFeiyongclasse cmfFeiyongclasse)
    {
        return toAjax(cmfFeiyongclasseService.insertCmfFeiyongclasse(cmfFeiyongclasse));
    }

    /**
     * 修改费用分类
     */
    @PreAuthorize("@ss.hasPermi('basicdata:feiyongclasse:edit')")
    @Log(title = "费用分类", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmfFeiyongclasse cmfFeiyongclasse)
    {
        return toAjax(cmfFeiyongclasseService.updateCmfFeiyongclasse(cmfFeiyongclasse));
    }

    /**
     * 删除费用分类
     */
    @PreAuthorize("@ss.hasPermi('basicdata:feiyongclasse:remove')")
    @Log(title = "费用分类", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(cmfFeiyongclasseService.deleteCmfFeiyongclasseByIds(ids));
    }
}
