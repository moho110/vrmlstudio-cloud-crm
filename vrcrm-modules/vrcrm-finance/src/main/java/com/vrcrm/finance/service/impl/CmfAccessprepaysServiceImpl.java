package com.vrcrm.finance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.finance.mapper.CmfAccessprepaysMapper;
import com.vrcrm.finance.domain.CmfAccessprepays;
import com.vrcrm.finance.service.ICmfAccessprepaysService;

/**
 * 预付款记录Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-13
 */
@Service
public class CmfAccessprepaysServiceImpl implements ICmfAccessprepaysService 
{
    @Autowired
    private CmfAccessprepaysMapper cmfAccessprepaysMapper;

    /**
     * 查询预付款记录
     * 
     * @param id 预付款记录主键
     * @return 预付款记录
     */
    @Override
    public CmfAccessprepays selectCmfAccessprepaysById(Integer id)
    {
        return cmfAccessprepaysMapper.selectCmfAccessprepaysById(id);
    }

    /**
     * 查询预付款记录列表
     * 
     * @param cmfAccessprepays 预付款记录
     * @return 预付款记录
     */
    @Override
    public List<CmfAccessprepays> selectCmfAccessprepaysList(CmfAccessprepays cmfAccessprepays)
    {
        return cmfAccessprepaysMapper.selectCmfAccessprepaysList(cmfAccessprepays);
    }

    /**
     * 新增预付款记录
     * 
     * @param cmfAccessprepays 预付款记录
     * @return 结果
     */
    @Override
    public int insertCmfAccessprepays(CmfAccessprepays cmfAccessprepays)
    {
        return cmfAccessprepaysMapper.insertCmfAccessprepays(cmfAccessprepays);
    }

    /**
     * 修改预付款记录
     * 
     * @param cmfAccessprepays 预付款记录
     * @return 结果
     */
    @Override
    public int updateCmfAccessprepays(CmfAccessprepays cmfAccessprepays)
    {
        return cmfAccessprepaysMapper.updateCmfAccessprepays(cmfAccessprepays);
    }

    /**
     * 批量删除预付款记录
     * 
     * @param ids 需要删除的预付款记录主键
     * @return 结果
     */
    @Override
    public int deleteCmfAccessprepaysByIds(Integer[] ids)
    {
        return cmfAccessprepaysMapper.deleteCmfAccessprepaysByIds(ids);
    }

    /**
     * 删除预付款记录信息
     * 
     * @param id 预付款记录主键
     * @return 结果
     */
    @Override
    public int deleteCmfAccessprepaysById(Integer id)
    {
        return cmfAccessprepaysMapper.deleteCmfAccessprepaysById(id);
    }
}
