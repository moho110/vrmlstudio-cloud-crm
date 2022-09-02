package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfHrmsWorkStatusMapper;
import com.vrcrm.hr.domain.CmfHrmsWorkStatus;
import com.vrcrm.hr.service.ICmfHrmsWorkStatusService;

/**
 * 工作人员状态Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfHrmsWorkStatusServiceImpl implements ICmfHrmsWorkStatusService 
{
    @Autowired
    private CmfHrmsWorkStatusMapper cmfHrmsWorkStatusMapper;

    /**
     * 查询工作人员状态
     * 
     * @param id 工作人员状态主键
     * @return 工作人员状态
     */
    @Override
    public CmfHrmsWorkStatus selectCmfHrmsWorkStatusById(Integer id)
    {
        return cmfHrmsWorkStatusMapper.selectCmfHrmsWorkStatusById(id);
    }

    /**
     * 查询工作人员状态列表
     * 
     * @param cmfHrmsWorkStatus 工作人员状态
     * @return 工作人员状态
     */
    @Override
    public List<CmfHrmsWorkStatus> selectCmfHrmsWorkStatusList(CmfHrmsWorkStatus cmfHrmsWorkStatus)
    {
        return cmfHrmsWorkStatusMapper.selectCmfHrmsWorkStatusList(cmfHrmsWorkStatus);
    }

    /**
     * 新增工作人员状态
     * 
     * @param cmfHrmsWorkStatus 工作人员状态
     * @return 结果
     */
    @Override
    public int insertCmfHrmsWorkStatus(CmfHrmsWorkStatus cmfHrmsWorkStatus)
    {
        return cmfHrmsWorkStatusMapper.insertCmfHrmsWorkStatus(cmfHrmsWorkStatus);
    }

    /**
     * 修改工作人员状态
     * 
     * @param cmfHrmsWorkStatus 工作人员状态
     * @return 结果
     */
    @Override
    public int updateCmfHrmsWorkStatus(CmfHrmsWorkStatus cmfHrmsWorkStatus)
    {
        return cmfHrmsWorkStatusMapper.updateCmfHrmsWorkStatus(cmfHrmsWorkStatus);
    }

    /**
     * 批量删除工作人员状态
     * 
     * @param ids 需要删除的工作人员状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsWorkStatusByIds(Integer[] ids)
    {
        return cmfHrmsWorkStatusMapper.deleteCmfHrmsWorkStatusByIds(ids);
    }

    /**
     * 删除工作人员状态信息
     * 
     * @param id 工作人员状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsWorkStatusById(Integer id)
    {
        return cmfHrmsWorkStatusMapper.deleteCmfHrmsWorkStatusById(id);
    }
}
