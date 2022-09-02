package com.vrcrm.customer.mapper;

import java.util.List;
import com.vrcrm.customer.domain.CmfContractFlag;

/**
 * 合同标识Mapper接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface CmfContractFlagMapper 
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
     * 删除合同标识
     * 
     * @param id 合同标识主键
     * @return 结果
     */
    public int deleteCmfContractFlagById(Integer id);

    /**
     * 批量删除合同标识
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfContractFlagByIds(Integer[] ids);
}
