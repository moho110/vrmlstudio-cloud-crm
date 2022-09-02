package com.vrcrm.customer.mapper;

import java.util.List;
import com.vrcrm.customer.domain.CmfCrmCustomerMove;

/**
 * 客户移除Mapper接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface CmfCrmCustomerMoveMapper 
{
    /**
     * 查询客户移除
     * 
     * @param id 客户移除主键
     * @return 客户移除
     */
    public CmfCrmCustomerMove selectCmfCrmCustomerMoveById(Integer id);

    /**
     * 查询客户移除列表
     * 
     * @param cmfCrmCustomerMove 客户移除
     * @return 客户移除集合
     */
    public List<CmfCrmCustomerMove> selectCmfCrmCustomerMoveList(CmfCrmCustomerMove cmfCrmCustomerMove);

    /**
     * 新增客户移除
     * 
     * @param cmfCrmCustomerMove 客户移除
     * @return 结果
     */
    public int insertCmfCrmCustomerMove(CmfCrmCustomerMove cmfCrmCustomerMove);

    /**
     * 修改客户移除
     * 
     * @param cmfCrmCustomerMove 客户移除
     * @return 结果
     */
    public int updateCmfCrmCustomerMove(CmfCrmCustomerMove cmfCrmCustomerMove);

    /**
     * 删除客户移除
     * 
     * @param id 客户移除主键
     * @return 结果
     */
    public int deleteCmfCrmCustomerMoveById(Integer id);

    /**
     * 批量删除客户移除
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfCrmCustomerMoveByIds(Integer[] ids);
}
