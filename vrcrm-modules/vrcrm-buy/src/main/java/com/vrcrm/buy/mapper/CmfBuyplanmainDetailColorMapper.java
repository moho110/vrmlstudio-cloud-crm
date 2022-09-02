package com.vrcrm.buy.mapper;

import java.util.List;
import com.vrcrm.buy.domain.CmfBuyplanmainDetailColor;

/**
 * 采购计划明细表颜色Mapper接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface CmfBuyplanmainDetailColorMapper 
{
    /**
     * 查询采购计划明细表颜色
     * 
     * @param id 采购计划明细表颜色主键
     * @return 采购计划明细表颜色
     */
    public CmfBuyplanmainDetailColor selectCmfBuyplanmainDetailColorById(Integer id);

    /**
     * 查询采购计划明细表颜色列表
     * 
     * @param cmfBuyplanmainDetailColor 采购计划明细表颜色
     * @return 采购计划明细表颜色集合
     */
    public List<CmfBuyplanmainDetailColor> selectCmfBuyplanmainDetailColorList(CmfBuyplanmainDetailColor cmfBuyplanmainDetailColor);

    /**
     * 新增采购计划明细表颜色
     * 
     * @param cmfBuyplanmainDetailColor 采购计划明细表颜色
     * @return 结果
     */
    public int insertCmfBuyplanmainDetailColor(CmfBuyplanmainDetailColor cmfBuyplanmainDetailColor);

    /**
     * 修改采购计划明细表颜色
     * 
     * @param cmfBuyplanmainDetailColor 采购计划明细表颜色
     * @return 结果
     */
    public int updateCmfBuyplanmainDetailColor(CmfBuyplanmainDetailColor cmfBuyplanmainDetailColor);

    /**
     * 删除采购计划明细表颜色
     * 
     * @param id 采购计划明细表颜色主键
     * @return 结果
     */
    public int deleteCmfBuyplanmainDetailColorById(Integer id);

    /**
     * 批量删除采购计划明细表颜色
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfBuyplanmainDetailColorByIds(Integer[] ids);
}
