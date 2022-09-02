package com.vrcrm.sales.mapper;

import java.util.List;
import com.vrcrm.sales.domain.CmfSellplanstate;

/**
 * 销售计划状态Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfSellplanstateMapper 
{
    /**
     * 查询销售计划状态
     * 
     * @param id 销售计划状态主键
     * @return 销售计划状态
     */
    public CmfSellplanstate selectCmfSellplanstateById(Integer id);

    /**
     * 查询销售计划状态列表
     * 
     * @param cmfSellplanstate 销售计划状态
     * @return 销售计划状态集合
     */
    public List<CmfSellplanstate> selectCmfSellplanstateList(CmfSellplanstate cmfSellplanstate);

    /**
     * 新增销售计划状态
     * 
     * @param cmfSellplanstate 销售计划状态
     * @return 结果
     */
    public int insertCmfSellplanstate(CmfSellplanstate cmfSellplanstate);

    /**
     * 修改销售计划状态
     * 
     * @param cmfSellplanstate 销售计划状态
     * @return 结果
     */
    public int updateCmfSellplanstate(CmfSellplanstate cmfSellplanstate);

    /**
     * 删除销售计划状态
     * 
     * @param id 销售计划状态主键
     * @return 结果
     */
    public int deleteCmfSellplanstateById(Integer id);

    /**
     * 批量删除销售计划状态
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfSellplanstateByIds(Integer[] ids);
}
