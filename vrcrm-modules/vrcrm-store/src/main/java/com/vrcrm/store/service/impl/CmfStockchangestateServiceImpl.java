package com.vrcrm.store.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.store.mapper.CmfStockchangestateMapper;
import com.vrcrm.store.domain.CmfStockchangestate;
import com.vrcrm.store.service.ICmfStockchangestateService;

/**
 * 仓库管理调拔状态Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfStockchangestateServiceImpl implements ICmfStockchangestateService 
{
    @Autowired
    private CmfStockchangestateMapper cmfStockchangestateMapper;

    /**
     * 查询仓库管理调拔状态
     * 
     * @param id 仓库管理调拔状态主键
     * @return 仓库管理调拔状态
     */
    @Override
    public CmfStockchangestate selectCmfStockchangestateById(Integer id)
    {
        return cmfStockchangestateMapper.selectCmfStockchangestateById(id);
    }

    /**
     * 查询仓库管理调拔状态列表
     * 
     * @param cmfStockchangestate 仓库管理调拔状态
     * @return 仓库管理调拔状态
     */
    @Override
    public List<CmfStockchangestate> selectCmfStockchangestateList(CmfStockchangestate cmfStockchangestate)
    {
        return cmfStockchangestateMapper.selectCmfStockchangestateList(cmfStockchangestate);
    }

    /**
     * 新增仓库管理调拔状态
     * 
     * @param cmfStockchangestate 仓库管理调拔状态
     * @return 结果
     */
    @Override
    public int insertCmfStockchangestate(CmfStockchangestate cmfStockchangestate)
    {
        return cmfStockchangestateMapper.insertCmfStockchangestate(cmfStockchangestate);
    }

    /**
     * 修改仓库管理调拔状态
     * 
     * @param cmfStockchangestate 仓库管理调拔状态
     * @return 结果
     */
    @Override
    public int updateCmfStockchangestate(CmfStockchangestate cmfStockchangestate)
    {
        return cmfStockchangestateMapper.updateCmfStockchangestate(cmfStockchangestate);
    }

    /**
     * 批量删除仓库管理调拔状态
     * 
     * @param ids 需要删除的仓库管理调拔状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfStockchangestateByIds(Integer[] ids)
    {
        return cmfStockchangestateMapper.deleteCmfStockchangestateByIds(ids);
    }

    /**
     * 删除仓库管理调拔状态信息
     * 
     * @param id 仓库管理调拔状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfStockchangestateById(Integer id)
    {
        return cmfStockchangestateMapper.deleteCmfStockchangestateById(id);
    }
}
