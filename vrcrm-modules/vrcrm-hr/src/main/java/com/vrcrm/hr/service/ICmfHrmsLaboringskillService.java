package com.vrcrm.hr.service;

import java.util.List;
import com.vrcrm.hr.domain.CmfHrmsLaboringskill;

/**
 * 人员技能Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfHrmsLaboringskillService 
{
    /**
     * 查询人员技能
     * 
     * @param id 人员技能主键
     * @return 人员技能
     */
    public CmfHrmsLaboringskill selectCmfHrmsLaboringskillById(Integer id);

    /**
     * 查询人员技能列表
     * 
     * @param cmfHrmsLaboringskill 人员技能
     * @return 人员技能集合
     */
    public List<CmfHrmsLaboringskill> selectCmfHrmsLaboringskillList(CmfHrmsLaboringskill cmfHrmsLaboringskill);

    /**
     * 新增人员技能
     * 
     * @param cmfHrmsLaboringskill 人员技能
     * @return 结果
     */
    public int insertCmfHrmsLaboringskill(CmfHrmsLaboringskill cmfHrmsLaboringskill);

    /**
     * 修改人员技能
     * 
     * @param cmfHrmsLaboringskill 人员技能
     * @return 结果
     */
    public int updateCmfHrmsLaboringskill(CmfHrmsLaboringskill cmfHrmsLaboringskill);

    /**
     * 批量删除人员技能
     * 
     * @param ids 需要删除的人员技能主键集合
     * @return 结果
     */
    public int deleteCmfHrmsLaboringskillByIds(Integer[] ids);

    /**
     * 删除人员技能信息
     * 
     * @param id 人员技能主键
     * @return 结果
     */
    public int deleteCmfHrmsLaboringskillById(Integer id);
}
