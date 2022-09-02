package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfLinkmanMapper;
import com.vrcrm.basicdata.domain.CmfLinkman;
import com.vrcrm.basicdata.service.ICmfLinkmanService;

/**
 * 联系人Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfLinkmanServiceImpl implements ICmfLinkmanService 
{
    @Autowired
    private CmfLinkmanMapper cmfLinkmanMapper;

    /**
     * 查询联系人
     * 
     * @param id 联系人主键
     * @return 联系人
     */
    @Override
    public CmfLinkman selectCmfLinkmanById(Integer id)
    {
        return cmfLinkmanMapper.selectCmfLinkmanById(id);
    }

    /**
     * 查询联系人列表
     * 
     * @param cmfLinkman 联系人
     * @return 联系人
     */
    @Override
    public List<CmfLinkman> selectCmfLinkmanList(CmfLinkman cmfLinkman)
    {
        return cmfLinkmanMapper.selectCmfLinkmanList(cmfLinkman);
    }

    /**
     * 新增联系人
     * 
     * @param cmfLinkman 联系人
     * @return 结果
     */
    @Override
    public int insertCmfLinkman(CmfLinkman cmfLinkman)
    {
        return cmfLinkmanMapper.insertCmfLinkman(cmfLinkman);
    }

    /**
     * 修改联系人
     * 
     * @param cmfLinkman 联系人
     * @return 结果
     */
    @Override
    public int updateCmfLinkman(CmfLinkman cmfLinkman)
    {
        return cmfLinkmanMapper.updateCmfLinkman(cmfLinkman);
    }

    /**
     * 批量删除联系人
     * 
     * @param ids 需要删除的联系人主键
     * @return 结果
     */
    @Override
    public int deleteCmfLinkmanByIds(Integer[] ids)
    {
        return cmfLinkmanMapper.deleteCmfLinkmanByIds(ids);
    }

    /**
     * 删除联系人信息
     * 
     * @param id 联系人主键
     * @return 结果
     */
    @Override
    public int deleteCmfLinkmanById(Integer id)
    {
        return cmfLinkmanMapper.deleteCmfLinkmanById(id);
    }
}
