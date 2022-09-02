package com.vrcrm.store.service;

import java.util.List;
import com.vrcrm.store.domain.CmfStoreColor;

/**
 * 库存明细颜色Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfStoreColorService 
{
    /**
     * 查询库存明细颜色
     * 
     * @param id 库存明细颜色主键
     * @return 库存明细颜色
     */
    public CmfStoreColor selectCmfStoreColorById(Integer id);

    /**
     * 查询库存明细颜色列表
     * 
     * @param cmfStoreColor 库存明细颜色
     * @return 库存明细颜色集合
     */
    public List<CmfStoreColor> selectCmfStoreColorList(CmfStoreColor cmfStoreColor);

    /**
     * 新增库存明细颜色
     * 
     * @param cmfStoreColor 库存明细颜色
     * @return 结果
     */
    public int insertCmfStoreColor(CmfStoreColor cmfStoreColor);

    /**
     * 修改库存明细颜色
     * 
     * @param cmfStoreColor 库存明细颜色
     * @return 结果
     */
    public int updateCmfStoreColor(CmfStoreColor cmfStoreColor);

    /**
     * 批量删除库存明细颜色
     * 
     * @param ids 需要删除的库存明细颜色主键集合
     * @return 结果
     */
    public int deleteCmfStoreColorByIds(Integer[] ids);

    /**
     * 删除库存明细颜色信息
     * 
     * @param id 库存明细颜色主键
     * @return 结果
     */
    public int deleteCmfStoreColorById(Integer id);
}
