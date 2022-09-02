package com.vrcrm.customer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.customer.mapper.CmfCustomerMapper;
import com.vrcrm.customer.domain.CmfCustomer;
import com.vrcrm.customer.service.ICmfCustomerService;

/**
 * 客户Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfCustomerServiceImpl implements ICmfCustomerService 
{
    @Autowired
    private CmfCustomerMapper cmfCustomerMapper;

    /**
     * 查询客户
     * 
     * @param id 客户主键
     * @return 客户
     */
    @Override
    public CmfCustomer selectCmfCustomerById(Integer id)
    {
        return cmfCustomerMapper.selectCmfCustomerById(id);
    }

    /**
     * 查询客户列表
     * 
     * @param cmfCustomer 客户
     * @return 客户
     */
    @Override
    public List<CmfCustomer> selectCmfCustomerList(CmfCustomer cmfCustomer)
    {
        return cmfCustomerMapper.selectCmfCustomerList(cmfCustomer);
    }

    /**
     * 新增客户
     * 
     * @param cmfCustomer 客户
     * @return 结果
     */
    @Override
    public int insertCmfCustomer(CmfCustomer cmfCustomer)
    {
        return cmfCustomerMapper.insertCmfCustomer(cmfCustomer);
    }

    /**
     * 修改客户
     * 
     * @param cmfCustomer 客户
     * @return 结果
     */
    @Override
    public int updateCmfCustomer(CmfCustomer cmfCustomer)
    {
        return cmfCustomerMapper.updateCmfCustomer(cmfCustomer);
    }

    /**
     * 批量删除客户
     * 
     * @param ids 需要删除的客户主键
     * @return 结果
     */
    @Override
    public int deleteCmfCustomerByIds(Integer[] ids)
    {
        return cmfCustomerMapper.deleteCmfCustomerByIds(ids);
    }

    /**
     * 删除客户信息
     * 
     * @param id 客户主键
     * @return 结果
     */
    @Override
    public int deleteCmfCustomerById(Integer id)
    {
        return cmfCustomerMapper.deleteCmfCustomerById(id);
    }
}
