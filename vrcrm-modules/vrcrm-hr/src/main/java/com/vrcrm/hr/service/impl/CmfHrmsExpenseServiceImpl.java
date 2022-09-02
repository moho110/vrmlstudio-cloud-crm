package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfHrmsExpenseMapper;
import com.vrcrm.hr.domain.CmfHrmsExpense;
import com.vrcrm.hr.service.ICmfHrmsExpenseService;

/**
 * 日常费用Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfHrmsExpenseServiceImpl implements ICmfHrmsExpenseService 
{
    @Autowired
    private CmfHrmsExpenseMapper cmfHrmsExpenseMapper;

    /**
     * 查询日常费用
     * 
     * @param id 日常费用主键
     * @return 日常费用
     */
    @Override
    public CmfHrmsExpense selectCmfHrmsExpenseById(Integer id)
    {
        return cmfHrmsExpenseMapper.selectCmfHrmsExpenseById(id);
    }

    /**
     * 查询日常费用列表
     * 
     * @param cmfHrmsExpense 日常费用
     * @return 日常费用
     */
    @Override
    public List<CmfHrmsExpense> selectCmfHrmsExpenseList(CmfHrmsExpense cmfHrmsExpense)
    {
        return cmfHrmsExpenseMapper.selectCmfHrmsExpenseList(cmfHrmsExpense);
    }

    /**
     * 新增日常费用
     * 
     * @param cmfHrmsExpense 日常费用
     * @return 结果
     */
    @Override
    public int insertCmfHrmsExpense(CmfHrmsExpense cmfHrmsExpense)
    {
        return cmfHrmsExpenseMapper.insertCmfHrmsExpense(cmfHrmsExpense);
    }

    /**
     * 修改日常费用
     * 
     * @param cmfHrmsExpense 日常费用
     * @return 结果
     */
    @Override
    public int updateCmfHrmsExpense(CmfHrmsExpense cmfHrmsExpense)
    {
        return cmfHrmsExpenseMapper.updateCmfHrmsExpense(cmfHrmsExpense);
    }

    /**
     * 批量删除日常费用
     * 
     * @param ids 需要删除的日常费用主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsExpenseByIds(Integer[] ids)
    {
        return cmfHrmsExpenseMapper.deleteCmfHrmsExpenseByIds(ids);
    }

    /**
     * 删除日常费用信息
     * 
     * @param id 日常费用主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsExpenseById(Integer id)
    {
        return cmfHrmsExpenseMapper.deleteCmfHrmsExpenseById(id);
    }
}
