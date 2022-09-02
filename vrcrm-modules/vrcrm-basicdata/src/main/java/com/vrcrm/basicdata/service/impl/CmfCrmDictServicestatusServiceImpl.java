package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfCrmDictServicestatusMapper;
import com.vrcrm.basicdata.domain.CmfCrmDictServicestatus;
import com.vrcrm.basicdata.service.ICmfCrmDictServicestatusService;

/**
 * 服务状态Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfCrmDictServicestatusServiceImpl implements ICmfCrmDictServicestatusService 
{
    @Autowired
    private CmfCrmDictServicestatusMapper cmfCrmDictServicestatusMapper;

    /**
     * 查询服务状态
     * 
     * @param id 服务状态主键
     * @return 服务状态
     */
    @Override
    public CmfCrmDictServicestatus selectCmfCrmDictServicestatusById(Integer id)
    {
        return cmfCrmDictServicestatusMapper.selectCmfCrmDictServicestatusById(id);
    }

    /**
     * 查询服务状态列表
     * 
     * @param cmfCrmDictServicestatus 服务状态
     * @return 服务状态
     */
    @Override
    public List<CmfCrmDictServicestatus> selectCmfCrmDictServicestatusList(CmfCrmDictServicestatus cmfCrmDictServicestatus)
    {
        return cmfCrmDictServicestatusMapper.selectCmfCrmDictServicestatusList(cmfCrmDictServicestatus);
    }

    /**
     * 新增服务状态
     * 
     * @param cmfCrmDictServicestatus 服务状态
     * @return 结果
     */
    @Override
    public int insertCmfCrmDictServicestatus(CmfCrmDictServicestatus cmfCrmDictServicestatus)
    {
        return cmfCrmDictServicestatusMapper.insertCmfCrmDictServicestatus(cmfCrmDictServicestatus);
    }

    /**
     * 修改服务状态
     * 
     * @param cmfCrmDictServicestatus 服务状态
     * @return 结果
     */
    @Override
    public int updateCmfCrmDictServicestatus(CmfCrmDictServicestatus cmfCrmDictServicestatus)
    {
        return cmfCrmDictServicestatusMapper.updateCmfCrmDictServicestatus(cmfCrmDictServicestatus);
    }

    /**
     * 批量删除服务状态
     * 
     * @param ids 需要删除的服务状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmDictServicestatusByIds(Integer[] ids)
    {
        return cmfCrmDictServicestatusMapper.deleteCmfCrmDictServicestatusByIds(ids);
    }

    /**
     * 删除服务状态信息
     * 
     * @param id 服务状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmDictServicestatusById(Integer id)
    {
        return cmfCrmDictServicestatusMapper.deleteCmfCrmDictServicestatusById(id);
    }
}
