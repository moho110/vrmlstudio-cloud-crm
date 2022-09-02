package com.vrcrm.basicdata.service;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfDepartment;

/**
 * 部门管理Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfDepartmentService 
{
    /**
     * 查询部门管理
     * 
     * @param id 部门管理主键
     * @return 部门管理
     */
    public CmfDepartment selectCmfDepartmentById(Integer id);

    /**
     * 查询部门管理列表
     * 
     * @param cmfDepartment 部门管理
     * @return 部门管理集合
     */
    public List<CmfDepartment> selectCmfDepartmentList(CmfDepartment cmfDepartment);

    /**
     * 新增部门管理
     * 
     * @param cmfDepartment 部门管理
     * @return 结果
     */
    public int insertCmfDepartment(CmfDepartment cmfDepartment);

    /**
     * 修改部门管理
     * 
     * @param cmfDepartment 部门管理
     * @return 结果
     */
    public int updateCmfDepartment(CmfDepartment cmfDepartment);

    /**
     * 批量删除部门管理
     * 
     * @param ids 需要删除的部门管理主键集合
     * @return 结果
     */
    public int deleteCmfDepartmentByIds(Integer[] ids);

    /**
     * 删除部门管理信息
     * 
     * @param id 部门管理主键
     * @return 结果
     */
    public int deleteCmfDepartmentById(Integer id);
}
