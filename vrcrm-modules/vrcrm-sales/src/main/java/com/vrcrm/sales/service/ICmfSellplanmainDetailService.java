package com.vrcrm.sales.service;

import java.util.List;
import com.vrcrm.sales.domain.CmfSellplanmainDetail;

/**
 * 销售计划明细Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfSellplanmainDetailService 
{
    /**
     * 查询销售计划明细
     * 
     * @param id 销售计划明细主键
     * @return 销售计划明细
     */
    public CmfSellplanmainDetail selectCmfSellplanmainDetailById(Integer id);

    /**
     * 查询销售计划明细列表
     * 
     * @param cmfSellplanmainDetail 销售计划明细
     * @return 销售计划明细集合
     */
    public List<CmfSellplanmainDetail> selectCmfSellplanmainDetailList(CmfSellplanmainDetail cmfSellplanmainDetail);

    /**
     * 新增销售计划明细
     * 
     * @param cmfSellplanmainDetail 销售计划明细
     * @return 结果
     */
    public int insertCmfSellplanmainDetail(CmfSellplanmainDetail cmfSellplanmainDetail);

    /**
     * 修改销售计划明细
     * 
     * @param cmfSellplanmainDetail 销售计划明细
     * @return 结果
     */
    public int updateCmfSellplanmainDetail(CmfSellplanmainDetail cmfSellplanmainDetail);

    /**
     * 批量删除销售计划明细
     * 
     * @param ids 需要删除的销售计划明细主键集合
     * @return 结果
     */
    public int deleteCmfSellplanmainDetailByIds(Integer[] ids);

    /**
     * 删除销售计划明细信息
     * 
     * @param id 销售计划明细主键
     * @return 结果
     */
    public int deleteCmfSellplanmainDetailById(Integer id);
}
