package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfHrmsExpense;

/**
 * 日常费用Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfHrmsExpenseMapper 
{
    /**
     * 查询日常费用
     * 
     * @param id 日常费用主键
     * @return 日常费用
     */
    public CmfHrmsExpense selectCmfHrmsExpenseById(Integer id);

    /**
     * 查询日常费用列表
     * 
     * @param cmfHrmsExpense 日常费用
     * @return 日常费用集合
     */
    public List<CmfHrmsExpense> selectCmfHrmsExpenseList(CmfHrmsExpense cmfHrmsExpense);

    /**
     * 新增日常费用
     * 
     * @param cmfHrmsExpense 日常费用
     * @return 结果
     */
    public int insertCmfHrmsExpense(CmfHrmsExpense cmfHrmsExpense);

    /**
     * 修改日常费用
     * 
     * @param cmfHrmsExpense 日常费用
     * @return 结果
     */
    public int updateCmfHrmsExpense(CmfHrmsExpense cmfHrmsExpense);

    /**
     * 删除日常费用
     * 
     * @param id 日常费用主键
     * @return 结果
     */
    public int deleteCmfHrmsExpenseById(Integer id);

    /**
     * 批量删除日常费用
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfHrmsExpenseByIds(Integer[] ids);
}
