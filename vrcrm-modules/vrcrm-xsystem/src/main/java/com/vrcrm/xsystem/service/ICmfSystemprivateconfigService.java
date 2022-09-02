package com.vrcrm.xsystem.service;

import java.util.List;
import com.vrcrm.xsystem.domain.CmfSystemprivateconfig;

/**
 * 系统权限配置Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfSystemprivateconfigService 
{
    /**
     * 查询系统权限配置
     * 
     * @param id 系统权限配置主键
     * @return 系统权限配置
     */
    public CmfSystemprivateconfig selectCmfSystemprivateconfigById(Integer id);

    /**
     * 查询系统权限配置列表
     * 
     * @param cmfSystemprivateconfig 系统权限配置
     * @return 系统权限配置集合
     */
    public List<CmfSystemprivateconfig> selectCmfSystemprivateconfigList(CmfSystemprivateconfig cmfSystemprivateconfig);

    /**
     * 新增系统权限配置
     * 
     * @param cmfSystemprivateconfig 系统权限配置
     * @return 结果
     */
    public int insertCmfSystemprivateconfig(CmfSystemprivateconfig cmfSystemprivateconfig);

    /**
     * 修改系统权限配置
     * 
     * @param cmfSystemprivateconfig 系统权限配置
     * @return 结果
     */
    public int updateCmfSystemprivateconfig(CmfSystemprivateconfig cmfSystemprivateconfig);

    /**
     * 批量删除系统权限配置
     * 
     * @param ids 需要删除的系统权限配置主键集合
     * @return 结果
     */
    public int deleteCmfSystemprivateconfigByIds(Integer[] ids);

    /**
     * 删除系统权限配置信息
     * 
     * @param id 系统权限配置主键
     * @return 结果
     */
    public int deleteCmfSystemprivateconfigById(Integer id);
}
