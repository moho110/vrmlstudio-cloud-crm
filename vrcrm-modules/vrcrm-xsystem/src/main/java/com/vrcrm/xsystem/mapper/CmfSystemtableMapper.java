package com.vrcrm.xsystem.mapper;

import java.util.List;
import com.vrcrm.xsystem.domain.CmfSystemtable;

/**
 * 系统表Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfSystemtableMapper 
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
     * 删除系统表
     * 
     * @param id 系统表主键
     * @return 结果
     */
    public int deleteCmfSystemtableById(Integer id);

    /**
     * 批量删除系统表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfSystemtableByIds(Integer[] ids);
}
