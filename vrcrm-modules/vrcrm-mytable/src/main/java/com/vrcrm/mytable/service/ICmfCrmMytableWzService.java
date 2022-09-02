package com.vrcrm.mytable.service;

import java.util.List;
import com.vrcrm.mytable.domain.CmfCrmMytableWz;

/**
 * 桌面显示位置表Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfCrmMytableWzService 
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
     * 批量删除桌面显示位置表
     * 
     * @param ids 需要删除的桌面显示位置表主键集合
     * @return 结果
     */
    public int deleteCmfCrmMytableWzByIds(Integer[] ids);

    /**
     * 删除桌面显示位置表信息
     * 
     * @param id 桌面显示位置表主键
     * @return 结果
     */
    public int deleteCmfCrmMytableWzById(Integer id);
}
