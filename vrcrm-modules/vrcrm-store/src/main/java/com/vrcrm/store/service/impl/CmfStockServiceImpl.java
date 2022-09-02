package com.vrcrm.store.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.store.mapper.CmfStockMapper;
import com.vrcrm.store.domain.CmfStock;
import com.vrcrm.store.service.ICmfStockService;

/**
 * 仓库管理Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfStockServiceImpl implements ICmfStockService 
{
    @Autowired
    private CmfStockMapper cmfStockMapper;

    /**
     * 查询仓库管理
     * 
     * @param id 仓库管理主键
     * @return 仓库管理
     */
    @Override
    public CmfStock selectCmfStockById(Integer id)
    {
        return cmfStockMapper.selectCmfStockById(id);
    }

    /**
     * 查询仓库管理列表
     * 
     * @param cmfStock 仓库管理
     * @return 仓库管理
     */
    @Override
    public List<CmfStock> selectCmfStockList(CmfStock cmfStock)
    {
        return cmfStockMapper.selectCmfStockList(cmfStock);
    }

    /**
     * 新增仓库管理
     * 
     * @param cmfStock 仓库管理
     * @return 结果
     */
    @Override
    public int insertCmfStock(CmfStock cmfStock)
    {
        return cmfStockMapper.insertCmfStock(cmfStock);
    }

    /**
     * 修改仓库管理
     * 
     * @param cmfStock 仓库管理
     * @return 结果
     */
    @Override
    public int updateCmfStock(CmfStock cmfStock)
    {
        return cmfStockMapper.updateCmfStock(cmfStock);
    }

    /**
     * 批量删除仓库管理
     * 
     * @param ids 需要删除的仓库管理主键
     * @return 结果
     */
    @Override
    public int deleteCmfStockByIds(Integer[] ids)
    {
        return cmfStockMapper.deleteCmfStockByIds(ids);
    }

    /**
     * 删除仓库管理信息
     * 
     * @param id 仓库管理主键
     * @return 结果
     */
    @Override
    public int deleteCmfStockById(Integer id)
    {
        return cmfStockMapper.deleteCmfStockById(id);
    }
}
