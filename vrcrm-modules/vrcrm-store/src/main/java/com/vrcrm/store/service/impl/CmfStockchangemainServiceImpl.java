package com.vrcrm.store.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.store.mapper.CmfStockchangemainMapper;
import com.vrcrm.store.domain.CmfStockchangemain;
import com.vrcrm.store.service.ICmfStockchangemainService;

/**
 * 仓库管理调拔Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfStockchangemainServiceImpl implements ICmfStockchangemainService 
{
    @Autowired
    private CmfStockchangemainMapper cmfStockchangemainMapper;

    /**
     * 查询仓库管理调拔
     * 
     * @param id 仓库管理调拔主键
     * @return 仓库管理调拔
     */
    @Override
    public CmfStockchangemain selectCmfStockchangemainById(Integer id)
    {
        return cmfStockchangemainMapper.selectCmfStockchangemainById(id);
    }

    /**
     * 查询仓库管理调拔列表
     * 
     * @param cmfStockchangemain 仓库管理调拔
     * @return 仓库管理调拔
     */
    @Override
    public List<CmfStockchangemain> selectCmfStockchangemainList(CmfStockchangemain cmfStockchangemain)
    {
        return cmfStockchangemainMapper.selectCmfStockchangemainList(cmfStockchangemain);
    }

    /**
     * 新增仓库管理调拔
     * 
     * @param cmfStockchangemain 仓库管理调拔
     * @return 结果
     */
    @Override
    public int insertCmfStockchangemain(CmfStockchangemain cmfStockchangemain)
    {
        return cmfStockchangemainMapper.insertCmfStockchangemain(cmfStockchangemain);
    }

    /**
     * 修改仓库管理调拔
     * 
     * @param cmfStockchangemain 仓库管理调拔
     * @return 结果
     */
    @Override
    public int updateCmfStockchangemain(CmfStockchangemain cmfStockchangemain)
    {
        return cmfStockchangemainMapper.updateCmfStockchangemain(cmfStockchangemain);
    }

    /**
     * 批量删除仓库管理调拔
     * 
     * @param ids 需要删除的仓库管理调拔主键
     * @return 结果
     */
    @Override
    public int deleteCmfStockchangemainByIds(Integer[] ids)
    {
        return cmfStockchangemainMapper.deleteCmfStockchangemainByIds(ids);
    }

    /**
     * 删除仓库管理调拔信息
     * 
     * @param id 仓库管理调拔主键
     * @return 结果
     */
    @Override
    public int deleteCmfStockchangemainById(Integer id)
    {
        return cmfStockchangemainMapper.deleteCmfStockchangemainById(id);
    }
}
