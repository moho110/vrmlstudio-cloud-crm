package com.vrcrm.mytable.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.mytable.mapper.CmfCalendarMapper;
import com.vrcrm.mytable.domain.CmfCalendar;
import com.vrcrm.mytable.service.ICmfCalendarService;

/**
 * 日程安排Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfCalendarServiceImpl implements ICmfCalendarService 
{
    @Autowired
    private CmfCalendarMapper cmfCalendarMapper;

    /**
     * 查询日程安排
     * 
     * @param id 日程安排主键
     * @return 日程安排
     */
    @Override
    public CmfCalendar selectCmfCalendarById(Long id)
    {
        return cmfCalendarMapper.selectCmfCalendarById(id);
    }

    /**
     * 查询日程安排列表
     * 
     * @param cmfCalendar 日程安排
     * @return 日程安排
     */
    @Override
    public List<CmfCalendar> selectCmfCalendarList(CmfCalendar cmfCalendar)
    {
        return cmfCalendarMapper.selectCmfCalendarList(cmfCalendar);
    }

    /**
     * 新增日程安排
     * 
     * @param cmfCalendar 日程安排
     * @return 结果
     */
    @Override
    public int insertCmfCalendar(CmfCalendar cmfCalendar)
    {
        return cmfCalendarMapper.insertCmfCalendar(cmfCalendar);
    }

    /**
     * 修改日程安排
     * 
     * @param cmfCalendar 日程安排
     * @return 结果
     */
    @Override
    public int updateCmfCalendar(CmfCalendar cmfCalendar)
    {
        return cmfCalendarMapper.updateCmfCalendar(cmfCalendar);
    }

    /**
     * 批量删除日程安排
     * 
     * @param ids 需要删除的日程安排主键
     * @return 结果
     */
    @Override
    public int deleteCmfCalendarByIds(Long[] ids)
    {
        return cmfCalendarMapper.deleteCmfCalendarByIds(ids);
    }

    /**
     * 删除日程安排信息
     * 
     * @param id 日程安排主键
     * @return 结果
     */
    @Override
    public int deleteCmfCalendarById(Long id)
    {
        return cmfCalendarMapper.deleteCmfCalendarById(id);
    }
}
