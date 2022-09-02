package com.vrcrm.finance.service;

import java.util.List;
import com.vrcrm.finance.domain.CmfPaystate;

/**
 * 支付状态Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfPaystateService 
{
    /**
     * 查询支付状态
     * 
     * @param id 支付状态主键
     * @return 支付状态
     */
    public CmfPaystate selectCmfPaystateById(Integer id);

    /**
     * 查询支付状态列表
     * 
     * @param cmfPaystate 支付状态
     * @return 支付状态集合
     */
    public List<CmfPaystate> selectCmfPaystateList(CmfPaystate cmfPaystate);

    /**
     * 新增支付状态
     * 
     * @param cmfPaystate 支付状态
     * @return 结果
     */
    public int insertCmfPaystate(CmfPaystate cmfPaystate);

    /**
     * 修改支付状态
     * 
     * @param cmfPaystate 支付状态
     * @return 结果
     */
    public int updateCmfPaystate(CmfPaystate cmfPaystate);

    /**
     * 批量删除支付状态
     * 
     * @param ids 需要删除的支付状态主键集合
     * @return 结果
     */
    public int deleteCmfPaystateByIds(Integer[] ids);

    /**
     * 删除支付状态信息
     * 
     * @param id 支付状态主键
     * @return 结果
     */
    public int deleteCmfPaystateById(Integer id);
}
