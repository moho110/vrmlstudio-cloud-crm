package com.vrcrm.basicdata.service;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfCrmDictServicesource;

/**
 * 服务来源Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfCrmDictServicesourceService 
{
    /**
     * 查询服务来源
     * 
     * @param id 服务来源主键
     * @return 服务来源
     */
    public CmfCrmDictServicesource selectCmfCrmDictServicesourceById(Integer id);

    /**
     * 查询服务来源列表
     * 
     * @param cmfCrmDictServicesource 服务来源
     * @return 服务来源集合
     */
    public List<CmfCrmDictServicesource> selectCmfCrmDictServicesourceList(CmfCrmDictServicesource cmfCrmDictServicesource);

    /**
     * 新增服务来源
     * 
     * @param cmfCrmDictServicesource 服务来源
     * @return 结果
     */
    public int insertCmfCrmDictServicesource(CmfCrmDictServicesource cmfCrmDictServicesource);

    /**
     * 修改服务来源
     * 
     * @param cmfCrmDictServicesource 服务来源
     * @return 结果
     */
    public int updateCmfCrmDictServicesource(CmfCrmDictServicesource cmfCrmDictServicesource);

    /**
     * 批量删除服务来源
     * 
     * @param ids 需要删除的服务来源主键集合
     * @return 结果
     */
    public int deleteCmfCrmDictServicesourceByIds(Integer[] ids);

    /**
     * 删除服务来源信息
     * 
     * @param id 服务来源主键
     * @return 结果
     */
    public int deleteCmfCrmDictServicesourceById(Integer id);
}
