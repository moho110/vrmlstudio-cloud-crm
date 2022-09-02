package com.vrcrm.customer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.customer.mapper.CmfCustomeroriginMapper;
import com.vrcrm.customer.domain.CmfCustomerorigin;
import com.vrcrm.customer.service.ICmfCustomeroriginService;

/**
 * 客户来源Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfCustomeroriginServiceImpl implements ICmfCustomeroriginService 
{
    @Autowired
    private CmfCustomeroriginMapper cmfCustomeroriginMapper;

    /**
     * 查询客户来源
     * 
     * @param id 客户来源主键
     * @return 客户来源
     */
    @Override
    public CmfCustomerorigin selectCmfCustomeroriginById(Integer id)
    {
        return cmfCustomeroriginMapper.selectCmfCustomeroriginById(id);
    }

    /**
     * 查询客户来源列表
     * 
     * @param cmfCustomerorigin 客户来源
     * @return 客户来源
     */
    @Override
    public List<CmfCustomerorigin> selectCmfCustomeroriginList(CmfCustomerorigin cmfCustomerorigin)
    {
        return cmfCustomeroriginMapper.selectCmfCustomeroriginList(cmfCustomerorigin);
    }

    /**
     * 新增客户来源
     * 
     * @param cmfCustomerorigin 客户来源
     * @return 结果
     */
    @Override
    public int insertCmfCustomerorigin(CmfCustomerorigin cmfCustomerorigin)
    {
        return cmfCustomeroriginMapper.insertCmfCustomerorigin(cmfCustomerorigin);
    }

    /**
     * 修改客户来源
     * 
     * @param cmfCustomerorigin 客户来源
     * @return 结果
     */
    @Override
    public int updateCmfCustomerorigin(CmfCustomerorigin cmfCustomerorigin)
    {
        return cmfCustomeroriginMapper.updateCmfCustomerorigin(cmfCustomerorigin);
    }

    /**
     * 批量删除客户来源
     * 
     * @param ids 需要删除的客户来源主键
     * @return 结果
     */
    @Override
    public int deleteCmfCustomeroriginByIds(Integer[] ids)
    {
        return cmfCustomeroriginMapper.deleteCmfCustomeroriginByIds(ids);
    }

    /**
     * 删除客户来源信息
     * 
     * @param id 客户来源主键
     * @return 结果
     */
    @Override
    public int deleteCmfCustomeroriginById(Integer id)
    {
        return cmfCustomeroriginMapper.deleteCmfCustomeroriginById(id);
    }
}
