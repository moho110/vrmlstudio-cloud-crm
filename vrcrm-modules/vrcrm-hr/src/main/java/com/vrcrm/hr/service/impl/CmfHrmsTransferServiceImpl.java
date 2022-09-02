package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfHrmsTransferMapper;
import com.vrcrm.hr.domain.CmfHrmsTransfer;
import com.vrcrm.hr.service.ICmfHrmsTransferService;

/**
 * 转职明细Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfHrmsTransferServiceImpl implements ICmfHrmsTransferService 
{
    @Autowired
    private CmfHrmsTransferMapper cmfHrmsTransferMapper;

    /**
     * 查询转职明细
     * 
     * @param id 转职明细主键
     * @return 转职明细
     */
    @Override
    public CmfHrmsTransfer selectCmfHrmsTransferById(Integer id)
    {
        return cmfHrmsTransferMapper.selectCmfHrmsTransferById(id);
    }

    /**
     * 查询转职明细列表
     * 
     * @param cmfHrmsTransfer 转职明细
     * @return 转职明细
     */
    @Override
    public List<CmfHrmsTransfer> selectCmfHrmsTransferList(CmfHrmsTransfer cmfHrmsTransfer)
    {
        return cmfHrmsTransferMapper.selectCmfHrmsTransferList(cmfHrmsTransfer);
    }

    /**
     * 新增转职明细
     * 
     * @param cmfHrmsTransfer 转职明细
     * @return 结果
     */
    @Override
    public int insertCmfHrmsTransfer(CmfHrmsTransfer cmfHrmsTransfer)
    {
        return cmfHrmsTransferMapper.insertCmfHrmsTransfer(cmfHrmsTransfer);
    }

    /**
     * 修改转职明细
     * 
     * @param cmfHrmsTransfer 转职明细
     * @return 结果
     */
    @Override
    public int updateCmfHrmsTransfer(CmfHrmsTransfer cmfHrmsTransfer)
    {
        return cmfHrmsTransferMapper.updateCmfHrmsTransfer(cmfHrmsTransfer);
    }

    /**
     * 批量删除转职明细
     * 
     * @param ids 需要删除的转职明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsTransferByIds(Integer[] ids)
    {
        return cmfHrmsTransferMapper.deleteCmfHrmsTransferByIds(ids);
    }

    /**
     * 删除转职明细信息
     * 
     * @param id 转职明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsTransferById(Integer id)
    {
        return cmfHrmsTransferMapper.deleteCmfHrmsTransferById(id);
    }
}
