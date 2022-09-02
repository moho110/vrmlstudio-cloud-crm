package com.vrcrm.store.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.store.mapper.CmfStoreInitMapper;
import com.vrcrm.store.domain.CmfStoreInit;
import com.vrcrm.store.service.ICmfStoreInitService;

/**
 * 库存初始化Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfStoreInitServiceImpl implements ICmfStoreInitService 
{
    @Autowired
    private CmfStoreInitMapper cmfStoreInitMapper;

    /**
     * 查询库存初始化
     * 
     * @param id 库存初始化主键
     * @return 库存初始化
     */
    @Override
    public CmfStoreInit selectCmfStoreInitById(Integer id)
    {
        return cmfStoreInitMapper.selectCmfStoreInitById(id);
    }

    /**
     * 查询库存初始化列表
     * 
     * @param cmfStoreInit 库存初始化
     * @return 库存初始化
     */
    @Override
    public List<CmfStoreInit> selectCmfStoreInitList(CmfStoreInit cmfStoreInit)
    {
        return cmfStoreInitMapper.selectCmfStoreInitList(cmfStoreInit);
    }

    /**
     * 新增库存初始化
     * 
     * @param cmfStoreInit 库存初始化
     * @return 结果
     */
    @Override
    public int insertCmfStoreInit(CmfStoreInit cmfStoreInit)
    {
        return cmfStoreInitMapper.insertCmfStoreInit(cmfStoreInit);
    }

    /**
     * 修改库存初始化
     * 
     * @param cmfStoreInit 库存初始化
     * @return 结果
     */
    @Override
    public int updateCmfStoreInit(CmfStoreInit cmfStoreInit)
    {
        return cmfStoreInitMapper.updateCmfStoreInit(cmfStoreInit);
    }

    /**
     * 批量删除库存初始化
     * 
     * @param ids 需要删除的库存初始化主键
     * @return 结果
     */
    @Override
    public int deleteCmfStoreInitByIds(Integer[] ids)
    {
        return cmfStoreInitMapper.deleteCmfStoreInitByIds(ids);
    }

    /**
     * 删除库存初始化信息
     * 
     * @param id 库存初始化主键
     * @return 结果
     */
    @Override
    public int deleteCmfStoreInitById(Integer id)
    {
        return cmfStoreInitMapper.deleteCmfStoreInitById(id);
    }
}
