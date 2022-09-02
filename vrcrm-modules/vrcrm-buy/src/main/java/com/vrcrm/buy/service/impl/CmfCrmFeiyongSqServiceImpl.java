package com.vrcrm.buy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.buy.mapper.CmfCrmFeiyongSqMapper;
import com.vrcrm.buy.domain.CmfCrmFeiyongSq;
import com.vrcrm.buy.service.ICmfCrmFeiyongSqService;

/**
 * 费用申请Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfCrmFeiyongSqServiceImpl implements ICmfCrmFeiyongSqService 
{
    @Autowired
    private CmfCrmFeiyongSqMapper cmfCrmFeiyongSqMapper;

    /**
     * 查询费用申请
     * 
     * @param id 费用申请主键
     * @return 费用申请
     */
    @Override
    public CmfCrmFeiyongSq selectCmfCrmFeiyongSqById(Integer id)
    {
        return cmfCrmFeiyongSqMapper.selectCmfCrmFeiyongSqById(id);
    }

    /**
     * 查询费用申请列表
     * 
     * @param cmfCrmFeiyongSq 费用申请
     * @return 费用申请
     */
    @Override
    public List<CmfCrmFeiyongSq> selectCmfCrmFeiyongSqList(CmfCrmFeiyongSq cmfCrmFeiyongSq)
    {
        return cmfCrmFeiyongSqMapper.selectCmfCrmFeiyongSqList(cmfCrmFeiyongSq);
    }

    /**
     * 新增费用申请
     * 
     * @param cmfCrmFeiyongSq 费用申请
     * @return 结果
     */
    @Override
    public int insertCmfCrmFeiyongSq(CmfCrmFeiyongSq cmfCrmFeiyongSq)
    {
        return cmfCrmFeiyongSqMapper.insertCmfCrmFeiyongSq(cmfCrmFeiyongSq);
    }

    /**
     * 修改费用申请
     * 
     * @param cmfCrmFeiyongSq 费用申请
     * @return 结果
     */
    @Override
    public int updateCmfCrmFeiyongSq(CmfCrmFeiyongSq cmfCrmFeiyongSq)
    {
        return cmfCrmFeiyongSqMapper.updateCmfCrmFeiyongSq(cmfCrmFeiyongSq);
    }

    /**
     * 批量删除费用申请
     * 
     * @param ids 需要删除的费用申请主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmFeiyongSqByIds(Integer[] ids)
    {
        return cmfCrmFeiyongSqMapper.deleteCmfCrmFeiyongSqByIds(ids);
    }

    /**
     * 删除费用申请信息
     * 
     * @param id 费用申请主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmFeiyongSqById(Integer id)
    {
        return cmfCrmFeiyongSqMapper.deleteCmfCrmFeiyongSqById(id);
    }
}
