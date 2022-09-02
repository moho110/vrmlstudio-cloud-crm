package com.vrcrm.store.mapper;

import java.util.List;
import com.vrcrm.store.domain.CmfStoreInit;

/**
 * 库存初始化Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfStoreInitMapper 
{
    /**
     * 查询库存初始化
     * 
     * @param id 库存初始化主键
     * @return 库存初始化
     */
    public CmfStoreInit selectCmfStoreInitById(Integer id);

    /**
     * 查询库存初始化列表
     * 
     * @param cmfStoreInit 库存初始化
     * @return 库存初始化集合
     */
    public List<CmfStoreInit> selectCmfStoreInitList(CmfStoreInit cmfStoreInit);

    /**
     * 新增库存初始化
     * 
     * @param cmfStoreInit 库存初始化
     * @return 结果
     */
    public int insertCmfStoreInit(CmfStoreInit cmfStoreInit);

    /**
     * 修改库存初始化
     * 
     * @param cmfStoreInit 库存初始化
     * @return 结果
     */
    public int updateCmfStoreInit(CmfStoreInit cmfStoreInit);

    /**
     * 删除库存初始化
     * 
     * @param id 库存初始化主键
     * @return 结果
     */
    public int deleteCmfStoreInitById(Integer id);

    /**
     * 批量删除库存初始化
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfStoreInitByIds(Integer[] ids);
}
