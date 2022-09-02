package com.vrcrm.customer.service;

import java.util.List;
import com.vrcrm.customer.domain.CmfCustomerbelong;

/**
 * 客户所属Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfCustomerbelongService 
{
    /**
     * 查询客户所属
     * 
     * @param id 客户所属主键
     * @return 客户所属
     */
    public CmfCustomerbelong selectCmfCustomerbelongById(Integer id);

    /**
     * 查询客户所属列表
     * 
     * @param cmfCustomerbelong 客户所属
     * @return 客户所属集合
     */
    public List<CmfCustomerbelong> selectCmfCustomerbelongList(CmfCustomerbelong cmfCustomerbelong);

    /**
     * 新增客户所属
     * 
     * @param cmfCustomerbelong 客户所属
     * @return 结果
     */
    public int insertCmfCustomerbelong(CmfCustomerbelong cmfCustomerbelong);

    /**
     * 修改客户所属
     * 
     * @param cmfCustomerbelong 客户所属
     * @return 结果
     */
    public int updateCmfCustomerbelong(CmfCustomerbelong cmfCustomerbelong);

    /**
     * 批量删除客户所属
     * 
     * @param ids 需要删除的客户所属主键集合
     * @return 结果
     */
    public int deleteCmfCustomerbelongByIds(Integer[] ids);

    /**
     * 删除客户所属信息
     * 
     * @param id 客户所属主键
     * @return 结果
     */
    public int deleteCmfCustomerbelongById(Integer id);
}
