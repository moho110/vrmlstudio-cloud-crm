package com.vrcrm.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.xsystem.mapper.CmfSystemconfigMapper;
import com.vrcrm.xsystem.domain.CmfSystemconfig;
import com.vrcrm.xsystem.service.ICmfSystemconfigService;

/**
 * 系统配置Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSystemconfigServiceImpl implements ICmfSystemconfigService 
{
    @Autowired
    private CmfSystemconfigMapper cmfSystemconfigMapper;

    /**
     * 查询系统配置
     * 
     * @param id 系统配置主键
     * @return 系统配置
     */
    @Override
    public CmfSystemconfig selectCmfSystemconfigById(Integer id)
    {
        return cmfSystemconfigMapper.selectCmfSystemconfigById(id);
    }

    /**
     * 查询系统配置列表
     * 
     * @param cmfSystemconfig 系统配置
     * @return 系统配置
     */
    @Override
    public List<CmfSystemconfig> selectCmfSystemconfigList(CmfSystemconfig cmfSystemconfig)
    {
        return cmfSystemconfigMapper.selectCmfSystemconfigList(cmfSystemconfig);
    }

    /**
     * 新增系统配置
     * 
     * @param cmfSystemconfig 系统配置
     * @return 结果
     */
    @Override
    public int insertCmfSystemconfig(CmfSystemconfig cmfSystemconfig)
    {
        return cmfSystemconfigMapper.insertCmfSystemconfig(cmfSystemconfig);
    }

    /**
     * 修改系统配置
     * 
     * @param cmfSystemconfig 系统配置
     * @return 结果
     */
    @Override
    public int updateCmfSystemconfig(CmfSystemconfig cmfSystemconfig)
    {
        return cmfSystemconfigMapper.updateCmfSystemconfig(cmfSystemconfig);
    }

    /**
     * 批量删除系统配置
     * 
     * @param ids 需要删除的系统配置主键
     * @return 结果
     */
    @Override
    public int deleteCmfSystemconfigByIds(Integer[] ids)
    {
        return cmfSystemconfigMapper.deleteCmfSystemconfigByIds(ids);
    }

    /**
     * 删除系统配置信息
     * 
     * @param id 系统配置主键
     * @return 结果
     */
    @Override
    public int deleteCmfSystemconfigById(Integer id)
    {
        return cmfSystemconfigMapper.deleteCmfSystemconfigById(id);
    }
}
