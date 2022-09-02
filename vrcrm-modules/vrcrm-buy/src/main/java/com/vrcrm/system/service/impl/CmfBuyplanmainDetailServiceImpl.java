package com.vrcrm.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.system.mapper.CmfBuyplanmainDetailMapper;
import com.vrcrm.system.domain.CmfBuyplanmainDetail;
import com.vrcrm.system.service.ICmfBuyplanmainDetailService;

/**
 * 采购单名细Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfBuyplanmainDetailServiceImpl implements ICmfBuyplanmainDetailService 
{
    @Autowired
    private CmfBuyplanmainDetailMapper cmfBuyplanmainDetailMapper;

    /**
     * 查询采购单名细
     * 
     * @param id 采购单名细主键
     * @return 采购单名细
     */
    @Override
    public CmfBuyplanmainDetail selectCmfBuyplanmainDetailById(Integer id)
    {
        return cmfBuyplanmainDetailMapper.selectCmfBuyplanmainDetailById(id);
    }

    /**
     * 查询采购单名细列表
     * 
     * @param cmfBuyplanmainDetail 采购单名细
     * @return 采购单名细
     */
    @Override
    public List<CmfBuyplanmainDetail> selectCmfBuyplanmainDetailList(CmfBuyplanmainDetail cmfBuyplanmainDetail)
    {
        return cmfBuyplanmainDetailMapper.selectCmfBuyplanmainDetailList(cmfBuyplanmainDetail);
    }

    /**
     * 新增采购单名细
     * 
     * @param cmfBuyplanmainDetail 采购单名细
     * @return 结果
     */
    @Override
    public int insertCmfBuyplanmainDetail(CmfBuyplanmainDetail cmfBuyplanmainDetail)
    {
        return cmfBuyplanmainDetailMapper.insertCmfBuyplanmainDetail(cmfBuyplanmainDetail);
    }

    /**
     * 修改采购单名细
     * 
     * @param cmfBuyplanmainDetail 采购单名细
     * @return 结果
     */
    @Override
    public int updateCmfBuyplanmainDetail(CmfBuyplanmainDetail cmfBuyplanmainDetail)
    {
        return cmfBuyplanmainDetailMapper.updateCmfBuyplanmainDetail(cmfBuyplanmainDetail);
    }

    /**
     * 批量删除采购单名细
     * 
     * @param ids 需要删除的采购单名细主键
     * @return 结果
     */
    @Override
    public int deleteCmfBuyplanmainDetailByIds(Integer[] ids)
    {
        return cmfBuyplanmainDetailMapper.deleteCmfBuyplanmainDetailByIds(ids);
    }

    /**
     * 删除采购单名细信息
     * 
     * @param id 采购单名细主键
     * @return 结果
     */
    @Override
    public int deleteCmfBuyplanmainDetailById(Integer id)
    {
        return cmfBuyplanmainDetailMapper.deleteCmfBuyplanmainDetailById(id);
    }
}
