package com.vrcrm.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.xsystem.mapper.CmfSystemLogtypeMapper;
import com.vrcrm.xsystem.domain.CmfSystemLogtype;
import com.vrcrm.xsystem.service.ICmfSystemLogtypeService;

/**
 * 系统日志类型Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSystemLogtypeServiceImpl implements ICmfSystemLogtypeService 
{
    @Autowired
    private CmfSystemLogtypeMapper cmfSystemLogtypeMapper;

    /**
     * 查询系统日志类型
     * 
     * @param id 系统日志类型主键
     * @return 系统日志类型
     */
    @Override
    public CmfSystemLogtype selectCmfSystemLogtypeById(Integer id)
    {
        return cmfSystemLogtypeMapper.selectCmfSystemLogtypeById(id);
    }

    /**
     * 查询系统日志类型列表
     * 
     * @param cmfSystemLogtype 系统日志类型
     * @return 系统日志类型
     */
    @Override
    public List<CmfSystemLogtype> selectCmfSystemLogtypeList(CmfSystemLogtype cmfSystemLogtype)
    {
        return cmfSystemLogtypeMapper.selectCmfSystemLogtypeList(cmfSystemLogtype);
    }

    /**
     * 新增系统日志类型
     * 
     * @param cmfSystemLogtype 系统日志类型
     * @return 结果
     */
    @Override
    public int insertCmfSystemLogtype(CmfSystemLogtype cmfSystemLogtype)
    {
        return cmfSystemLogtypeMapper.insertCmfSystemLogtype(cmfSystemLogtype);
    }

    /**
     * 修改系统日志类型
     * 
     * @param cmfSystemLogtype 系统日志类型
     * @return 结果
     */
    @Override
    public int updateCmfSystemLogtype(CmfSystemLogtype cmfSystemLogtype)
    {
        return cmfSystemLogtypeMapper.updateCmfSystemLogtype(cmfSystemLogtype);
    }

    /**
     * 批量删除系统日志类型
     * 
     * @param ids 需要删除的系统日志类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfSystemLogtypeByIds(Integer[] ids)
    {
        return cmfSystemLogtypeMapper.deleteCmfSystemLogtypeByIds(ids);
    }

    /**
     * 删除系统日志类型信息
     * 
     * @param id 系统日志类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfSystemLogtypeById(Integer id)
    {
        return cmfSystemLogtypeMapper.deleteCmfSystemLogtypeById(id);
    }
}
