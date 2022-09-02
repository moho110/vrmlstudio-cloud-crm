package com.vrcrm.hr.service;

import java.util.List;
import com.vrcrm.hr.domain.CmfHrmsEducationalexperience;

/**
 * 教育经历Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfHrmsEducationalexperienceService 
{
    /**
     * 查询教育经历
     * 
     * @param id 教育经历主键
     * @return 教育经历
     */
    public CmfHrmsEducationalexperience selectCmfHrmsEducationalexperienceById(Integer id);

    /**
     * 查询教育经历列表
     * 
     * @param cmfHrmsEducationalexperience 教育经历
     * @return 教育经历集合
     */
    public List<CmfHrmsEducationalexperience> selectCmfHrmsEducationalexperienceList(CmfHrmsEducationalexperience cmfHrmsEducationalexperience);

    /**
     * 新增教育经历
     * 
     * @param cmfHrmsEducationalexperience 教育经历
     * @return 结果
     */
    public int insertCmfHrmsEducationalexperience(CmfHrmsEducationalexperience cmfHrmsEducationalexperience);

    /**
     * 修改教育经历
     * 
     * @param cmfHrmsEducationalexperience 教育经历
     * @return 结果
     */
    public int updateCmfHrmsEducationalexperience(CmfHrmsEducationalexperience cmfHrmsEducationalexperience);

    /**
     * 批量删除教育经历
     * 
     * @param ids 需要删除的教育经历主键集合
     * @return 结果
     */
    public int deleteCmfHrmsEducationalexperienceByIds(Integer[] ids);

    /**
     * 删除教育经历信息
     * 
     * @param id 教育经历主键
     * @return 结果
     */
    public int deleteCmfHrmsEducationalexperienceById(Integer id);
}
