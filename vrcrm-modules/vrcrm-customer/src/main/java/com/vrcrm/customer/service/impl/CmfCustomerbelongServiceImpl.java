package com.vrcrm.customer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.customer.mapper.CmfCustomerbelongMapper;
import com.vrcrm.customer.domain.CmfCustomerbelong;
import com.vrcrm.customer.service.ICmfCustomerbelongService;

/**
 * 客户所属Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfCustomerbelongServiceImpl implements ICmfCustomerbelongService 
{
    @Autowired
    private CmfCustomerbelongMapper cmfCustomerbelongMapper;

    /**
     * 查询客户所属
     * 
     * @param id 客户所属主键
     * @return 客户所属
     */
    @Override
    public CmfCustomerbelong selectCmfCustomerbelongById(Integer id)
    {
        return cmfCustomerbelongMapper.selectCmfCustomerbelongById(id);
    }

    /**
     * 查询客户所属列表
     * 
     * @param cmfCustomerbelong 客户所属
     * @return 客户所属
     */
    @Override
    public List<CmfCustomerbelong> selectCmfCustomerbelongList(CmfCustomerbelong cmfCustomerbelong)
    {
        return cmfCustomerbelongMapper.selectCmfCustomerbelongList(cmfCustomerbelong);
    }

    /**
     * 新增客户所属
     * 
     * @param cmfCustomerbelong 客户所属
     * @return 结果
     */
    @Override
    public int insertCmfCustomerbelong(CmfCustomerbelong cmfCustomerbelong)
    {
        return cmfCustomerbelongMapper.insertCmfCustomerbelong(cmfCustomerbelong);
    }

    /**
     * 修改客户所属
     * 
     * @param cmfCustomerbelong 客户所属
     * @return 结果
     */
    @Override
    public int updateCmfCustomerbelong(CmfCustomerbelong cmfCustomerbelong)
    {
        return cmfCustomerbelongMapper.updateCmfCustomerbelong(cmfCustomerbelong);
    }

    /**
     * 批量删除客户所属
     * 
     * @param ids 需要删除的客户所属主键
     * @return 结果
     */
    @Override
    public int deleteCmfCustomerbelongByIds(Integer[] ids)
    {
        return cmfCustomerbelongMapper.deleteCmfCustomerbelongByIds(ids);
    }

    /**
     * 删除客户所属信息
     * 
     * @param id 客户所属主键
     * @return 结果
     */
    @Override
    public int deleteCmfCustomerbelongById(Integer id)
    {
        return cmfCustomerbelongMapper.deleteCmfCustomerbelongById(id);
    }
}
