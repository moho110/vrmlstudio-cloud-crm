package com.vrcrm.customer.service;

import java.util.List;
import com.vrcrm.customer.domain.CmfCustomerXuqiu;

/**
 * 客户需求Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfCustomerXuqiuService 
{
    /**
     * 查询客户需求
     * 
     * @param id 客户需求主键
     * @return 客户需求
     */
    public CmfCustomerXuqiu selectCmfCustomerXuqiuById(Integer id);

    /**
     * 查询客户需求列表
     * 
     * @param cmfCustomerXuqiu 客户需求
     * @return 客户需求集合
     */
    public List<CmfCustomerXuqiu> selectCmfCustomerXuqiuList(CmfCustomerXuqiu cmfCustomerXuqiu);

    /**
     * 新增客户需求
     * 
     * @param cmfCustomerXuqiu 客户需求
     * @return 结果
     */
    public int insertCmfCustomerXuqiu(CmfCustomerXuqiu cmfCustomerXuqiu);

    /**
     * 修改客户需求
     * 
     * @param cmfCustomerXuqiu 客户需求
     * @return 结果
     */
    public int updateCmfCustomerXuqiu(CmfCustomerXuqiu cmfCustomerXuqiu);

    /**
     * 批量删除客户需求
     * 
     * @param ids 需要删除的客户需求主键集合
     * @return 结果
     */
    public int deleteCmfCustomerXuqiuByIds(Integer[] ids);

    /**
     * 删除客户需求信息
     * 
     * @param id 客户需求主键
     * @return 结果
     */
    public int deleteCmfCustomerXuqiuById(Integer id);
}
