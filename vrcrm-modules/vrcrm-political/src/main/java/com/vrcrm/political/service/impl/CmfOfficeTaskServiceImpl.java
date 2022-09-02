package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfOfficeTaskMapper;
import com.vrcrm.political.domain.CmfOfficeTask;
import com.vrcrm.political.service.ICmfOfficeTaskService;

/**
 * 办公任务Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfOfficeTaskServiceImpl implements ICmfOfficeTaskService 
{
    @Autowired
    private CmfOfficeTaskMapper cmfOfficeTaskMapper;

    /**
     * 查询办公任务
     * 
     * @param id 办公任务主键
     * @return 办公任务
     */
    @Override
    public CmfOfficeTask selectCmfOfficeTaskById(Integer id)
    {
        return cmfOfficeTaskMapper.selectCmfOfficeTaskById(id);
    }

    /**
     * 查询办公任务列表
     * 
     * @param cmfOfficeTask 办公任务
     * @return 办公任务
     */
    @Override
    public List<CmfOfficeTask> selectCmfOfficeTaskList(CmfOfficeTask cmfOfficeTask)
    {
        return cmfOfficeTaskMapper.selectCmfOfficeTaskList(cmfOfficeTask);
    }

    /**
     * 新增办公任务
     * 
     * @param cmfOfficeTask 办公任务
     * @return 结果
     */
    @Override
    public int insertCmfOfficeTask(CmfOfficeTask cmfOfficeTask)
    {
        return cmfOfficeTaskMapper.insertCmfOfficeTask(cmfOfficeTask);
    }

    /**
     * 修改办公任务
     * 
     * @param cmfOfficeTask 办公任务
     * @return 结果
     */
    @Override
    public int updateCmfOfficeTask(CmfOfficeTask cmfOfficeTask)
    {
        return cmfOfficeTaskMapper.updateCmfOfficeTask(cmfOfficeTask);
    }

    /**
     * 批量删除办公任务
     * 
     * @param ids 需要删除的办公任务主键
     * @return 结果
     */
    @Override
    public int deleteCmfOfficeTaskByIds(Integer[] ids)
    {
        return cmfOfficeTaskMapper.deleteCmfOfficeTaskByIds(ids);
    }

    /**
     * 删除办公任务信息
     * 
     * @param id 办公任务主键
     * @return 结果
     */
    @Override
    public int deleteCmfOfficeTaskById(Integer id)
    {
        return cmfOfficeTaskMapper.deleteCmfOfficeTaskById(id);
    }
}
