package com.vrcrm.buy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.buy.mapper.CmfHuikuanplanMapper;
import com.vrcrm.buy.domain.CmfHuikuanplan;
import com.vrcrm.buy.service.ICmfHuikuanplanService;

/**
 * 汇款计划Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfHuikuanplanServiceImpl implements ICmfHuikuanplanService 
{
    @Autowired
    private CmfHuikuanplanMapper cmfHuikuanplanMapper;

    /**
     * 查询汇款计划
     * 
     * @param id 汇款计划主键
     * @return 汇款计划
     */
    @Override
    public CmfHuikuanplan selectCmfHuikuanplanById(Integer id)
    {
        return cmfHuikuanplanMapper.selectCmfHuikuanplanById(id);
    }

    /**
     * 查询汇款计划列表
     * 
     * @param cmfHuikuanplan 汇款计划
     * @return 汇款计划
     */
    @Override
    public List<CmfHuikuanplan> selectCmfHuikuanplanList(CmfHuikuanplan cmfHuikuanplan)
    {
        return cmfHuikuanplanMapper.selectCmfHuikuanplanList(cmfHuikuanplan);
    }

    /**
     * 新增汇款计划
     * 
     * @param cmfHuikuanplan 汇款计划
     * @return 结果
     */
    @Override
    public int insertCmfHuikuanplan(CmfHuikuanplan cmfHuikuanplan)
    {
        return cmfHuikuanplanMapper.insertCmfHuikuanplan(cmfHuikuanplan);
    }

    /**
     * 修改汇款计划
     * 
     * @param cmfHuikuanplan 汇款计划
     * @return 结果
     */
    @Override
    public int updateCmfHuikuanplan(CmfHuikuanplan cmfHuikuanplan)
    {
        return cmfHuikuanplanMapper.updateCmfHuikuanplan(cmfHuikuanplan);
    }

    /**
     * 批量删除汇款计划
     * 
     * @param ids 需要删除的汇款计划主键
     * @return 结果
     */
    @Override
    public int deleteCmfHuikuanplanByIds(Integer[] ids)
    {
        return cmfHuikuanplanMapper.deleteCmfHuikuanplanByIds(ids);
    }

    /**
     * 删除汇款计划信息
     * 
     * @param id 汇款计划主键
     * @return 结果
     */
    @Override
    public int deleteCmfHuikuanplanById(Integer id)
    {
        return cmfHuikuanplanMapper.deleteCmfHuikuanplanById(id);
    }
}
