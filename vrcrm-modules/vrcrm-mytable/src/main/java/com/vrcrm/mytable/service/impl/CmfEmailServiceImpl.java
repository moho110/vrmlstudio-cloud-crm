package com.vrcrm.mytable.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.mytable.mapper.CmfEmailMapper;
import com.vrcrm.mytable.domain.CmfEmail;
import com.vrcrm.mytable.service.ICmfEmailService;

/**
 * 发送邮件Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfEmailServiceImpl implements ICmfEmailService 
{
    @Autowired
    private CmfEmailMapper cmfEmailMapper;

    /**
     * 查询发送邮件
     * 
     * @param id 发送邮件主键
     * @return 发送邮件
     */
    @Override
    public CmfEmail selectCmfEmailById(Integer id)
    {
        return cmfEmailMapper.selectCmfEmailById(id);
    }

    /**
     * 查询发送邮件列表
     * 
     * @param cmfEmail 发送邮件
     * @return 发送邮件
     */
    @Override
    public List<CmfEmail> selectCmfEmailList(CmfEmail cmfEmail)
    {
        return cmfEmailMapper.selectCmfEmailList(cmfEmail);
    }

    /**
     * 新增发送邮件
     * 
     * @param cmfEmail 发送邮件
     * @return 结果
     */
    @Override
    public int insertCmfEmail(CmfEmail cmfEmail)
    {
        return cmfEmailMapper.insertCmfEmail(cmfEmail);
    }

    /**
     * 修改发送邮件
     * 
     * @param cmfEmail 发送邮件
     * @return 结果
     */
    @Override
    public int updateCmfEmail(CmfEmail cmfEmail)
    {
        return cmfEmailMapper.updateCmfEmail(cmfEmail);
    }

    /**
     * 批量删除发送邮件
     * 
     * @param ids 需要删除的发送邮件主键
     * @return 结果
     */
    @Override
    public int deleteCmfEmailByIds(Integer[] ids)
    {
        return cmfEmailMapper.deleteCmfEmailByIds(ids);
    }

    /**
     * 删除发送邮件信息
     * 
     * @param id 发送邮件主键
     * @return 结果
     */
    @Override
    public int deleteCmfEmailById(Integer id)
    {
        return cmfEmailMapper.deleteCmfEmailById(id);
    }
}
