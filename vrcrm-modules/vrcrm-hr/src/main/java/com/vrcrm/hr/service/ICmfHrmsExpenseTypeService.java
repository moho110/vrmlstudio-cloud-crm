package com.vrcrm.hr.service;

import java.util.List;
import com.vrcrm.hr.domain.CmfHrmsExpenseType;

/**
 * 费用类型Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfHrmsExpenseTypeService 
{
    /**
     * 查询费用类型
     * 
     * @param id 费用类型主键
     * @return 费用类型
     */
    public CmfHrmsExpenseType selectCmfHrmsExpenseTypeById(Integer id);

    /**
     * 查询费用类型列表
     * 
     * @param cmfHrmsExpenseType 费用类型
     * @return 费用类型集合
     */
    public List<CmfHrmsExpenseType> selectCmfHrmsExpenseTypeList(CmfHrmsExpenseType cmfHrmsExpenseType);

    /**
     * 新增费用类型
     * 
     * @param cmfHrmsExpenseType 费用类型
     * @return 结果
     */
    public int insertCmfHrmsExpenseType(CmfHrmsExpenseType cmfHrmsExpenseType);

    /**
     * 修改费用类型
     * 
     * @param cmfHrmsExpenseType 费用类型
     * @return 结果
     */
    public int updateCmfHrmsExpenseType(CmfHrmsExpenseType cmfHrmsExpenseType);

    /**
     * 批量删除费用类型
     * 
     * @param ids 需要删除的费用类型主键集合
     * @return 结果
     */
    public int deleteCmfHrmsExpenseTypeByIds(Integer[] ids);

    /**
     * 删除费用类型信息
     * 
     * @param id 费用类型主键
     * @return 结果
     */
    public int deleteCmfHrmsExpenseTypeById(Integer id);
}
