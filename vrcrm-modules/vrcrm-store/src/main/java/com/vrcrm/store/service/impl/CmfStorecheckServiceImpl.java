package com.vrcrm.store.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.store.mapper.CmfStorecheckMapper;
import com.vrcrm.store.domain.CmfStorecheck;
import com.vrcrm.store.service.ICmfStorecheckService;

/**
 * 库存盘点Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfStorecheckServiceImpl implements ICmfStorecheckService 
{
    @Autowired
    private CmfStorecheckMapper cmfStorecheckMapper;

    /**
     * 查询库存盘点
     * 
     * @param id 库存盘点主键
     * @return 库存盘点
     */
    @Override
    public CmfStorecheck selectCmfStorecheckById(Integer id)
    {
        return cmfStorecheckMapper.selectCmfStorecheckById(id);
    }

    /**
     * 查询库存盘点列表
     * 
     * @param cmfStorecheck 库存盘点
     * @return 库存盘点
     */
    @Override
    public List<CmfStorecheck> selectCmfStorecheckList(CmfStorecheck cmfStorecheck)
    {
        return cmfStorecheckMapper.selectCmfStorecheckList(cmfStorecheck);
    }

    /**
     * 新增库存盘点
     * 
     * @param cmfStorecheck 库存盘点
     * @return 结果
     */
    @Override
    public int insertCmfStorecheck(CmfStorecheck cmfStorecheck)
    {
        return cmfStorecheckMapper.insertCmfStorecheck(cmfStorecheck);
    }

    /**
     * 修改库存盘点
     * 
     * @param cmfStorecheck 库存盘点
     * @return 结果
     */
    @Override
    public int updateCmfStorecheck(CmfStorecheck cmfStorecheck)
    {
        return cmfStorecheckMapper.updateCmfStorecheck(cmfStorecheck);
    }

    /**
     * 批量删除库存盘点
     * 
     * @param ids 需要删除的库存盘点主键
     * @return 结果
     */
    @Override
    public int deleteCmfStorecheckByIds(Integer[] ids)
    {
        return cmfStorecheckMapper.deleteCmfStorecheckByIds(ids);
    }

    /**
     * 删除库存盘点信息
     * 
     * @param id 库存盘点主键
     * @return 结果
     */
    @Override
    public int deleteCmfStorecheckById(Integer id)
    {
        return cmfStorecheckMapper.deleteCmfStorecheckById(id);
    }
}
