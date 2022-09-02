package com.vrcrm.hr.service;

import java.util.List;
import com.vrcrm.hr.domain.CmfDictWeekday;

/**
 * 周工作日Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfDictWeekdayService 
{
    /**
     * 查询周工作日
     * 
     * @param id 周工作日主键
     * @return 周工作日
     */
    public CmfDictWeekday selectCmfDictWeekdayById(Integer id);

    /**
     * 查询周工作日列表
     * 
     * @param cmfDictWeekday 周工作日
     * @return 周工作日集合
     */
    public List<CmfDictWeekday> selectCmfDictWeekdayList(CmfDictWeekday cmfDictWeekday);

    /**
     * 新增周工作日
     * 
     * @param cmfDictWeekday 周工作日
     * @return 结果
     */
    public int insertCmfDictWeekday(CmfDictWeekday cmfDictWeekday);

    /**
     * 修改周工作日
     * 
     * @param cmfDictWeekday 周工作日
     * @return 结果
     */
    public int updateCmfDictWeekday(CmfDictWeekday cmfDictWeekday);

    /**
     * 批量删除周工作日
     * 
     * @param ids 需要删除的周工作日主键集合
     * @return 结果
     */
    public int deleteCmfDictWeekdayByIds(Integer[] ids);

    /**
     * 删除周工作日信息
     * 
     * @param id 周工作日主键
     * @return 结果
     */
    public int deleteCmfDictWeekdayById(Integer id);
}
