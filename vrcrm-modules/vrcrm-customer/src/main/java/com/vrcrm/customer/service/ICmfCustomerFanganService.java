package com.vrcrm.customer.service;

import java.util.List;
import com.vrcrm.customer.domain.CmfCustomerFangan;

/**
 * 客户方案Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfCustomerFanganService 
{
    /**
     * 查询客户方案
     * 
     * @param id 客户方案主键
     * @return 客户方案
     */
    public CmfCustomerFangan selectCmfCustomerFanganById(Integer id);

    /**
     * 查询客户方案列表
     * 
     * @param cmfCustomerFangan 客户方案
     * @return 客户方案集合
     */
    public List<CmfCustomerFangan> selectCmfCustomerFanganList(CmfCustomerFangan cmfCustomerFangan);

    /**
     * 新增客户方案
     * 
     * @param cmfCustomerFangan 客户方案
     * @return 结果
     */
    public int insertCmfCustomerFangan(CmfCustomerFangan cmfCustomerFangan);

    /**
     * 修改客户方案
     * 
     * @param cmfCustomerFangan 客户方案
     * @return 结果
     */
    public int updateCmfCustomerFangan(CmfCustomerFangan cmfCustomerFangan);

    /**
     * 批量删除客户方案
     * 
     * @param ids 需要删除的客户方案主键集合
     * @return 结果
     */
    public int deleteCmfCustomerFanganByIds(Integer[] ids);

    /**
     * 删除客户方案信息
     * 
     * @param id 客户方案主键
     * @return 结果
     */
    public int deleteCmfCustomerFanganById(Integer id);
}
