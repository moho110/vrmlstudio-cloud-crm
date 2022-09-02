package com.vrcrm.basicdata.mapper;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfCrmDictServicesource;

/**
 * 服务来源Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfCrmDictServicesourceMapper 
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
     * 删除服务来源
     * 
     * @param id 服务来源主键
     * @return 结果
     */
    public int deleteCmfCrmDictServicesourceById(Integer id);

    /**
     * 批量删除服务来源
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfCrmDictServicesourceByIds(Integer[] ids);
}
