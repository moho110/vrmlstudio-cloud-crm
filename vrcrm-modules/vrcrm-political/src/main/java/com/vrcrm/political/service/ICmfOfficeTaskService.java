package com.vrcrm.political.service;

import java.util.List;
import com.vrcrm.political.domain.CmfOfficeTask;

/**
 * 办公任务Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfOfficeTaskService 
{
    /**
     * 查询办公任务
     * 
     * @param id 办公任务主键
     * @return 办公任务
     */
    public CmfOfficeTask selectCmfOfficeTaskById(Integer id);

    /**
     * 查询办公任务列表
     * 
     * @param cmfOfficeTask 办公任务
     * @return 办公任务集合
     */
    public List<CmfOfficeTask> selectCmfOfficeTaskList(CmfOfficeTask cmfOfficeTask);

    /**
     * 新增办公任务
     * 
     * @param cmfOfficeTask 办公任务
     * @return 结果
     */
    public int insertCmfOfficeTask(CmfOfficeTask cmfOfficeTask);

    /**
     * 修改办公任务
     * 
     * @param cmfOfficeTask 办公任务
     * @return 结果
     */
    public int updateCmfOfficeTask(CmfOfficeTask cmfOfficeTask);

    /**
     * 批量删除办公任务
     * 
     * @param ids 需要删除的办公任务主键集合
     * @return 结果
     */
    public int deleteCmfOfficeTaskByIds(Integer[] ids);

    /**
     * 删除办公任务信息
     * 
     * @param id 办公任务主键
     * @return 结果
     */
    public int deleteCmfOfficeTaskById(Integer id);
}
