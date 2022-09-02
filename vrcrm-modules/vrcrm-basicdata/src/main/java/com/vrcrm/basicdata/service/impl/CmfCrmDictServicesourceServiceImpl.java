package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfCrmDictServicesourceMapper;
import com.vrcrm.basicdata.domain.CmfCrmDictServicesource;
import com.vrcrm.basicdata.service.ICmfCrmDictServicesourceService;

/**
 * 服务来源Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfCrmDictServicesourceServiceImpl implements ICmfCrmDictServicesourceService 
{
    @Autowired
    private CmfCrmDictServicesourceMapper cmfCrmDictServicesourceMapper;

    /**
     * 查询服务来源
     * 
     * @param id 服务来源主键
     * @return 服务来源
     */
    @Override
    public CmfCrmDictServicesource selectCmfCrmDictServicesourceById(Integer id)
    {
        return cmfCrmDictServicesourceMapper.selectCmfCrmDictServicesourceById(id);
    }

    /**
     * 查询服务来源列表
     * 
     * @param cmfCrmDictServicesource 服务来源
     * @return 服务来源
     */
    @Override
    public List<CmfCrmDictServicesource> selectCmfCrmDictServicesourceList(CmfCrmDictServicesource cmfCrmDictServicesource)
    {
        return cmfCrmDictServicesourceMapper.selectCmfCrmDictServicesourceList(cmfCrmDictServicesource);
    }

    /**
     * 新增服务来源
     * 
     * @param cmfCrmDictServicesource 服务来源
     * @return 结果
     */
    @Override
    public int insertCmfCrmDictServicesource(CmfCrmDictServicesource cmfCrmDictServicesource)
    {
        return cmfCrmDictServicesourceMapper.insertCmfCrmDictServicesource(cmfCrmDictServicesource);
    }

    /**
     * 修改服务来源
     * 
     * @param cmfCrmDictServicesource 服务来源
     * @return 结果
     */
    @Override
    public int updateCmfCrmDictServicesource(CmfCrmDictServicesource cmfCrmDictServicesource)
    {
        return cmfCrmDictServicesourceMapper.updateCmfCrmDictServicesource(cmfCrmDictServicesource);
    }

    /**
     * 批量删除服务来源
     * 
     * @param ids 需要删除的服务来源主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmDictServicesourceByIds(Integer[] ids)
    {
        return cmfCrmDictServicesourceMapper.deleteCmfCrmDictServicesourceByIds(ids);
    }

    /**
     * 删除服务来源信息
     * 
     * @param id 服务来源主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmDictServicesourceById(Integer id)
    {
        return cmfCrmDictServicesourceMapper.deleteCmfCrmDictServicesourceById(id);
    }
}
