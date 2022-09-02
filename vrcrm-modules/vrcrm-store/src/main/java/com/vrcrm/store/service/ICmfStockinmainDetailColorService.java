package com.vrcrm.store.service;

import java.util.List;
import com.vrcrm.store.domain.CmfStockinmainDetailColor;

/**
 * 仓库管理入库明细颜色Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfStockinmainDetailColorService 
{
    /**
     * 查询仓库管理入库明细颜色
     * 
     * @param id 仓库管理入库明细颜色主键
     * @return 仓库管理入库明细颜色
     */
    public CmfStockinmainDetailColor selectCmfStockinmainDetailColorById(Integer id);

    /**
     * 查询仓库管理入库明细颜色列表
     * 
     * @param cmfStockinmainDetailColor 仓库管理入库明细颜色
     * @return 仓库管理入库明细颜色集合
     */
    public List<CmfStockinmainDetailColor> selectCmfStockinmainDetailColorList(CmfStockinmainDetailColor cmfStockinmainDetailColor);

    /**
     * 新增仓库管理入库明细颜色
     * 
     * @param cmfStockinmainDetailColor 仓库管理入库明细颜色
     * @return 结果
     */
    public int insertCmfStockinmainDetailColor(CmfStockinmainDetailColor cmfStockinmainDetailColor);

    /**
     * 修改仓库管理入库明细颜色
     * 
     * @param cmfStockinmainDetailColor 仓库管理入库明细颜色
     * @return 结果
     */
    public int updateCmfStockinmainDetailColor(CmfStockinmainDetailColor cmfStockinmainDetailColor);

    /**
     * 批量删除仓库管理入库明细颜色
     * 
     * @param ids 需要删除的仓库管理入库明细颜色主键集合
     * @return 结果
     */
    public int deleteCmfStockinmainDetailColorByIds(Integer[] ids);

    /**
     * 删除仓库管理入库明细颜色信息
     * 
     * @param id 仓库管理入库明细颜色主键
     * @return 结果
     */
    public int deleteCmfStockinmainDetailColorById(Integer id);
}
