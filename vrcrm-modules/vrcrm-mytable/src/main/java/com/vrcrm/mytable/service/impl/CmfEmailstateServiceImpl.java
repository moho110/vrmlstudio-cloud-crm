package com.vrcrm.mytable.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.mytable.mapper.CmfEmailstateMapper;
import com.vrcrm.mytable.domain.CmfEmailstate;
import com.vrcrm.mytable.service.ICmfEmailstateService;

/**
 * 邮件状态Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfEmailstateServiceImpl implements ICmfEmailstateService 
{
    @Autowired
    private CmfEmailstateMapper cmfEmailstateMapper;

    /**
     * 查询邮件状态
     * 
     * @param id 邮件状态主键
     * @return 邮件状态
     */
    @Override
    public CmfEmailstate selectCmfEmailstateById(Integer id)
    {
        return cmfEmailstateMapper.selectCmfEmailstateById(id);
    }

    /**
     * 查询邮件状态列表
     * 
     * @param cmfEmailstate 邮件状态
     * @return 邮件状态
     */
    @Override
    public List<CmfEmailstate> selectCmfEmailstateList(CmfEmailstate cmfEmailstate)
    {
        return cmfEmailstateMapper.selectCmfEmailstateList(cmfEmailstate);
    }

    /**
     * 新增邮件状态
     * 
     * @param cmfEmailstate 邮件状态
     * @return 结果
     */
    @Override
    public int insertCmfEmailstate(CmfEmailstate cmfEmailstate)
    {
        return cmfEmailstateMapper.insertCmfEmailstate(cmfEmailstate);
    }

    /**
     * 修改邮件状态
     * 
     * @param cmfEmailstate 邮件状态
     * @return 结果
     */
    @Override
    public int updateCmfEmailstate(CmfEmailstate cmfEmailstate)
    {
        return cmfEmailstateMapper.updateCmfEmailstate(cmfEmailstate);
    }

    /**
     * 批量删除邮件状态
     * 
     * @param ids 需要删除的邮件状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfEmailstateByIds(Integer[] ids)
    {
        return cmfEmailstateMapper.deleteCmfEmailstateByIds(ids);
    }

    /**
     * 删除邮件状态信息
     * 
     * @param id 邮件状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfEmailstateById(Integer id)
    {
        return cmfEmailstateMapper.deleteCmfEmailstateById(id);
    }
}
