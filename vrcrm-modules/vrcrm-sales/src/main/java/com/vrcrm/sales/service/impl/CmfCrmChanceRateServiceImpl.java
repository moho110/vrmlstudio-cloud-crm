package com.vrcrm.sales.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.sales.mapper.CmfCrmChanceRateMapper;
import com.vrcrm.sales.domain.CmfCrmChanceRate;
import com.vrcrm.sales.service.ICmfCrmChanceRateService;

/**
 * 销售机会成功率Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfCrmChanceRateServiceImpl implements ICmfCrmChanceRateService 
{
    @Autowired
    private CmfCrmChanceRateMapper cmfCrmChanceRateMapper;

    /**
     * 查询销售机会成功率
     * 
     * @param id 销售机会成功率主键
     * @return 销售机会成功率
     */
    @Override
    public CmfCrmChanceRate selectCmfCrmChanceRateById(Integer id)
    {
        return cmfCrmChanceRateMapper.selectCmfCrmChanceRateById(id);
    }

    /**
     * 查询销售机会成功率列表
     * 
     * @param cmfCrmChanceRate 销售机会成功率
     * @return 销售机会成功率
     */
    @Override
    public List<CmfCrmChanceRate> selectCmfCrmChanceRateList(CmfCrmChanceRate cmfCrmChanceRate)
    {
        return cmfCrmChanceRateMapper.selectCmfCrmChanceRateList(cmfCrmChanceRate);
    }

    /**
     * 新增销售机会成功率
     * 
     * @param cmfCrmChanceRate 销售机会成功率
     * @return 结果
     */
    @Override
    public int insertCmfCrmChanceRate(CmfCrmChanceRate cmfCrmChanceRate)
    {
        return cmfCrmChanceRateMapper.insertCmfCrmChanceRate(cmfCrmChanceRate);
    }

    /**
     * 修改销售机会成功率
     * 
     * @param cmfCrmChanceRate 销售机会成功率
     * @return 结果
     */
    @Override
    public int updateCmfCrmChanceRate(CmfCrmChanceRate cmfCrmChanceRate)
    {
        return cmfCrmChanceRateMapper.updateCmfCrmChanceRate(cmfCrmChanceRate);
    }

    /**
     * 批量删除销售机会成功率
     * 
     * @param ids 需要删除的销售机会成功率主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmChanceRateByIds(Integer[] ids)
    {
        return cmfCrmChanceRateMapper.deleteCmfCrmChanceRateByIds(ids);
    }

    /**
     * 删除销售机会成功率信息
     * 
     * @param id 销售机会成功率主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmChanceRateById(Integer id)
    {
        return cmfCrmChanceRateMapper.deleteCmfCrmChanceRateById(id);
    }
}
