package com.vrcrm.customer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.customer.mapper.CmfCrmCustomerMoveMapper;
import com.vrcrm.customer.domain.CmfCrmCustomerMove;
import com.vrcrm.customer.service.ICmfCrmCustomerMoveService;

/**
 * 客户移除Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfCrmCustomerMoveServiceImpl implements ICmfCrmCustomerMoveService 
{
    @Autowired
    private CmfCrmCustomerMoveMapper cmfCrmCustomerMoveMapper;

    /**
     * 查询客户移除
     * 
     * @param id 客户移除主键
     * @return 客户移除
     */
    @Override
    public CmfCrmCustomerMove selectCmfCrmCustomerMoveById(Integer id)
    {
        return cmfCrmCustomerMoveMapper.selectCmfCrmCustomerMoveById(id);
    }

    /**
     * 查询客户移除列表
     * 
     * @param cmfCrmCustomerMove 客户移除
     * @return 客户移除
     */
    @Override
    public List<CmfCrmCustomerMove> selectCmfCrmCustomerMoveList(CmfCrmCustomerMove cmfCrmCustomerMove)
    {
        return cmfCrmCustomerMoveMapper.selectCmfCrmCustomerMoveList(cmfCrmCustomerMove);
    }

    /**
     * 新增客户移除
     * 
     * @param cmfCrmCustomerMove 客户移除
     * @return 结果
     */
    @Override
    public int insertCmfCrmCustomerMove(CmfCrmCustomerMove cmfCrmCustomerMove)
    {
        return cmfCrmCustomerMoveMapper.insertCmfCrmCustomerMove(cmfCrmCustomerMove);
    }

    /**
     * 修改客户移除
     * 
     * @param cmfCrmCustomerMove 客户移除
     * @return 结果
     */
    @Override
    public int updateCmfCrmCustomerMove(CmfCrmCustomerMove cmfCrmCustomerMove)
    {
        return cmfCrmCustomerMoveMapper.updateCmfCrmCustomerMove(cmfCrmCustomerMove);
    }

    /**
     * 批量删除客户移除
     * 
     * @param ids 需要删除的客户移除主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmCustomerMoveByIds(Integer[] ids)
    {
        return cmfCrmCustomerMoveMapper.deleteCmfCrmCustomerMoveByIds(ids);
    }

    /**
     * 删除客户移除信息
     * 
     * @param id 客户移除主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmCustomerMoveById(Integer id)
    {
        return cmfCrmCustomerMoveMapper.deleteCmfCrmCustomerMoveById(id);
    }
}
