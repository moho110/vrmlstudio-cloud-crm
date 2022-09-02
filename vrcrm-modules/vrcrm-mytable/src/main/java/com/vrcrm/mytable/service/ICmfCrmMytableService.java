package com.vrcrm.mytable.service;

import java.util.List;
import com.vrcrm.mytable.domain.CmfCrmMytable;

/**
 * 桌面模块表Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfCrmMytableService 
{
    /**
     * 查询桌面模块表
     * 
     * @param id 桌面模块表主键
     * @return 桌面模块表
     */
    public CmfCrmMytable selectCmfCrmMytableById(Long id);

    /**
     * 查询桌面模块表列表
     * 
     * @param cmfCrmMytable 桌面模块表
     * @return 桌面模块表集合
     */
    public List<CmfCrmMytable> selectCmfCrmMytableList(CmfCrmMytable cmfCrmMytable);

    /**
     * 新增桌面模块表
     * 
     * @param cmfCrmMytable 桌面模块表
     * @return 结果
     */
    public int insertCmfCrmMytable(CmfCrmMytable cmfCrmMytable);

    /**
     * 修改桌面模块表
     * 
     * @param cmfCrmMytable 桌面模块表
     * @return 结果
     */
    public int updateCmfCrmMytable(CmfCrmMytable cmfCrmMytable);

    /**
     * 批量删除桌面模块表
     * 
     * @param ids 需要删除的桌面模块表主键集合
     * @return 结果
     */
    public int deleteCmfCrmMytableByIds(Long[] ids);

    /**
     * 删除桌面模块表信息
     * 
     * @param id 桌面模块表主键
     * @return 结果
     */
    public int deleteCmfCrmMytableById(Long id);
}
