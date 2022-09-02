package com.vrcrm.sales.service;

import java.util.List;
import com.vrcrm.sales.domain.CmfSellcontractJiaofu;

/**
 * 销售合同交付管理Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfSellcontractJiaofuService 
{
    /**
     * 查询销售合同交付管理
     * 
     * @param id 销售合同交付管理主键
     * @return 销售合同交付管理
     */
    public CmfSellcontractJiaofu selectCmfSellcontractJiaofuById(Integer id);

    /**
     * 查询销售合同交付管理列表
     * 
     * @param cmfSellcontractJiaofu 销售合同交付管理
     * @return 销售合同交付管理集合
     */
    public List<CmfSellcontractJiaofu> selectCmfSellcontractJiaofuList(CmfSellcontractJiaofu cmfSellcontractJiaofu);

    /**
     * 新增销售合同交付管理
     * 
     * @param cmfSellcontractJiaofu 销售合同交付管理
     * @return 结果
     */
    public int insertCmfSellcontractJiaofu(CmfSellcontractJiaofu cmfSellcontractJiaofu);

    /**
     * 修改销售合同交付管理
     * 
     * @param cmfSellcontractJiaofu 销售合同交付管理
     * @return 结果
     */
    public int updateCmfSellcontractJiaofu(CmfSellcontractJiaofu cmfSellcontractJiaofu);

    /**
     * 批量删除销售合同交付管理
     * 
     * @param ids 需要删除的销售合同交付管理主键集合
     * @return 结果
     */
    public int deleteCmfSellcontractJiaofuByIds(Integer[] ids);

    /**
     * 删除销售合同交付管理信息
     * 
     * @param id 销售合同交付管理主键
     * @return 结果
     */
    public int deleteCmfSellcontractJiaofuById(Integer id);
}
