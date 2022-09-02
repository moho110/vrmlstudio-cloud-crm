package com.vrcrm.basicdata.service;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfNotify;

/**
 * 公告通知Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfNotifyService 
{
    /**
     * 查询公告通知
     * 
     * @param id 公告通知主键
     * @return 公告通知
     */
    public CmfNotify selectCmfNotifyById(Integer id);

    /**
     * 查询公告通知列表
     * 
     * @param cmfNotify 公告通知
     * @return 公告通知集合
     */
    public List<CmfNotify> selectCmfNotifyList(CmfNotify cmfNotify);

    /**
     * 新增公告通知
     * 
     * @param cmfNotify 公告通知
     * @return 结果
     */
    public int insertCmfNotify(CmfNotify cmfNotify);

    /**
     * 修改公告通知
     * 
     * @param cmfNotify 公告通知
     * @return 结果
     */
    public int updateCmfNotify(CmfNotify cmfNotify);

    /**
     * 批量删除公告通知
     * 
     * @param ids 需要删除的公告通知主键集合
     * @return 结果
     */
    public int deleteCmfNotifyByIds(Integer[] ids);

    /**
     * 删除公告通知信息
     * 
     * @param id 公告通知主键
     * @return 结果
     */
    public int deleteCmfNotifyById(Integer id);
}
