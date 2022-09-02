package com.vrcrm.buy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.buy.mapper.CmfIfneedMapper;
import com.vrcrm.buy.domain.CmfIfneed;
import com.vrcrm.buy.service.ICmfIfneedService;

/**
 * 是否需求Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfIfneedServiceImpl implements ICmfIfneedService 
{
    @Autowired
    private CmfIfneedMapper cmfIfneedMapper;

    /**
     * 查询是否需求
     * 
     * @param id 是否需求主键
     * @return 是否需求
     */
    @Override
    public CmfIfneed selectCmfIfneedById(Integer id)
    {
        return cmfIfneedMapper.selectCmfIfneedById(id);
    }

    /**
     * 查询是否需求列表
     * 
     * @param cmfIfneed 是否需求
     * @return 是否需求
     */
    @Override
    public List<CmfIfneed> selectCmfIfneedList(CmfIfneed cmfIfneed)
    {
        return cmfIfneedMapper.selectCmfIfneedList(cmfIfneed);
    }

    /**
     * 新增是否需求
     * 
     * @param cmfIfneed 是否需求
     * @return 结果
     */
    @Override
    public int insertCmfIfneed(CmfIfneed cmfIfneed)
    {
        return cmfIfneedMapper.insertCmfIfneed(cmfIfneed);
    }

    /**
     * 修改是否需求
     * 
     * @param cmfIfneed 是否需求
     * @return 结果
     */
    @Override
    public int updateCmfIfneed(CmfIfneed cmfIfneed)
    {
        return cmfIfneedMapper.updateCmfIfneed(cmfIfneed);
    }

    /**
     * 批量删除是否需求
     * 
     * @param ids 需要删除的是否需求主键
     * @return 结果
     */
    @Override
    public int deleteCmfIfneedByIds(Integer[] ids)
    {
        return cmfIfneedMapper.deleteCmfIfneedByIds(ids);
    }

    /**
     * 删除是否需求信息
     * 
     * @param id 是否需求主键
     * @return 结果
     */
    @Override
    public int deleteCmfIfneedById(Integer id)
    {
        return cmfIfneedMapper.deleteCmfIfneedById(id);
    }
}
