package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfDictEducation;

/**
 * 教育明细Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfDictEducationMapper 
{
    /**
     * 查询教育明细
     * 
     * @param id 教育明细主键
     * @return 教育明细
     */
    public CmfDictEducation selectCmfDictEducationById(Integer id);

    /**
     * 查询教育明细列表
     * 
     * @param cmfDictEducation 教育明细
     * @return 教育明细集合
     */
    public List<CmfDictEducation> selectCmfDictEducationList(CmfDictEducation cmfDictEducation);

    /**
     * 新增教育明细
     * 
     * @param cmfDictEducation 教育明细
     * @return 结果
     */
    public int insertCmfDictEducation(CmfDictEducation cmfDictEducation);

    /**
     * 修改教育明细
     * 
     * @param cmfDictEducation 教育明细
     * @return 结果
     */
    public int updateCmfDictEducation(CmfDictEducation cmfDictEducation);

    /**
     * 删除教育明细
     * 
     * @param id 教育明细主键
     * @return 结果
     */
    public int deleteCmfDictEducationById(Integer id);

    /**
     * 批量删除教育明细
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfDictEducationByIds(Integer[] ids);
}
