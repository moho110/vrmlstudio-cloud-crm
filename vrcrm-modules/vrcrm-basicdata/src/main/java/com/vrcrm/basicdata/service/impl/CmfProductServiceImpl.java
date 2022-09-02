package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfProductMapper;
import com.vrcrm.basicdata.domain.CmfProduct;
import com.vrcrm.basicdata.service.ICmfProductService;

/**
 * 产品Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfProductServiceImpl implements ICmfProductService 
{
    @Autowired
    private CmfProductMapper cmfProductMapper;

    /**
     * 查询产品
     * 
     * @param id 产品主键
     * @return 产品
     */
    @Override
    public CmfProduct selectCmfProductById(Integer id)
    {
        return cmfProductMapper.selectCmfProductById(id);
    }

    /**
     * 查询产品列表
     * 
     * @param cmfProduct 产品
     * @return 产品
     */
    @Override
    public List<CmfProduct> selectCmfProductList(CmfProduct cmfProduct)
    {
        return cmfProductMapper.selectCmfProductList(cmfProduct);
    }

    /**
     * 新增产品
     * 
     * @param cmfProduct 产品
     * @return 结果
     */
    @Override
    public int insertCmfProduct(CmfProduct cmfProduct)
    {
        return cmfProductMapper.insertCmfProduct(cmfProduct);
    }

    /**
     * 修改产品
     * 
     * @param cmfProduct 产品
     * @return 结果
     */
    @Override
    public int updateCmfProduct(CmfProduct cmfProduct)
    {
        return cmfProductMapper.updateCmfProduct(cmfProduct);
    }

    /**
     * 批量删除产品
     * 
     * @param ids 需要删除的产品主键
     * @return 结果
     */
    @Override
    public int deleteCmfProductByIds(Integer[] ids)
    {
        return cmfProductMapper.deleteCmfProductByIds(ids);
    }

    /**
     * 删除产品信息
     * 
     * @param id 产品主键
     * @return 结果
     */
    @Override
    public int deleteCmfProductById(Integer id)
    {
        return cmfProductMapper.deleteCmfProductById(id);
    }
}
