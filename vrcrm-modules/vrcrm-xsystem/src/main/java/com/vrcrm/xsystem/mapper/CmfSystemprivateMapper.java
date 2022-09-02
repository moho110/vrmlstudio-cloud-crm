package com.vrcrm.xsystem.mapper;

import java.util.List;
import com.vrcrm.xsystem.domain.CmfSystemprivate;

/**
 * 系统权限Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfSystemprivateMapper 
{
    /**
     * 查询系统权限
     * 
     * @param id 系统权限主键
     * @return 系统权限
     */
    public CmfSystemprivate selectCmfSystemprivateById(Integer id);

    /**
     * 查询系统权限列表
     * 
     * @param cmfSystemprivate 系统权限
     * @return 系统权限集合
     */
    public List<CmfSystemprivate> selectCmfSystemprivateList(CmfSystemprivate cmfSystemprivate);

    /**
     * 新增系统权限
     * 
     * @param cmfSystemprivate 系统权限
     * @return 结果
     */
    public int insertCmfSystemprivate(CmfSystemprivate cmfSystemprivate);

    /**
     * 修改系统权限
     * 
     * @param cmfSystemprivate 系统权限
     * @return 结果
     */
    public int updateCmfSystemprivate(CmfSystemprivate cmfSystemprivate);

    /**
     * 删除系统权限
     * 
     * @param id 系统权限主键
     * @return 结果
     */
    public int deleteCmfSystemprivateById(Integer id);

    /**
     * 批量删除系统权限
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfSystemprivateByIds(Integer[] ids);
}
