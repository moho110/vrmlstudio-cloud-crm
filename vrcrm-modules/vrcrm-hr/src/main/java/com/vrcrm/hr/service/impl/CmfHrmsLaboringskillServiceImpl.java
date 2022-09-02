package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfHrmsLaboringskillMapper;
import com.vrcrm.hr.domain.CmfHrmsLaboringskill;
import com.vrcrm.hr.service.ICmfHrmsLaboringskillService;

/**
 * 人员技能Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfHrmsLaboringskillServiceImpl implements ICmfHrmsLaboringskillService 
{
    @Autowired
    private CmfHrmsLaboringskillMapper cmfHrmsLaboringskillMapper;

    /**
     * 查询人员技能
     * 
     * @param id 人员技能主键
     * @return 人员技能
     */
    @Override
    public CmfHrmsLaboringskill selectCmfHrmsLaboringskillById(Integer id)
    {
        return cmfHrmsLaboringskillMapper.selectCmfHrmsLaboringskillById(id);
    }

    /**
     * 查询人员技能列表
     * 
     * @param cmfHrmsLaboringskill 人员技能
     * @return 人员技能
     */
    @Override
    public List<CmfHrmsLaboringskill> selectCmfHrmsLaboringskillList(CmfHrmsLaboringskill cmfHrmsLaboringskill)
    {
        return cmfHrmsLaboringskillMapper.selectCmfHrmsLaboringskillList(cmfHrmsLaboringskill);
    }

    /**
     * 新增人员技能
     * 
     * @param cmfHrmsLaboringskill 人员技能
     * @return 结果
     */
    @Override
    public int insertCmfHrmsLaboringskill(CmfHrmsLaboringskill cmfHrmsLaboringskill)
    {
        return cmfHrmsLaboringskillMapper.insertCmfHrmsLaboringskill(cmfHrmsLaboringskill);
    }

    /**
     * 修改人员技能
     * 
     * @param cmfHrmsLaboringskill 人员技能
     * @return 结果
     */
    @Override
    public int updateCmfHrmsLaboringskill(CmfHrmsLaboringskill cmfHrmsLaboringskill)
    {
        return cmfHrmsLaboringskillMapper.updateCmfHrmsLaboringskill(cmfHrmsLaboringskill);
    }

    /**
     * 批量删除人员技能
     * 
     * @param ids 需要删除的人员技能主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsLaboringskillByIds(Integer[] ids)
    {
        return cmfHrmsLaboringskillMapper.deleteCmfHrmsLaboringskillByIds(ids);
    }

    /**
     * 删除人员技能信息
     * 
     * @param id 人员技能主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsLaboringskillById(Integer id)
    {
        return cmfHrmsLaboringskillMapper.deleteCmfHrmsLaboringskillById(id);
    }
}
