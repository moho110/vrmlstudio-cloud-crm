package com.vrcrm.store.service;

import java.util.List;
import com.vrcrm.store.domain.CmfStoreaccesstype;

/**
 * 库存处理类型Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfStoreaccesstypeService 
{
    /**
     * 查询库存处理类型
     * 
     * @param id 库存处理类型主键
     * @return 库存处理类型
     */
    public CmfStoreaccesstype selectCmfStoreaccesstypeById(Integer id);

    /**
     * 查询库存处理类型列表
     * 
     * @param cmfStoreaccesstype 库存处理类型
     * @return 库存处理类型集合
     */
    public List<CmfStoreaccesstype> selectCmfStoreaccesstypeList(CmfStoreaccesstype cmfStoreaccesstype);

    /**
     * 新增库存处理类型
     * 
     * @param cmfStoreaccesstype 库存处理类型
     * @return 结果
     */
    public int insertCmfStoreaccesstype(CmfStoreaccesstype cmfStoreaccesstype);

    /**
     * 修改库存处理类型
     * 
     * @param cmfStoreaccesstype 库存处理类型
     * @return 结果
     */
    public int updateCmfStoreaccesstype(CmfStoreaccesstype cmfStoreaccesstype);

    /**
     * 批量删除库存处理类型
     * 
     * @param ids 需要删除的库存处理类型主键集合
     * @return 结果
     */
    public int deleteCmfStoreaccesstypeByIds(Integer[] ids);

    /**
     * 删除库存处理类型信息
     * 
     * @param id 库存处理类型主键
     * @return 结果
     */
    public int deleteCmfStoreaccesstypeById(Integer id);
}
