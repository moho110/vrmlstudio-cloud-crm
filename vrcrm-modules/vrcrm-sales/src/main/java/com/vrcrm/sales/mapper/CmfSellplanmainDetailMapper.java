package com.vrcrm.sales.mapper;

import java.util.List;
import com.vrcrm.sales.domain.CmfSellplanmainDetail;

/**
 * 销售计划明细Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfSellplanmainDetailMapper 
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
     * 删除销售计划明细
     * 
     * @param id 销售计划明细主键
     * @return 结果
     */
    public int deleteCmfSellplanmainDetailById(Integer id);

    /**
     * 批量删除销售计划明细
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfSellplanmainDetailByIds(Integer[] ids);
}
