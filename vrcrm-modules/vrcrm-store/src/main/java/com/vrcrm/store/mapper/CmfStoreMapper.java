package com.vrcrm.store.mapper;

import java.util.List;
import com.vrcrm.store.domain.CmfStore;

/**
 * 库存Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfStoreMapper 
{
    /**
     * 查询库存
     * 
     * @param id 库存主键
     * @return 库存
     */
    public CmfStore selectCmfStoreById(Integer id);

    /**
     * 查询库存列表
     * 
     * @param cmfStore 库存
     * @return 库存集合
     */
    public List<CmfStore> selectCmfStoreList(CmfStore cmfStore);

    /**
     * 新增库存
     * 
     * @param cmfStore 库存
     * @return 结果
     */
    public int insertCmfStore(CmfStore cmfStore);

    /**
     * 修改库存
     * 
     * @param cmfStore 库存
     * @return 结果
     */
    public int updateCmfStore(CmfStore cmfStore);

    /**
     * 删除库存
     * 
     * @param id 库存主键
     * @return 结果
     */
    public int deleteCmfStoreById(Integer id);

    /**
     * 批量删除库存
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfStoreByIds(Integer[] ids);
}
