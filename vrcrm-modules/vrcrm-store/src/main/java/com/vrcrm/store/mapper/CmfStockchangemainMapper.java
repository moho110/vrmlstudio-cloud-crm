package com.vrcrm.store.mapper;

import java.util.List;
import com.vrcrm.store.domain.CmfStockchangemain;

/**
 * 仓库管理调拔Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfStockchangemainMapper 
{
    /**
     * 查询仓库管理调拔
     * 
     * @param id 仓库管理调拔主键
     * @return 仓库管理调拔
     */
    public CmfStockchangemain selectCmfStockchangemainById(Integer id);

    /**
     * 查询仓库管理调拔列表
     * 
     * @param cmfStockchangemain 仓库管理调拔
     * @return 仓库管理调拔集合
     */
    public List<CmfStockchangemain> selectCmfStockchangemainList(CmfStockchangemain cmfStockchangemain);

    /**
     * 新增仓库管理调拔
     * 
     * @param cmfStockchangemain 仓库管理调拔
     * @return 结果
     */
    public int insertCmfStockchangemain(CmfStockchangemain cmfStockchangemain);

    /**
     * 修改仓库管理调拔
     * 
     * @param cmfStockchangemain 仓库管理调拔
     * @return 结果
     */
    public int updateCmfStockchangemain(CmfStockchangemain cmfStockchangemain);

    /**
     * 删除仓库管理调拔
     * 
     * @param id 仓库管理调拔主键
     * @return 结果
     */
    public int deleteCmfStockchangemainById(Integer id);

    /**
     * 批量删除仓库管理调拔
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfStockchangemainByIds(Integer[] ids);
}
