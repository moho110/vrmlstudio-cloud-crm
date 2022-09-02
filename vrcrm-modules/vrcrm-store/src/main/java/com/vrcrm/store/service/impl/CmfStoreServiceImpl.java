package com.vrcrm.store.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.store.mapper.CmfStoreMapper;
import com.vrcrm.store.domain.CmfStore;
import com.vrcrm.store.service.ICmfStoreService;

/**
 * 库存Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfStoreServiceImpl implements ICmfStoreService 
{
    @Autowired
    private CmfStoreMapper cmfStoreMapper;

    /**
     * 查询库存
     * 
     * @param id 库存主键
     * @return 库存
     */
    @Override
    public CmfStore selectCmfStoreById(Integer id)
    {
        return cmfStoreMapper.selectCmfStoreById(id);
    }

    /**
     * 查询库存列表
     * 
     * @param cmfStore 库存
     * @return 库存
     */
    @Override
    public List<CmfStore> selectCmfStoreList(CmfStore cmfStore)
    {
        return cmfStoreMapper.selectCmfStoreList(cmfStore);
    }

    /**
     * 新增库存
     * 
     * @param cmfStore 库存
     * @return 结果
     */
    @Override
    public int insertCmfStore(CmfStore cmfStore)
    {
        return cmfStoreMapper.insertCmfStore(cmfStore);
    }

    /**
     * 修改库存
     * 
     * @param cmfStore 库存
     * @return 结果
     */
    @Override
    public int updateCmfStore(CmfStore cmfStore)
    {
        return cmfStoreMapper.updateCmfStore(cmfStore);
    }

    /**
     * 批量删除库存
     * 
     * @param ids 需要删除的库存主键
     * @return 结果
     */
    @Override
    public int deleteCmfStoreByIds(Integer[] ids)
    {
        return cmfStoreMapper.deleteCmfStoreByIds(ids);
    }

    /**
     * 删除库存信息
     * 
     * @param id 库存主键
     * @return 结果
     */
    @Override
    public int deleteCmfStoreById(Integer id)
    {
        return cmfStoreMapper.deleteCmfStoreById(id);
    }
}
