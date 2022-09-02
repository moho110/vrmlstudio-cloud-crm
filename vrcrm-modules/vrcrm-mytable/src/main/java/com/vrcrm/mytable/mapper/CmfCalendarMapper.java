package com.vrcrm.mytable.mapper;

import java.util.List;
import com.vrcrm.mytable.domain.CmfCalendar;

/**
 * 日程安排Mapper接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface CmfCalendarMapper 
{
    /**
     * 查询日程安排
     * 
     * @param id 日程安排主键
     * @return 日程安排
     */
    public CmfCalendar selectCmfCalendarById(Long id);

    /**
     * 查询日程安排列表
     * 
     * @param cmfCalendar 日程安排
     * @return 日程安排集合
     */
    public List<CmfCalendar> selectCmfCalendarList(CmfCalendar cmfCalendar);

    /**
     * 新增日程安排
     * 
     * @param cmfCalendar 日程安排
     * @return 结果
     */
    public int insertCmfCalendar(CmfCalendar cmfCalendar);

    /**
     * 修改日程安排
     * 
     * @param cmfCalendar 日程安排
     * @return 结果
     */
    public int updateCmfCalendar(CmfCalendar cmfCalendar);

    /**
     * 删除日程安排
     * 
     * @param id 日程安排主键
     * @return 结果
     */
    public int deleteCmfCalendarById(Long id);

    /**
     * 批量删除日程安排
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfCalendarByIds(Long[] ids);
}
