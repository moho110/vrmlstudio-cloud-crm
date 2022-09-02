package com.vrcrm.mytable.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.mytable.mapper.CmfCrmMytableMapper;
import com.vrcrm.mytable.domain.CmfCrmMytable;
import com.vrcrm.mytable.service.ICmfCrmMytableService;

/**
 * 桌面模块表Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfCrmMytableServiceImpl implements ICmfCrmMytableService 
{
    @Autowired
    private CmfCrmMytableMapper cmfCrmMytableMapper;

    /**
     * 查询桌面模块表
     * 
     * @param id 桌面模块表主键
     * @return 桌面模块表
     */
    @Override
    public CmfCrmMytable selectCmfCrmMytableById(Long id)
    {
        return cmfCrmMytableMapper.selectCmfCrmMytableById(id);
    }

    /**
     * 查询桌面模块表列表
     * 
     * @param cmfCrmMytable 桌面模块表
     * @return 桌面模块表
     */
    @Override
    public List<CmfCrmMytable> selectCmfCrmMytableList(CmfCrmMytable cmfCrmMytable)
    {
        return cmfCrmMytableMapper.selectCmfCrmMytableList(cmfCrmMytable);
    }

    /**
     * 新增桌面模块表
     * 
     * @param cmfCrmMytable 桌面模块表
     * @return 结果
     */
    @Override
    public int insertCmfCrmMytable(CmfCrmMytable cmfCrmMytable)
    {
        return cmfCrmMytableMapper.insertCmfCrmMytable(cmfCrmMytable);
    }

    /**
     * 修改桌面模块表
     * 
     * @param cmfCrmMytable 桌面模块表
     * @return 结果
     */
    @Override
    public int updateCmfCrmMytable(CmfCrmMytable cmfCrmMytable)
    {
        return cmfCrmMytableMapper.updateCmfCrmMytable(cmfCrmMytable);
    }

    /**
     * 批量删除桌面模块表
     * 
     * @param ids 需要删除的桌面模块表主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmMytableByIds(Long[] ids)
    {
        return cmfCrmMytableMapper.deleteCmfCrmMytableByIds(ids);
    }

    /**
     * 删除桌面模块表信息
     * 
     * @param id 桌面模块表主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmMytableById(Long id)
    {
        return cmfCrmMytableMapper.deleteCmfCrmMytableById(id);
    }
}
