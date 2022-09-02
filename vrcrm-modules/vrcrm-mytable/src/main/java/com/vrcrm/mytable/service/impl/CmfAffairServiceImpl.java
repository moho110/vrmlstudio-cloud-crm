package com.vrcrm.mytable.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.mytable.mapper.CmfAffairMapper;
import com.vrcrm.mytable.domain.CmfAffair;
import com.vrcrm.mytable.service.ICmfAffairService;

/**
 * 事务Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfAffairServiceImpl implements ICmfAffairService 
{
    @Autowired
    private CmfAffairMapper cmfAffairMapper;

    /**
     * 查询事务
     * 
     * @param id 事务主键
     * @return 事务
     */
    @Override
    public CmfAffair selectCmfAffairById(Integer id)
    {
        return cmfAffairMapper.selectCmfAffairById(id);
    }

    /**
     * 查询事务列表
     * 
     * @param cmfAffair 事务
     * @return 事务
     */
    @Override
    public List<CmfAffair> selectCmfAffairList(CmfAffair cmfAffair)
    {
        return cmfAffairMapper.selectCmfAffairList(cmfAffair);
    }

    /**
     * 新增事务
     * 
     * @param cmfAffair 事务
     * @return 结果
     */
    @Override
    public int insertCmfAffair(CmfAffair cmfAffair)
    {
        return cmfAffairMapper.insertCmfAffair(cmfAffair);
    }

    /**
     * 修改事务
     * 
     * @param cmfAffair 事务
     * @return 结果
     */
    @Override
    public int updateCmfAffair(CmfAffair cmfAffair)
    {
        return cmfAffairMapper.updateCmfAffair(cmfAffair);
    }

    /**
     * 批量删除事务
     * 
     * @param ids 需要删除的事务主键
     * @return 结果
     */
    @Override
    public int deleteCmfAffairByIds(Integer[] ids)
    {
        return cmfAffairMapper.deleteCmfAffairByIds(ids);
    }

    /**
     * 删除事务信息
     * 
     * @param id 事务主键
     * @return 结果
     */
    @Override
    public int deleteCmfAffairById(Integer id)
    {
        return cmfAffairMapper.deleteCmfAffairById(id);
    }
}
