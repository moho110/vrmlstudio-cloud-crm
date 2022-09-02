package com.vrcrm.basicdata.mapper;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfProduct;

/**
 * 产品Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfProductMapper 
{
    /**
     * 查询产品
     * 
     * @param id 产品主键
     * @return 产品
     */
    public CmfProduct selectCmfProductById(Integer id);

    /**
     * 查询产品列表
     * 
     * @param cmfProduct 产品
     * @return 产品集合
     */
    public List<CmfProduct> selectCmfProductList(CmfProduct cmfProduct);

    /**
     * 新增产品
     * 
     * @param cmfProduct 产品
     * @return 结果
     */
    public int insertCmfProduct(CmfProduct cmfProduct);

    /**
     * 修改产品
     * 
     * @param cmfProduct 产品
     * @return 结果
     */
    public int updateCmfProduct(CmfProduct cmfProduct);

    /**
     * 删除产品
     * 
     * @param id 产品主键
     * @return 结果
     */
    public int deleteCmfProductById(Integer id);

    /**
     * 批量删除产品
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfProductByIds(Integer[] ids);
}
