package com.vrcrm.store.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.store.mapper.CmfStockinmainDetailMapper;
import com.vrcrm.store.domain.CmfStockinmainDetail;
import com.vrcrm.store.service.ICmfStockinmainDetailService;

/**
 * 仓库管理入库明细Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfStockinmainDetailServiceImpl implements ICmfStockinmainDetailService 
{
    @Autowired
    private CmfStockinmainDetailMapper cmfStockinmainDetailMapper;

    /**
     * 查询仓库管理入库明细
     * 
     * @param id 仓库管理入库明细主键
     * @return 仓库管理入库明细
     */
    @Override
    public CmfStockinmainDetail selectCmfStockinmainDetailById(Integer id)
    {
        return cmfStockinmainDetailMapper.selectCmfStockinmainDetailById(id);
    }

    /**
     * 查询仓库管理入库明细列表
     * 
     * @param cmfStockinmainDetail 仓库管理入库明细
     * @return 仓库管理入库明细
     */
    @Override
    public List<CmfStockinmainDetail> selectCmfStockinmainDetailList(CmfStockinmainDetail cmfStockinmainDetail)
    {
        return cmfStockinmainDetailMapper.selectCmfStockinmainDetailList(cmfStockinmainDetail);
    }

    /**
     * 新增仓库管理入库明细
     * 
     * @param cmfStockinmainDetail 仓库管理入库明细
     * @return 结果
     */
    @Override
    public int insertCmfStockinmainDetail(CmfStockinmainDetail cmfStockinmainDetail)
    {
        return cmfStockinmainDetailMapper.insertCmfStockinmainDetail(cmfStockinmainDetail);
    }

    /**
     * 修改仓库管理入库明细
     * 
     * @param cmfStockinmainDetail 仓库管理入库明细
     * @return 结果
     */
    @Override
    public int updateCmfStockinmainDetail(CmfStockinmainDetail cmfStockinmainDetail)
    {
        return cmfStockinmainDetailMapper.updateCmfStockinmainDetail(cmfStockinmainDetail);
    }

    /**
     * 批量删除仓库管理入库明细
     * 
     * @param ids 需要删除的仓库管理入库明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfStockinmainDetailByIds(Integer[] ids)
    {
        return cmfStockinmainDetailMapper.deleteCmfStockinmainDetailByIds(ids);
    }

    /**
     * 删除仓库管理入库明细信息
     * 
     * @param id 仓库管理入库明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfStockinmainDetailById(Integer id)
    {
        return cmfStockinmainDetailMapper.deleteCmfStockinmainDetailById(id);
    }
}
