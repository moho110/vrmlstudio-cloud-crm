package com.vrcrm.store.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.store.mapper.CmfStockoutmainDetailMapper;
import com.vrcrm.store.domain.CmfStockoutmainDetail;
import com.vrcrm.store.service.ICmfStockoutmainDetailService;

/**
 * 仓库出库明细Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfStockoutmainDetailServiceImpl implements ICmfStockoutmainDetailService 
{
    @Autowired
    private CmfStockoutmainDetailMapper cmfStockoutmainDetailMapper;

    /**
     * 查询仓库出库明细
     * 
     * @param id 仓库出库明细主键
     * @return 仓库出库明细
     */
    @Override
    public CmfStockoutmainDetail selectCmfStockoutmainDetailById(Integer id)
    {
        return cmfStockoutmainDetailMapper.selectCmfStockoutmainDetailById(id);
    }

    /**
     * 查询仓库出库明细列表
     * 
     * @param cmfStockoutmainDetail 仓库出库明细
     * @return 仓库出库明细
     */
    @Override
    public List<CmfStockoutmainDetail> selectCmfStockoutmainDetailList(CmfStockoutmainDetail cmfStockoutmainDetail)
    {
        return cmfStockoutmainDetailMapper.selectCmfStockoutmainDetailList(cmfStockoutmainDetail);
    }

    /**
     * 新增仓库出库明细
     * 
     * @param cmfStockoutmainDetail 仓库出库明细
     * @return 结果
     */
    @Override
    public int insertCmfStockoutmainDetail(CmfStockoutmainDetail cmfStockoutmainDetail)
    {
        return cmfStockoutmainDetailMapper.insertCmfStockoutmainDetail(cmfStockoutmainDetail);
    }

    /**
     * 修改仓库出库明细
     * 
     * @param cmfStockoutmainDetail 仓库出库明细
     * @return 结果
     */
    @Override
    public int updateCmfStockoutmainDetail(CmfStockoutmainDetail cmfStockoutmainDetail)
    {
        return cmfStockoutmainDetailMapper.updateCmfStockoutmainDetail(cmfStockoutmainDetail);
    }

    /**
     * 批量删除仓库出库明细
     * 
     * @param ids 需要删除的仓库出库明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfStockoutmainDetailByIds(Integer[] ids)
    {
        return cmfStockoutmainDetailMapper.deleteCmfStockoutmainDetailByIds(ids);
    }

    /**
     * 删除仓库出库明细信息
     * 
     * @param id 仓库出库明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfStockoutmainDetailById(Integer id)
    {
        return cmfStockoutmainDetailMapper.deleteCmfStockoutmainDetailById(id);
    }
}
