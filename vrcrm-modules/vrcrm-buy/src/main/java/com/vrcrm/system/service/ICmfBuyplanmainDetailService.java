package com.vrcrm.system.service;

import java.util.List;
import com.vrcrm.system.domain.CmfBuyplanmainDetail;

/**
 * 采购单名细Service接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface ICmfBuyplanmainDetailService 
{
    /**
     * 查询采购单名细
     * 
     * @param id 采购单名细主键
     * @return 采购单名细
     */
    public CmfBuyplanmainDetail selectCmfBuyplanmainDetailById(Integer id);

    /**
     * 查询采购单名细列表
     * 
     * @param cmfBuyplanmainDetail 采购单名细
     * @return 采购单名细集合
     */
    public List<CmfBuyplanmainDetail> selectCmfBuyplanmainDetailList(CmfBuyplanmainDetail cmfBuyplanmainDetail);

    /**
     * 新增采购单名细
     * 
     * @param cmfBuyplanmainDetail 采购单名细
     * @return 结果
     */
    public int insertCmfBuyplanmainDetail(CmfBuyplanmainDetail cmfBuyplanmainDetail);

    /**
     * 修改采购单名细
     * 
     * @param cmfBuyplanmainDetail 采购单名细
     * @return 结果
     */
    public int updateCmfBuyplanmainDetail(CmfBuyplanmainDetail cmfBuyplanmainDetail);

    /**
     * 批量删除采购单名细
     * 
     * @param ids 需要删除的采购单名细主键集合
     * @return 结果
     */
    public int deleteCmfBuyplanmainDetailByIds(Integer[] ids);

    /**
     * 删除采购单名细信息
     * 
     * @param id 采购单名细主键
     * @return 结果
     */
    public int deleteCmfBuyplanmainDetailById(Integer id);
}
