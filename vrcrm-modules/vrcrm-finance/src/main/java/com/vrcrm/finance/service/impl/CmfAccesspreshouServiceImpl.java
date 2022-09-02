package com.vrcrm.finance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.finance.mapper.CmfAccesspreshouMapper;
import com.vrcrm.finance.domain.CmfAccesspreshou;
import com.vrcrm.finance.service.ICmfAccesspreshouService;

/**
 * 预收款记录Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-13
 */
@Service
public class CmfAccesspreshouServiceImpl implements ICmfAccesspreshouService 
{
    @Autowired
    private CmfAccesspreshouMapper cmfAccesspreshouMapper;

    /**
     * 查询预收款记录
     * 
     * @param id 预收款记录主键
     * @return 预收款记录
     */
    @Override
    public CmfAccesspreshou selectCmfAccesspreshouById(Integer id)
    {
        return cmfAccesspreshouMapper.selectCmfAccesspreshouById(id);
    }

    /**
     * 查询预收款记录列表
     * 
     * @param cmfAccesspreshou 预收款记录
     * @return 预收款记录
     */
    @Override
    public List<CmfAccesspreshou> selectCmfAccesspreshouList(CmfAccesspreshou cmfAccesspreshou)
    {
        return cmfAccesspreshouMapper.selectCmfAccesspreshouList(cmfAccesspreshou);
    }

    /**
     * 新增预收款记录
     * 
     * @param cmfAccesspreshou 预收款记录
     * @return 结果
     */
    @Override
    public int insertCmfAccesspreshou(CmfAccesspreshou cmfAccesspreshou)
    {
        return cmfAccesspreshouMapper.insertCmfAccesspreshou(cmfAccesspreshou);
    }

    /**
     * 修改预收款记录
     * 
     * @param cmfAccesspreshou 预收款记录
     * @return 结果
     */
    @Override
    public int updateCmfAccesspreshou(CmfAccesspreshou cmfAccesspreshou)
    {
        return cmfAccesspreshouMapper.updateCmfAccesspreshou(cmfAccesspreshou);
    }

    /**
     * 批量删除预收款记录
     * 
     * @param ids 需要删除的预收款记录主键
     * @return 结果
     */
    @Override
    public int deleteCmfAccesspreshouByIds(Integer[] ids)
    {
        return cmfAccesspreshouMapper.deleteCmfAccesspreshouByIds(ids);
    }

    /**
     * 删除预收款记录信息
     * 
     * @param id 预收款记录主键
     * @return 结果
     */
    @Override
    public int deleteCmfAccesspreshouById(Integer id)
    {
        return cmfAccesspreshouMapper.deleteCmfAccesspreshouById(id);
    }
}
