package com.vrcrm.buy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.buy.mapper.CmfBuyplanmainDetailColorMapper;
import com.vrcrm.buy.domain.CmfBuyplanmainDetailColor;
import com.vrcrm.buy.service.ICmfBuyplanmainDetailColorService;

/**
 * 采购计划明细表颜色Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfBuyplanmainDetailColorServiceImpl implements ICmfBuyplanmainDetailColorService 
{
    @Autowired
    private CmfBuyplanmainDetailColorMapper cmfBuyplanmainDetailColorMapper;

    /**
     * 查询采购计划明细表颜色
     * 
     * @param id 采购计划明细表颜色主键
     * @return 采购计划明细表颜色
     */
    @Override
    public CmfBuyplanmainDetailColor selectCmfBuyplanmainDetailColorById(Integer id)
    {
        return cmfBuyplanmainDetailColorMapper.selectCmfBuyplanmainDetailColorById(id);
    }

    /**
     * 查询采购计划明细表颜色列表
     * 
     * @param cmfBuyplanmainDetailColor 采购计划明细表颜色
     * @return 采购计划明细表颜色
     */
    @Override
    public List<CmfBuyplanmainDetailColor> selectCmfBuyplanmainDetailColorList(CmfBuyplanmainDetailColor cmfBuyplanmainDetailColor)
    {
        return cmfBuyplanmainDetailColorMapper.selectCmfBuyplanmainDetailColorList(cmfBuyplanmainDetailColor);
    }

    /**
     * 新增采购计划明细表颜色
     * 
     * @param cmfBuyplanmainDetailColor 采购计划明细表颜色
     * @return 结果
     */
    @Override
    public int insertCmfBuyplanmainDetailColor(CmfBuyplanmainDetailColor cmfBuyplanmainDetailColor)
    {
        return cmfBuyplanmainDetailColorMapper.insertCmfBuyplanmainDetailColor(cmfBuyplanmainDetailColor);
    }

    /**
     * 修改采购计划明细表颜色
     * 
     * @param cmfBuyplanmainDetailColor 采购计划明细表颜色
     * @return 结果
     */
    @Override
    public int updateCmfBuyplanmainDetailColor(CmfBuyplanmainDetailColor cmfBuyplanmainDetailColor)
    {
        return cmfBuyplanmainDetailColorMapper.updateCmfBuyplanmainDetailColor(cmfBuyplanmainDetailColor);
    }

    /**
     * 批量删除采购计划明细表颜色
     * 
     * @param ids 需要删除的采购计划明细表颜色主键
     * @return 结果
     */
    @Override
    public int deleteCmfBuyplanmainDetailColorByIds(Integer[] ids)
    {
        return cmfBuyplanmainDetailColorMapper.deleteCmfBuyplanmainDetailColorByIds(ids);
    }

    /**
     * 删除采购计划明细表颜色信息
     * 
     * @param id 采购计划明细表颜色主键
     * @return 结果
     */
    @Override
    public int deleteCmfBuyplanmainDetailColorById(Integer id)
    {
        return cmfBuyplanmainDetailColorMapper.deleteCmfBuyplanmainDetailColorById(id);
    }
}
