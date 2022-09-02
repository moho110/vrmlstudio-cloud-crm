package com.vrcrm.basicdata.service;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfCrmDictServicestatus;

/**
 * 服务状态Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfCrmDictServicestatusService 
{
    /**
     * 查询服务状态
     * 
     * @param id 服务状态主键
     * @return 服务状态
     */
    public CmfCrmDictServicestatus selectCmfCrmDictServicestatusById(Integer id);

    /**
     * 查询服务状态列表
     * 
     * @param cmfCrmDictServicestatus 服务状态
     * @return 服务状态集合
     */
    public List<CmfCrmDictServicestatus> selectCmfCrmDictServicestatusList(CmfCrmDictServicestatus cmfCrmDictServicestatus);

    /**
     * 新增服务状态
     * 
     * @param cmfCrmDictServicestatus 服务状态
     * @return 结果
     */
    public int insertCmfCrmDictServicestatus(CmfCrmDictServicestatus cmfCrmDictServicestatus);

    /**
     * 修改服务状态
     * 
     * @param cmfCrmDictServicestatus 服务状态
     * @return 结果
     */
    public int updateCmfCrmDictServicestatus(CmfCrmDictServicestatus cmfCrmDictServicestatus);

    /**
     * 批量删除服务状态
     * 
     * @param ids 需要删除的服务状态主键集合
     * @return 结果
     */
    public int deleteCmfCrmDictServicestatusByIds(Integer[] ids);

    /**
     * 删除服务状态信息
     * 
     * @param id 服务状态主键
     * @return 结果
     */
    public int deleteCmfCrmDictServicestatusById(Integer id);
}
