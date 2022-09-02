package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfFixedassetstatusMapper;
import com.vrcrm.political.domain.CmfFixedassetstatus;
import com.vrcrm.political.service.ICmfFixedassetstatusService;

/**
 * 固定资产状态Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfFixedassetstatusServiceImpl implements ICmfFixedassetstatusService 
{
    @Autowired
    private CmfFixedassetstatusMapper cmfFixedassetstatusMapper;

    /**
     * 查询固定资产状态
     * 
     * @param id 固定资产状态主键
     * @return 固定资产状态
     */
    @Override
    public CmfFixedassetstatus selectCmfFixedassetstatusById(Integer id)
    {
        return cmfFixedassetstatusMapper.selectCmfFixedassetstatusById(id);
    }

    /**
     * 查询固定资产状态列表
     * 
     * @param cmfFixedassetstatus 固定资产状态
     * @return 固定资产状态
     */
    @Override
    public List<CmfFixedassetstatus> selectCmfFixedassetstatusList(CmfFixedassetstatus cmfFixedassetstatus)
    {
        return cmfFixedassetstatusMapper.selectCmfFixedassetstatusList(cmfFixedassetstatus);
    }

    /**
     * 新增固定资产状态
     * 
     * @param cmfFixedassetstatus 固定资产状态
     * @return 结果
     */
    @Override
    public int insertCmfFixedassetstatus(CmfFixedassetstatus cmfFixedassetstatus)
    {
        return cmfFixedassetstatusMapper.insertCmfFixedassetstatus(cmfFixedassetstatus);
    }

    /**
     * 修改固定资产状态
     * 
     * @param cmfFixedassetstatus 固定资产状态
     * @return 结果
     */
    @Override
    public int updateCmfFixedassetstatus(CmfFixedassetstatus cmfFixedassetstatus)
    {
        return cmfFixedassetstatusMapper.updateCmfFixedassetstatus(cmfFixedassetstatus);
    }

    /**
     * 批量删除固定资产状态
     * 
     * @param ids 需要删除的固定资产状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfFixedassetstatusByIds(Integer[] ids)
    {
        return cmfFixedassetstatusMapper.deleteCmfFixedassetstatusByIds(ids);
    }

    /**
     * 删除固定资产状态信息
     * 
     * @param id 固定资产状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfFixedassetstatusById(Integer id)
    {
        return cmfFixedassetstatusMapper.deleteCmfFixedassetstatusById(id);
    }
}
