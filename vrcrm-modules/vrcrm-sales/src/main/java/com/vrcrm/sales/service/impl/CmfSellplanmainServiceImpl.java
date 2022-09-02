package com.vrcrm.sales.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.sales.mapper.CmfSellplanmainMapper;
import com.vrcrm.sales.domain.CmfSellplanmain;
import com.vrcrm.sales.service.ICmfSellplanmainService;

/**
 * 销售计划Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSellplanmainServiceImpl implements ICmfSellplanmainService 
{
    @Autowired
    private CmfSellplanmainMapper cmfSellplanmainMapper;

    /**
     * 查询销售计划
     * 
     * @param id 销售计划主键
     * @return 销售计划
     */
    @Override
    public CmfSellplanmain selectCmfSellplanmainById(Integer id)
    {
        return cmfSellplanmainMapper.selectCmfSellplanmainById(id);
    }

    /**
     * 查询销售计划列表
     * 
     * @param cmfSellplanmain 销售计划
     * @return 销售计划
     */
    @Override
    public List<CmfSellplanmain> selectCmfSellplanmainList(CmfSellplanmain cmfSellplanmain)
    {
        return cmfSellplanmainMapper.selectCmfSellplanmainList(cmfSellplanmain);
    }

    /**
     * 新增销售计划
     * 
     * @param cmfSellplanmain 销售计划
     * @return 结果
     */
    @Override
    public int insertCmfSellplanmain(CmfSellplanmain cmfSellplanmain)
    {
        return cmfSellplanmainMapper.insertCmfSellplanmain(cmfSellplanmain);
    }

    /**
     * 修改销售计划
     * 
     * @param cmfSellplanmain 销售计划
     * @return 结果
     */
    @Override
    public int updateCmfSellplanmain(CmfSellplanmain cmfSellplanmain)
    {
        return cmfSellplanmainMapper.updateCmfSellplanmain(cmfSellplanmain);
    }

    /**
     * 批量删除销售计划
     * 
     * @param ids 需要删除的销售计划主键
     * @return 结果
     */
    @Override
    public int deleteCmfSellplanmainByIds(Integer[] ids)
    {
        return cmfSellplanmainMapper.deleteCmfSellplanmainByIds(ids);
    }

    /**
     * 删除销售计划信息
     * 
     * @param id 销售计划主键
     * @return 结果
     */
    @Override
    public int deleteCmfSellplanmainById(Integer id)
    {
        return cmfSellplanmainMapper.deleteCmfSellplanmainById(id);
    }
}
