package com.vrcrm.political.service;

import java.util.List;
import com.vrcrm.political.domain.CmfWuBoolean;

/**
 * 是否Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfWuBooleanService 
{
    /**
     * 查询是否
     * 
     * @param id 是否主键
     * @return 是否
     */
    public CmfWuBoolean selectCmfWuBooleanById(Integer id);

    /**
     * 查询是否列表
     * 
     * @param cmfWuBoolean 是否
     * @return 是否集合
     */
    public List<CmfWuBoolean> selectCmfWuBooleanList(CmfWuBoolean cmfWuBoolean);

    /**
     * 新增是否
     * 
     * @param cmfWuBoolean 是否
     * @return 结果
     */
    public int insertCmfWuBoolean(CmfWuBoolean cmfWuBoolean);

    /**
     * 修改是否
     * 
     * @param cmfWuBoolean 是否
     * @return 结果
     */
    public int updateCmfWuBoolean(CmfWuBoolean cmfWuBoolean);

    /**
     * 批量删除是否
     * 
     * @param ids 需要删除的是否主键集合
     * @return 结果
     */
    public int deleteCmfWuBooleanByIds(Integer[] ids);

    /**
     * 删除是否信息
     * 
     * @param id 是否主键
     * @return 结果
     */
    public int deleteCmfWuBooleanById(Integer id);
}
