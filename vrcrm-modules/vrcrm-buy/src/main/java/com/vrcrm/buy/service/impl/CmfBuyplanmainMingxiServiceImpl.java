package com.vrcrm.buy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.buy.mapper.CmfBuyplanmainMingxiMapper;
import com.vrcrm.buy.domain.CmfBuyplanmainMingxi;
import com.vrcrm.buy.service.ICmfBuyplanmainMingxiService;

/**
 * 采购单名细Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfBuyplanmainMingxiServiceImpl implements ICmfBuyplanmainMingxiService 
{
    @Autowired
    private CmfBuyplanmainMingxiMapper cmfBuyplanmainMingxiMapper;

    /**
     * 查询采购单名细
     * 
     * @param id 采购单名细主键
     * @return 采购单名细
     */
    @Override
    public CmfBuyplanmainMingxi selectCmfBuyplanmainMingxiById(Integer id)
    {
        return cmfBuyplanmainMingxiMapper.selectCmfBuyplanmainMingxiById(id);
    }

    /**
     * 查询采购单名细列表
     * 
     * @param cmfBuyplanmainMingxi 采购单名细
     * @return 采购单名细
     */
    @Override
    public List<CmfBuyplanmainMingxi> selectCmfBuyplanmainMingxiList(CmfBuyplanmainMingxi cmfBuyplanmainMingxi)
    {
        return cmfBuyplanmainMingxiMapper.selectCmfBuyplanmainMingxiList(cmfBuyplanmainMingxi);
    }

    /**
     * 新增采购单名细
     * 
     * @param cmfBuyplanmainMingxi 采购单名细
     * @return 结果
     */
    @Override
    public int insertCmfBuyplanmainMingxi(CmfBuyplanmainMingxi cmfBuyplanmainMingxi)
    {
        return cmfBuyplanmainMingxiMapper.insertCmfBuyplanmainMingxi(cmfBuyplanmainMingxi);
    }

    /**
     * 修改采购单名细
     * 
     * @param cmfBuyplanmainMingxi 采购单名细
     * @return 结果
     */
    @Override
    public int updateCmfBuyplanmainMingxi(CmfBuyplanmainMingxi cmfBuyplanmainMingxi)
    {
        return cmfBuyplanmainMingxiMapper.updateCmfBuyplanmainMingxi(cmfBuyplanmainMingxi);
    }

    /**
     * 批量删除采购单名细
     * 
     * @param ids 需要删除的采购单名细主键
     * @return 结果
     */
    @Override
    public int deleteCmfBuyplanmainMingxiByIds(Integer[] ids)
    {
        return cmfBuyplanmainMingxiMapper.deleteCmfBuyplanmainMingxiByIds(ids);
    }

    /**
     * 删除采购单名细信息
     * 
     * @param id 采购单名细主键
     * @return 结果
     */
    @Override
    public int deleteCmfBuyplanmainMingxiById(Integer id)
    {
        return cmfBuyplanmainMingxiMapper.deleteCmfBuyplanmainMingxiById(id);
    }
}
