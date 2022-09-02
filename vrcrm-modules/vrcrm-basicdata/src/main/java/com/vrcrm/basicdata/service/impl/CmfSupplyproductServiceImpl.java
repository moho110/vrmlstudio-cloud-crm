package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfSupplyproductMapper;
import com.vrcrm.basicdata.domain.CmfSupplyproduct;
import com.vrcrm.basicdata.service.ICmfSupplyproductService;

/**
 * 供应商产品Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSupplyproductServiceImpl implements ICmfSupplyproductService 
{
    @Autowired
    private CmfSupplyproductMapper cmfSupplyproductMapper;

    /**
     * 查询供应商产品
     * 
     * @param id 供应商产品主键
     * @return 供应商产品
     */
    @Override
    public CmfSupplyproduct selectCmfSupplyproductById(Integer id)
    {
        return cmfSupplyproductMapper.selectCmfSupplyproductById(id);
    }

    /**
     * 查询供应商产品列表
     * 
     * @param cmfSupplyproduct 供应商产品
     * @return 供应商产品
     */
    @Override
    public List<CmfSupplyproduct> selectCmfSupplyproductList(CmfSupplyproduct cmfSupplyproduct)
    {
        return cmfSupplyproductMapper.selectCmfSupplyproductList(cmfSupplyproduct);
    }

    /**
     * 新增供应商产品
     * 
     * @param cmfSupplyproduct 供应商产品
     * @return 结果
     */
    @Override
    public int insertCmfSupplyproduct(CmfSupplyproduct cmfSupplyproduct)
    {
        return cmfSupplyproductMapper.insertCmfSupplyproduct(cmfSupplyproduct);
    }

    /**
     * 修改供应商产品
     * 
     * @param cmfSupplyproduct 供应商产品
     * @return 结果
     */
    @Override
    public int updateCmfSupplyproduct(CmfSupplyproduct cmfSupplyproduct)
    {
        return cmfSupplyproductMapper.updateCmfSupplyproduct(cmfSupplyproduct);
    }

    /**
     * 批量删除供应商产品
     * 
     * @param ids 需要删除的供应商产品主键
     * @return 结果
     */
    @Override
    public int deleteCmfSupplyproductByIds(Integer[] ids)
    {
        return cmfSupplyproductMapper.deleteCmfSupplyproductByIds(ids);
    }

    /**
     * 删除供应商产品信息
     * 
     * @param id 供应商产品主键
     * @return 结果
     */
    @Override
    public int deleteCmfSupplyproductById(Integer id)
    {
        return cmfSupplyproductMapper.deleteCmfSupplyproductById(id);
    }
}
