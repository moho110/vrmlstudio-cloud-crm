package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfHrmsWorkexperienceMapper;
import com.vrcrm.hr.domain.CmfHrmsWorkexperience;
import com.vrcrm.hr.service.ICmfHrmsWorkexperienceService;

/**
 * 工作人员工作经验Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfHrmsWorkexperienceServiceImpl implements ICmfHrmsWorkexperienceService 
{
    @Autowired
    private CmfHrmsWorkexperienceMapper cmfHrmsWorkexperienceMapper;

    /**
     * 查询工作人员工作经验
     * 
     * @param id 工作人员工作经验主键
     * @return 工作人员工作经验
     */
    @Override
    public CmfHrmsWorkexperience selectCmfHrmsWorkexperienceById(Integer id)
    {
        return cmfHrmsWorkexperienceMapper.selectCmfHrmsWorkexperienceById(id);
    }

    /**
     * 查询工作人员工作经验列表
     * 
     * @param cmfHrmsWorkexperience 工作人员工作经验
     * @return 工作人员工作经验
     */
    @Override
    public List<CmfHrmsWorkexperience> selectCmfHrmsWorkexperienceList(CmfHrmsWorkexperience cmfHrmsWorkexperience)
    {
        return cmfHrmsWorkexperienceMapper.selectCmfHrmsWorkexperienceList(cmfHrmsWorkexperience);
    }

    /**
     * 新增工作人员工作经验
     * 
     * @param cmfHrmsWorkexperience 工作人员工作经验
     * @return 结果
     */
    @Override
    public int insertCmfHrmsWorkexperience(CmfHrmsWorkexperience cmfHrmsWorkexperience)
    {
        return cmfHrmsWorkexperienceMapper.insertCmfHrmsWorkexperience(cmfHrmsWorkexperience);
    }

    /**
     * 修改工作人员工作经验
     * 
     * @param cmfHrmsWorkexperience 工作人员工作经验
     * @return 结果
     */
    @Override
    public int updateCmfHrmsWorkexperience(CmfHrmsWorkexperience cmfHrmsWorkexperience)
    {
        return cmfHrmsWorkexperienceMapper.updateCmfHrmsWorkexperience(cmfHrmsWorkexperience);
    }

    /**
     * 批量删除工作人员工作经验
     * 
     * @param ids 需要删除的工作人员工作经验主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsWorkexperienceByIds(Integer[] ids)
    {
        return cmfHrmsWorkexperienceMapper.deleteCmfHrmsWorkexperienceByIds(ids);
    }

    /**
     * 删除工作人员工作经验信息
     * 
     * @param id 工作人员工作经验主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsWorkexperienceById(Integer id)
    {
        return cmfHrmsWorkexperienceMapper.deleteCmfHrmsWorkexperienceById(id);
    }
}
