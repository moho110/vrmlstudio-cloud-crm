package com.vrcrm.customer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.customer.mapper.CmfCustomerFanganMapper;
import com.vrcrm.customer.domain.CmfCustomerFangan;
import com.vrcrm.customer.service.ICmfCustomerFanganService;

/**
 * 客户方案Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfCustomerFanganServiceImpl implements ICmfCustomerFanganService 
{
    @Autowired
    private CmfCustomerFanganMapper cmfCustomerFanganMapper;

    /**
     * 查询客户方案
     * 
     * @param id 客户方案主键
     * @return 客户方案
     */
    @Override
    public CmfCustomerFangan selectCmfCustomerFanganById(Integer id)
    {
        return cmfCustomerFanganMapper.selectCmfCustomerFanganById(id);
    }

    /**
     * 查询客户方案列表
     * 
     * @param cmfCustomerFangan 客户方案
     * @return 客户方案
     */
    @Override
    public List<CmfCustomerFangan> selectCmfCustomerFanganList(CmfCustomerFangan cmfCustomerFangan)
    {
        return cmfCustomerFanganMapper.selectCmfCustomerFanganList(cmfCustomerFangan);
    }

    /**
     * 新增客户方案
     * 
     * @param cmfCustomerFangan 客户方案
     * @return 结果
     */
    @Override
    public int insertCmfCustomerFangan(CmfCustomerFangan cmfCustomerFangan)
    {
        return cmfCustomerFanganMapper.insertCmfCustomerFangan(cmfCustomerFangan);
    }

    /**
     * 修改客户方案
     * 
     * @param cmfCustomerFangan 客户方案
     * @return 结果
     */
    @Override
    public int updateCmfCustomerFangan(CmfCustomerFangan cmfCustomerFangan)
    {
        return cmfCustomerFanganMapper.updateCmfCustomerFangan(cmfCustomerFangan);
    }

    /**
     * 批量删除客户方案
     * 
     * @param ids 需要删除的客户方案主键
     * @return 结果
     */
    @Override
    public int deleteCmfCustomerFanganByIds(Integer[] ids)
    {
        return cmfCustomerFanganMapper.deleteCmfCustomerFanganByIds(ids);
    }

    /**
     * 删除客户方案信息
     * 
     * @param id 客户方案主键
     * @return 结果
     */
    @Override
    public int deleteCmfCustomerFanganById(Integer id)
    {
        return cmfCustomerFanganMapper.deleteCmfCustomerFanganById(id);
    }
}
