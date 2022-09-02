package com.vrcrm.finance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.finance.mapper.CmfBankzhuruMapper;
import com.vrcrm.finance.domain.CmfBankzhuru;
import com.vrcrm.finance.service.ICmfBankzhuruService;

/**
 * 帐户注入Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfBankzhuruServiceImpl implements ICmfBankzhuruService 
{
    @Autowired
    private CmfBankzhuruMapper cmfBankzhuruMapper;

    /**
     * 查询帐户注入
     * 
     * @param id 帐户注入主键
     * @return 帐户注入
     */
    @Override
    public CmfBankzhuru selectCmfBankzhuruById(Integer id)
    {
        return cmfBankzhuruMapper.selectCmfBankzhuruById(id);
    }

    /**
     * 查询帐户注入列表
     * 
     * @param cmfBankzhuru 帐户注入
     * @return 帐户注入
     */
    @Override
    public List<CmfBankzhuru> selectCmfBankzhuruList(CmfBankzhuru cmfBankzhuru)
    {
        return cmfBankzhuruMapper.selectCmfBankzhuruList(cmfBankzhuru);
    }

    /**
     * 新增帐户注入
     * 
     * @param cmfBankzhuru 帐户注入
     * @return 结果
     */
    @Override
    public int insertCmfBankzhuru(CmfBankzhuru cmfBankzhuru)
    {
        return cmfBankzhuruMapper.insertCmfBankzhuru(cmfBankzhuru);
    }

    /**
     * 修改帐户注入
     * 
     * @param cmfBankzhuru 帐户注入
     * @return 结果
     */
    @Override
    public int updateCmfBankzhuru(CmfBankzhuru cmfBankzhuru)
    {
        return cmfBankzhuruMapper.updateCmfBankzhuru(cmfBankzhuru);
    }

    /**
     * 批量删除帐户注入
     * 
     * @param ids 需要删除的帐户注入主键
     * @return 结果
     */
    @Override
    public int deleteCmfBankzhuruByIds(Integer[] ids)
    {
        return cmfBankzhuruMapper.deleteCmfBankzhuruByIds(ids);
    }

    /**
     * 删除帐户注入信息
     * 
     * @param id 帐户注入主键
     * @return 结果
     */
    @Override
    public int deleteCmfBankzhuruById(Integer id)
    {
        return cmfBankzhuruMapper.deleteCmfBankzhuruById(id);
    }
}
