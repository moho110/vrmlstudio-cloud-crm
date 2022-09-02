package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfHrmsEducationalexperienceMapper;
import com.vrcrm.hr.domain.CmfHrmsEducationalexperience;
import com.vrcrm.hr.service.ICmfHrmsEducationalexperienceService;

/**
 * 教育经历Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfHrmsEducationalexperienceServiceImpl implements ICmfHrmsEducationalexperienceService 
{
    @Autowired
    private CmfHrmsEducationalexperienceMapper cmfHrmsEducationalexperienceMapper;

    /**
     * 查询教育经历
     * 
     * @param id 教育经历主键
     * @return 教育经历
     */
    @Override
    public CmfHrmsEducationalexperience selectCmfHrmsEducationalexperienceById(Integer id)
    {
        return cmfHrmsEducationalexperienceMapper.selectCmfHrmsEducationalexperienceById(id);
    }

    /**
     * 查询教育经历列表
     * 
     * @param cmfHrmsEducationalexperience 教育经历
     * @return 教育经历
     */
    @Override
    public List<CmfHrmsEducationalexperience> selectCmfHrmsEducationalexperienceList(CmfHrmsEducationalexperience cmfHrmsEducationalexperience)
    {
        return cmfHrmsEducationalexperienceMapper.selectCmfHrmsEducationalexperienceList(cmfHrmsEducationalexperience);
    }

    /**
     * 新增教育经历
     * 
     * @param cmfHrmsEducationalexperience 教育经历
     * @return 结果
     */
    @Override
    public int insertCmfHrmsEducationalexperience(CmfHrmsEducationalexperience cmfHrmsEducationalexperience)
    {
        return cmfHrmsEducationalexperienceMapper.insertCmfHrmsEducationalexperience(cmfHrmsEducationalexperience);
    }

    /**
     * 修改教育经历
     * 
     * @param cmfHrmsEducationalexperience 教育经历
     * @return 结果
     */
    @Override
    public int updateCmfHrmsEducationalexperience(CmfHrmsEducationalexperience cmfHrmsEducationalexperience)
    {
        return cmfHrmsEducationalexperienceMapper.updateCmfHrmsEducationalexperience(cmfHrmsEducationalexperience);
    }

    /**
     * 批量删除教育经历
     * 
     * @param ids 需要删除的教育经历主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsEducationalexperienceByIds(Integer[] ids)
    {
        return cmfHrmsEducationalexperienceMapper.deleteCmfHrmsEducationalexperienceByIds(ids);
    }

    /**
     * 删除教育经历信息
     * 
     * @param id 教育经历主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsEducationalexperienceById(Integer id)
    {
        return cmfHrmsEducationalexperienceMapper.deleteCmfHrmsEducationalexperienceById(id);
    }
}
