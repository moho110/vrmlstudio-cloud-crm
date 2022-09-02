package com.vrcrm.sales.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.sales.mapper.CmfSellcontractJiaofuMapper;
import com.vrcrm.sales.domain.CmfSellcontractJiaofu;
import com.vrcrm.sales.service.ICmfSellcontractJiaofuService;

/**
 * 销售合同交付管理Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSellcontractJiaofuServiceImpl implements ICmfSellcontractJiaofuService 
{
    @Autowired
    private CmfSellcontractJiaofuMapper cmfSellcontractJiaofuMapper;

    /**
     * 查询销售合同交付管理
     * 
     * @param id 销售合同交付管理主键
     * @return 销售合同交付管理
     */
    @Override
    public CmfSellcontractJiaofu selectCmfSellcontractJiaofuById(Integer id)
    {
        return cmfSellcontractJiaofuMapper.selectCmfSellcontractJiaofuById(id);
    }

    /**
     * 查询销售合同交付管理列表
     * 
     * @param cmfSellcontractJiaofu 销售合同交付管理
     * @return 销售合同交付管理
     */
    @Override
    public List<CmfSellcontractJiaofu> selectCmfSellcontractJiaofuList(CmfSellcontractJiaofu cmfSellcontractJiaofu)
    {
        return cmfSellcontractJiaofuMapper.selectCmfSellcontractJiaofuList(cmfSellcontractJiaofu);
    }

    /**
     * 新增销售合同交付管理
     * 
     * @param cmfSellcontractJiaofu 销售合同交付管理
     * @return 结果
     */
    @Override
    public int insertCmfSellcontractJiaofu(CmfSellcontractJiaofu cmfSellcontractJiaofu)
    {
        return cmfSellcontractJiaofuMapper.insertCmfSellcontractJiaofu(cmfSellcontractJiaofu);
    }

    /**
     * 修改销售合同交付管理
     * 
     * @param cmfSellcontractJiaofu 销售合同交付管理
     * @return 结果
     */
    @Override
    public int updateCmfSellcontractJiaofu(CmfSellcontractJiaofu cmfSellcontractJiaofu)
    {
        return cmfSellcontractJiaofuMapper.updateCmfSellcontractJiaofu(cmfSellcontractJiaofu);
    }

    /**
     * 批量删除销售合同交付管理
     * 
     * @param ids 需要删除的销售合同交付管理主键
     * @return 结果
     */
    @Override
    public int deleteCmfSellcontractJiaofuByIds(Integer[] ids)
    {
        return cmfSellcontractJiaofuMapper.deleteCmfSellcontractJiaofuByIds(ids);
    }

    /**
     * 删除销售合同交付管理信息
     * 
     * @param id 销售合同交付管理主键
     * @return 结果
     */
    @Override
    public int deleteCmfSellcontractJiaofuById(Integer id)
    {
        return cmfSellcontractJiaofuMapper.deleteCmfSellcontractJiaofuById(id);
    }
}
