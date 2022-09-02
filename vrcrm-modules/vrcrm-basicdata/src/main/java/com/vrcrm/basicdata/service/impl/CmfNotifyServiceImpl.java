package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfNotifyMapper;
import com.vrcrm.basicdata.domain.CmfNotify;
import com.vrcrm.basicdata.service.ICmfNotifyService;

/**
 * 公告通知Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfNotifyServiceImpl implements ICmfNotifyService 
{
    @Autowired
    private CmfNotifyMapper cmfNotifyMapper;

    /**
     * 查询公告通知
     * 
     * @param id 公告通知主键
     * @return 公告通知
     */
    @Override
    public CmfNotify selectCmfNotifyById(Integer id)
    {
        return cmfNotifyMapper.selectCmfNotifyById(id);
    }

    /**
     * 查询公告通知列表
     * 
     * @param cmfNotify 公告通知
     * @return 公告通知
     */
    @Override
    public List<CmfNotify> selectCmfNotifyList(CmfNotify cmfNotify)
    {
        return cmfNotifyMapper.selectCmfNotifyList(cmfNotify);
    }

    /**
     * 新增公告通知
     * 
     * @param cmfNotify 公告通知
     * @return 结果
     */
    @Override
    public int insertCmfNotify(CmfNotify cmfNotify)
    {
        return cmfNotifyMapper.insertCmfNotify(cmfNotify);
    }

    /**
     * 修改公告通知
     * 
     * @param cmfNotify 公告通知
     * @return 结果
     */
    @Override
    public int updateCmfNotify(CmfNotify cmfNotify)
    {
        return cmfNotifyMapper.updateCmfNotify(cmfNotify);
    }

    /**
     * 批量删除公告通知
     * 
     * @param ids 需要删除的公告通知主键
     * @return 结果
     */
    @Override
    public int deleteCmfNotifyByIds(Integer[] ids)
    {
        return cmfNotifyMapper.deleteCmfNotifyByIds(ids);
    }

    /**
     * 删除公告通知信息
     * 
     * @param id 公告通知主键
     * @return 结果
     */
    @Override
    public int deleteCmfNotifyById(Integer id)
    {
        return cmfNotifyMapper.deleteCmfNotifyById(id);
    }
}
