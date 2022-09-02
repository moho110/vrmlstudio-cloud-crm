package com.vrcrm.store.mapper;

import java.util.List;
import com.vrcrm.store.domain.CmfStorecheck;

/**
 * 库存盘点Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfStorecheckMapper 
{
    /**
     * 查询库存盘点
     * 
     * @param id 库存盘点主键
     * @return 库存盘点
     */
    public CmfStorecheck selectCmfStorecheckById(Integer id);

    /**
     * 查询库存盘点列表
     * 
     * @param cmfStorecheck 库存盘点
     * @return 库存盘点集合
     */
    public List<CmfStorecheck> selectCmfStorecheckList(CmfStorecheck cmfStorecheck);

    /**
     * 新增库存盘点
     * 
     * @param cmfStorecheck 库存盘点
     * @return 结果
     */
    public int insertCmfStorecheck(CmfStorecheck cmfStorecheck);

    /**
     * 修改库存盘点
     * 
     * @param cmfStorecheck 库存盘点
     * @return 结果
     */
    public int updateCmfStorecheck(CmfStorecheck cmfStorecheck);

    /**
     * 删除库存盘点
     * 
     * @param id 库存盘点主键
     * @return 结果
     */
    public int deleteCmfStorecheckById(Integer id);

    /**
     * 批量删除库存盘点
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfStorecheckByIds(Integer[] ids);
}
