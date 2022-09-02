package com.vrcrm.sales.service;

import java.util.List;
import com.vrcrm.sales.domain.CmfCrmChanceRate;

/**
 * 销售机会成功率Service接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface ICmfCrmChanceRateService 
{
    /**
     * 查询销售机会成功率
     * 
     * @param id 销售机会成功率主键
     * @return 销售机会成功率
     */
    public CmfCrmChanceRate selectCmfCrmChanceRateById(Integer id);

    /**
     * 查询销售机会成功率列表
     * 
     * @param cmfCrmChanceRate 销售机会成功率
     * @return 销售机会成功率集合
     */
    public List<CmfCrmChanceRate> selectCmfCrmChanceRateList(CmfCrmChanceRate cmfCrmChanceRate);

    /**
     * 新增销售机会成功率
     * 
     * @param cmfCrmChanceRate 销售机会成功率
     * @return 结果
     */
    public int insertCmfCrmChanceRate(CmfCrmChanceRate cmfCrmChanceRate);

    /**
     * 修改销售机会成功率
     * 
     * @param cmfCrmChanceRate 销售机会成功率
     * @return 结果
     */
    public int updateCmfCrmChanceRate(CmfCrmChanceRate cmfCrmChanceRate);

    /**
     * 批量删除销售机会成功率
     * 
     * @param ids 需要删除的销售机会成功率主键集合
     * @return 结果
     */
    public int deleteCmfCrmChanceRateByIds(Integer[] ids);

    /**
     * 删除销售机会成功率信息
     * 
     * @param id 销售机会成功率主键
     * @return 结果
     */
    public int deleteCmfCrmChanceRateById(Integer id);
}
