package com.vrcrm.mytable.mapper;

import java.util.List;
import com.vrcrm.mytable.domain.CmfEmail;

/**
 * 发送邮件Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfEmailMapper 
{
    /**
     * 查询发送邮件
     * 
     * @param id 发送邮件主键
     * @return 发送邮件
     */
    public CmfEmail selectCmfEmailById(Integer id);

    /**
     * 查询发送邮件列表
     * 
     * @param cmfEmail 发送邮件
     * @return 发送邮件集合
     */
    public List<CmfEmail> selectCmfEmailList(CmfEmail cmfEmail);

    /**
     * 新增发送邮件
     * 
     * @param cmfEmail 发送邮件
     * @return 结果
     */
    public int insertCmfEmail(CmfEmail cmfEmail);

    /**
     * 修改发送邮件
     * 
     * @param cmfEmail 发送邮件
     * @return 结果
     */
    public int updateCmfEmail(CmfEmail cmfEmail);

    /**
     * 删除发送邮件
     * 
     * @param id 发送邮件主键
     * @return 结果
     */
    public int deleteCmfEmailById(Integer id);

    /**
     * 批量删除发送邮件
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfEmailByIds(Integer[] ids);
}
