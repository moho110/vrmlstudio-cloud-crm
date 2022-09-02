package com.vrcrm.customer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.customer.mapper.CmfCustomerareaMapper;
import com.vrcrm.customer.domain.CmfCustomerarea;
import com.vrcrm.customer.service.ICmfCustomerareaService;

/**
 * 客户区域Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfCustomerareaServiceImpl implements ICmfCustomerareaService 
{
    @Autowired
    private CmfCustomerareaMapper cmfCustomerareaMapper;

    /**
     * 查询客户区域
     * 
     * @param id 客户区域主键
     * @return 客户区域
     */
    @Override
    public CmfCustomerarea selectCmfCustomerareaById(Integer id)
    {
        return cmfCustomerareaMapper.selectCmfCustomerareaById(id);
    }

    /**
     * 查询客户区域列表
     * 
     * @param cmfCustomerarea 客户区域
     * @return 客户区域
     */
    @Override
    public List<CmfCustomerarea> selectCmfCustomerareaList(CmfCustomerarea cmfCustomerarea)
    {
        return cmfCustomerareaMapper.selectCmfCustomerareaList(cmfCustomerarea);
    }

    /**
     * 新增客户区域
     * 
     * @param cmfCustomerarea 客户区域
     * @return 结果
     */
    @Override
    public int insertCmfCustomerarea(CmfCustomerarea cmfCustomerarea)
    {
        return cmfCustomerareaMapper.insertCmfCustomerarea(cmfCustomerarea);
    }

    /**
     * 修改客户区域
     * 
     * @param cmfCustomerarea 客户区域
     * @return 结果
     */
    @Override
    public int updateCmfCustomerarea(CmfCustomerarea cmfCustomerarea)
    {
        return cmfCustomerareaMapper.updateCmfCustomerarea(cmfCustomerarea);
    }

    /**
     * 批量删除客户区域
     * 
     * @param ids 需要删除的客户区域主键
     * @return 结果
     */
    @Override
    public int deleteCmfCustomerareaByIds(Integer[] ids)
    {
        return cmfCustomerareaMapper.deleteCmfCustomerareaByIds(ids);
    }

    /**
     * 删除客户区域信息
     * 
     * @param id 客户区域主键
     * @return 结果
     */
    @Override
    public int deleteCmfCustomerareaById(Integer id)
    {
        return cmfCustomerareaMapper.deleteCmfCustomerareaById(id);
    }
}
