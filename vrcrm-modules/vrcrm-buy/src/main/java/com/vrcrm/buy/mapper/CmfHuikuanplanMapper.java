package com.vrcrm.buy.mapper;

import java.util.List;
import com.vrcrm.buy.domain.CmfHuikuanplan;

/**
 * 汇款计划Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfHuikuanplanMapper 
{
    /**
     * 查询汇款计划
     * 
     * @param id 汇款计划主键
     * @return 汇款计划
     */
    public CmfHuikuanplan selectCmfHuikuanplanById(Integer id);

    /**
     * 查询汇款计划列表
     * 
     * @param cmfHuikuanplan 汇款计划
     * @return 汇款计划集合
     */
    public List<CmfHuikuanplan> selectCmfHuikuanplanList(CmfHuikuanplan cmfHuikuanplan);

    /**
     * 新增汇款计划
     * 
     * @param cmfHuikuanplan 汇款计划
     * @return 结果
     */
    public int insertCmfHuikuanplan(CmfHuikuanplan cmfHuikuanplan);

    /**
     * 修改汇款计划
     * 
     * @param cmfHuikuanplan 汇款计划
     * @return 结果
     */
    public int updateCmfHuikuanplan(CmfHuikuanplan cmfHuikuanplan);

    /**
     * 删除汇款计划
     * 
     * @param id 汇款计划主键
     * @return 结果
     */
    public int deleteCmfHuikuanplanById(Integer id);

    /**
     * 批量删除汇款计划
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfHuikuanplanByIds(Integer[] ids);
}
