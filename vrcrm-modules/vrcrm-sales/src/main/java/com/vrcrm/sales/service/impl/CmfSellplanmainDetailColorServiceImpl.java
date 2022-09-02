package com.vrcrm.sales.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.sales.mapper.CmfSellplanmainDetailColorMapper;
import com.vrcrm.sales.domain.CmfSellplanmainDetailColor;
import com.vrcrm.sales.service.ICmfSellplanmainDetailColorService;

/**
 * 销售计划明细表颜色Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSellplanmainDetailColorServiceImpl implements ICmfSellplanmainDetailColorService 
{
    @Autowired
    private CmfSellplanmainDetailColorMapper cmfSellplanmainDetailColorMapper;

    /**
     * 查询销售计划明细表颜色
     * 
     * @param id 销售计划明细表颜色主键
     * @return 销售计划明细表颜色
     */
    @Override
    public CmfSellplanmainDetailColor selectCmfSellplanmainDetailColorById(Integer id)
    {
        return cmfSellplanmainDetailColorMapper.selectCmfSellplanmainDetailColorById(id);
    }

    /**
     * 查询销售计划明细表颜色列表
     * 
     * @param cmfSellplanmainDetailColor 销售计划明细表颜色
     * @return 销售计划明细表颜色
     */
    @Override
    public List<CmfSellplanmainDetailColor> selectCmfSellplanmainDetailColorList(CmfSellplanmainDetailColor cmfSellplanmainDetailColor)
    {
        return cmfSellplanmainDetailColorMapper.selectCmfSellplanmainDetailColorList(cmfSellplanmainDetailColor);
    }

    /**
     * 新增销售计划明细表颜色
     * 
     * @param cmfSellplanmainDetailColor 销售计划明细表颜色
     * @return 结果
     */
    @Override
    public int insertCmfSellplanmainDetailColor(CmfSellplanmainDetailColor cmfSellplanmainDetailColor)
    {
        return cmfSellplanmainDetailColorMapper.insertCmfSellplanmainDetailColor(cmfSellplanmainDetailColor);
    }

    /**
     * 修改销售计划明细表颜色
     * 
     * @param cmfSellplanmainDetailColor 销售计划明细表颜色
     * @return 结果
     */
    @Override
    public int updateCmfSellplanmainDetailColor(CmfSellplanmainDetailColor cmfSellplanmainDetailColor)
    {
        return cmfSellplanmainDetailColorMapper.updateCmfSellplanmainDetailColor(cmfSellplanmainDetailColor);
    }

    /**
     * 批量删除销售计划明细表颜色
     * 
     * @param ids 需要删除的销售计划明细表颜色主键
     * @return 结果
     */
    @Override
    public int deleteCmfSellplanmainDetailColorByIds(Integer[] ids)
    {
        return cmfSellplanmainDetailColorMapper.deleteCmfSellplanmainDetailColorByIds(ids);
    }

    /**
     * 删除销售计划明细表颜色信息
     * 
     * @param id 销售计划明细表颜色主键
     * @return 结果
     */
    @Override
    public int deleteCmfSellplanmainDetailColorById(Integer id)
    {
        return cmfSellplanmainDetailColorMapper.deleteCmfSellplanmainDetailColorById(id);
    }
}
