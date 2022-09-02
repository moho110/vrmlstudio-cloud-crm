package com.vrcrm.mytable.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.mytable.mapper.CmfWorkplanmainDetailMapper;
import com.vrcrm.mytable.domain.CmfWorkplanmainDetail;
import com.vrcrm.mytable.service.ICmfWorkplanmainDetailService;

/**
 * 工作计划明细Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfWorkplanmainDetailServiceImpl implements ICmfWorkplanmainDetailService 
{
    @Autowired
    private CmfWorkplanmainDetailMapper cmfWorkplanmainDetailMapper;

    /**
     * 查询工作计划明细
     * 
     * @param id 工作计划明细主键
     * @return 工作计划明细
     */
    @Override
    public CmfWorkplanmainDetail selectCmfWorkplanmainDetailById(Integer id)
    {
        return cmfWorkplanmainDetailMapper.selectCmfWorkplanmainDetailById(id);
    }

    /**
     * 查询工作计划明细列表
     * 
     * @param cmfWorkplanmainDetail 工作计划明细
     * @return 工作计划明细
     */
    @Override
    public List<CmfWorkplanmainDetail> selectCmfWorkplanmainDetailList(CmfWorkplanmainDetail cmfWorkplanmainDetail)
    {
        return cmfWorkplanmainDetailMapper.selectCmfWorkplanmainDetailList(cmfWorkplanmainDetail);
    }

    /**
     * 新增工作计划明细
     * 
     * @param cmfWorkplanmainDetail 工作计划明细
     * @return 结果
     */
    @Override
    public int insertCmfWorkplanmainDetail(CmfWorkplanmainDetail cmfWorkplanmainDetail)
    {
        return cmfWorkplanmainDetailMapper.insertCmfWorkplanmainDetail(cmfWorkplanmainDetail);
    }

    /**
     * 修改工作计划明细
     * 
     * @param cmfWorkplanmainDetail 工作计划明细
     * @return 结果
     */
    @Override
    public int updateCmfWorkplanmainDetail(CmfWorkplanmainDetail cmfWorkplanmainDetail)
    {
        return cmfWorkplanmainDetailMapper.updateCmfWorkplanmainDetail(cmfWorkplanmainDetail);
    }

    /**
     * 批量删除工作计划明细
     * 
     * @param ids 需要删除的工作计划明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfWorkplanmainDetailByIds(Integer[] ids)
    {
        return cmfWorkplanmainDetailMapper.deleteCmfWorkplanmainDetailByIds(ids);
    }

    /**
     * 删除工作计划明细信息
     * 
     * @param id 工作计划明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfWorkplanmainDetailById(Integer id)
    {
        return cmfWorkplanmainDetailMapper.deleteCmfWorkplanmainDetailById(id);
    }
}
