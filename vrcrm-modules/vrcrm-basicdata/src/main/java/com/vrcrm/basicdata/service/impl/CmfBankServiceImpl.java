package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfBankMapper;
import com.vrcrm.basicdata.domain.CmfBank;
import com.vrcrm.basicdata.service.ICmfBankService;

/**
 * 银行帐户Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfBankServiceImpl implements ICmfBankService 
{
    @Autowired
    private CmfBankMapper cmfBankMapper;

    /**
     * 查询银行帐户
     * 
     * @param id 银行帐户主键
     * @return 银行帐户
     */
    @Override
    public CmfBank selectCmfBankById(Integer id)
    {
        return cmfBankMapper.selectCmfBankById(id);
    }

    /**
     * 查询银行帐户列表
     * 
     * @param cmfBank 银行帐户
     * @return 银行帐户
     */
    @Override
    public List<CmfBank> selectCmfBankList(CmfBank cmfBank)
    {
        return cmfBankMapper.selectCmfBankList(cmfBank);
    }

    /**
     * 新增银行帐户
     * 
     * @param cmfBank 银行帐户
     * @return 结果
     */
    @Override
    public int insertCmfBank(CmfBank cmfBank)
    {
        return cmfBankMapper.insertCmfBank(cmfBank);
    }

    /**
     * 修改银行帐户
     * 
     * @param cmfBank 银行帐户
     * @return 结果
     */
    @Override
    public int updateCmfBank(CmfBank cmfBank)
    {
        return cmfBankMapper.updateCmfBank(cmfBank);
    }

    /**
     * 批量删除银行帐户
     * 
     * @param ids 需要删除的银行帐户主键
     * @return 结果
     */
    @Override
    public int deleteCmfBankByIds(Integer[] ids)
    {
        return cmfBankMapper.deleteCmfBankByIds(ids);
    }

    /**
     * 删除银行帐户信息
     * 
     * @param id 银行帐户主键
     * @return 结果
     */
    @Override
    public int deleteCmfBankById(Integer id)
    {
        return cmfBankMapper.deleteCmfBankById(id);
    }
}
