package com.vrcrm.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.xsystem.mapper.CmfSystemtableMapper;
import com.vrcrm.xsystem.domain.CmfSystemtable;
import com.vrcrm.xsystem.service.ICmfSystemtableService;

/**
 * 系统表Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSystemtableServiceImpl implements ICmfSystemtableService 
{
    @Autowired
    private CmfSystemtableMapper cmfSystemtableMapper;

    /**
     * 查询系统表
     * 
     * @param id 系统表主键
     * @return 系统表
     */
    @Override
    public CmfSystemtable selectCmfSystemtableById(Integer id)
    {
        return cmfSystemtableMapper.selectCmfSystemtableById(id);
    }

    /**
     * 查询系统表列表
     * 
     * @param cmfSystemtable 系统表
     * @return 系统表
     */
    @Override
    public List<CmfSystemtable> selectCmfSystemtableList(CmfSystemtable cmfSystemtable)
    {
        return cmfSystemtableMapper.selectCmfSystemtableList(cmfSystemtable);
    }

    /**
     * 新增系统表
     * 
     * @param cmfSystemtable 系统表
     * @return 结果
     */
    @Override
    public int insertCmfSystemtable(CmfSystemtable cmfSystemtable)
    {
        return cmfSystemtableMapper.insertCmfSystemtable(cmfSystemtable);
    }

    /**
     * 修改系统表
     * 
     * @param cmfSystemtable 系统表
     * @return 结果
     */
    @Override
    public int updateCmfSystemtable(CmfSystemtable cmfSystemtable)
    {
        return cmfSystemtableMapper.updateCmfSystemtable(cmfSystemtable);
    }

    /**
     * 批量删除系统表
     * 
     * @param ids 需要删除的系统表主键
     * @return 结果
     */
    @Override
    public int deleteCmfSystemtableByIds(Integer[] ids)
    {
        return cmfSystemtableMapper.deleteCmfSystemtableByIds(ids);
    }

    /**
     * 删除系统表信息
     * 
     * @param id 系统表主键
     * @return 结果
     */
    @Override
    public int deleteCmfSystemtableById(Integer id)
    {
        return cmfSystemtableMapper.deleteCmfSystemtableById(id);
    }
}
