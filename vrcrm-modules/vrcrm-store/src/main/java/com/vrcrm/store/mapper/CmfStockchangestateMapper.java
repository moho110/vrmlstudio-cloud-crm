package com.vrcrm.store.mapper;

import java.util.List;
import com.vrcrm.store.domain.CmfStockchangestate;

/**
 * 仓库管理调拔状态Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfStockchangestateMapper 
{
    /**
     * 查询仓库管理调拔状态
     * 
     * @param id 仓库管理调拔状态主键
     * @return 仓库管理调拔状态
     */
    public CmfStockchangestate selectCmfStockchangestateById(Integer id);

    /**
     * 查询仓库管理调拔状态列表
     * 
     * @param cmfStockchangestate 仓库管理调拔状态
     * @return 仓库管理调拔状态集合
     */
    public List<CmfStockchangestate> selectCmfStockchangestateList(CmfStockchangestate cmfStockchangestate);

    /**
     * 新增仓库管理调拔状态
     * 
     * @param cmfStockchangestate 仓库管理调拔状态
     * @return 结果
     */
    public int insertCmfStockchangestate(CmfStockchangestate cmfStockchangestate);

    /**
     * 修改仓库管理调拔状态
     * 
     * @param cmfStockchangestate 仓库管理调拔状态
     * @return 结果
     */
    public int updateCmfStockchangestate(CmfStockchangestate cmfStockchangestate);

    /**
     * 删除仓库管理调拔状态
     * 
     * @param id 仓库管理调拔状态主键
     * @return 结果
     */
    public int deleteCmfStockchangestateById(Integer id);

    /**
     * 批量删除仓库管理调拔状态
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfStockchangestateByIds(Integer[] ids);
}
