package com.vrcrm.buy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.buy.mapper.CmfBuyplanstateMapper;
import com.vrcrm.buy.domain.CmfBuyplanstate;
import com.vrcrm.buy.service.ICmfBuyplanstateService;

/**
 * 采购计划状态Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfBuyplanstateServiceImpl implements ICmfBuyplanstateService 
{
    @Autowired
    private CmfBuyplanstateMapper cmfBuyplanstateMapper;

    /**
     * 查询采购计划状态
     * 
     * @param id 采购计划状态主键
     * @return 采购计划状态
     */
    @Override
    public CmfBuyplanstate selectCmfBuyplanstateById(Integer id)
    {
        return cmfBuyplanstateMapper.selectCmfBuyplanstateById(id);
    }

    /**
     * 查询采购计划状态列表
     * 
     * @param cmfBuyplanstate 采购计划状态
     * @return 采购计划状态
     */
    @Override
    public List<CmfBuyplanstate> selectCmfBuyplanstateList(CmfBuyplanstate cmfBuyplanstate)
    {
        return cmfBuyplanstateMapper.selectCmfBuyplanstateList(cmfBuyplanstate);
    }

    /**
     * 新增采购计划状态
     * 
     * @param cmfBuyplanstate 采购计划状态
     * @return 结果
     */
    @Override
    public int insertCmfBuyplanstate(CmfBuyplanstate cmfBuyplanstate)
    {
        return cmfBuyplanstateMapper.insertCmfBuyplanstate(cmfBuyplanstate);
    }

    /**
     * 修改采购计划状态
     * 
     * @param cmfBuyplanstate 采购计划状态
     * @return 结果
     */
    @Override
    public int updateCmfBuyplanstate(CmfBuyplanstate cmfBuyplanstate)
    {
        return cmfBuyplanstateMapper.updateCmfBuyplanstate(cmfBuyplanstate);
    }

    /**
     * 批量删除采购计划状态
     * 
     * @param ids 需要删除的采购计划状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfBuyplanstateByIds(Integer[] ids)
    {
        return cmfBuyplanstateMapper.deleteCmfBuyplanstateByIds(ids);
    }

    /**
     * 删除采购计划状态信息
     * 
     * @param id 采购计划状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfBuyplanstateById(Integer id)
    {
        return cmfBuyplanstateMapper.deleteCmfBuyplanstateById(id);
    }
}
