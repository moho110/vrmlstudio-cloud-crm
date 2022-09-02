package com.vrcrm.customer.service;

import java.util.List;
import com.vrcrm.customer.domain.CmfCustomer;

/**
 * 客户Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfCustomerService 
{
    /**
     * 查询客户
     * 
     * @param id 客户主键
     * @return 客户
     */
    public CmfCustomer selectCmfCustomerById(Integer id);

    /**
     * 查询客户列表
     * 
     * @param cmfCustomer 客户
     * @return 客户集合
     */
    public List<CmfCustomer> selectCmfCustomerList(CmfCustomer cmfCustomer);

    /**
     * 新增客户
     * 
     * @param cmfCustomer 客户
     * @return 结果
     */
    public int insertCmfCustomer(CmfCustomer cmfCustomer);

    /**
     * 修改客户
     * 
     * @param cmfCustomer 客户
     * @return 结果
     */
    public int updateCmfCustomer(CmfCustomer cmfCustomer);

    /**
     * 批量删除客户
     * 
     * @param ids 需要删除的客户主键集合
     * @return 结果
     */
    public int deleteCmfCustomerByIds(Integer[] ids);

    /**
     * 删除客户信息
     * 
     * @param id 客户主键
     * @return 结果
     */
    public int deleteCmfCustomerById(Integer id);
}
