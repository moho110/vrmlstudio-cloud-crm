package com.vrcrm.buy.service;

import java.util.List;
import com.vrcrm.buy.domain.CmfBuyplanmainTmpColor;

/**
 * 采购单临时颜色表Service接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface ICmfBuyplanmainTmpColorService 
{
    /**
     * 查询采购单临时颜色表
     * 
     * @param id 采购单临时颜色表主键
     * @return 采购单临时颜色表
     */
    public CmfBuyplanmainTmpColor selectCmfBuyplanmainTmpColorById(Integer id);

    /**
     * 查询采购单临时颜色表列表
     * 
     * @param cmfBuyplanmainTmpColor 采购单临时颜色表
     * @return 采购单临时颜色表集合
     */
    public List<CmfBuyplanmainTmpColor> selectCmfBuyplanmainTmpColorList(CmfBuyplanmainTmpColor cmfBuyplanmainTmpColor);

    /**
     * 新增采购单临时颜色表
     * 
     * @param cmfBuyplanmainTmpColor 采购单临时颜色表
     * @return 结果
     */
    public int insertCmfBuyplanmainTmpColor(CmfBuyplanmainTmpColor cmfBuyplanmainTmpColor);

    /**
     * 修改采购单临时颜色表
     * 
     * @param cmfBuyplanmainTmpColor 采购单临时颜色表
     * @return 结果
     */
    public int updateCmfBuyplanmainTmpColor(CmfBuyplanmainTmpColor cmfBuyplanmainTmpColor);

    /**
     * 批量删除采购单临时颜色表
     * 
     * @param ids 需要删除的采购单临时颜色表主键集合
     * @return 结果
     */
    public int deleteCmfBuyplanmainTmpColorByIds(Integer[] ids);

    /**
     * 删除采购单临时颜色表信息
     * 
     * @param id 采购单临时颜色表主键
     * @return 结果
     */
    public int deleteCmfBuyplanmainTmpColorById(Integer id);
}
