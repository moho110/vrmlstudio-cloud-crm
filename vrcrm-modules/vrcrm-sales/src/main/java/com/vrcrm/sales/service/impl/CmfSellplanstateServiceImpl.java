package com.vrcrm.sales.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.sales.mapper.CmfSellplanstateMapper;
import com.vrcrm.sales.domain.CmfSellplanstate;
import com.vrcrm.sales.service.ICmfSellplanstateService;

/**
 * 销售计划状态Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSellplanstateServiceImpl implements ICmfSellplanstateService 
{
    @Autowired
    private CmfSellplanstateMapper cmfSellplanstateMapper;

    /**
     * 查询销售计划状态
     * 
     * @param id 销售计划状态主键
     * @return 销售计划状态
     */
    @Override
    public CmfSellplanstate selectCmfSellplanstateById(Integer id)
    {
        return cmfSellplanstateMapper.selectCmfSellplanstateById(id);
    }

    /**
     * 查询销售计划状态列表
     * 
     * @param cmfSellplanstate 销售计划状态
     * @return 销售计划状态
     */
    @Override
    public List<CmfSellplanstate> selectCmfSellplanstateList(CmfSellplanstate cmfSellplanstate)
    {
        return cmfSellplanstateMapper.selectCmfSellplanstateList(cmfSellplanstate);
    }

    /**
     * 新增销售计划状态
     * 
     * @param cmfSellplanstate 销售计划状态
     * @return 结果
     */
    @Override
    public int insertCmfSellplanstate(CmfSellplanstate cmfSellplanstate)
    {
        return cmfSellplanstateMapper.insertCmfSellplanstate(cmfSellplanstate);
    }

    /**
     * 修改销售计划状态
     * 
     * @param cmfSellplanstate 销售计划状态
     * @return 结果
     */
    @Override
    public int updateCmfSellplanstate(CmfSellplanstate cmfSellplanstate)
    {
        return cmfSellplanstateMapper.updateCmfSellplanstate(cmfSellplanstate);
    }

    /**
     * 批量删除销售计划状态
     * 
     * @param ids 需要删除的销售计划状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfSellplanstateByIds(Integer[] ids)
    {
        return cmfSellplanstateMapper.deleteCmfSellplanstateByIds(ids);
    }

    /**
     * 删除销售计划状态信息
     * 
     * @param id 销售计划状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfSellplanstateById(Integer id)
    {
        return cmfSellplanstateMapper.deleteCmfSellplanstateById(id);
    }
}
