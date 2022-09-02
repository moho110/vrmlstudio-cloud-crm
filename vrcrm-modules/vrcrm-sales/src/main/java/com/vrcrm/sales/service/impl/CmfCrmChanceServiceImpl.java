package com.vrcrm.sales.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.sales.mapper.CmfCrmChanceMapper;
import com.vrcrm.sales.domain.CmfCrmChance;
import com.vrcrm.sales.service.ICmfCrmChanceService;

/**
 * 销售机会Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfCrmChanceServiceImpl implements ICmfCrmChanceService 
{
    @Autowired
    private CmfCrmChanceMapper cmfCrmChanceMapper;

    /**
     * 查询销售机会
     * 
     * @param id 销售机会主键
     * @return 销售机会
     */
    @Override
    public CmfCrmChance selectCmfCrmChanceById(Integer id)
    {
        return cmfCrmChanceMapper.selectCmfCrmChanceById(id);
    }

    /**
     * 查询销售机会列表
     * 
     * @param cmfCrmChance 销售机会
     * @return 销售机会
     */
    @Override
    public List<CmfCrmChance> selectCmfCrmChanceList(CmfCrmChance cmfCrmChance)
    {
        return cmfCrmChanceMapper.selectCmfCrmChanceList(cmfCrmChance);
    }

    /**
     * 新增销售机会
     * 
     * @param cmfCrmChance 销售机会
     * @return 结果
     */
    @Override
    public int insertCmfCrmChance(CmfCrmChance cmfCrmChance)
    {
        return cmfCrmChanceMapper.insertCmfCrmChance(cmfCrmChance);
    }

    /**
     * 修改销售机会
     * 
     * @param cmfCrmChance 销售机会
     * @return 结果
     */
    @Override
    public int updateCmfCrmChance(CmfCrmChance cmfCrmChance)
    {
        return cmfCrmChanceMapper.updateCmfCrmChance(cmfCrmChance);
    }

    /**
     * 批量删除销售机会
     * 
     * @param ids 需要删除的销售机会主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmChanceByIds(Integer[] ids)
    {
        return cmfCrmChanceMapper.deleteCmfCrmChanceByIds(ids);
    }

    /**
     * 删除销售机会信息
     * 
     * @param id 销售机会主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmChanceById(Integer id)
    {
        return cmfCrmChanceMapper.deleteCmfCrmChanceById(id);
    }
}
