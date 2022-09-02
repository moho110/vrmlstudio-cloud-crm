package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfHrmsWorkStatus;

/**
 * 工作人员状态Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfHrmsWorkStatusMapper 
{
    /**
     * 查询工作人员状态
     * 
     * @param id 工作人员状态主键
     * @return 工作人员状态
     */
    public CmfHrmsWorkStatus selectCmfHrmsWorkStatusById(Integer id);

    /**
     * 查询工作人员状态列表
     * 
     * @param cmfHrmsWorkStatus 工作人员状态
     * @return 工作人员状态集合
     */
    public List<CmfHrmsWorkStatus> selectCmfHrmsWorkStatusList(CmfHrmsWorkStatus cmfHrmsWorkStatus);

    /**
     * 新增工作人员状态
     * 
     * @param cmfHrmsWorkStatus 工作人员状态
     * @return 结果
     */
    public int insertCmfHrmsWorkStatus(CmfHrmsWorkStatus cmfHrmsWorkStatus);

    /**
     * 修改工作人员状态
     * 
     * @param cmfHrmsWorkStatus 工作人员状态
     * @return 结果
     */
    public int updateCmfHrmsWorkStatus(CmfHrmsWorkStatus cmfHrmsWorkStatus);

    /**
     * 删除工作人员状态
     * 
     * @param id 工作人员状态主键
     * @return 结果
     */
    public int deleteCmfHrmsWorkStatusById(Integer id);

    /**
     * 批量删除工作人员状态
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfHrmsWorkStatusByIds(Integer[] ids);
}
