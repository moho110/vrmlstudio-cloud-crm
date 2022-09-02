package com.vrcrm.finance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.finance.mapper.CmfPaystateMapper;
import com.vrcrm.finance.domain.CmfPaystate;
import com.vrcrm.finance.service.ICmfPaystateService;

/**
 * 支付状态Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfPaystateServiceImpl implements ICmfPaystateService 
{
    @Autowired
    private CmfPaystateMapper cmfPaystateMapper;

    /**
     * 查询支付状态
     * 
     * @param id 支付状态主键
     * @return 支付状态
     */
    @Override
    public CmfPaystate selectCmfPaystateById(Integer id)
    {
        return cmfPaystateMapper.selectCmfPaystateById(id);
    }

    /**
     * 查询支付状态列表
     * 
     * @param cmfPaystate 支付状态
     * @return 支付状态
     */
    @Override
    public List<CmfPaystate> selectCmfPaystateList(CmfPaystate cmfPaystate)
    {
        return cmfPaystateMapper.selectCmfPaystateList(cmfPaystate);
    }

    /**
     * 新增支付状态
     * 
     * @param cmfPaystate 支付状态
     * @return 结果
     */
    @Override
    public int insertCmfPaystate(CmfPaystate cmfPaystate)
    {
        return cmfPaystateMapper.insertCmfPaystate(cmfPaystate);
    }

    /**
     * 修改支付状态
     * 
     * @param cmfPaystate 支付状态
     * @return 结果
     */
    @Override
    public int updateCmfPaystate(CmfPaystate cmfPaystate)
    {
        return cmfPaystateMapper.updateCmfPaystate(cmfPaystate);
    }

    /**
     * 批量删除支付状态
     * 
     * @param ids 需要删除的支付状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfPaystateByIds(Integer[] ids)
    {
        return cmfPaystateMapper.deleteCmfPaystateByIds(ids);
    }

    /**
     * 删除支付状态信息
     * 
     * @param id 支付状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfPaystateById(Integer id)
    {
        return cmfPaystateMapper.deleteCmfPaystateById(id);
    }
}
