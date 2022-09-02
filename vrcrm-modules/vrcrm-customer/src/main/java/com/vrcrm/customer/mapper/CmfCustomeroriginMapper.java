package com.vrcrm.customer.mapper;

import java.util.List;
import com.vrcrm.customer.domain.CmfCustomerorigin;

/**
 * 客户来源Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfCustomeroriginMapper 
{
    /**
     * 查询客户来源
     * 
     * @param id 客户来源主键
     * @return 客户来源
     */
    public CmfCustomerorigin selectCmfCustomeroriginById(Integer id);

    /**
     * 查询客户来源列表
     * 
     * @param cmfCustomerorigin 客户来源
     * @return 客户来源集合
     */
    public List<CmfCustomerorigin> selectCmfCustomeroriginList(CmfCustomerorigin cmfCustomerorigin);

    /**
     * 新增客户来源
     * 
     * @param cmfCustomerorigin 客户来源
     * @return 结果
     */
    public int insertCmfCustomerorigin(CmfCustomerorigin cmfCustomerorigin);

    /**
     * 修改客户来源
     * 
     * @param cmfCustomerorigin 客户来源
     * @return 结果
     */
    public int updateCmfCustomerorigin(CmfCustomerorigin cmfCustomerorigin);

    /**
     * 删除客户来源
     * 
     * @param id 客户来源主键
     * @return 结果
     */
    public int deleteCmfCustomeroriginById(Integer id);

    /**
     * 批量删除客户来源
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfCustomeroriginByIds(Integer[] ids);
}
