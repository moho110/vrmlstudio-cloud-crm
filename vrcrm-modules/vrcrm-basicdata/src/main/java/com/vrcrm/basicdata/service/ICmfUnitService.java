package com.vrcrm.basicdata.service;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfUnit;

/**
 * 单位Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfUnitService 
{
    /**
     * 查询单位
     * 
     * @param id 单位主键
     * @return 单位
     */
    public CmfUnit selectCmfUnitById(Integer id);

    /**
     * 查询单位列表
     * 
     * @param cmfUnit 单位
     * @return 单位集合
     */
    public List<CmfUnit> selectCmfUnitList(CmfUnit cmfUnit);

    /**
     * 新增单位
     * 
     * @param cmfUnit 单位
     * @return 结果
     */
    public int insertCmfUnit(CmfUnit cmfUnit);

    /**
     * 修改单位
     * 
     * @param cmfUnit 单位
     * @return 结果
     */
    public int updateCmfUnit(CmfUnit cmfUnit);

    /**
     * 批量删除单位
     * 
     * @param ids 需要删除的单位主键集合
     * @return 结果
     */
    public int deleteCmfUnitByIds(Integer[] ids);

    /**
     * 删除单位信息
     * 
     * @param id 单位主键
     * @return 结果
     */
    public int deleteCmfUnitById(Integer id);
}
