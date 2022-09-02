package com.vrcrm.sales.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.sales.mapper.CmfFahuostateMapper;
import com.vrcrm.sales.domain.CmfFahuostate;
import com.vrcrm.sales.service.ICmfFahuostateService;

/**
 * 发货状态Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfFahuostateServiceImpl implements ICmfFahuostateService 
{
    @Autowired
    private CmfFahuostateMapper cmfFahuostateMapper;

    /**
     * 查询发货状态
     * 
     * @param id 发货状态主键
     * @return 发货状态
     */
    @Override
    public CmfFahuostate selectCmfFahuostateById(Integer id)
    {
        return cmfFahuostateMapper.selectCmfFahuostateById(id);
    }

    /**
     * 查询发货状态列表
     * 
     * @param cmfFahuostate 发货状态
     * @return 发货状态
     */
    @Override
    public List<CmfFahuostate> selectCmfFahuostateList(CmfFahuostate cmfFahuostate)
    {
        return cmfFahuostateMapper.selectCmfFahuostateList(cmfFahuostate);
    }

    /**
     * 新增发货状态
     * 
     * @param cmfFahuostate 发货状态
     * @return 结果
     */
    @Override
    public int insertCmfFahuostate(CmfFahuostate cmfFahuostate)
    {
        return cmfFahuostateMapper.insertCmfFahuostate(cmfFahuostate);
    }

    /**
     * 修改发货状态
     * 
     * @param cmfFahuostate 发货状态
     * @return 结果
     */
    @Override
    public int updateCmfFahuostate(CmfFahuostate cmfFahuostate)
    {
        return cmfFahuostateMapper.updateCmfFahuostate(cmfFahuostate);
    }

    /**
     * 批量删除发货状态
     * 
     * @param ids 需要删除的发货状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfFahuostateByIds(Integer[] ids)
    {
        return cmfFahuostateMapper.deleteCmfFahuostateByIds(ids);
    }

    /**
     * 删除发货状态信息
     * 
     * @param id 发货状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfFahuostateById(Integer id)
    {
        return cmfFahuostateMapper.deleteCmfFahuostateById(id);
    }
}
