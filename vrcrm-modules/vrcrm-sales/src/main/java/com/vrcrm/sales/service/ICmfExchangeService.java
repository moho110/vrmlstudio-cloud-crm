package com.vrcrm.sales.service;

import java.util.List;
import com.vrcrm.sales.domain.CmfExchange;

/**
 * 积分兑换Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfExchangeService 
{
    /**
     * 查询积分兑换
     * 
     * @param id 积分兑换主键
     * @return 积分兑换
     */
    public CmfExchange selectCmfExchangeById(Integer id);

    /**
     * 查询积分兑换列表
     * 
     * @param cmfExchange 积分兑换
     * @return 积分兑换集合
     */
    public List<CmfExchange> selectCmfExchangeList(CmfExchange cmfExchange);

    /**
     * 新增积分兑换
     * 
     * @param cmfExchange 积分兑换
     * @return 结果
     */
    public int insertCmfExchange(CmfExchange cmfExchange);

    /**
     * 修改积分兑换
     * 
     * @param cmfExchange 积分兑换
     * @return 结果
     */
    public int updateCmfExchange(CmfExchange cmfExchange);

    /**
     * 批量删除积分兑换
     * 
     * @param ids 需要删除的积分兑换主键集合
     * @return 结果
     */
    public int deleteCmfExchangeByIds(Integer[] ids);

    /**
     * 删除积分兑换信息
     * 
     * @param id 积分兑换主键
     * @return 结果
     */
    public int deleteCmfExchangeById(Integer id);
}
