package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfMessageMapper;
import com.vrcrm.basicdata.domain.CmfMessage;
import com.vrcrm.basicdata.service.ICmfMessageService;

/**
 * 消息明细Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfMessageServiceImpl implements ICmfMessageService 
{
    @Autowired
    private CmfMessageMapper cmfMessageMapper;

    /**
     * 查询消息明细
     * 
     * @param id 消息明细主键
     * @return 消息明细
     */
    @Override
    public CmfMessage selectCmfMessageById(Integer id)
    {
        return cmfMessageMapper.selectCmfMessageById(id);
    }

    /**
     * 查询消息明细列表
     * 
     * @param cmfMessage 消息明细
     * @return 消息明细
     */
    @Override
    public List<CmfMessage> selectCmfMessageList(CmfMessage cmfMessage)
    {
        return cmfMessageMapper.selectCmfMessageList(cmfMessage);
    }

    /**
     * 新增消息明细
     * 
     * @param cmfMessage 消息明细
     * @return 结果
     */
    @Override
    public int insertCmfMessage(CmfMessage cmfMessage)
    {
        return cmfMessageMapper.insertCmfMessage(cmfMessage);
    }

    /**
     * 修改消息明细
     * 
     * @param cmfMessage 消息明细
     * @return 结果
     */
    @Override
    public int updateCmfMessage(CmfMessage cmfMessage)
    {
        return cmfMessageMapper.updateCmfMessage(cmfMessage);
    }

    /**
     * 批量删除消息明细
     * 
     * @param ids 需要删除的消息明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfMessageByIds(Integer[] ids)
    {
        return cmfMessageMapper.deleteCmfMessageByIds(ids);
    }

    /**
     * 删除消息明细信息
     * 
     * @param id 消息明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfMessageById(Integer id)
    {
        return cmfMessageMapper.deleteCmfMessageById(id);
    }
}
