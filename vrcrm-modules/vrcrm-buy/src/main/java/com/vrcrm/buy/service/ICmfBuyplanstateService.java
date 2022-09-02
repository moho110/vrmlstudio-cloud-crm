package com.vrcrm.buy.service;

import java.util.List;
import com.vrcrm.buy.domain.CmfBuyplanstate;

/**
 * 采购计划状态Service接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface ICmfBuyplanstateService 
{
    /**
     * 查询采购计划状态
     * 
     * @param id 采购计划状态主键
     * @return 采购计划状态
     */
    public CmfBuyplanstate selectCmfBuyplanstateById(Integer id);

    /**
     * 查询采购计划状态列表
     * 
     * @param cmfBuyplanstate 采购计划状态
     * @return 采购计划状态集合
     */
    public List<CmfBuyplanstate> selectCmfBuyplanstateList(CmfBuyplanstate cmfBuyplanstate);

    /**
     * 新增采购计划状态
     * 
     * @param cmfBuyplanstate 采购计划状态
     * @return 结果
     */
    public int insertCmfBuyplanstate(CmfBuyplanstate cmfBuyplanstate);

    /**
     * 修改采购计划状态
     * 
     * @param cmfBuyplanstate 采购计划状态
     * @return 结果
     */
    public int updateCmfBuyplanstate(CmfBuyplanstate cmfBuyplanstate);

    /**
     * 批量删除采购计划状态
     * 
     * @param ids 需要删除的采购计划状态主键集合
     * @return 结果
     */
    public int deleteCmfBuyplanstateByIds(Integer[] ids);

    /**
     * 删除采购计划状态信息
     * 
     * @param id 采购计划状态主键
     * @return 结果
     */
    public int deleteCmfBuyplanstateById(Integer id);
}
