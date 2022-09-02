package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfEduTeacherkaoqinMapper;
import com.vrcrm.hr.domain.CmfEduTeacherkaoqin;
import com.vrcrm.hr.service.ICmfEduTeacherkaoqinService;

/**
 * 教师考勤Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfEduTeacherkaoqinServiceImpl implements ICmfEduTeacherkaoqinService 
{
    @Autowired
    private CmfEduTeacherkaoqinMapper cmfEduTeacherkaoqinMapper;

    /**
     * 查询教师考勤
     * 
     * @param id 教师考勤主键
     * @return 教师考勤
     */
    @Override
    public CmfEduTeacherkaoqin selectCmfEduTeacherkaoqinById(Integer id)
    {
        return cmfEduTeacherkaoqinMapper.selectCmfEduTeacherkaoqinById(id);
    }

    /**
     * 查询教师考勤列表
     * 
     * @param cmfEduTeacherkaoqin 教师考勤
     * @return 教师考勤
     */
    @Override
    public List<CmfEduTeacherkaoqin> selectCmfEduTeacherkaoqinList(CmfEduTeacherkaoqin cmfEduTeacherkaoqin)
    {
        return cmfEduTeacherkaoqinMapper.selectCmfEduTeacherkaoqinList(cmfEduTeacherkaoqin);
    }

    /**
     * 新增教师考勤
     * 
     * @param cmfEduTeacherkaoqin 教师考勤
     * @return 结果
     */
    @Override
    public int insertCmfEduTeacherkaoqin(CmfEduTeacherkaoqin cmfEduTeacherkaoqin)
    {
        return cmfEduTeacherkaoqinMapper.insertCmfEduTeacherkaoqin(cmfEduTeacherkaoqin);
    }

    /**
     * 修改教师考勤
     * 
     * @param cmfEduTeacherkaoqin 教师考勤
     * @return 结果
     */
    @Override
    public int updateCmfEduTeacherkaoqin(CmfEduTeacherkaoqin cmfEduTeacherkaoqin)
    {
        return cmfEduTeacherkaoqinMapper.updateCmfEduTeacherkaoqin(cmfEduTeacherkaoqin);
    }

    /**
     * 批量删除教师考勤
     * 
     * @param ids 需要删除的教师考勤主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduTeacherkaoqinByIds(Integer[] ids)
    {
        return cmfEduTeacherkaoqinMapper.deleteCmfEduTeacherkaoqinByIds(ids);
    }

    /**
     * 删除教师考勤信息
     * 
     * @param id 教师考勤主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduTeacherkaoqinById(Integer id)
    {
        return cmfEduTeacherkaoqinMapper.deleteCmfEduTeacherkaoqinById(id);
    }
}
