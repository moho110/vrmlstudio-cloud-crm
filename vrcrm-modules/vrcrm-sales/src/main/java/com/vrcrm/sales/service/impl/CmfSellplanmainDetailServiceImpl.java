package com.vrcrm.sales.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.sales.mapper.CmfSellplanmainDetailMapper;
import com.vrcrm.sales.domain.CmfSellplanmainDetail;
import com.vrcrm.sales.service.ICmfSellplanmainDetailService;

/**
 * 销售计划明细Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSellplanmainDetailServiceImpl implements ICmfSellplanmainDetailService 
{
    @Autowired
    private CmfSellplanmainDetailMapper cmfSellplanmainDetailMapper;

    /**
     * 查询销售计划明细
     * 
     * @param id 销售计划明细主键
     * @return 销售计划明细
     */
    @Override
    public CmfSellplanmainDetail selectCmfSellplanmainDetailById(Integer id)
    {
        return cmfSellplanmainDetailMapper.selectCmfSellplanmainDetailById(id);
    }

    /**
     * 查询销售计划明细列表
     * 
     * @param cmfSellplanmainDetail 销售计划明细
     * @return 销售计划明细
     */
    @Override
    public List<CmfSellplanmainDetail> selectCmfSellplanmainDetailList(CmfSellplanmainDetail cmfSellplanmainDetail)
    {
        return cmfSellplanmainDetailMapper.selectCmfSellplanmainDetailList(cmfSellplanmainDetail);
    }

    /**
     * 新增销售计划明细
     * 
     * @param cmfSellplanmainDetail 销售计划明细
     * @return 结果
     */
    @Override
    public int insertCmfSellplanmainDetail(CmfSellplanmainDetail cmfSellplanmainDetail)
    {
        return cmfSellplanmainDetailMapper.insertCmfSellplanmainDetail(cmfSellplanmainDetail);
    }

    /**
     * 修改销售计划明细
     * 
     * @param cmfSellplanmainDetail 销售计划明细
     * @return 结果
     */
    @Override
    public int updateCmfSellplanmainDetail(CmfSellplanmainDetail cmfSellplanmainDetail)
    {
        return cmfSellplanmainDetailMapper.updateCmfSellplanmainDetail(cmfSellplanmainDetail);
    }

    /**
     * 批量删除销售计划明细
     * 
     * @param ids 需要删除的销售计划明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfSellplanmainDetailByIds(Integer[] ids)
    {
        return cmfSellplanmainDetailMapper.deleteCmfSellplanmainDetailByIds(ids);
    }

    /**
     * 删除销售计划明细信息
     * 
     * @param id 销售计划明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfSellplanmainDetailById(Integer id)
    {
        return cmfSellplanmainDetailMapper.deleteCmfSellplanmainDetailById(id);
    }
}
