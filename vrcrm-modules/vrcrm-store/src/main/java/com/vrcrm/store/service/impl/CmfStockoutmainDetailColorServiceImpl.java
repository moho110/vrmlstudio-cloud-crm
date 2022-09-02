package com.vrcrm.store.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.store.mapper.CmfStockoutmainDetailColorMapper;
import com.vrcrm.store.domain.CmfStockoutmainDetailColor;
import com.vrcrm.store.service.ICmfStockoutmainDetailColorService;

/**
 * 仓库出库明细颜色Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfStockoutmainDetailColorServiceImpl implements ICmfStockoutmainDetailColorService 
{
    @Autowired
    private CmfStockoutmainDetailColorMapper cmfStockoutmainDetailColorMapper;

    /**
     * 查询仓库出库明细颜色
     * 
     * @param id 仓库出库明细颜色主键
     * @return 仓库出库明细颜色
     */
    @Override
    public CmfStockoutmainDetailColor selectCmfStockoutmainDetailColorById(Integer id)
    {
        return cmfStockoutmainDetailColorMapper.selectCmfStockoutmainDetailColorById(id);
    }

    /**
     * 查询仓库出库明细颜色列表
     * 
     * @param cmfStockoutmainDetailColor 仓库出库明细颜色
     * @return 仓库出库明细颜色
     */
    @Override
    public List<CmfStockoutmainDetailColor> selectCmfStockoutmainDetailColorList(CmfStockoutmainDetailColor cmfStockoutmainDetailColor)
    {
        return cmfStockoutmainDetailColorMapper.selectCmfStockoutmainDetailColorList(cmfStockoutmainDetailColor);
    }

    /**
     * 新增仓库出库明细颜色
     * 
     * @param cmfStockoutmainDetailColor 仓库出库明细颜色
     * @return 结果
     */
    @Override
    public int insertCmfStockoutmainDetailColor(CmfStockoutmainDetailColor cmfStockoutmainDetailColor)
    {
        return cmfStockoutmainDetailColorMapper.insertCmfStockoutmainDetailColor(cmfStockoutmainDetailColor);
    }

    /**
     * 修改仓库出库明细颜色
     * 
     * @param cmfStockoutmainDetailColor 仓库出库明细颜色
     * @return 结果
     */
    @Override
    public int updateCmfStockoutmainDetailColor(CmfStockoutmainDetailColor cmfStockoutmainDetailColor)
    {
        return cmfStockoutmainDetailColorMapper.updateCmfStockoutmainDetailColor(cmfStockoutmainDetailColor);
    }

    /**
     * 批量删除仓库出库明细颜色
     * 
     * @param ids 需要删除的仓库出库明细颜色主键
     * @return 结果
     */
    @Override
    public int deleteCmfStockoutmainDetailColorByIds(Integer[] ids)
    {
        return cmfStockoutmainDetailColorMapper.deleteCmfStockoutmainDetailColorByIds(ids);
    }

    /**
     * 删除仓库出库明细颜色信息
     * 
     * @param id 仓库出库明细颜色主键
     * @return 结果
     */
    @Override
    public int deleteCmfStockoutmainDetailColorById(Integer id)
    {
        return cmfStockoutmainDetailColorMapper.deleteCmfStockoutmainDetailColorById(id);
    }
}
