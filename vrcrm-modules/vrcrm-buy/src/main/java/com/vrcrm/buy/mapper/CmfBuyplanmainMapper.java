package com.vrcrm.buy.mapper;

import java.util.List;
import com.vrcrm.buy.domain.CmfBuyplanmain;

/**
 * 采购计划Mapper接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface CmfBuyplanmainMapper 
{
    /**
     * 查询采购计划
     * 
     * @param id 采购计划主键
     * @return 采购计划
     */
    public CmfBuyplanmain selectCmfBuyplanmainById(Integer id);

    /**
     * 查询采购计划列表
     * 
     * @param cmfBuyplanmain 采购计划
     * @return 采购计划集合
     */
    public List<CmfBuyplanmain> selectCmfBuyplanmainList(CmfBuyplanmain cmfBuyplanmain);

    /**
     * 新增采购计划
     * 
     * @param cmfBuyplanmain 采购计划
     * @return 结果
     */
    public int insertCmfBuyplanmain(CmfBuyplanmain cmfBuyplanmain);

    /**
     * 修改采购计划
     * 
     * @param cmfBuyplanmain 采购计划
     * @return 结果
     */
    public int updateCmfBuyplanmain(CmfBuyplanmain cmfBuyplanmain);

    /**
     * 删除采购计划
     * 
     * @param id 采购计划主键
     * @return 结果
     */
    public int deleteCmfBuyplanmainById(Integer id);

    /**
     * 批量删除采购计划
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfBuyplanmainByIds(Integer[] ids);
}
