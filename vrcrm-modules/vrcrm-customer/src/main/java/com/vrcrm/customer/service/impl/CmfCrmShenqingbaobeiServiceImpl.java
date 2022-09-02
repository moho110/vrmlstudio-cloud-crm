package com.vrcrm.customer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.customer.mapper.CmfCrmShenqingbaobeiMapper;
import com.vrcrm.customer.domain.CmfCrmShenqingbaobei;
import com.vrcrm.customer.service.ICmfCrmShenqingbaobeiService;

/**
 * 申请报备Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfCrmShenqingbaobeiServiceImpl implements ICmfCrmShenqingbaobeiService 
{
    @Autowired
    private CmfCrmShenqingbaobeiMapper cmfCrmShenqingbaobeiMapper;

    /**
     * 查询申请报备
     * 
     * @param id 申请报备主键
     * @return 申请报备
     */
    @Override
    public CmfCrmShenqingbaobei selectCmfCrmShenqingbaobeiById(Integer id)
    {
        return cmfCrmShenqingbaobeiMapper.selectCmfCrmShenqingbaobeiById(id);
    }

    /**
     * 查询申请报备列表
     * 
     * @param cmfCrmShenqingbaobei 申请报备
     * @return 申请报备
     */
    @Override
    public List<CmfCrmShenqingbaobei> selectCmfCrmShenqingbaobeiList(CmfCrmShenqingbaobei cmfCrmShenqingbaobei)
    {
        return cmfCrmShenqingbaobeiMapper.selectCmfCrmShenqingbaobeiList(cmfCrmShenqingbaobei);
    }

    /**
     * 新增申请报备
     * 
     * @param cmfCrmShenqingbaobei 申请报备
     * @return 结果
     */
    @Override
    public int insertCmfCrmShenqingbaobei(CmfCrmShenqingbaobei cmfCrmShenqingbaobei)
    {
        return cmfCrmShenqingbaobeiMapper.insertCmfCrmShenqingbaobei(cmfCrmShenqingbaobei);
    }

    /**
     * 修改申请报备
     * 
     * @param cmfCrmShenqingbaobei 申请报备
     * @return 结果
     */
    @Override
    public int updateCmfCrmShenqingbaobei(CmfCrmShenqingbaobei cmfCrmShenqingbaobei)
    {
        return cmfCrmShenqingbaobeiMapper.updateCmfCrmShenqingbaobei(cmfCrmShenqingbaobei);
    }

    /**
     * 批量删除申请报备
     * 
     * @param ids 需要删除的申请报备主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmShenqingbaobeiByIds(Integer[] ids)
    {
        return cmfCrmShenqingbaobeiMapper.deleteCmfCrmShenqingbaobeiByIds(ids);
    }

    /**
     * 删除申请报备信息
     * 
     * @param id 申请报备主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmShenqingbaobeiById(Integer id)
    {
        return cmfCrmShenqingbaobeiMapper.deleteCmfCrmShenqingbaobeiById(id);
    }
}
