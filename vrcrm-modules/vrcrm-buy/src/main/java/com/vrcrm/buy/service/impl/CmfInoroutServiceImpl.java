package com.vrcrm.buy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.buy.mapper.CmfInoroutMapper;
import com.vrcrm.buy.domain.CmfInorout;
import com.vrcrm.buy.service.ICmfInoroutService;

/**
 * 输入输出Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfInoroutServiceImpl implements ICmfInoroutService 
{
    @Autowired
    private CmfInoroutMapper cmfInoroutMapper;

    /**
     * 查询输入输出
     * 
     * @param id 输入输出主键
     * @return 输入输出
     */
    @Override
    public CmfInorout selectCmfInoroutById(Integer id)
    {
        return cmfInoroutMapper.selectCmfInoroutById(id);
    }

    /**
     * 查询输入输出列表
     * 
     * @param cmfInorout 输入输出
     * @return 输入输出
     */
    @Override
    public List<CmfInorout> selectCmfInoroutList(CmfInorout cmfInorout)
    {
        return cmfInoroutMapper.selectCmfInoroutList(cmfInorout);
    }

    /**
     * 新增输入输出
     * 
     * @param cmfInorout 输入输出
     * @return 结果
     */
    @Override
    public int insertCmfInorout(CmfInorout cmfInorout)
    {
        return cmfInoroutMapper.insertCmfInorout(cmfInorout);
    }

    /**
     * 修改输入输出
     * 
     * @param cmfInorout 输入输出
     * @return 结果
     */
    @Override
    public int updateCmfInorout(CmfInorout cmfInorout)
    {
        return cmfInoroutMapper.updateCmfInorout(cmfInorout);
    }

    /**
     * 批量删除输入输出
     * 
     * @param ids 需要删除的输入输出主键
     * @return 结果
     */
    @Override
    public int deleteCmfInoroutByIds(Integer[] ids)
    {
        return cmfInoroutMapper.deleteCmfInoroutByIds(ids);
    }

    /**
     * 删除输入输出信息
     * 
     * @param id 输入输出主键
     * @return 结果
     */
    @Override
    public int deleteCmfInoroutById(Integer id)
    {
        return cmfInoroutMapper.deleteCmfInoroutById(id);
    }
}
