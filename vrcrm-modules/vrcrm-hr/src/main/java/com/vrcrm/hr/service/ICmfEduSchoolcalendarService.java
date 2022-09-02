package com.vrcrm.hr.service;

import java.util.List;
import com.vrcrm.hr.domain.CmfEduSchoolcalendar;

/**
 * 校历Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfEduSchoolcalendarService 
{
    /**
     * 查询校历
     * 
     * @param id 校历主键
     * @return 校历
     */
    public CmfEduSchoolcalendar selectCmfEduSchoolcalendarById(Integer id);

    /**
     * 查询校历列表
     * 
     * @param cmfEduSchoolcalendar 校历
     * @return 校历集合
     */
    public List<CmfEduSchoolcalendar> selectCmfEduSchoolcalendarList(CmfEduSchoolcalendar cmfEduSchoolcalendar);

    /**
     * 新增校历
     * 
     * @param cmfEduSchoolcalendar 校历
     * @return 结果
     */
    public int insertCmfEduSchoolcalendar(CmfEduSchoolcalendar cmfEduSchoolcalendar);

    /**
     * 修改校历
     * 
     * @param cmfEduSchoolcalendar 校历
     * @return 结果
     */
    public int updateCmfEduSchoolcalendar(CmfEduSchoolcalendar cmfEduSchoolcalendar);

    /**
     * 批量删除校历
     * 
     * @param ids 需要删除的校历主键集合
     * @return 结果
     */
    public int deleteCmfEduSchoolcalendarByIds(Integer[] ids);

    /**
     * 删除校历信息
     * 
     * @param id 校历主键
     * @return 结果
     */
    public int deleteCmfEduSchoolcalendarById(Integer id);
}
