package com.vrcrm.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.xsystem.mapper.CmfSystemprivateMapper;
import com.vrcrm.xsystem.domain.CmfSystemprivate;
import com.vrcrm.xsystem.service.ICmfSystemprivateService;

/**
 * 系统权限Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSystemprivateServiceImpl implements ICmfSystemprivateService 
{
    @Autowired
    private CmfSystemprivateMapper cmfSystemprivateMapper;

    /**
     * 查询系统权限
     * 
     * @param id 系统权限主键
     * @return 系统权限
     */
    @Override
    public CmfSystemprivate selectCmfSystemprivateById(Integer id)
    {
        return cmfSystemprivateMapper.selectCmfSystemprivateById(id);
    }

    /**
     * 查询系统权限列表
     * 
     * @param cmfSystemprivate 系统权限
     * @return 系统权限
     */
    @Override
    public List<CmfSystemprivate> selectCmfSystemprivateList(CmfSystemprivate cmfSystemprivate)
    {
        return cmfSystemprivateMapper.selectCmfSystemprivateList(cmfSystemprivate);
    }

    /**
     * 新增系统权限
     * 
     * @param cmfSystemprivate 系统权限
     * @return 结果
     */
    @Override
    public int insertCmfSystemprivate(CmfSystemprivate cmfSystemprivate)
    {
        return cmfSystemprivateMapper.insertCmfSystemprivate(cmfSystemprivate);
    }

    /**
     * 修改系统权限
     * 
     * @param cmfSystemprivate 系统权限
     * @return 结果
     */
    @Override
    public int updateCmfSystemprivate(CmfSystemprivate cmfSystemprivate)
    {
        return cmfSystemprivateMapper.updateCmfSystemprivate(cmfSystemprivate);
    }

    /**
     * 批量删除系统权限
     * 
     * @param ids 需要删除的系统权限主键
     * @return 结果
     */
    @Override
    public int deleteCmfSystemprivateByIds(Integer[] ids)
    {
        return cmfSystemprivateMapper.deleteCmfSystemprivateByIds(ids);
    }

    /**
     * 删除系统权限信息
     * 
     * @param id 系统权限主键
     * @return 结果
     */
    @Override
    public int deleteCmfSystemprivateById(Integer id)
    {
        return cmfSystemprivateMapper.deleteCmfSystemprivateById(id);
    }
}
