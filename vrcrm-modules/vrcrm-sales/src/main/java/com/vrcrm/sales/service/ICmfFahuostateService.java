package com.vrcrm.sales.service;

import java.util.List;
import com.vrcrm.sales.domain.CmfFahuostate;

/**
 * 发货状态Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfFahuostateService 
{
    /**
     * 查询发货状态
     * 
     * @param id 发货状态主键
     * @return 发货状态
     */
    public CmfFahuostate selectCmfFahuostateById(Integer id);

    /**
     * 查询发货状态列表
     * 
     * @param cmfFahuostate 发货状态
     * @return 发货状态集合
     */
    public List<CmfFahuostate> selectCmfFahuostateList(CmfFahuostate cmfFahuostate);

    /**
     * 新增发货状态
     * 
     * @param cmfFahuostate 发货状态
     * @return 结果
     */
    public int insertCmfFahuostate(CmfFahuostate cmfFahuostate);

    /**
     * 修改发货状态
     * 
     * @param cmfFahuostate 发货状态
     * @return 结果
     */
    public int updateCmfFahuostate(CmfFahuostate cmfFahuostate);

    /**
     * 批量删除发货状态
     * 
     * @param ids 需要删除的发货状态主键集合
     * @return 结果
     */
    public int deleteCmfFahuostateByIds(Integer[] ids);

    /**
     * 删除发货状态信息
     * 
     * @param id 发货状态主键
     * @return 结果
     */
    public int deleteCmfFahuostateById(Integer id);
}
