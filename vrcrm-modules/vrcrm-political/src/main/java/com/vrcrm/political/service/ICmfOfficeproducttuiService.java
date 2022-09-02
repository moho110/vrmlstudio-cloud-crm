package com.vrcrm.political.service;

import java.util.List;
import com.vrcrm.political.domain.CmfOfficeproducttui;

/**
 * 办公用品归还Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfOfficeproducttuiService 
{
    /**
     * 查询办公用品归还
     * 
     * @param id 办公用品归还主键
     * @return 办公用品归还
     */
    public CmfOfficeproducttui selectCmfOfficeproducttuiById(Integer id);

    /**
     * 查询办公用品归还列表
     * 
     * @param cmfOfficeproducttui 办公用品归还
     * @return 办公用品归还集合
     */
    public List<CmfOfficeproducttui> selectCmfOfficeproducttuiList(CmfOfficeproducttui cmfOfficeproducttui);

    /**
     * 新增办公用品归还
     * 
     * @param cmfOfficeproducttui 办公用品归还
     * @return 结果
     */
    public int insertCmfOfficeproducttui(CmfOfficeproducttui cmfOfficeproducttui);

    /**
     * 修改办公用品归还
     * 
     * @param cmfOfficeproducttui 办公用品归还
     * @return 结果
     */
    public int updateCmfOfficeproducttui(CmfOfficeproducttui cmfOfficeproducttui);

    /**
     * 批量删除办公用品归还
     * 
     * @param ids 需要删除的办公用品归还主键集合
     * @return 结果
     */
    public int deleteCmfOfficeproducttuiByIds(Integer[] ids);

    /**
     * 删除办公用品归还信息
     * 
     * @param id 办公用品归还主键
     * @return 结果
     */
    public int deleteCmfOfficeproducttuiById(Integer id);
}
