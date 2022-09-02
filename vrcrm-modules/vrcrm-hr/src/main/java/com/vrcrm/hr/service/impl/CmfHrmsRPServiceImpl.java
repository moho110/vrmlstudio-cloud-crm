package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfHrmsRPMapper;
import com.vrcrm.hr.domain.CmfHrmsRP;
import com.vrcrm.hr.service.ICmfHrmsRPService;

/**
 * 是否奖惩Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfHrmsRPServiceImpl implements ICmfHrmsRPService 
{
    @Autowired
    private CmfHrmsRPMapper cmfHrmsRPMapper;

    /**
     * 查询是否奖惩
     * 
     * @param id 是否奖惩主键
     * @return 是否奖惩
     */
    @Override
    public CmfHrmsRP selectCmfHrmsRPById(Integer id)
    {
        return cmfHrmsRPMapper.selectCmfHrmsRPById(id);
    }

    /**
     * 查询是否奖惩列表
     * 
     * @param cmfHrmsRP 是否奖惩
     * @return 是否奖惩
     */
    @Override
    public List<CmfHrmsRP> selectCmfHrmsRPList(CmfHrmsRP cmfHrmsRP)
    {
        return cmfHrmsRPMapper.selectCmfHrmsRPList(cmfHrmsRP);
    }

    /**
     * 新增是否奖惩
     * 
     * @param cmfHrmsRP 是否奖惩
     * @return 结果
     */
    @Override
    public int insertCmfHrmsRP(CmfHrmsRP cmfHrmsRP)
    {
        return cmfHrmsRPMapper.insertCmfHrmsRP(cmfHrmsRP);
    }

    /**
     * 修改是否奖惩
     * 
     * @param cmfHrmsRP 是否奖惩
     * @return 结果
     */
    @Override
    public int updateCmfHrmsRP(CmfHrmsRP cmfHrmsRP)
    {
        return cmfHrmsRPMapper.updateCmfHrmsRP(cmfHrmsRP);
    }

    /**
     * 批量删除是否奖惩
     * 
     * @param ids 需要删除的是否奖惩主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsRPByIds(Integer[] ids)
    {
        return cmfHrmsRPMapper.deleteCmfHrmsRPByIds(ids);
    }

    /**
     * 删除是否奖惩信息
     * 
     * @param id 是否奖惩主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsRPById(Integer id)
    {
        return cmfHrmsRPMapper.deleteCmfHrmsRPById(id);
    }
}
