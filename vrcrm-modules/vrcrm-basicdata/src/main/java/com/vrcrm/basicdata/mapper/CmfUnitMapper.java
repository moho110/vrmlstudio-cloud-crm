package com.vrcrm.basicdata.mapper;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfUnit;

/**
 * 单位Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfUnitMapper 
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
     * 删除单位
     * 
     * @param id 单位主键
     * @return 结果
     */
    public int deleteCmfUnitById(Integer id);

    /**
     * 批量删除单位
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfUnitByIds(Integer[] ids);
}
