package com.vrcrm.buy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.buy.mapper.CmfImportantMapper;
import com.vrcrm.buy.domain.CmfImportant;
import com.vrcrm.buy.service.ICmfImportantService;

/**
 * 重要性Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfImportantServiceImpl implements ICmfImportantService 
{
    @Autowired
    private CmfImportantMapper cmfImportantMapper;

    /**
     * 查询重要性
     * 
     * @param id 重要性主键
     * @return 重要性
     */
    @Override
    public CmfImportant selectCmfImportantById(Integer id)
    {
        return cmfImportantMapper.selectCmfImportantById(id);
    }

    /**
     * 查询重要性列表
     * 
     * @param cmfImportant 重要性
     * @return 重要性
     */
    @Override
    public List<CmfImportant> selectCmfImportantList(CmfImportant cmfImportant)
    {
        return cmfImportantMapper.selectCmfImportantList(cmfImportant);
    }

    /**
     * 新增重要性
     * 
     * @param cmfImportant 重要性
     * @return 结果
     */
    @Override
    public int insertCmfImportant(CmfImportant cmfImportant)
    {
        return cmfImportantMapper.insertCmfImportant(cmfImportant);
    }

    /**
     * 修改重要性
     * 
     * @param cmfImportant 重要性
     * @return 结果
     */
    @Override
    public int updateCmfImportant(CmfImportant cmfImportant)
    {
        return cmfImportantMapper.updateCmfImportant(cmfImportant);
    }

    /**
     * 批量删除重要性
     * 
     * @param ids 需要删除的重要性主键
     * @return 结果
     */
    @Override
    public int deleteCmfImportantByIds(Integer[] ids)
    {
        return cmfImportantMapper.deleteCmfImportantByIds(ids);
    }

    /**
     * 删除重要性信息
     * 
     * @param id 重要性主键
     * @return 结果
     */
    @Override
    public int deleteCmfImportantById(Integer id)
    {
        return cmfImportantMapper.deleteCmfImportantById(id);
    }
}
