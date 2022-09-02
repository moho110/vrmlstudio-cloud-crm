package com.vrcrm.xsystem.service;

import java.util.List;
import com.vrcrm.xsystem.domain.CmfSystemconfig;

/**
 * 系统配置Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfSystemconfigService 
{
    /**
     * 查询系统配置
     * 
     * @param id 系统配置主键
     * @return 系统配置
     */
    public CmfSystemconfig selectCmfSystemconfigById(Integer id);

    /**
     * 查询系统配置列表
     * 
     * @param cmfSystemconfig 系统配置
     * @return 系统配置集合
     */
    public List<CmfSystemconfig> selectCmfSystemconfigList(CmfSystemconfig cmfSystemconfig);

    /**
     * 新增系统配置
     * 
     * @param cmfSystemconfig 系统配置
     * @return 结果
     */
    public int insertCmfSystemconfig(CmfSystemconfig cmfSystemconfig);

    /**
     * 修改系统配置
     * 
     * @param cmfSystemconfig 系统配置
     * @return 结果
     */
    public int updateCmfSystemconfig(CmfSystemconfig cmfSystemconfig);

    /**
     * 批量删除系统配置
     * 
     * @param ids 需要删除的系统配置主键集合
     * @return 结果
     */
    public int deleteCmfSystemconfigByIds(Integer[] ids);

    /**
     * 删除系统配置信息
     * 
     * @param id 系统配置主键
     * @return 结果
     */
    public int deleteCmfSystemconfigById(Integer id);
}
