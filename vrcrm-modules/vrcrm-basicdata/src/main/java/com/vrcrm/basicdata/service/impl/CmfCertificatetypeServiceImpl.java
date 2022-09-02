package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfCertificatetypeMapper;
import com.vrcrm.basicdata.domain.CmfCertificatetype;
import com.vrcrm.basicdata.service.ICmfCertificatetypeService;

/**
 * 认证类型Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfCertificatetypeServiceImpl implements ICmfCertificatetypeService 
{
    @Autowired
    private CmfCertificatetypeMapper cmfCertificatetypeMapper;

    /**
     * 查询认证类型
     * 
     * @param id 认证类型主键
     * @return 认证类型
     */
    @Override
    public CmfCertificatetype selectCmfCertificatetypeById(Integer id)
    {
        return cmfCertificatetypeMapper.selectCmfCertificatetypeById(id);
    }

    /**
     * 查询认证类型列表
     * 
     * @param cmfCertificatetype 认证类型
     * @return 认证类型
     */
    @Override
    public List<CmfCertificatetype> selectCmfCertificatetypeList(CmfCertificatetype cmfCertificatetype)
    {
        return cmfCertificatetypeMapper.selectCmfCertificatetypeList(cmfCertificatetype);
    }

    /**
     * 新增认证类型
     * 
     * @param cmfCertificatetype 认证类型
     * @return 结果
     */
    @Override
    public int insertCmfCertificatetype(CmfCertificatetype cmfCertificatetype)
    {
        return cmfCertificatetypeMapper.insertCmfCertificatetype(cmfCertificatetype);
    }

    /**
     * 修改认证类型
     * 
     * @param cmfCertificatetype 认证类型
     * @return 结果
     */
    @Override
    public int updateCmfCertificatetype(CmfCertificatetype cmfCertificatetype)
    {
        return cmfCertificatetypeMapper.updateCmfCertificatetype(cmfCertificatetype);
    }

    /**
     * 批量删除认证类型
     * 
     * @param ids 需要删除的认证类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfCertificatetypeByIds(Integer[] ids)
    {
        return cmfCertificatetypeMapper.deleteCmfCertificatetypeByIds(ids);
    }

    /**
     * 删除认证类型信息
     * 
     * @param id 认证类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfCertificatetypeById(Integer id)
    {
        return cmfCertificatetypeMapper.deleteCmfCertificatetypeById(id);
    }
}
