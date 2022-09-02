package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfCertificateMapper;
import com.vrcrm.basicdata.domain.CmfCertificate;
import com.vrcrm.basicdata.service.ICmfCertificateService;

/**
 * 认证Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfCertificateServiceImpl implements ICmfCertificateService 
{
    @Autowired
    private CmfCertificateMapper cmfCertificateMapper;

    /**
     * 查询认证
     * 
     * @param id 认证主键
     * @return 认证
     */
    @Override
    public CmfCertificate selectCmfCertificateById(Integer id)
    {
        return cmfCertificateMapper.selectCmfCertificateById(id);
    }

    /**
     * 查询认证列表
     * 
     * @param cmfCertificate 认证
     * @return 认证
     */
    @Override
    public List<CmfCertificate> selectCmfCertificateList(CmfCertificate cmfCertificate)
    {
        return cmfCertificateMapper.selectCmfCertificateList(cmfCertificate);
    }

    /**
     * 新增认证
     * 
     * @param cmfCertificate 认证
     * @return 结果
     */
    @Override
    public int insertCmfCertificate(CmfCertificate cmfCertificate)
    {
        return cmfCertificateMapper.insertCmfCertificate(cmfCertificate);
    }

    /**
     * 修改认证
     * 
     * @param cmfCertificate 认证
     * @return 结果
     */
    @Override
    public int updateCmfCertificate(CmfCertificate cmfCertificate)
    {
        return cmfCertificateMapper.updateCmfCertificate(cmfCertificate);
    }

    /**
     * 批量删除认证
     * 
     * @param ids 需要删除的认证主键
     * @return 结果
     */
    @Override
    public int deleteCmfCertificateByIds(Integer[] ids)
    {
        return cmfCertificateMapper.deleteCmfCertificateByIds(ids);
    }

    /**
     * 删除认证信息
     * 
     * @param id 认证主键
     * @return 结果
     */
    @Override
    public int deleteCmfCertificateById(Integer id)
    {
        return cmfCertificateMapper.deleteCmfCertificateById(id);
    }
}
