package com.vrcrm.customer.service;

import java.util.List;
import com.vrcrm.customer.domain.CmfContractFlag;

/**
 * 合同标识Service接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface ICmfContractFlagService 
{
    /**
     * 查询合同标识
     * 
     * @param id 合同标识主键
     * @return 合同标识
     */
    public CmfContractFlag selectCmfContractFlagById(Integer id);

    /**
     * 查询合同标识列表
     * 
     * @param cmfContractFlag 合同标识
     * @return 合同标识集合
     */
    public List<CmfContractFlag> selectCmfContractFlagList(CmfContractFlag cmfContractFlag);

    /**
     * 新增合同标识
     * 
     * @param cmfContractFlag 合同标识
     * @return 结果
     */
    public int insertCmfContractFlag(CmfContractFlag cmfContractFlag);

    /**
     * 修改合同标识
     * 
     * @param cmfContractFlag 合同标识
     * @return 结果
     */
    public int updateCmfContractFlag(CmfContractFlag cmfContractFlag);

    /**
     * 批量删除合同标识
     * 
     * @param ids 需要删除的合同标识主键集合
     * @return 结果
     */
    public int deleteCmfContractFlagByIds(Integer[] ids);

    /**
     * 删除合同标识信息
     * 
     * @param id 合同标识主键
     * @return 结果
     */
    public int deleteCmfContractFlagById(Integer id);
}
