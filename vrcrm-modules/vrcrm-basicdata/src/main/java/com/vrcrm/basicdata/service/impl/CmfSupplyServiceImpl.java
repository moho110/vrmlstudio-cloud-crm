package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfSupplyMapper;
import com.vrcrm.basicdata.domain.CmfSupply;
import com.vrcrm.basicdata.service.ICmfSupplyService;

/**
 * 供应商Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSupplyServiceImpl implements ICmfSupplyService 
{
    @Autowired
    private CmfSupplyMapper cmfSupplyMapper;

    /**
     * 查询供应商
     * 
     * @param id 供应商主键
     * @return 供应商
     */
    @Override
    public CmfSupply selectCmfSupplyById(Long id)
    {
        return cmfSupplyMapper.selectCmfSupplyById(id);
    }

    /**
     * 查询供应商列表
     * 
     * @param cmfSupply 供应商
     * @return 供应商
     */
    @Override
    public List<CmfSupply> selectCmfSupplyList(CmfSupply cmfSupply)
    {
        return cmfSupplyMapper.selectCmfSupplyList(cmfSupply);
    }

    /**
     * 新增供应商
     * 
     * @param cmfSupply 供应商
     * @return 结果
     */
    @Override
    public int insertCmfSupply(CmfSupply cmfSupply)
    {
        return cmfSupplyMapper.insertCmfSupply(cmfSupply);
    }

    /**
     * 修改供应商
     * 
     * @param cmfSupply 供应商
     * @return 结果
     */
    @Override
    public int updateCmfSupply(CmfSupply cmfSupply)
    {
        return cmfSupplyMapper.updateCmfSupply(cmfSupply);
    }

    /**
     * 批量删除供应商
     * 
     * @param ids 需要删除的供应商主键
     * @return 结果
     */
    @Override
    public int deleteCmfSupplyByIds(Long[] ids)
    {
        return cmfSupplyMapper.deleteCmfSupplyByIds(ids);
    }

    /**
     * 删除供应商信息
     * 
     * @param id 供应商主键
     * @return 结果
     */
    @Override
    public int deleteCmfSupplyById(Long id)
    {
        return cmfSupplyMapper.deleteCmfSupplyById(id);
    }
}
