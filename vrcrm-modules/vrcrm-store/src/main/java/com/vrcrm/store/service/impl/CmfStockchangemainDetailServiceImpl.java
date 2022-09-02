package com.vrcrm.store.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.store.mapper.CmfStockchangemainDetailMapper;
import com.vrcrm.store.domain.CmfStockchangemainDetail;
import com.vrcrm.store.service.ICmfStockchangemainDetailService;

/**
 * 仓库管理调拔明细Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfStockchangemainDetailServiceImpl implements ICmfStockchangemainDetailService 
{
    @Autowired
    private CmfStockchangemainDetailMapper cmfStockchangemainDetailMapper;

    /**
     * 查询仓库管理调拔明细
     * 
     * @param id 仓库管理调拔明细主键
     * @return 仓库管理调拔明细
     */
    @Override
    public CmfStockchangemainDetail selectCmfStockchangemainDetailById(Integer id)
    {
        return cmfStockchangemainDetailMapper.selectCmfStockchangemainDetailById(id);
    }

    /**
     * 查询仓库管理调拔明细列表
     * 
     * @param cmfStockchangemainDetail 仓库管理调拔明细
     * @return 仓库管理调拔明细
     */
    @Override
    public List<CmfStockchangemainDetail> selectCmfStockchangemainDetailList(CmfStockchangemainDetail cmfStockchangemainDetail)
    {
        return cmfStockchangemainDetailMapper.selectCmfStockchangemainDetailList(cmfStockchangemainDetail);
    }

    /**
     * 新增仓库管理调拔明细
     * 
     * @param cmfStockchangemainDetail 仓库管理调拔明细
     * @return 结果
     */
    @Override
    public int insertCmfStockchangemainDetail(CmfStockchangemainDetail cmfStockchangemainDetail)
    {
        return cmfStockchangemainDetailMapper.insertCmfStockchangemainDetail(cmfStockchangemainDetail);
    }

    /**
     * 修改仓库管理调拔明细
     * 
     * @param cmfStockchangemainDetail 仓库管理调拔明细
     * @return 结果
     */
    @Override
    public int updateCmfStockchangemainDetail(CmfStockchangemainDetail cmfStockchangemainDetail)
    {
        return cmfStockchangemainDetailMapper.updateCmfStockchangemainDetail(cmfStockchangemainDetail);
    }

    /**
     * 批量删除仓库管理调拔明细
     * 
     * @param ids 需要删除的仓库管理调拔明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfStockchangemainDetailByIds(Integer[] ids)
    {
        return cmfStockchangemainDetailMapper.deleteCmfStockchangemainDetailByIds(ids);
    }

    /**
     * 删除仓库管理调拔明细信息
     * 
     * @param id 仓库管理调拔明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfStockchangemainDetailById(Integer id)
    {
        return cmfStockchangemainDetailMapper.deleteCmfStockchangemainDetailById(id);
    }
}
