package com.vrcrm.sales.mapper;

import java.util.List;
import com.vrcrm.sales.domain.CmfCrmChance;

/**
 * 销售机会Mapper接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface CmfCrmChanceMapper 
{
    /**
     * 查询销售机会
     * 
     * @param id 销售机会主键
     * @return 销售机会
     */
    public CmfCrmChance selectCmfCrmChanceById(Integer id);

    /**
     * 查询销售机会列表
     * 
     * @param cmfCrmChance 销售机会
     * @return 销售机会集合
     */
    public List<CmfCrmChance> selectCmfCrmChanceList(CmfCrmChance cmfCrmChance);

    /**
     * 新增销售机会
     * 
     * @param cmfCrmChance 销售机会
     * @return 结果
     */
    public int insertCmfCrmChance(CmfCrmChance cmfCrmChance);

    /**
     * 修改销售机会
     * 
     * @param cmfCrmChance 销售机会
     * @return 结果
     */
    public int updateCmfCrmChance(CmfCrmChance cmfCrmChance);

    /**
     * 删除销售机会
     * 
     * @param id 销售机会主键
     * @return 结果
     */
    public int deleteCmfCrmChanceById(Integer id);

    /**
     * 批量删除销售机会
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfCrmChanceByIds(Integer[] ids);
}
