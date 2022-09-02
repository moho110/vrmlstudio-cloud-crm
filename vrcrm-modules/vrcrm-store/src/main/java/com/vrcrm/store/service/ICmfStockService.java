package com.vrcrm.store.service;

import java.util.List;
import com.vrcrm.store.domain.CmfStock;

/**
 * 仓库管理Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfStockService 
{
    /**
     * 查询仓库管理
     * 
     * @param id 仓库管理主键
     * @return 仓库管理
     */
    public CmfStock selectCmfStockById(Integer id);

    /**
     * 查询仓库管理列表
     * 
     * @param cmfStock 仓库管理
     * @return 仓库管理集合
     */
    public List<CmfStock> selectCmfStockList(CmfStock cmfStock);

    /**
     * 新增仓库管理
     * 
     * @param cmfStock 仓库管理
     * @return 结果
     */
    public int insertCmfStock(CmfStock cmfStock);

    /**
     * 修改仓库管理
     * 
     * @param cmfStock 仓库管理
     * @return 结果
     */
    public int updateCmfStock(CmfStock cmfStock);

    /**
     * 批量删除仓库管理
     * 
     * @param ids 需要删除的仓库管理主键集合
     * @return 结果
     */
    public int deleteCmfStockByIds(Integer[] ids);

    /**
     * 删除仓库管理信息
     * 
     * @param id 仓库管理主键
     * @return 结果
     */
    public int deleteCmfStockById(Integer id);
}
