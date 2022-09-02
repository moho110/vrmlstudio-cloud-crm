package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfEduTeacherkaoqin;

/**
 * 教师考勤Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfEduTeacherkaoqinMapper 
{
    /**
     * 查询教师考勤
     * 
     * @param id 教师考勤主键
     * @return 教师考勤
     */
    public CmfEduTeacherkaoqin selectCmfEduTeacherkaoqinById(Integer id);

    /**
     * 查询教师考勤列表
     * 
     * @param cmfEduTeacherkaoqin 教师考勤
     * @return 教师考勤集合
     */
    public List<CmfEduTeacherkaoqin> selectCmfEduTeacherkaoqinList(CmfEduTeacherkaoqin cmfEduTeacherkaoqin);

    /**
     * 新增教师考勤
     * 
     * @param cmfEduTeacherkaoqin 教师考勤
     * @return 结果
     */
    public int insertCmfEduTeacherkaoqin(CmfEduTeacherkaoqin cmfEduTeacherkaoqin);

    /**
     * 修改教师考勤
     * 
     * @param cmfEduTeacherkaoqin 教师考勤
     * @return 结果
     */
    public int updateCmfEduTeacherkaoqin(CmfEduTeacherkaoqin cmfEduTeacherkaoqin);

    /**
     * 删除教师考勤
     * 
     * @param id 教师考勤主键
     * @return 结果
     */
    public int deleteCmfEduTeacherkaoqinById(Integer id);

    /**
     * 批量删除教师考勤
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfEduTeacherkaoqinByIds(Integer[] ids);
}
