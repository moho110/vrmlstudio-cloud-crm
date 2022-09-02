package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfEduSchoolcalendarMapper;
import com.vrcrm.hr.domain.CmfEduSchoolcalendar;
import com.vrcrm.hr.service.ICmfEduSchoolcalendarService;

/**
 * 校历Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfEduSchoolcalendarServiceImpl implements ICmfEduSchoolcalendarService 
{
    @Autowired
    private CmfEduSchoolcalendarMapper cmfEduSchoolcalendarMapper;

    /**
     * 查询校历
     * 
     * @param id 校历主键
     * @return 校历
     */
    @Override
    public CmfEduSchoolcalendar selectCmfEduSchoolcalendarById(Integer id)
    {
        return cmfEduSchoolcalendarMapper.selectCmfEduSchoolcalendarById(id);
    }

    /**
     * 查询校历列表
     * 
     * @param cmfEduSchoolcalendar 校历
     * @return 校历
     */
    @Override
    public List<CmfEduSchoolcalendar> selectCmfEduSchoolcalendarList(CmfEduSchoolcalendar cmfEduSchoolcalendar)
    {
        return cmfEduSchoolcalendarMapper.selectCmfEduSchoolcalendarList(cmfEduSchoolcalendar);
    }

    /**
     * 新增校历
     * 
     * @param cmfEduSchoolcalendar 校历
     * @return 结果
     */
    @Override
    public int insertCmfEduSchoolcalendar(CmfEduSchoolcalendar cmfEduSchoolcalendar)
    {
        return cmfEduSchoolcalendarMapper.insertCmfEduSchoolcalendar(cmfEduSchoolcalendar);
    }

    /**
     * 修改校历
     * 
     * @param cmfEduSchoolcalendar 校历
     * @return 结果
     */
    @Override
    public int updateCmfEduSchoolcalendar(CmfEduSchoolcalendar cmfEduSchoolcalendar)
    {
        return cmfEduSchoolcalendarMapper.updateCmfEduSchoolcalendar(cmfEduSchoolcalendar);
    }

    /**
     * 批量删除校历
     * 
     * @param ids 需要删除的校历主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduSchoolcalendarByIds(Integer[] ids)
    {
        return cmfEduSchoolcalendarMapper.deleteCmfEduSchoolcalendarByIds(ids);
    }

    /**
     * 删除校历信息
     * 
     * @param id 校历主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduSchoolcalendarById(Integer id)
    {
        return cmfEduSchoolcalendarMapper.deleteCmfEduSchoolcalendarById(id);
    }
}
