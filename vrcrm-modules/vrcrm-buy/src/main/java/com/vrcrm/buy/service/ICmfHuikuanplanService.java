package com.vrcrm.buy.service;

import java.util.List;
import com.vrcrm.buy.domain.CmfHuikuanplan;

/**
 * 汇款计划Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfHuikuanplanService 
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
     * 批量删除汇款计划
     * 
     * @param ids 需要删除的汇款计划主键集合
     * @return 结果
     */
    public int deleteCmfHuikuanplanByIds(Integer[] ids);

    /**
     * 删除汇款计划信息
     * 
     * @param id 汇款计划主键
     * @return 结果
     */
    public int deleteCmfHuikuanplanById(Integer id);
}
