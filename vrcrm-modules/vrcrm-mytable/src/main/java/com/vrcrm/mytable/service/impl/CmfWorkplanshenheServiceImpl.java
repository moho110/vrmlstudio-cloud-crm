package com.vrcrm.mytable.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.mytable.mapper.CmfWorkplanshenheMapper;
import com.vrcrm.mytable.domain.CmfWorkplanshenhe;
import com.vrcrm.mytable.service.ICmfWorkplanshenheService;

/**
 * 工作计划审核Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfWorkplanshenheServiceImpl implements ICmfWorkplanshenheService 
{
    @Autowired
    private CmfWorkplanshenheMapper cmfWorkplanshenheMapper;

    /**
     * 查询工作计划审核
     * 
     * @param id 工作计划审核主键
     * @return 工作计划审核
     */
    @Override
    public CmfWorkplanshenhe selectCmfWorkplanshenheById(Integer id)
    {
        return cmfWorkplanshenheMapper.selectCmfWorkplanshenheById(id);
    }

    /**
     * 查询工作计划审核列表
     * 
     * @param cmfWorkplanshenhe 工作计划审核
     * @return 工作计划审核
     */
    @Override
    public List<CmfWorkplanshenhe> selectCmfWorkplanshenheList(CmfWorkplanshenhe cmfWorkplanshenhe)
    {
        return cmfWorkplanshenheMapper.selectCmfWorkplanshenheList(cmfWorkplanshenhe);
    }

    /**
     * 新增工作计划审核
     * 
     * @param cmfWorkplanshenhe 工作计划审核
     * @return 结果
     */
    @Override
    public int insertCmfWorkplanshenhe(CmfWorkplanshenhe cmfWorkplanshenhe)
    {
        return cmfWorkplanshenheMapper.insertCmfWorkplanshenhe(cmfWorkplanshenhe);
    }

    /**
     * 修改工作计划审核
     * 
     * @param cmfWorkplanshenhe 工作计划审核
     * @return 结果
     */
    @Override
    public int updateCmfWorkplanshenhe(CmfWorkplanshenhe cmfWorkplanshenhe)
    {
        return cmfWorkplanshenheMapper.updateCmfWorkplanshenhe(cmfWorkplanshenhe);
    }

    /**
     * 批量删除工作计划审核
     * 
     * @param ids 需要删除的工作计划审核主键
     * @return 结果
     */
    @Override
    public int deleteCmfWorkplanshenheByIds(Integer[] ids)
    {
        return cmfWorkplanshenheMapper.deleteCmfWorkplanshenheByIds(ids);
    }

    /**
     * 删除工作计划审核信息
     * 
     * @param id 工作计划审核主键
     * @return 结果
     */
    @Override
    public int deleteCmfWorkplanshenheById(Integer id)
    {
        return cmfWorkplanshenheMapper.deleteCmfWorkplanshenheById(id);
    }
}
