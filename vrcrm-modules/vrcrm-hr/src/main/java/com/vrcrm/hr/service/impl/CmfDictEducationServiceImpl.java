package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfDictEducationMapper;
import com.vrcrm.hr.domain.CmfDictEducation;
import com.vrcrm.hr.service.ICmfDictEducationService;

/**
 * 教育明细Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfDictEducationServiceImpl implements ICmfDictEducationService 
{
    @Autowired
    private CmfDictEducationMapper cmfDictEducationMapper;

    /**
     * 查询教育明细
     * 
     * @param id 教育明细主键
     * @return 教育明细
     */
    @Override
    public CmfDictEducation selectCmfDictEducationById(Integer id)
    {
        return cmfDictEducationMapper.selectCmfDictEducationById(id);
    }

    /**
     * 查询教育明细列表
     * 
     * @param cmfDictEducation 教育明细
     * @return 教育明细
     */
    @Override
    public List<CmfDictEducation> selectCmfDictEducationList(CmfDictEducation cmfDictEducation)
    {
        return cmfDictEducationMapper.selectCmfDictEducationList(cmfDictEducation);
    }

    /**
     * 新增教育明细
     * 
     * @param cmfDictEducation 教育明细
     * @return 结果
     */
    @Override
    public int insertCmfDictEducation(CmfDictEducation cmfDictEducation)
    {
        return cmfDictEducationMapper.insertCmfDictEducation(cmfDictEducation);
    }

    /**
     * 修改教育明细
     * 
     * @param cmfDictEducation 教育明细
     * @return 结果
     */
    @Override
    public int updateCmfDictEducation(CmfDictEducation cmfDictEducation)
    {
        return cmfDictEducationMapper.updateCmfDictEducation(cmfDictEducation);
    }

    /**
     * 批量删除教育明细
     * 
     * @param ids 需要删除的教育明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfDictEducationByIds(Integer[] ids)
    {
        return cmfDictEducationMapper.deleteCmfDictEducationByIds(ids);
    }

    /**
     * 删除教育明细信息
     * 
     * @param id 教育明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfDictEducationById(Integer id)
    {
        return cmfDictEducationMapper.deleteCmfDictEducationById(id);
    }
}
