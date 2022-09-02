package com.vrcrm.finance.service;

import java.util.List;
import com.vrcrm.finance.domain.CmfBankzhuru;

/**
 * 帐户注入Service接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface ICmfBankzhuruService 
{
    /**
     * 查询帐户注入
     * 
     * @param id 帐户注入主键
     * @return 帐户注入
     */
    public CmfBankzhuru selectCmfBankzhuruById(Integer id);

    /**
     * 查询帐户注入列表
     * 
     * @param cmfBankzhuru 帐户注入
     * @return 帐户注入集合
     */
    public List<CmfBankzhuru> selectCmfBankzhuruList(CmfBankzhuru cmfBankzhuru);

    /**
     * 新增帐户注入
     * 
     * @param cmfBankzhuru 帐户注入
     * @return 结果
     */
    public int insertCmfBankzhuru(CmfBankzhuru cmfBankzhuru);

    /**
     * 修改帐户注入
     * 
     * @param cmfBankzhuru 帐户注入
     * @return 结果
     */
    public int updateCmfBankzhuru(CmfBankzhuru cmfBankzhuru);

    /**
     * 批量删除帐户注入
     * 
     * @param ids 需要删除的帐户注入主键集合
     * @return 结果
     */
    public int deleteCmfBankzhuruByIds(Integer[] ids);

    /**
     * 删除帐户注入信息
     * 
     * @param id 帐户注入主键
     * @return 结果
     */
    public int deleteCmfBankzhuruById(Integer id);
}
