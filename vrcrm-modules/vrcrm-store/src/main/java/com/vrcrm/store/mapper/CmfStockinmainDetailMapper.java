package com.vrcrm.store.mapper;

import java.util.List;
import com.vrcrm.store.domain.CmfStockinmainDetail;

/**
 * 仓库管理入库明细Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfStockinmainDetailMapper 
{
    /**
     * 查询仓库管理入库明细
     * 
     * @param id 仓库管理入库明细主键
     * @return 仓库管理入库明细
     */
    public CmfStockinmainDetail selectCmfStockinmainDetailById(Integer id);

    /**
     * 查询仓库管理入库明细列表
     * 
     * @param cmfStockinmainDetail 仓库管理入库明细
     * @return 仓库管理入库明细集合
     */
    public List<CmfStockinmainDetail> selectCmfStockinmainDetailList(CmfStockinmainDetail cmfStockinmainDetail);

    /**
     * 新增仓库管理入库明细
     * 
     * @param cmfStockinmainDetail 仓库管理入库明细
     * @return 结果
     */
    public int insertCmfStockinmainDetail(CmfStockinmainDetail cmfStockinmainDetail);

    /**
     * 修改仓库管理入库明细
     * 
     * @param cmfStockinmainDetail 仓库管理入库明细
     * @return 结果
     */
    public int updateCmfStockinmainDetail(CmfStockinmainDetail cmfStockinmainDetail);

    /**
     * 删除仓库管理入库明细
     * 
     * @param id 仓库管理入库明细主键
     * @return 结果
     */
    public int deleteCmfStockinmainDetailById(Integer id);

    /**
     * 批量删除仓库管理入库明细
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfStockinmainDetailByIds(Integer[] ids);
}
