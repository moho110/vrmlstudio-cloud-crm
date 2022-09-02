package com.vrcrm.store.service;

import java.util.List;
import com.vrcrm.store.domain.CmfStockoutmainDetail;

/**
 * 仓库出库明细Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfStockoutmainDetailService 
{
    /**
     * 查询仓库出库明细
     * 
     * @param id 仓库出库明细主键
     * @return 仓库出库明细
     */
    public CmfStockoutmainDetail selectCmfStockoutmainDetailById(Integer id);

    /**
     * 查询仓库出库明细列表
     * 
     * @param cmfStockoutmainDetail 仓库出库明细
     * @return 仓库出库明细集合
     */
    public List<CmfStockoutmainDetail> selectCmfStockoutmainDetailList(CmfStockoutmainDetail cmfStockoutmainDetail);

    /**
     * 新增仓库出库明细
     * 
     * @param cmfStockoutmainDetail 仓库出库明细
     * @return 结果
     */
    public int insertCmfStockoutmainDetail(CmfStockoutmainDetail cmfStockoutmainDetail);

    /**
     * 修改仓库出库明细
     * 
     * @param cmfStockoutmainDetail 仓库出库明细
     * @return 结果
     */
    public int updateCmfStockoutmainDetail(CmfStockoutmainDetail cmfStockoutmainDetail);

    /**
     * 批量删除仓库出库明细
     * 
     * @param ids 需要删除的仓库出库明细主键集合
     * @return 结果
     */
    public int deleteCmfStockoutmainDetailByIds(Integer[] ids);

    /**
     * 删除仓库出库明细信息
     * 
     * @param id 仓库出库明细主键
     * @return 结果
     */
    public int deleteCmfStockoutmainDetailById(Integer id);
}
