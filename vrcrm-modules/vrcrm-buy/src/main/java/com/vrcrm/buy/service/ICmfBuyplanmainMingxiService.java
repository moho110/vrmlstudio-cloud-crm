package com.vrcrm.buy.service;

import java.util.List;
import com.vrcrm.buy.domain.CmfBuyplanmainMingxi;

/**
 * 采购单名细Service接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface ICmfBuyplanmainMingxiService 
{
    /**
     * 查询采购单名细
     * 
     * @param id 采购单名细主键
     * @return 采购单名细
     */
    public CmfBuyplanmainMingxi selectCmfBuyplanmainMingxiById(Integer id);

    /**
     * 查询采购单名细列表
     * 
     * @param cmfBuyplanmainMingxi 采购单名细
     * @return 采购单名细集合
     */
    public List<CmfBuyplanmainMingxi> selectCmfBuyplanmainMingxiList(CmfBuyplanmainMingxi cmfBuyplanmainMingxi);

    /**
     * 新增采购单名细
     * 
     * @param cmfBuyplanmainMingxi 采购单名细
     * @return 结果
     */
    public int insertCmfBuyplanmainMingxi(CmfBuyplanmainMingxi cmfBuyplanmainMingxi);

    /**
     * 修改采购单名细
     * 
     * @param cmfBuyplanmainMingxi 采购单名细
     * @return 结果
     */
    public int updateCmfBuyplanmainMingxi(CmfBuyplanmainMingxi cmfBuyplanmainMingxi);

    /**
     * 批量删除采购单名细
     * 
     * @param ids 需要删除的采购单名细主键集合
     * @return 结果
     */
    public int deleteCmfBuyplanmainMingxiByIds(Integer[] ids);

    /**
     * 删除采购单名细信息
     * 
     * @param id 采购单名细主键
     * @return 结果
     */
    public int deleteCmfBuyplanmainMingxiById(Integer id);
}
