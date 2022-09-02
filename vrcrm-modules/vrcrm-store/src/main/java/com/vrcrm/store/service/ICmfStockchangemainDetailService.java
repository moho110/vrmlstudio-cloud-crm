package com.vrcrm.store.service;

import java.util.List;
import com.vrcrm.store.domain.CmfStockchangemainDetail;

/**
 * 仓库管理调拔明细Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfStockchangemainDetailService 
{
    /**
     * 查询仓库管理调拔明细
     * 
     * @param id 仓库管理调拔明细主键
     * @return 仓库管理调拔明细
     */
    public CmfStockchangemainDetail selectCmfStockchangemainDetailById(Integer id);

    /**
     * 查询仓库管理调拔明细列表
     * 
     * @param cmfStockchangemainDetail 仓库管理调拔明细
     * @return 仓库管理调拔明细集合
     */
    public List<CmfStockchangemainDetail> selectCmfStockchangemainDetailList(CmfStockchangemainDetail cmfStockchangemainDetail);

    /**
     * 新增仓库管理调拔明细
     * 
     * @param cmfStockchangemainDetail 仓库管理调拔明细
     * @return 结果
     */
    public int insertCmfStockchangemainDetail(CmfStockchangemainDetail cmfStockchangemainDetail);

    /**
     * 修改仓库管理调拔明细
     * 
     * @param cmfStockchangemainDetail 仓库管理调拔明细
     * @return 结果
     */
    public int updateCmfStockchangemainDetail(CmfStockchangemainDetail cmfStockchangemainDetail);

    /**
     * 批量删除仓库管理调拔明细
     * 
     * @param ids 需要删除的仓库管理调拔明细主键集合
     * @return 结果
     */
    public int deleteCmfStockchangemainDetailByIds(Integer[] ids);

    /**
     * 删除仓库管理调拔明细信息
     * 
     * @param id 仓库管理调拔明细主键
     * @return 结果
     */
    public int deleteCmfStockchangemainDetailById(Integer id);
}
