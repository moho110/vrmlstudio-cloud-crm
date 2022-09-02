package com.vrcrm.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.xsystem.mapper.CmfSystemprivateconfigMapper;
import com.vrcrm.xsystem.domain.CmfSystemprivateconfig;
import com.vrcrm.xsystem.service.ICmfSystemprivateconfigService;

/**
 * 系统权限配置Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSystemprivateconfigServiceImpl implements ICmfSystemprivateconfigService 
{
    @Autowired
    private CmfSystemprivateconfigMapper cmfSystemprivateconfigMapper;

    /**
     * 查询系统权限配置
     * 
     * @param id 系统权限配置主键
     * @return 系统权限配置
     */
    @Override
    public CmfSystemprivateconfig selectCmfSystemprivateconfigById(Integer id)
    {
        return cmfSystemprivateconfigMapper.selectCmfSystemprivateconfigById(id);
    }

    /**
     * 查询系统权限配置列表
     * 
     * @param cmfSystemprivateconfig 系统权限配置
     * @return 系统权限配置
     */
    @Override
    public List<CmfSystemprivateconfig> selectCmfSystemprivateconfigList(CmfSystemprivateconfig cmfSystemprivateconfig)
    {
        return cmfSystemprivateconfigMapper.selectCmfSystemprivateconfigList(cmfSystemprivateconfig);
    }

    /**
     * 新增系统权限配置
     * 
     * @param cmfSystemprivateconfig 系统权限配置
     * @return 结果
     */
    @Override
    public int insertCmfSystemprivateconfig(CmfSystemprivateconfig cmfSystemprivateconfig)
    {
        return cmfSystemprivateconfigMapper.insertCmfSystemprivateconfig(cmfSystemprivateconfig);
    }

    /**
     * 修改系统权限配置
     * 
     * @param cmfSystemprivateconfig 系统权限配置
     * @return 结果
     */
    @Override
    public int updateCmfSystemprivateconfig(CmfSystemprivateconfig cmfSystemprivateconfig)
    {
        return cmfSystemprivateconfigMapper.updateCmfSystemprivateconfig(cmfSystemprivateconfig);
    }

    /**
     * 批量删除系统权限配置
     * 
     * @param ids 需要删除的系统权限配置主键
     * @return 结果
     */
    @Override
    public int deleteCmfSystemprivateconfigByIds(Integer[] ids)
    {
        return cmfSystemprivateconfigMapper.deleteCmfSystemprivateconfigByIds(ids);
    }

    /**
     * 删除系统权限配置信息
     * 
     * @param id 系统权限配置主键
     * @return 结果
     */
    @Override
    public int deleteCmfSystemprivateconfigById(Integer id)
    {
        return cmfSystemprivateconfigMapper.deleteCmfSystemprivateconfigById(id);
    }
}
