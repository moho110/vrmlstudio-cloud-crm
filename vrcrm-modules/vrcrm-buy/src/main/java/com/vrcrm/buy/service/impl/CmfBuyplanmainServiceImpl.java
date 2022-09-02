package com.vrcrm.buy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.buy.mapper.CmfBuyplanmainMapper;
import com.vrcrm.buy.domain.CmfBuyplanmain;
import com.vrcrm.buy.service.ICmfBuyplanmainService;

/**
 * 采购计划Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfBuyplanmainServiceImpl implements ICmfBuyplanmainService 
{
    @Autowired
    private CmfBuyplanmainMapper cmfBuyplanmainMapper;

    /**
     * 查询采购计划
     * 
     * @param id 采购计划主键
     * @return 采购计划
     */
    @Override
    public CmfBuyplanmain selectCmfBuyplanmainById(Integer id)
    {
        return cmfBuyplanmainMapper.selectCmfBuyplanmainById(id);
    }

    /**
     * 查询采购计划列表
     * 
     * @param cmfBuyplanmain 采购计划
     * @return 采购计划
     */
    @Override
    public List<CmfBuyplanmain> selectCmfBuyplanmainList(CmfBuyplanmain cmfBuyplanmain)
    {
        return cmfBuyplanmainMapper.selectCmfBuyplanmainList(cmfBuyplanmain);
    }

    /**
     * 新增采购计划
     * 
     * @param cmfBuyplanmain 采购计划
     * @return 结果
     */
    @Override
    public int insertCmfBuyplanmain(CmfBuyplanmain cmfBuyplanmain)
    {
        return cmfBuyplanmainMapper.insertCmfBuyplanmain(cmfBuyplanmain);
    }

    /**
     * 修改采购计划
     * 
     * @param cmfBuyplanmain 采购计划
     * @return 结果
     */
    @Override
    public int updateCmfBuyplanmain(CmfBuyplanmain cmfBuyplanmain)
    {
        return cmfBuyplanmainMapper.updateCmfBuyplanmain(cmfBuyplanmain);
    }

    /**
     * 批量删除采购计划
     * 
     * @param ids 需要删除的采购计划主键
     * @return 结果
     */
    @Override
    public int deleteCmfBuyplanmainByIds(Integer[] ids)
    {
        return cmfBuyplanmainMapper.deleteCmfBuyplanmainByIds(ids);
    }

    /**
     * 删除采购计划信息
     * 
     * @param id 采购计划主键
     * @return 结果
     */
    @Override
    public int deleteCmfBuyplanmainById(Integer id)
    {
        return cmfBuyplanmainMapper.deleteCmfBuyplanmainById(id);
    }
}
