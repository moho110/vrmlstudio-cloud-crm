package com.vrcrm.customer.service;

import java.util.List;
import com.vrcrm.customer.domain.CmfCustomerarea;

/**
 * 客户区域Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfCustomerareaService 
{
    /**
     * 查询客户区域
     * 
     * @param id 客户区域主键
     * @return 客户区域
     */
    public CmfCustomerarea selectCmfCustomerareaById(Integer id);

    /**
     * 查询客户区域列表
     * 
     * @param cmfCustomerarea 客户区域
     * @return 客户区域集合
     */
    public List<CmfCustomerarea> selectCmfCustomerareaList(CmfCustomerarea cmfCustomerarea);

    /**
     * 新增客户区域
     * 
     * @param cmfCustomerarea 客户区域
     * @return 结果
     */
    public int insertCmfCustomerarea(CmfCustomerarea cmfCustomerarea);

    /**
     * 修改客户区域
     * 
     * @param cmfCustomerarea 客户区域
     * @return 结果
     */
    public int updateCmfCustomerarea(CmfCustomerarea cmfCustomerarea);

    /**
     * 批量删除客户区域
     * 
     * @param ids 需要删除的客户区域主键集合
     * @return 结果
     */
    public int deleteCmfCustomerareaByIds(Integer[] ids);

    /**
     * 删除客户区域信息
     * 
     * @param id 客户区域主键
     * @return 结果
     */
    public int deleteCmfCustomerareaById(Integer id);
}
