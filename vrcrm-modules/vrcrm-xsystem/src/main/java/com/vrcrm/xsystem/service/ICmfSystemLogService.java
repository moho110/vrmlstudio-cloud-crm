package com.vrcrm.xsystem.service;

import java.util.List;
import com.vrcrm.xsystem.domain.CmfSystemLog;

/**
 * 系统日志Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfSystemLogService 
{
    /**
     * 查询系统日志
     * 
     * @param id 系统日志主键
     * @return 系统日志
     */
    public CmfSystemLog selectCmfSystemLogById(Integer id);

    /**
     * 查询系统日志列表
     * 
     * @param cmfSystemLog 系统日志
     * @return 系统日志集合
     */
    public List<CmfSystemLog> selectCmfSystemLogList(CmfSystemLog cmfSystemLog);

    /**
     * 新增系统日志
     * 
     * @param cmfSystemLog 系统日志
     * @return 结果
     */
    public int insertCmfSystemLog(CmfSystemLog cmfSystemLog);

    /**
     * 修改系统日志
     * 
     * @param cmfSystemLog 系统日志
     * @return 结果
     */
    public int updateCmfSystemLog(CmfSystemLog cmfSystemLog);

    /**
     * 批量删除系统日志
     * 
     * @param ids 需要删除的系统日志主键集合
     * @return 结果
     */
    public int deleteCmfSystemLogByIds(Integer[] ids);

    /**
     * 删除系统日志信息
     * 
     * @param id 系统日志主键
     * @return 结果
     */
    public int deleteCmfSystemLogById(Integer id);
}
