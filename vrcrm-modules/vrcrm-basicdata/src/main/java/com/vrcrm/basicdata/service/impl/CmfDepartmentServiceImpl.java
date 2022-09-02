package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfDepartmentMapper;
import com.vrcrm.basicdata.domain.CmfDepartment;
import com.vrcrm.basicdata.service.ICmfDepartmentService;

/**
 * 部门管理Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfDepartmentServiceImpl implements ICmfDepartmentService 
{
    @Autowired
    private CmfDepartmentMapper cmfDepartmentMapper;

    /**
     * 查询部门管理
     * 
     * @param id 部门管理主键
     * @return 部门管理
     */
    @Override
    public CmfDepartment selectCmfDepartmentById(Integer id)
    {
        return cmfDepartmentMapper.selectCmfDepartmentById(id);
    }

    /**
     * 查询部门管理列表
     * 
     * @param cmfDepartment 部门管理
     * @return 部门管理
     */
    @Override
    public List<CmfDepartment> selectCmfDepartmentList(CmfDepartment cmfDepartment)
    {
        return cmfDepartmentMapper.selectCmfDepartmentList(cmfDepartment);
    }

    /**
     * 新增部门管理
     * 
     * @param cmfDepartment 部门管理
     * @return 结果
     */
    @Override
    public int insertCmfDepartment(CmfDepartment cmfDepartment)
    {
        return cmfDepartmentMapper.insertCmfDepartment(cmfDepartment);
    }

    /**
     * 修改部门管理
     * 
     * @param cmfDepartment 部门管理
     * @return 结果
     */
    @Override
    public int updateCmfDepartment(CmfDepartment cmfDepartment)
    {
        return cmfDepartmentMapper.updateCmfDepartment(cmfDepartment);
    }

    /**
     * 批量删除部门管理
     * 
     * @param ids 需要删除的部门管理主键
     * @return 结果
     */
    @Override
    public int deleteCmfDepartmentByIds(Integer[] ids)
    {
        return cmfDepartmentMapper.deleteCmfDepartmentByIds(ids);
    }

    /**
     * 删除部门管理信息
     * 
     * @param id 部门管理主键
     * @return 结果
     */
    @Override
    public int deleteCmfDepartmentById(Integer id)
    {
        return cmfDepartmentMapper.deleteCmfDepartmentById(id);
    }
}
