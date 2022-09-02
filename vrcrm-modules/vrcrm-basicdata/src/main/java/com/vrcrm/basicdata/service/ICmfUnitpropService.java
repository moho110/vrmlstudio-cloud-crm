package com.vrcrm.basicdata.service;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfUnitprop;

/**
 * 单位属性Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfUnitpropService 
{
    /**
     * 查询单位属性
     * 
     * @param id 单位属性主键
     * @return 单位属性
     */
    public CmfUnitprop selectCmfUnitpropById(Integer id);

    /**
     * 查询单位属性列表
     * 
     * @param cmfUnitprop 单位属性
     * @return 单位属性集合
     */
    public List<CmfUnitprop> selectCmfUnitpropList(CmfUnitprop cmfUnitprop);

    /**
     * 新增单位属性
     * 
     * @param cmfUnitprop 单位属性
     * @return 结果
     */
    public int insertCmfUnitprop(CmfUnitprop cmfUnitprop);

    /**
     * 修改单位属性
     * 
     * @param cmfUnitprop 单位属性
     * @return 结果
     */
    public int updateCmfUnitprop(CmfUnitprop cmfUnitprop);

    /**
     * 批量删除单位属性
     * 
     * @param ids 需要删除的单位属性主键集合
     * @return 结果
     */
    public int deleteCmfUnitpropByIds(Integer[] ids);

    /**
     * 删除单位属性信息
     * 
     * @param id 单位属性主键
     * @return 结果
     */
    public int deleteCmfUnitpropById(Integer id);
}
