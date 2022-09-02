package com.vrcrm.sales.service;

import java.util.List;
import com.vrcrm.sales.domain.CmfFukuanplan;

/**
 * 付款计划Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfFukuanplanService 
{
    /**
     * 查询付款计划
     * 
     * @param id 付款计划主键
     * @return 付款计划
     */
    public CmfFukuanplan selectCmfFukuanplanById(Integer id);

    /**
     * 查询付款计划列表
     * 
     * @param cmfFukuanplan 付款计划
     * @return 付款计划集合
     */
    public List<CmfFukuanplan> selectCmfFukuanplanList(CmfFukuanplan cmfFukuanplan);

    /**
     * 新增付款计划
     * 
     * @param cmfFukuanplan 付款计划
     * @return 结果
     */
    public int insertCmfFukuanplan(CmfFukuanplan cmfFukuanplan);

    /**
     * 修改付款计划
     * 
     * @param cmfFukuanplan 付款计划
     * @return 结果
     */
    public int updateCmfFukuanplan(CmfFukuanplan cmfFukuanplan);

    /**
     * 批量删除付款计划
     * 
     * @param ids 需要删除的付款计划主键集合
     * @return 结果
     */
    public int deleteCmfFukuanplanByIds(Integer[] ids);

    /**
     * 删除付款计划信息
     * 
     * @param id 付款计划主键
     * @return 结果
     */
    public int deleteCmfFukuanplanById(Integer id);
}
