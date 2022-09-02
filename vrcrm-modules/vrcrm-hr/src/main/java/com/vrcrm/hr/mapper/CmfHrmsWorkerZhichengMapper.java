package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfHrmsWorkerZhicheng;

/**
 * 工作人员职称Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfHrmsWorkerZhichengMapper 
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
     * 删除工作人员职称
     * 
     * @param id 工作人员职称主键
     * @return 结果
     */
    public int deleteCmfHrmsWorkerZhichengById(Integer id);

    /**
     * 批量删除工作人员职称
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfHrmsWorkerZhichengByIds(Integer[] ids);
}
