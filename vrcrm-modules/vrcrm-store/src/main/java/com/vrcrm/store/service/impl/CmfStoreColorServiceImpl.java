package com.vrcrm.store.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.store.mapper.CmfStoreColorMapper;
import com.vrcrm.store.domain.CmfStoreColor;
import com.vrcrm.store.service.ICmfStoreColorService;

/**
 * 库存明细颜色Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfStoreColorServiceImpl implements ICmfStoreColorService 
{
    @Autowired
    private CmfStoreColorMapper cmfStoreColorMapper;

    /**
     * 查询库存明细颜色
     * 
     * @param id 库存明细颜色主键
     * @return 库存明细颜色
     */
    @Override
    public CmfStoreColor selectCmfStoreColorById(Integer id)
    {
        return cmfStoreColorMapper.selectCmfStoreColorById(id);
    }

    /**
     * 查询库存明细颜色列表
     * 
     * @param cmfStoreColor 库存明细颜色
     * @return 库存明细颜色
     */
    @Override
    public List<CmfStoreColor> selectCmfStoreColorList(CmfStoreColor cmfStoreColor)
    {
        return cmfStoreColorMapper.selectCmfStoreColorList(cmfStoreColor);
    }

    /**
     * 新增库存明细颜色
     * 
     * @param cmfStoreColor 库存明细颜色
     * @return 结果
     */
    @Override
    public int insertCmfStoreColor(CmfStoreColor cmfStoreColor)
    {
        return cmfStoreColorMapper.insertCmfStoreColor(cmfStoreColor);
    }

    /**
     * 修改库存明细颜色
     * 
     * @param cmfStoreColor 库存明细颜色
     * @return 结果
     */
    @Override
    public int updateCmfStoreColor(CmfStoreColor cmfStoreColor)
    {
        return cmfStoreColorMapper.updateCmfStoreColor(cmfStoreColor);
    }

    /**
     * 批量删除库存明细颜色
     * 
     * @param ids 需要删除的库存明细颜色主键
     * @return 结果
     */
    @Override
    public int deleteCmfStoreColorByIds(Integer[] ids)
    {
        return cmfStoreColorMapper.deleteCmfStoreColorByIds(ids);
    }

    /**
     * 删除库存明细颜色信息
     * 
     * @param id 库存明细颜色主键
     * @return 结果
     */
    @Override
    public int deleteCmfStoreColorById(Integer id)
    {
        return cmfStoreColorMapper.deleteCmfStoreColorById(id);
    }
}
