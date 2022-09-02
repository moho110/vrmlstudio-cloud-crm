package com.vrcrm.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.xsystem.mapper.CmfSystemlangMapper;
import com.vrcrm.xsystem.domain.CmfSystemlang;
import com.vrcrm.xsystem.service.ICmfSystemlangService;

/**
 * 系统语言Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSystemlangServiceImpl implements ICmfSystemlangService 
{
    @Autowired
    private CmfSystemlangMapper cmfSystemlangMapper;

    /**
     * 查询系统语言
     * 
     * @param id 系统语言主键
     * @return 系统语言
     */
    @Override
    public CmfSystemlang selectCmfSystemlangById(Integer id)
    {
        return cmfSystemlangMapper.selectCmfSystemlangById(id);
    }

    /**
     * 查询系统语言列表
     * 
     * @param cmfSystemlang 系统语言
     * @return 系统语言
     */
    @Override
    public List<CmfSystemlang> selectCmfSystemlangList(CmfSystemlang cmfSystemlang)
    {
        return cmfSystemlangMapper.selectCmfSystemlangList(cmfSystemlang);
    }

    /**
     * 新增系统语言
     * 
     * @param cmfSystemlang 系统语言
     * @return 结果
     */
    @Override
    public int insertCmfSystemlang(CmfSystemlang cmfSystemlang)
    {
        return cmfSystemlangMapper.insertCmfSystemlang(cmfSystemlang);
    }

    /**
     * 修改系统语言
     * 
     * @param cmfSystemlang 系统语言
     * @return 结果
     */
    @Override
    public int updateCmfSystemlang(CmfSystemlang cmfSystemlang)
    {
        return cmfSystemlangMapper.updateCmfSystemlang(cmfSystemlang);
    }

    /**
     * 批量删除系统语言
     * 
     * @param ids 需要删除的系统语言主键
     * @return 结果
     */
    @Override
    public int deleteCmfSystemlangByIds(Integer[] ids)
    {
        return cmfSystemlangMapper.deleteCmfSystemlangByIds(ids);
    }

    /**
     * 删除系统语言信息
     * 
     * @param id 系统语言主键
     * @return 结果
     */
    @Override
    public int deleteCmfSystemlangById(Integer id)
    {
        return cmfSystemlangMapper.deleteCmfSystemlangById(id);
    }
}
