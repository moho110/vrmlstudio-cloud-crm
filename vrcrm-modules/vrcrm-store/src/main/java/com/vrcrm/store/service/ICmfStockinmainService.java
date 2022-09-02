package com.vrcrm.store.service;

import java.util.List;
import com.vrcrm.store.domain.CmfStockinmain;

/**
 * 仓库管理入库Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfStockinmainService 
{
    /**
     * 查询仓库管理入库
     * 
     * @param id 仓库管理入库主键
     * @return 仓库管理入库
     */
    public CmfStockinmain selectCmfStockinmainById(Integer id);

    /**
     * 查询仓库管理入库列表
     * 
     * @param cmfStockinmain 仓库管理入库
     * @return 仓库管理入库集合
     */
    public List<CmfStockinmain> selectCmfStockinmainList(CmfStockinmain cmfStockinmain);

    /**
     * 新增仓库管理入库
     * 
     * @param cmfStockinmain 仓库管理入库
     * @return 结果
     */
    public int insertCmfStockinmain(CmfStockinmain cmfStockinmain);

    /**
     * 修改仓库管理入库
     * 
     * @param cmfStockinmain 仓库管理入库
     * @return 结果
     */
    public int updateCmfStockinmain(CmfStockinmain cmfStockinmain);

    /**
     * 批量删除仓库管理入库
     * 
     * @param ids 需要删除的仓库管理入库主键集合
     * @return 结果
     */
    public int deleteCmfStockinmainByIds(Integer[] ids);

    /**
     * 删除仓库管理入库信息
     * 
     * @param id 仓库管理入库主键
     * @return 结果
     */
    public int deleteCmfStockinmainById(Integer id);
}
