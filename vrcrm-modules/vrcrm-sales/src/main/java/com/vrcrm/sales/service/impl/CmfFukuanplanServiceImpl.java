package com.vrcrm.sales.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.sales.mapper.CmfFukuanplanMapper;
import com.vrcrm.sales.domain.CmfFukuanplan;
import com.vrcrm.sales.service.ICmfFukuanplanService;

/**
 * 付款计划Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfFukuanplanServiceImpl implements ICmfFukuanplanService 
{
    @Autowired
    private CmfFukuanplanMapper cmfFukuanplanMapper;

    /**
     * 查询付款计划
     * 
     * @param id 付款计划主键
     * @return 付款计划
     */
    @Override
    public CmfFukuanplan selectCmfFukuanplanById(Integer id)
    {
        return cmfFukuanplanMapper.selectCmfFukuanplanById(id);
    }

    /**
     * 查询付款计划列表
     * 
     * @param cmfFukuanplan 付款计划
     * @return 付款计划
     */
    @Override
    public List<CmfFukuanplan> selectCmfFukuanplanList(CmfFukuanplan cmfFukuanplan)
    {
        return cmfFukuanplanMapper.selectCmfFukuanplanList(cmfFukuanplan);
    }

    /**
     * 新增付款计划
     * 
     * @param cmfFukuanplan 付款计划
     * @return 结果
     */
    @Override
    public int insertCmfFukuanplan(CmfFukuanplan cmfFukuanplan)
    {
        return cmfFukuanplanMapper.insertCmfFukuanplan(cmfFukuanplan);
    }

    /**
     * 修改付款计划
     * 
     * @param cmfFukuanplan 付款计划
     * @return 结果
     */
    @Override
    public int updateCmfFukuanplan(CmfFukuanplan cmfFukuanplan)
    {
        return cmfFukuanplanMapper.updateCmfFukuanplan(cmfFukuanplan);
    }

    /**
     * 批量删除付款计划
     * 
     * @param ids 需要删除的付款计划主键
     * @return 结果
     */
    @Override
    public int deleteCmfFukuanplanByIds(Integer[] ids)
    {
        return cmfFukuanplanMapper.deleteCmfFukuanplanByIds(ids);
    }

    /**
     * 删除付款计划信息
     * 
     * @param id 付款计划主键
     * @return 结果
     */
    @Override
    public int deleteCmfFukuanplanById(Integer id)
    {
        return cmfFukuanplanMapper.deleteCmfFukuanplanById(id);
    }
}
