package com.vrcrm.sales.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.sales.mapper.CmfExchangeMapper;
import com.vrcrm.sales.domain.CmfExchange;
import com.vrcrm.sales.service.ICmfExchangeService;

/**
 * 积分兑换Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfExchangeServiceImpl implements ICmfExchangeService 
{
    @Autowired
    private CmfExchangeMapper cmfExchangeMapper;

    /**
     * 查询积分兑换
     * 
     * @param id 积分兑换主键
     * @return 积分兑换
     */
    @Override
    public CmfExchange selectCmfExchangeById(Integer id)
    {
        return cmfExchangeMapper.selectCmfExchangeById(id);
    }

    /**
     * 查询积分兑换列表
     * 
     * @param cmfExchange 积分兑换
     * @return 积分兑换
     */
    @Override
    public List<CmfExchange> selectCmfExchangeList(CmfExchange cmfExchange)
    {
        return cmfExchangeMapper.selectCmfExchangeList(cmfExchange);
    }

    /**
     * 新增积分兑换
     * 
     * @param cmfExchange 积分兑换
     * @return 结果
     */
    @Override
    public int insertCmfExchange(CmfExchange cmfExchange)
    {
        return cmfExchangeMapper.insertCmfExchange(cmfExchange);
    }

    /**
     * 修改积分兑换
     * 
     * @param cmfExchange 积分兑换
     * @return 结果
     */
    @Override
    public int updateCmfExchange(CmfExchange cmfExchange)
    {
        return cmfExchangeMapper.updateCmfExchange(cmfExchange);
    }

    /**
     * 批量删除积分兑换
     * 
     * @param ids 需要删除的积分兑换主键
     * @return 结果
     */
    @Override
    public int deleteCmfExchangeByIds(Integer[] ids)
    {
        return cmfExchangeMapper.deleteCmfExchangeByIds(ids);
    }

    /**
     * 删除积分兑换信息
     * 
     * @param id 积分兑换主键
     * @return 结果
     */
    @Override
    public int deleteCmfExchangeById(Integer id)
    {
        return cmfExchangeMapper.deleteCmfExchangeById(id);
    }
}
