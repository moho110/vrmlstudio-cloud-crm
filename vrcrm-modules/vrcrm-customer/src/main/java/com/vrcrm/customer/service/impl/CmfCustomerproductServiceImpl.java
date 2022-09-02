package com.vrcrm.customer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.customer.mapper.CmfCustomerproductMapper;
import com.vrcrm.customer.domain.CmfCustomerproduct;
import com.vrcrm.customer.service.ICmfCustomerproductService;

/**
 * 产品列表Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfCustomerproductServiceImpl implements ICmfCustomerproductService 
{
    @Autowired
    private CmfCustomerproductMapper cmfCustomerproductMapper;

    /**
     * 查询产品列表
     * 
     * @param id 产品列表主键
     * @return 产品列表
     */
    @Override
    public CmfCustomerproduct selectCmfCustomerproductById(Integer id)
    {
        return cmfCustomerproductMapper.selectCmfCustomerproductById(id);
    }

    /**
     * 查询产品列表列表
     * 
     * @param cmfCustomerproduct 产品列表
     * @return 产品列表
     */
    @Override
    public List<CmfCustomerproduct> selectCmfCustomerproductList(CmfCustomerproduct cmfCustomerproduct)
    {
        return cmfCustomerproductMapper.selectCmfCustomerproductList(cmfCustomerproduct);
    }

    /**
     * 新增产品列表
     * 
     * @param cmfCustomerproduct 产品列表
     * @return 结果
     */
    @Override
    public int insertCmfCustomerproduct(CmfCustomerproduct cmfCustomerproduct)
    {
        return cmfCustomerproductMapper.insertCmfCustomerproduct(cmfCustomerproduct);
    }

    /**
     * 修改产品列表
     * 
     * @param cmfCustomerproduct 产品列表
     * @return 结果
     */
    @Override
    public int updateCmfCustomerproduct(CmfCustomerproduct cmfCustomerproduct)
    {
        return cmfCustomerproductMapper.updateCmfCustomerproduct(cmfCustomerproduct);
    }

    /**
     * 批量删除产品列表
     * 
     * @param ids 需要删除的产品列表主键
     * @return 结果
     */
    @Override
    public int deleteCmfCustomerproductByIds(Integer[] ids)
    {
        return cmfCustomerproductMapper.deleteCmfCustomerproductByIds(ids);
    }

    /**
     * 删除产品列表信息
     * 
     * @param id 产品列表主键
     * @return 结果
     */
    @Override
    public int deleteCmfCustomerproductById(Integer id)
    {
        return cmfCustomerproductMapper.deleteCmfCustomerproductById(id);
    }
}
