package com.vrcrm.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.system.mapper.CmfStorecheckDetailMapper;
import com.vrcrm.system.domain.CmfStorecheckDetail;
import com.vrcrm.system.service.ICmfStorecheckDetailService;

/**
 * 库存盘点明细Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfStorecheckDetailServiceImpl implements ICmfStorecheckDetailService 
{
    @Autowired
    private CmfStorecheckDetailMapper cmfStorecheckDetailMapper;

    /**
     * 查询库存盘点明细
     * 
     * @param id 库存盘点明细主键
     * @return 库存盘点明细
     */
    @Override
    public CmfStorecheckDetail selectCmfStorecheckDetailById(Integer id)
    {
        return cmfStorecheckDetailMapper.selectCmfStorecheckDetailById(id);
    }

    /**
     * 查询库存盘点明细列表
     * 
     * @param cmfStorecheckDetail 库存盘点明细
     * @return 库存盘点明细
     */
    @Override
    public List<CmfStorecheckDetail> selectCmfStorecheckDetailList(CmfStorecheckDetail cmfStorecheckDetail)
    {
        return cmfStorecheckDetailMapper.selectCmfStorecheckDetailList(cmfStorecheckDetail);
    }

    /**
     * 新增库存盘点明细
     * 
     * @param cmfStorecheckDetail 库存盘点明细
     * @return 结果
     */
    @Override
    public int insertCmfStorecheckDetail(CmfStorecheckDetail cmfStorecheckDetail)
    {
        return cmfStorecheckDetailMapper.insertCmfStorecheckDetail(cmfStorecheckDetail);
    }

    /**
     * 修改库存盘点明细
     * 
     * @param cmfStorecheckDetail 库存盘点明细
     * @return 结果
     */
    @Override
    public int updateCmfStorecheckDetail(CmfStorecheckDetail cmfStorecheckDetail)
    {
        return cmfStorecheckDetailMapper.updateCmfStorecheckDetail(cmfStorecheckDetail);
    }

    /**
     * 批量删除库存盘点明细
     * 
     * @param ids 需要删除的库存盘点明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfStorecheckDetailByIds(Integer[] ids)
    {
        return cmfStorecheckDetailMapper.deleteCmfStorecheckDetailByIds(ids);
    }

    /**
     * 删除库存盘点明细信息
     * 
     * @param id 库存盘点明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfStorecheckDetailById(Integer id)
    {
        return cmfStorecheckDetailMapper.deleteCmfStorecheckDetailById(id);
    }
}
