package com.vrcrm.customer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.customer.mapper.CmfCustomerproductDetailMapper;
import com.vrcrm.customer.domain.CmfCustomerproductDetail;
import com.vrcrm.customer.service.ICmfCustomerproductDetailService;

/**
 * 产品明细表Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfCustomerproductDetailServiceImpl implements ICmfCustomerproductDetailService 
{
    @Autowired
    private CmfCustomerproductDetailMapper cmfCustomerproductDetailMapper;

    /**
     * 查询产品明细表
     * 
     * @param id 产品明细表主键
     * @return 产品明细表
     */
    @Override
    public CmfCustomerproductDetail selectCmfCustomerproductDetailById(Integer id)
    {
        return cmfCustomerproductDetailMapper.selectCmfCustomerproductDetailById(id);
    }

    /**
     * 查询产品明细表列表
     * 
     * @param cmfCustomerproductDetail 产品明细表
     * @return 产品明细表
     */
    @Override
    public List<CmfCustomerproductDetail> selectCmfCustomerproductDetailList(CmfCustomerproductDetail cmfCustomerproductDetail)
    {
        return cmfCustomerproductDetailMapper.selectCmfCustomerproductDetailList(cmfCustomerproductDetail);
    }

    /**
     * 新增产品明细表
     * 
     * @param cmfCustomerproductDetail 产品明细表
     * @return 结果
     */
    @Override
    public int insertCmfCustomerproductDetail(CmfCustomerproductDetail cmfCustomerproductDetail)
    {
        return cmfCustomerproductDetailMapper.insertCmfCustomerproductDetail(cmfCustomerproductDetail);
    }

    /**
     * 修改产品明细表
     * 
     * @param cmfCustomerproductDetail 产品明细表
     * @return 结果
     */
    @Override
    public int updateCmfCustomerproductDetail(CmfCustomerproductDetail cmfCustomerproductDetail)
    {
        return cmfCustomerproductDetailMapper.updateCmfCustomerproductDetail(cmfCustomerproductDetail);
    }

    /**
     * 批量删除产品明细表
     * 
     * @param ids 需要删除的产品明细表主键
     * @return 结果
     */
    @Override
    public int deleteCmfCustomerproductDetailByIds(Integer[] ids)
    {
        return cmfCustomerproductDetailMapper.deleteCmfCustomerproductDetailByIds(ids);
    }

    /**
     * 删除产品明细表信息
     * 
     * @param id 产品明细表主键
     * @return 结果
     */
    @Override
    public int deleteCmfCustomerproductDetailById(Integer id)
    {
        return cmfCustomerproductDetailMapper.deleteCmfCustomerproductDetailById(id);
    }
}
