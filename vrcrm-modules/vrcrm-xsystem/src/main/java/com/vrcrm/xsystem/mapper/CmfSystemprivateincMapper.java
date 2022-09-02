package com.vrcrm.xsystem.mapper;

import java.util.List;
import com.vrcrm.xsystem.domain.CmfSystemprivateinc;

/**
 * 系统权限配置Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfSystemprivateincMapper 
{
    /**
     * 查询系统权限配置
     * 
     * @param id 系统权限配置主键
     * @return 系统权限配置
     */
    public CmfSystemprivateinc selectCmfSystemprivateincById(Integer id);

    /**
     * 查询系统权限配置列表
     * 
     * @param cmfSystemprivateinc 系统权限配置
     * @return 系统权限配置集合
     */
    public List<CmfSystemprivateinc> selectCmfSystemprivateincList(CmfSystemprivateinc cmfSystemprivateinc);

    /**
     * 新增系统权限配置
     * 
     * @param cmfSystemprivateinc 系统权限配置
     * @return 结果
     */
    public int insertCmfSystemprivateinc(CmfSystemprivateinc cmfSystemprivateinc);

    /**
     * 修改系统权限配置
     * 
     * @param cmfSystemprivateinc 系统权限配置
     * @return 结果
     */
    public int updateCmfSystemprivateinc(CmfSystemprivateinc cmfSystemprivateinc);

    /**
     * 删除系统权限配置
     * 
     * @param id 系统权限配置主键
     * @return 结果
     */
    public int deleteCmfSystemprivateincById(Integer id);

    /**
     * 批量删除系统权限配置
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfSystemprivateincByIds(Integer[] ids);
}
