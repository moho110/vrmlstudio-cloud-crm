package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfHrmsRPStatusMapper;
import com.vrcrm.hr.domain.CmfHrmsRPStatus;
import com.vrcrm.hr.service.ICmfHrmsRPStatusService;

/**
 * 奖惩状态Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfHrmsRPStatusServiceImpl implements ICmfHrmsRPStatusService 
{
    @Autowired
    private CmfHrmsRPStatusMapper cmfHrmsRPStatusMapper;

    /**
     * 查询奖惩状态
     * 
     * @param id 奖惩状态主键
     * @return 奖惩状态
     */
    @Override
    public CmfHrmsRPStatus selectCmfHrmsRPStatusById(Integer id)
    {
        return cmfHrmsRPStatusMapper.selectCmfHrmsRPStatusById(id);
    }

    /**
     * 查询奖惩状态列表
     * 
     * @param cmfHrmsRPStatus 奖惩状态
     * @return 奖惩状态
     */
    @Override
    public List<CmfHrmsRPStatus> selectCmfHrmsRPStatusList(CmfHrmsRPStatus cmfHrmsRPStatus)
    {
        return cmfHrmsRPStatusMapper.selectCmfHrmsRPStatusList(cmfHrmsRPStatus);
    }

    /**
     * 新增奖惩状态
     * 
     * @param cmfHrmsRPStatus 奖惩状态
     * @return 结果
     */
    @Override
    public int insertCmfHrmsRPStatus(CmfHrmsRPStatus cmfHrmsRPStatus)
    {
        return cmfHrmsRPStatusMapper.insertCmfHrmsRPStatus(cmfHrmsRPStatus);
    }

    /**
     * 修改奖惩状态
     * 
     * @param cmfHrmsRPStatus 奖惩状态
     * @return 结果
     */
    @Override
    public int updateCmfHrmsRPStatus(CmfHrmsRPStatus cmfHrmsRPStatus)
    {
        return cmfHrmsRPStatusMapper.updateCmfHrmsRPStatus(cmfHrmsRPStatus);
    }

    /**
     * 批量删除奖惩状态
     * 
     * @param ids 需要删除的奖惩状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsRPStatusByIds(Integer[] ids)
    {
        return cmfHrmsRPStatusMapper.deleteCmfHrmsRPStatusByIds(ids);
    }

    /**
     * 删除奖惩状态信息
     * 
     * @param id 奖惩状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsRPStatusById(Integer id)
    {
        return cmfHrmsRPStatusMapper.deleteCmfHrmsRPStatusById(id);
    }
}
