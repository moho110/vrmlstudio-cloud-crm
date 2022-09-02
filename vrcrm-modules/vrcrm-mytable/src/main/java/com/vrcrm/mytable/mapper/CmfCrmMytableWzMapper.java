package com.vrcrm.mytable.mapper;

import java.util.List;
import com.vrcrm.mytable.domain.CmfCrmMytableWz;

/**
 * 桌面显示位置表Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfCrmMytableWzMapper 
{
    /**
     * 查询桌面显示位置表
     * 
     * @param id 桌面显示位置表主键
     * @return 桌面显示位置表
     */
    public CmfCrmMytableWz selectCmfCrmMytableWzById(Integer id);

    /**
     * 查询桌面显示位置表列表
     * 
     * @param cmfCrmMytableWz 桌面显示位置表
     * @return 桌面显示位置表集合
     */
    public List<CmfCrmMytableWz> selectCmfCrmMytableWzList(CmfCrmMytableWz cmfCrmMytableWz);

    /**
     * 新增桌面显示位置表
     * 
     * @param cmfCrmMytableWz 桌面显示位置表
     * @return 结果
     */
    public int insertCmfCrmMytableWz(CmfCrmMytableWz cmfCrmMytableWz);

    /**
     * 修改桌面显示位置表
     * 
     * @param cmfCrmMytableWz 桌面显示位置表
     * @return 结果
     */
    public int updateCmfCrmMytableWz(CmfCrmMytableWz cmfCrmMytableWz);

    /**
     * 删除桌面显示位置表
     * 
     * @param id 桌面显示位置表主键
     * @return 结果
     */
    public int deleteCmfCrmMytableWzById(Integer id);

    /**
     * 批量删除桌面显示位置表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfCrmMytableWzByIds(Integer[] ids);
}
