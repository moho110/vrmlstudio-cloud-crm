package com.vrcrm.basicdata.service;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfSupplyproduct;

/**
 * 供应商产品Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfSupplyproductService 
{
    /**
     * 查询供应商产品
     * 
     * @param id 供应商产品主键
     * @return 供应商产品
     */
    public CmfSupplyproduct selectCmfSupplyproductById(Integer id);

    /**
     * 查询供应商产品列表
     * 
     * @param cmfSupplyproduct 供应商产品
     * @return 供应商产品集合
     */
    public List<CmfSupplyproduct> selectCmfSupplyproductList(CmfSupplyproduct cmfSupplyproduct);

    /**
     * 新增供应商产品
     * 
     * @param cmfSupplyproduct 供应商产品
     * @return 结果
     */
    public int insertCmfSupplyproduct(CmfSupplyproduct cmfSupplyproduct);

    /**
     * 修改供应商产品
     * 
     * @param cmfSupplyproduct 供应商产品
     * @return 结果
     */
    public int updateCmfSupplyproduct(CmfSupplyproduct cmfSupplyproduct);

    /**
     * 批量删除供应商产品
     * 
     * @param ids 需要删除的供应商产品主键集合
     * @return 结果
     */
    public int deleteCmfSupplyproductByIds(Integer[] ids);

    /**
     * 删除供应商产品信息
     * 
     * @param id 供应商产品主键
     * @return 结果
     */
    public int deleteCmfSupplyproductById(Integer id);
}
