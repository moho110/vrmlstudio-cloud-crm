package com.vrcrm.xsystem.service;

import java.util.List;
import com.vrcrm.xsystem.domain.CmfSystemhelp;

/**
 * 系统帮助Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfSystemhelpService 
{
    /**
     * 查询系统帮助
     * 
     * @param id 系统帮助主键
     * @return 系统帮助
     */
    public CmfSystemhelp selectCmfSystemhelpById(Integer id);

    /**
     * 查询系统帮助列表
     * 
     * @param cmfSystemhelp 系统帮助
     * @return 系统帮助集合
     */
    public List<CmfSystemhelp> selectCmfSystemhelpList(CmfSystemhelp cmfSystemhelp);

    /**
     * 新增系统帮助
     * 
     * @param cmfSystemhelp 系统帮助
     * @return 结果
     */
    public int insertCmfSystemhelp(CmfSystemhelp cmfSystemhelp);

    /**
     * 修改系统帮助
     * 
     * @param cmfSystemhelp 系统帮助
     * @return 结果
     */
    public int updateCmfSystemhelp(CmfSystemhelp cmfSystemhelp);

    /**
     * 批量删除系统帮助
     * 
     * @param ids 需要删除的系统帮助主键集合
     * @return 结果
     */
    public int deleteCmfSystemhelpByIds(Integer[] ids);

    /**
     * 删除系统帮助信息
     * 
     * @param id 系统帮助主键
     * @return 结果
     */
    public int deleteCmfSystemhelpById(Integer id);
}
