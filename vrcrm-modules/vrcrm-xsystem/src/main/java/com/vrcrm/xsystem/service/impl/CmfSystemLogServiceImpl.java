package com.vrcrm.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.xsystem.mapper.CmfSystemLogMapper;
import com.vrcrm.xsystem.domain.CmfSystemLog;
import com.vrcrm.xsystem.service.ICmfSystemLogService;

/**
 * 系统日志Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSystemLogServiceImpl implements ICmfSystemLogService 
{
    @Autowired
    private CmfSystemLogMapper cmfSystemLogMapper;

    /**
     * 查询系统日志
     * 
     * @param id 系统日志主键
     * @return 系统日志
     */
    @Override
    public CmfSystemLog selectCmfSystemLogById(Integer id)
    {
        return cmfSystemLogMapper.selectCmfSystemLogById(id);
    }

    /**
     * 查询系统日志列表
     * 
     * @param cmfSystemLog 系统日志
     * @return 系统日志
     */
    @Override
    public List<CmfSystemLog> selectCmfSystemLogList(CmfSystemLog cmfSystemLog)
    {
        return cmfSystemLogMapper.selectCmfSystemLogList(cmfSystemLog);
    }

    /**
     * 新增系统日志
     * 
     * @param cmfSystemLog 系统日志
     * @return 结果
     */
    @Override
    public int insertCmfSystemLog(CmfSystemLog cmfSystemLog)
    {
        return cmfSystemLogMapper.insertCmfSystemLog(cmfSystemLog);
    }

    /**
     * 修改系统日志
     * 
     * @param cmfSystemLog 系统日志
     * @return 结果
     */
    @Override
    public int updateCmfSystemLog(CmfSystemLog cmfSystemLog)
    {
        return cmfSystemLogMapper.updateCmfSystemLog(cmfSystemLog);
    }

    /**
     * 批量删除系统日志
     * 
     * @param ids 需要删除的系统日志主键
     * @return 结果
     */
    @Override
    public int deleteCmfSystemLogByIds(Integer[] ids)
    {
        return cmfSystemLogMapper.deleteCmfSystemLogByIds(ids);
    }

    /**
     * 删除系统日志信息
     * 
     * @param id 系统日志主键
     * @return 结果
     */
    @Override
    public int deleteCmfSystemLogById(Integer id)
    {
        return cmfSystemLogMapper.deleteCmfSystemLogById(id);
    }
}
