package com.vrcrm.basicdata.mapper;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfMeasure;

/**
 * 计量单位Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfMeasureMapper 
{
    /**
     * 查询计量单位
     * 
     * @param id 计量单位主键
     * @return 计量单位
     */
    public CmfMeasure selectCmfMeasureById(Integer id);

    /**
     * 查询计量单位列表
     * 
     * @param cmfMeasure 计量单位
     * @return 计量单位集合
     */
    public List<CmfMeasure> selectCmfMeasureList(CmfMeasure cmfMeasure);

    /**
     * 新增计量单位
     * 
     * @param cmfMeasure 计量单位
     * @return 结果
     */
    public int insertCmfMeasure(CmfMeasure cmfMeasure);

    /**
     * 修改计量单位
     * 
     * @param cmfMeasure 计量单位
     * @return 结果
     */
    public int updateCmfMeasure(CmfMeasure cmfMeasure);

    /**
     * 删除计量单位
     * 
     * @param id 计量单位主键
     * @return 结果
     */
    public int deleteCmfMeasureById(Integer id);

    /**
     * 批量删除计量单位
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfMeasureByIds(Integer[] ids);
}
