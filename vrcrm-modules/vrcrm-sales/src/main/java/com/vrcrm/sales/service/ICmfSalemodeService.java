package com.vrcrm.sales.service;

import java.util.List;
import com.vrcrm.sales.domain.CmfSalemode;

/**
 * 销售模式Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfSalemodeService 
{
    /**
     * 查询销售模式
     * 
     * @param id 销售模式主键
     * @return 销售模式
     */
    public CmfSalemode selectCmfSalemodeById(Integer id);

    /**
     * 查询销售模式列表
     * 
     * @param cmfSalemode 销售模式
     * @return 销售模式集合
     */
    public List<CmfSalemode> selectCmfSalemodeList(CmfSalemode cmfSalemode);

    /**
     * 新增销售模式
     * 
     * @param cmfSalemode 销售模式
     * @return 结果
     */
    public int insertCmfSalemode(CmfSalemode cmfSalemode);

    /**
     * 修改销售模式
     * 
     * @param cmfSalemode 销售模式
     * @return 结果
     */
    public int updateCmfSalemode(CmfSalemode cmfSalemode);

    /**
     * 批量删除销售模式
     * 
     * @param ids 需要删除的销售模式主键集合
     * @return 结果
     */
    public int deleteCmfSalemodeByIds(Integer[] ids);

    /**
     * 删除销售模式信息
     * 
     * @param id 销售模式主键
     * @return 结果
     */
    public int deleteCmfSalemodeById(Integer id);
}
