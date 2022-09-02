package com.vrcrm.customer.mapper;

import java.util.List;
import com.vrcrm.customer.domain.CmfCustomerproduct;

/**
 * 产品列表Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfCustomerproductMapper 
{
    /**
     * 查询产品列表
     * 
     * @param id 产品列表主键
     * @return 产品列表
     */
    public CmfCustomerproduct selectCmfCustomerproductById(Integer id);

    /**
     * 查询产品列表列表
     * 
     * @param cmfCustomerproduct 产品列表
     * @return 产品列表集合
     */
    public List<CmfCustomerproduct> selectCmfCustomerproductList(CmfCustomerproduct cmfCustomerproduct);

    /**
     * 新增产品列表
     * 
     * @param cmfCustomerproduct 产品列表
     * @return 结果
     */
    public int insertCmfCustomerproduct(CmfCustomerproduct cmfCustomerproduct);

    /**
     * 修改产品列表
     * 
     * @param cmfCustomerproduct 产品列表
     * @return 结果
     */
    public int updateCmfCustomerproduct(CmfCustomerproduct cmfCustomerproduct);

    /**
     * 删除产品列表
     * 
     * @param id 产品列表主键
     * @return 结果
     */
    public int deleteCmfCustomerproductById(Integer id);

    /**
     * 批量删除产品列表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfCustomerproductByIds(Integer[] ids);
}
