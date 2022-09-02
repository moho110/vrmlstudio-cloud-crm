package com.vrcrm.customer.mapper;

import java.util.List;
import com.vrcrm.customer.domain.CmfCustomerproductDetail;

/**
 * 产品明细表Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfCustomerproductDetailMapper 
{
    /**
     * 查询产品明细表
     * 
     * @param id 产品明细表主键
     * @return 产品明细表
     */
    public CmfCustomerproductDetail selectCmfCustomerproductDetailById(Integer id);

    /**
     * 查询产品明细表列表
     * 
     * @param cmfCustomerproductDetail 产品明细表
     * @return 产品明细表集合
     */
    public List<CmfCustomerproductDetail> selectCmfCustomerproductDetailList(CmfCustomerproductDetail cmfCustomerproductDetail);

    /**
     * 新增产品明细表
     * 
     * @param cmfCustomerproductDetail 产品明细表
     * @return 结果
     */
    public int insertCmfCustomerproductDetail(CmfCustomerproductDetail cmfCustomerproductDetail);

    /**
     * 修改产品明细表
     * 
     * @param cmfCustomerproductDetail 产品明细表
     * @return 结果
     */
    public int updateCmfCustomerproductDetail(CmfCustomerproductDetail cmfCustomerproductDetail);

    /**
     * 删除产品明细表
     * 
     * @param id 产品明细表主键
     * @return 结果
     */
    public int deleteCmfCustomerproductDetailById(Integer id);

    /**
     * 批量删除产品明细表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfCustomerproductDetailByIds(Integer[] ids);
}
