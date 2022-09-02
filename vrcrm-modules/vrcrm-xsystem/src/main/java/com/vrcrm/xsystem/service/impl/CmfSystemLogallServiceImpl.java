package com.vrcrm.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.xsystem.mapper.CmfSystemLogallMapper;
import com.vrcrm.xsystem.domain.CmfSystemLogall;
import com.vrcrm.xsystem.service.ICmfSystemLogallService;

/**
 * 系统操作日志Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSystemLogallServiceImpl implements ICmfSystemLogallService 
{
    @Autowired
    private CmfSystemLogallMapper cmfSystemLogallMapper;

    /**
     * 查询系统操作日志
     * 
     * @param id 系统操作日志主键
     * @return 系统操作日志
     */
    @Override
    public CmfSystemLogall selectCmfSystemLogallById(Integer id)
    {
        return cmfSystemLogallMapper.selectCmfSystemLogallById(id);
    }

    /**
     * 查询系统操作日志列表
     * 
     * @param cmfSystemLogall 系统操作日志
     * @return 系统操作日志
     */
    @Override
    public List<CmfSystemLogall> selectCmfSystemLogallList(CmfSystemLogall cmfSystemLogall)
    {
        return cmfSystemLogallMapper.selectCmfSystemLogallList(cmfSystemLogall);
    }

    /**
     * 新增系统操作日志
     * 
     * @param cmfSystemLogall 系统操作日志
     * @return 结果
     */
    @Override
    public int insertCmfSystemLogall(CmfSystemLogall cmfSystemLogall)
    {
        return cmfSystemLogallMapper.insertCmfSystemLogall(cmfSystemLogall);
    }

    /**
     * 修改系统操作日志
     * 
     * @param cmfSystemLogall 系统操作日志
     * @return 结果
     */
    @Override
    public int updateCmfSystemLogall(CmfSystemLogall cmfSystemLogall)
    {
        return cmfSystemLogallMapper.updateCmfSystemLogall(cmfSystemLogall);
    }

    /**
     * 批量删除系统操作日志
     * 
     * @param ids 需要删除的系统操作日志主键
     * @return 结果
     */
    @Override
    public int deleteCmfSystemLogallByIds(Integer[] ids)
    {
        return cmfSystemLogallMapper.deleteCmfSystemLogallByIds(ids);
    }

    /**
     * 删除系统操作日志信息
     * 
     * @param id 系统操作日志主键
     * @return 结果
     */
    @Override
    public int deleteCmfSystemLogallById(Integer id)
    {
        return cmfSystemLogallMapper.deleteCmfSystemLogallById(id);
    }
}
