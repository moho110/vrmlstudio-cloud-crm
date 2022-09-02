package com.vrcrm.buy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.buy.mapper.CmfBuyplanmainTmpColorMapper;
import com.vrcrm.buy.domain.CmfBuyplanmainTmpColor;
import com.vrcrm.buy.service.ICmfBuyplanmainTmpColorService;

/**
 * 采购单临时颜色表Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfBuyplanmainTmpColorServiceImpl implements ICmfBuyplanmainTmpColorService 
{
    @Autowired
    private CmfBuyplanmainTmpColorMapper cmfBuyplanmainTmpColorMapper;

    /**
     * 查询采购单临时颜色表
     * 
     * @param id 采购单临时颜色表主键
     * @return 采购单临时颜色表
     */
    @Override
    public CmfBuyplanmainTmpColor selectCmfBuyplanmainTmpColorById(Integer id)
    {
        return cmfBuyplanmainTmpColorMapper.selectCmfBuyplanmainTmpColorById(id);
    }

    /**
     * 查询采购单临时颜色表列表
     * 
     * @param cmfBuyplanmainTmpColor 采购单临时颜色表
     * @return 采购单临时颜色表
     */
    @Override
    public List<CmfBuyplanmainTmpColor> selectCmfBuyplanmainTmpColorList(CmfBuyplanmainTmpColor cmfBuyplanmainTmpColor)
    {
        return cmfBuyplanmainTmpColorMapper.selectCmfBuyplanmainTmpColorList(cmfBuyplanmainTmpColor);
    }

    /**
     * 新增采购单临时颜色表
     * 
     * @param cmfBuyplanmainTmpColor 采购单临时颜色表
     * @return 结果
     */
    @Override
    public int insertCmfBuyplanmainTmpColor(CmfBuyplanmainTmpColor cmfBuyplanmainTmpColor)
    {
        return cmfBuyplanmainTmpColorMapper.insertCmfBuyplanmainTmpColor(cmfBuyplanmainTmpColor);
    }

    /**
     * 修改采购单临时颜色表
     * 
     * @param cmfBuyplanmainTmpColor 采购单临时颜色表
     * @return 结果
     */
    @Override
    public int updateCmfBuyplanmainTmpColor(CmfBuyplanmainTmpColor cmfBuyplanmainTmpColor)
    {
        return cmfBuyplanmainTmpColorMapper.updateCmfBuyplanmainTmpColor(cmfBuyplanmainTmpColor);
    }

    /**
     * 批量删除采购单临时颜色表
     * 
     * @param ids 需要删除的采购单临时颜色表主键
     * @return 结果
     */
    @Override
    public int deleteCmfBuyplanmainTmpColorByIds(Integer[] ids)
    {
        return cmfBuyplanmainTmpColorMapper.deleteCmfBuyplanmainTmpColorByIds(ids);
    }

    /**
     * 删除采购单临时颜色表信息
     * 
     * @param id 采购单临时颜色表主键
     * @return 结果
     */
    @Override
    public int deleteCmfBuyplanmainTmpColorById(Integer id)
    {
        return cmfBuyplanmainTmpColorMapper.deleteCmfBuyplanmainTmpColorById(id);
    }
}
