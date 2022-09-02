package com.vrcrm.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.xsystem.mapper.CmfSystemprivateincMapper;
import com.vrcrm.xsystem.domain.CmfSystemprivateinc;
import com.vrcrm.xsystem.service.ICmfSystemprivateincService;

/**
 * 系统权限配置Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSystemprivateincServiceImpl implements ICmfSystemprivateincService 
{
    @Autowired
    private CmfSystemprivateincMapper cmfSystemprivateincMapper;

    /**
     * 查询系统权限配置
     * 
     * @param id 系统权限配置主键
     * @return 系统权限配置
     */
    @Override
    public CmfSystemprivateinc selectCmfSystemprivateincById(Integer id)
    {
        return cmfSystemprivateincMapper.selectCmfSystemprivateincById(id);
    }

    /**
     * 查询系统权限配置列表
     * 
     * @param cmfSystemprivateinc 系统权限配置
     * @return 系统权限配置
     */
    @Override
    public List<CmfSystemprivateinc> selectCmfSystemprivateincList(CmfSystemprivateinc cmfSystemprivateinc)
    {
        return cmfSystemprivateincMapper.selectCmfSystemprivateincList(cmfSystemprivateinc);
    }

    /**
     * 新增系统权限配置
     * 
     * @param cmfSystemprivateinc 系统权限配置
     * @return 结果
     */
    @Override
    public int insertCmfSystemprivateinc(CmfSystemprivateinc cmfSystemprivateinc)
    {
        return cmfSystemprivateincMapper.insertCmfSystemprivateinc(cmfSystemprivateinc);
    }

    /**
     * 修改系统权限配置
     * 
     * @param cmfSystemprivateinc 系统权限配置
     * @return 结果
     */
    @Override
    public int updateCmfSystemprivateinc(CmfSystemprivateinc cmfSystemprivateinc)
    {
        return cmfSystemprivateincMapper.updateCmfSystemprivateinc(cmfSystemprivateinc);
    }

    /**
     * 批量删除系统权限配置
     * 
     * @param ids 需要删除的系统权限配置主键
     * @return 结果
     */
    @Override
    public int deleteCmfSystemprivateincByIds(Integer[] ids)
    {
        return cmfSystemprivateincMapper.deleteCmfSystemprivateincByIds(ids);
    }

    /**
     * 删除系统权限配置信息
     * 
     * @param id 系统权限配置主键
     * @return 结果
     */
    @Override
    public int deleteCmfSystemprivateincById(Integer id)
    {
        return cmfSystemprivateincMapper.deleteCmfSystemprivateincById(id);
    }
}
