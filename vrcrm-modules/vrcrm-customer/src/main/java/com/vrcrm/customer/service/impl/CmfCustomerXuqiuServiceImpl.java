package com.vrcrm.customer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.customer.mapper.CmfCustomerXuqiuMapper;
import com.vrcrm.customer.domain.CmfCustomerXuqiu;
import com.vrcrm.customer.service.ICmfCustomerXuqiuService;

/**
 * 客户需求Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfCustomerXuqiuServiceImpl implements ICmfCustomerXuqiuService 
{
    @Autowired
    private CmfCustomerXuqiuMapper cmfCustomerXuqiuMapper;

    /**
     * 查询客户需求
     * 
     * @param id 客户需求主键
     * @return 客户需求
     */
    @Override
    public CmfCustomerXuqiu selectCmfCustomerXuqiuById(Integer id)
    {
        return cmfCustomerXuqiuMapper.selectCmfCustomerXuqiuById(id);
    }

    /**
     * 查询客户需求列表
     * 
     * @param cmfCustomerXuqiu 客户需求
     * @return 客户需求
     */
    @Override
    public List<CmfCustomerXuqiu> selectCmfCustomerXuqiuList(CmfCustomerXuqiu cmfCustomerXuqiu)
    {
        return cmfCustomerXuqiuMapper.selectCmfCustomerXuqiuList(cmfCustomerXuqiu);
    }

    /**
     * 新增客户需求
     * 
     * @param cmfCustomerXuqiu 客户需求
     * @return 结果
     */
    @Override
    public int insertCmfCustomerXuqiu(CmfCustomerXuqiu cmfCustomerXuqiu)
    {
        return cmfCustomerXuqiuMapper.insertCmfCustomerXuqiu(cmfCustomerXuqiu);
    }

    /**
     * 修改客户需求
     * 
     * @param cmfCustomerXuqiu 客户需求
     * @return 结果
     */
    @Override
    public int updateCmfCustomerXuqiu(CmfCustomerXuqiu cmfCustomerXuqiu)
    {
        return cmfCustomerXuqiuMapper.updateCmfCustomerXuqiu(cmfCustomerXuqiu);
    }

    /**
     * 批量删除客户需求
     * 
     * @param ids 需要删除的客户需求主键
     * @return 结果
     */
    @Override
    public int deleteCmfCustomerXuqiuByIds(Integer[] ids)
    {
        return cmfCustomerXuqiuMapper.deleteCmfCustomerXuqiuByIds(ids);
    }

    /**
     * 删除客户需求信息
     * 
     * @param id 客户需求主键
     * @return 结果
     */
    @Override
    public int deleteCmfCustomerXuqiuById(Integer id)
    {
        return cmfCustomerXuqiuMapper.deleteCmfCustomerXuqiuById(id);
    }
}
