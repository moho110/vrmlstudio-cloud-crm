package com.vrcrm.customer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.customer.mapper.CmfContractFlagMapper;
import com.vrcrm.customer.domain.CmfContractFlag;
import com.vrcrm.customer.service.ICmfContractFlagService;

/**
 * 合同标识Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfContractFlagServiceImpl implements ICmfContractFlagService 
{
    @Autowired
    private CmfContractFlagMapper cmfContractFlagMapper;

    /**
     * 查询合同标识
     * 
     * @param id 合同标识主键
     * @return 合同标识
     */
    @Override
    public CmfContractFlag selectCmfContractFlagById(Integer id)
    {
        return cmfContractFlagMapper.selectCmfContractFlagById(id);
    }

    /**
     * 查询合同标识列表
     * 
     * @param cmfContractFlag 合同标识
     * @return 合同标识
     */
    @Override
    public List<CmfContractFlag> selectCmfContractFlagList(CmfContractFlag cmfContractFlag)
    {
        return cmfContractFlagMapper.selectCmfContractFlagList(cmfContractFlag);
    }

    /**
     * 新增合同标识
     * 
     * @param cmfContractFlag 合同标识
     * @return 结果
     */
    @Override
    public int insertCmfContractFlag(CmfContractFlag cmfContractFlag)
    {
        return cmfContractFlagMapper.insertCmfContractFlag(cmfContractFlag);
    }

    /**
     * 修改合同标识
     * 
     * @param cmfContractFlag 合同标识
     * @return 结果
     */
    @Override
    public int updateCmfContractFlag(CmfContractFlag cmfContractFlag)
    {
        return cmfContractFlagMapper.updateCmfContractFlag(cmfContractFlag);
    }

    /**
     * 批量删除合同标识
     * 
     * @param ids 需要删除的合同标识主键
     * @return 结果
     */
    @Override
    public int deleteCmfContractFlagByIds(Integer[] ids)
    {
        return cmfContractFlagMapper.deleteCmfContractFlagByIds(ids);
    }

    /**
     * 删除合同标识信息
     * 
     * @param id 合同标识主键
     * @return 结果
     */
    @Override
    public int deleteCmfContractFlagById(Integer id)
    {
        return cmfContractFlagMapper.deleteCmfContractFlagById(id);
    }
}
