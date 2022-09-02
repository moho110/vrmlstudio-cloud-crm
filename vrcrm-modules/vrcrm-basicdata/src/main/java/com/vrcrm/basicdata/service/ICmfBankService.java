package com.vrcrm.basicdata.service;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfBank;

/**
 * 银行帐户Service接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface ICmfBankService 
{
    /**
     * 查询银行帐户
     * 
     * @param id 银行帐户主键
     * @return 银行帐户
     */
    public CmfBank selectCmfBankById(Integer id);

    /**
     * 查询银行帐户列表
     * 
     * @param cmfBank 银行帐户
     * @return 银行帐户集合
     */
    public List<CmfBank> selectCmfBankList(CmfBank cmfBank);

    /**
     * 新增银行帐户
     * 
     * @param cmfBank 银行帐户
     * @return 结果
     */
    public int insertCmfBank(CmfBank cmfBank);

    /**
     * 修改银行帐户
     * 
     * @param cmfBank 银行帐户
     * @return 结果
     */
    public int updateCmfBank(CmfBank cmfBank);

    /**
     * 批量删除银行帐户
     * 
     * @param ids 需要删除的银行帐户主键集合
     * @return 结果
     */
    public int deleteCmfBankByIds(Integer[] ids);

    /**
     * 删除银行帐户信息
     * 
     * @param id 银行帐户主键
     * @return 结果
     */
    public int deleteCmfBankById(Integer id);
}
