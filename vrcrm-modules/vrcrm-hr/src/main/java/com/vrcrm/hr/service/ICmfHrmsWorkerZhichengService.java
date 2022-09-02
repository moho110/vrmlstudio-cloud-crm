package com.vrcrm.hr.service;

import java.util.List;
import com.vrcrm.hr.domain.CmfHrmsWorkerZhicheng;

/**
 * 工作人员职称Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfHrmsWorkerZhichengService 
{
    /**
     * 查询工作人员职称
     * 
     * @param id 工作人员职称主键
     * @return 工作人员职称
     */
    public CmfHrmsWorkerZhicheng selectCmfHrmsWorkerZhichengById(Integer id);

    /**
     * 查询工作人员职称列表
     * 
     * @param cmfHrmsWorkerZhicheng 工作人员职称
     * @return 工作人员职称集合
     */
    public List<CmfHrmsWorkerZhicheng> selectCmfHrmsWorkerZhichengList(CmfHrmsWorkerZhicheng cmfHrmsWorkerZhicheng);

    /**
     * 新增工作人员职称
     * 
     * @param cmfHrmsWorkerZhicheng 工作人员职称
     * @return 结果
     */
    public int insertCmfHrmsWorkerZhicheng(CmfHrmsWorkerZhicheng cmfHrmsWorkerZhicheng);

    /**
     * 修改工作人员职称
     * 
     * @param cmfHrmsWorkerZhicheng 工作人员职称
     * @return 结果
     */
    public int updateCmfHrmsWorkerZhicheng(CmfHrmsWorkerZhicheng cmfHrmsWorkerZhicheng);

    /**
     * 批量删除工作人员职称
     * 
     * @param ids 需要删除的工作人员职称主键集合
     * @return 结果
     */
    public int deleteCmfHrmsWorkerZhichengByIds(Integer[] ids);

    /**
     * 删除工作人员职称信息
     * 
     * @param id 工作人员职称主键
     * @return 结果
     */
    public int deleteCmfHrmsWorkerZhichengById(Integer id);
}
