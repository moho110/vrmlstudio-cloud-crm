package com.vrcrm.xsystem.service;

import java.util.List;
import com.vrcrm.xsystem.domain.CmfSystemtable;

/**
 * 系统表Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfSystemtableService 
{
    /**
     * 查询系统表
     * 
     * @param id 系统表主键
     * @return 系统表
     */
    public CmfSystemtable selectCmfSystemtableById(Integer id);

    /**
     * 查询系统表列表
     * 
     * @param cmfSystemtable 系统表
     * @return 系统表集合
     */
    public List<CmfSystemtable> selectCmfSystemtableList(CmfSystemtable cmfSystemtable);

    /**
     * 新增系统表
     * 
     * @param cmfSystemtable 系统表
     * @return 结果
     */
    public int insertCmfSystemtable(CmfSystemtable cmfSystemtable);

    /**
     * 修改系统表
     * 
     * @param cmfSystemtable 系统表
     * @return 结果
     */
    public int updateCmfSystemtable(CmfSystemtable cmfSystemtable);

    /**
     * 批量删除系统表
     * 
     * @param ids 需要删除的系统表主键集合
     * @return 结果
     */
    public int deleteCmfSystemtableByIds(Integer[] ids);

    /**
     * 删除系统表信息
     * 
     * @param id 系统表主键
     * @return 结果
     */
    public int deleteCmfSystemtableById(Integer id);
}
