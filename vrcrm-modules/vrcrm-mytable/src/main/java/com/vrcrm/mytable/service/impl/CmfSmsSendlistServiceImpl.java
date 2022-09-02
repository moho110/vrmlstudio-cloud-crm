package com.vrcrm.mytable.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.mytable.mapper.CmfSmsSendlistMapper;
import com.vrcrm.mytable.domain.CmfSmsSendlist;
import com.vrcrm.mytable.service.ICmfSmsSendlistService;

/**
 * 短信发送清单Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSmsSendlistServiceImpl implements ICmfSmsSendlistService 
{
    @Autowired
    private CmfSmsSendlistMapper cmfSmsSendlistMapper;

    /**
     * 查询短信发送清单
     * 
     * @param id 短信发送清单主键
     * @return 短信发送清单
     */
    @Override
    public CmfSmsSendlist selectCmfSmsSendlistById(Integer id)
    {
        return cmfSmsSendlistMapper.selectCmfSmsSendlistById(id);
    }

    /**
     * 查询短信发送清单列表
     * 
     * @param cmfSmsSendlist 短信发送清单
     * @return 短信发送清单
     */
    @Override
    public List<CmfSmsSendlist> selectCmfSmsSendlistList(CmfSmsSendlist cmfSmsSendlist)
    {
        return cmfSmsSendlistMapper.selectCmfSmsSendlistList(cmfSmsSendlist);
    }

    /**
     * 新增短信发送清单
     * 
     * @param cmfSmsSendlist 短信发送清单
     * @return 结果
     */
    @Override
    public int insertCmfSmsSendlist(CmfSmsSendlist cmfSmsSendlist)
    {
        return cmfSmsSendlistMapper.insertCmfSmsSendlist(cmfSmsSendlist);
    }

    /**
     * 修改短信发送清单
     * 
     * @param cmfSmsSendlist 短信发送清单
     * @return 结果
     */
    @Override
    public int updateCmfSmsSendlist(CmfSmsSendlist cmfSmsSendlist)
    {
        return cmfSmsSendlistMapper.updateCmfSmsSendlist(cmfSmsSendlist);
    }

    /**
     * 批量删除短信发送清单
     * 
     * @param ids 需要删除的短信发送清单主键
     * @return 结果
     */
    @Override
    public int deleteCmfSmsSendlistByIds(Integer[] ids)
    {
        return cmfSmsSendlistMapper.deleteCmfSmsSendlistByIds(ids);
    }

    /**
     * 删除短信发送清单信息
     * 
     * @param id 短信发送清单主键
     * @return 结果
     */
    @Override
    public int deleteCmfSmsSendlistById(Integer id)
    {
        return cmfSmsSendlistMapper.deleteCmfSmsSendlistById(id);
    }
}
