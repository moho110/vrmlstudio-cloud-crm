package com.vrcrm.sales.mapper;

import java.util.List;
import com.vrcrm.sales.domain.CmfSellplanmainDetailColor;

/**
 * 销售计划明细表颜色Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfSellplanmainDetailColorMapper 
{
    /**
     * 查询销售计划明细表颜色
     * 
     * @param id 销售计划明细表颜色主键
     * @return 销售计划明细表颜色
     */
    public CmfSellplanmainDetailColor selectCmfSellplanmainDetailColorById(Integer id);

    /**
     * 查询销售计划明细表颜色列表
     * 
     * @param cmfSellplanmainDetailColor 销售计划明细表颜色
     * @return 销售计划明细表颜色集合
     */
    public List<CmfSellplanmainDetailColor> selectCmfSellplanmainDetailColorList(CmfSellplanmainDetailColor cmfSellplanmainDetailColor);

    /**
     * 新增销售计划明细表颜色
     * 
     * @param cmfSellplanmainDetailColor 销售计划明细表颜色
     * @return 结果
     */
    public int insertCmfSellplanmainDetailColor(CmfSellplanmainDetailColor cmfSellplanmainDetailColor);

    /**
     * 修改销售计划明细表颜色
     * 
     * @param cmfSellplanmainDetailColor 销售计划明细表颜色
     * @return 结果
     */
    public int updateCmfSellplanmainDetailColor(CmfSellplanmainDetailColor cmfSellplanmainDetailColor);

    /**
     * 删除销售计划明细表颜色
     * 
     * @param id 销售计划明细表颜色主键
     * @return 结果
     */
    public int deleteCmfSellplanmainDetailColorById(Integer id);

    /**
     * 批量删除销售计划明细表颜色
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfSellplanmainDetailColorByIds(Integer[] ids);
}
