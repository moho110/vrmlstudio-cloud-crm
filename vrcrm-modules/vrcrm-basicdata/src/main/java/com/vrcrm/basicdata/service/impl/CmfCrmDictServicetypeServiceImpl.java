package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfCrmDictServicetypeMapper;
import com.vrcrm.basicdata.domain.CmfCrmDictServicetype;
import com.vrcrm.basicdata.service.ICmfCrmDictServicetypeService;

/**
 * 服务类型Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfCrmDictServicetypeServiceImpl implements ICmfCrmDictServicetypeService 
{
    @Autowired
    private CmfCrmDictServicetypeMapper cmfCrmDictServicetypeMapper;

    /**
     * 查询服务类型
     * 
     * @param id 服务类型主键
     * @return 服务类型
     */
    @Override
    public CmfCrmDictServicetype selectCmfCrmDictServicetypeById(Integer id)
    {
        return cmfCrmDictServicetypeMapper.selectCmfCrmDictServicetypeById(id);
    }

    /**
     * 查询服务类型列表
     * 
     * @param cmfCrmDictServicetype 服务类型
     * @return 服务类型
     */
    @Override
    public List<CmfCrmDictServicetype> selectCmfCrmDictServicetypeList(CmfCrmDictServicetype cmfCrmDictServicetype)
    {
        return cmfCrmDictServicetypeMapper.selectCmfCrmDictServicetypeList(cmfCrmDictServicetype);
    }

    /**
     * 新增服务类型
     * 
     * @param cmfCrmDictServicetype 服务类型
     * @return 结果
     */
    @Override
    public int insertCmfCrmDictServicetype(CmfCrmDictServicetype cmfCrmDictServicetype)
    {
        return cmfCrmDictServicetypeMapper.insertCmfCrmDictServicetype(cmfCrmDictServicetype);
    }

    /**
     * 修改服务类型
     * 
     * @param cmfCrmDictServicetype 服务类型
     * @return 结果
     */
    @Override
    public int updateCmfCrmDictServicetype(CmfCrmDictServicetype cmfCrmDictServicetype)
    {
        return cmfCrmDictServicetypeMapper.updateCmfCrmDictServicetype(cmfCrmDictServicetype);
    }

    /**
     * 批量删除服务类型
     * 
     * @param ids 需要删除的服务类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmDictServicetypeByIds(Integer[] ids)
    {
        return cmfCrmDictServicetypeMapper.deleteCmfCrmDictServicetypeByIds(ids);
    }

    /**
     * 删除服务类型信息
     * 
     * @param id 服务类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmDictServicetypeById(Integer id)
    {
        return cmfCrmDictServicetypeMapper.deleteCmfCrmDictServicetypeById(id);
    }
}
