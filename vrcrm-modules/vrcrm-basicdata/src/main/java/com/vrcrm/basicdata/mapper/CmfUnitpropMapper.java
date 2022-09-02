package com.vrcrm.basicdata.mapper;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfUnitprop;

/**
 * 单位属性Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfUnitpropMapper 
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
     * 删除单位属性
     * 
     * @param id 单位属性主键
     * @return 结果
     */
    public int deleteCmfUnitpropById(Integer id);

    /**
     * 批量删除单位属性
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfUnitpropByIds(Integer[] ids);
}
