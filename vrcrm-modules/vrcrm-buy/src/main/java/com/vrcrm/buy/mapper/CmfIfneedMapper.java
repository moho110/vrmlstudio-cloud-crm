package com.vrcrm.buy.mapper;

import java.util.List;
import com.vrcrm.buy.domain.CmfIfneed;

/**
 * 是否需求Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfIfneedMapper 
{
    /**
     * 查询是否需求
     * 
     * @param id 是否需求主键
     * @return 是否需求
     */
    public CmfIfneed selectCmfIfneedById(Integer id);

    /**
     * 查询是否需求列表
     * 
     * @param cmfIfneed 是否需求
     * @return 是否需求集合
     */
    public List<CmfIfneed> selectCmfIfneedList(CmfIfneed cmfIfneed);

    /**
     * 新增是否需求
     * 
     * @param cmfIfneed 是否需求
     * @return 结果
     */
    public int insertCmfIfneed(CmfIfneed cmfIfneed);

    /**
     * 修改是否需求
     * 
     * @param cmfIfneed 是否需求
     * @return 结果
     */
    public int updateCmfIfneed(CmfIfneed cmfIfneed);

    /**
     * 删除是否需求
     * 
     * @param id 是否需求主键
     * @return 结果
     */
    public int deleteCmfIfneedById(Integer id);

    /**
     * 批量删除是否需求
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfIfneedByIds(Integer[] ids);
}
