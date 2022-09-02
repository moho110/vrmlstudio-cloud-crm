package com.vrcrm.store.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.store.mapper.CmfStockinmainDetailColorMapper;
import com.vrcrm.store.domain.CmfStockinmainDetailColor;
import com.vrcrm.store.service.ICmfStockinmainDetailColorService;

/**
 * 仓库管理入库明细颜色Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfStockinmainDetailColorServiceImpl implements ICmfStockinmainDetailColorService 
{
    @Autowired
    private CmfStockinmainDetailColorMapper cmfStockinmainDetailColorMapper;

    /**
     * 查询仓库管理入库明细颜色
     * 
     * @param id 仓库管理入库明细颜色主键
     * @return 仓库管理入库明细颜色
     */
    @Override
    public CmfStockinmainDetailColor selectCmfStockinmainDetailColorById(Integer id)
    {
        return cmfStockinmainDetailColorMapper.selectCmfStockinmainDetailColorById(id);
    }

    /**
     * 查询仓库管理入库明细颜色列表
     * 
     * @param cmfStockinmainDetailColor 仓库管理入库明细颜色
     * @return 仓库管理入库明细颜色
     */
    @Override
    public List<CmfStockinmainDetailColor> selectCmfStockinmainDetailColorList(CmfStockinmainDetailColor cmfStockinmainDetailColor)
    {
        return cmfStockinmainDetailColorMapper.selectCmfStockinmainDetailColorList(cmfStockinmainDetailColor);
    }

    /**
     * 新增仓库管理入库明细颜色
     * 
     * @param cmfStockinmainDetailColor 仓库管理入库明细颜色
     * @return 结果
     */
    @Override
    public int insertCmfStockinmainDetailColor(CmfStockinmainDetailColor cmfStockinmainDetailColor)
    {
        return cmfStockinmainDetailColorMapper.insertCmfStockinmainDetailColor(cmfStockinmainDetailColor);
    }

    /**
     * 修改仓库管理入库明细颜色
     * 
     * @param cmfStockinmainDetailColor 仓库管理入库明细颜色
     * @return 结果
     */
    @Override
    public int updateCmfStockinmainDetailColor(CmfStockinmainDetailColor cmfStockinmainDetailColor)
    {
        return cmfStockinmainDetailColorMapper.updateCmfStockinmainDetailColor(cmfStockinmainDetailColor);
    }

    /**
     * 批量删除仓库管理入库明细颜色
     * 
     * @param ids 需要删除的仓库管理入库明细颜色主键
     * @return 结果
     */
    @Override
    public int deleteCmfStockinmainDetailColorByIds(Integer[] ids)
    {
        return cmfStockinmainDetailColorMapper.deleteCmfStockinmainDetailColorByIds(ids);
    }

    /**
     * 删除仓库管理入库明细颜色信息
     * 
     * @param id 仓库管理入库明细颜色主键
     * @return 结果
     */
    @Override
    public int deleteCmfStockinmainDetailColorById(Integer id)
    {
        return cmfStockinmainDetailColorMapper.deleteCmfStockinmainDetailColorById(id);
    }
}
