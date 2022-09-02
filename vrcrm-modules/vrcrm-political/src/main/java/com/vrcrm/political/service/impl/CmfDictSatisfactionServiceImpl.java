package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfDictSatisfactionMapper;
import com.vrcrm.political.domain.CmfDictSatisfaction;
import com.vrcrm.political.service.ICmfDictSatisfactionService;

/**
 * 满意度Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfDictSatisfactionServiceImpl implements ICmfDictSatisfactionService 
{
    @Autowired
    private CmfDictSatisfactionMapper cmfDictSatisfactionMapper;

    /**
     * 查询满意度
     * 
     * @param id 满意度主键
     * @return 满意度
     */
    @Override
    public CmfDictSatisfaction selectCmfDictSatisfactionById(Integer id)
    {
        return cmfDictSatisfactionMapper.selectCmfDictSatisfactionById(id);
    }

    /**
     * 查询满意度列表
     * 
     * @param cmfDictSatisfaction 满意度
     * @return 满意度
     */
    @Override
    public List<CmfDictSatisfaction> selectCmfDictSatisfactionList(CmfDictSatisfaction cmfDictSatisfaction)
    {
        return cmfDictSatisfactionMapper.selectCmfDictSatisfactionList(cmfDictSatisfaction);
    }

    /**
     * 新增满意度
     * 
     * @param cmfDictSatisfaction 满意度
     * @return 结果
     */
    @Override
    public int insertCmfDictSatisfaction(CmfDictSatisfaction cmfDictSatisfaction)
    {
        return cmfDictSatisfactionMapper.insertCmfDictSatisfaction(cmfDictSatisfaction);
    }

    /**
     * 修改满意度
     * 
     * @param cmfDictSatisfaction 满意度
     * @return 结果
     */
    @Override
    public int updateCmfDictSatisfaction(CmfDictSatisfaction cmfDictSatisfaction)
    {
        return cmfDictSatisfactionMapper.updateCmfDictSatisfaction(cmfDictSatisfaction);
    }

    /**
     * 批量删除满意度
     * 
     * @param ids 需要删除的满意度主键
     * @return 结果
     */
    @Override
    public int deleteCmfDictSatisfactionByIds(Integer[] ids)
    {
        return cmfDictSatisfactionMapper.deleteCmfDictSatisfactionByIds(ids);
    }

    /**
     * 删除满意度信息
     * 
     * @param id 满意度主键
     * @return 结果
     */
    @Override
    public int deleteCmfDictSatisfactionById(Integer id)
    {
        return cmfDictSatisfactionMapper.deleteCmfDictSatisfactionById(id);
    }
}
