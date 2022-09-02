package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfFixedassetbaofeiMapper;
import com.vrcrm.political.domain.CmfFixedassetbaofei;
import com.vrcrm.political.service.ICmfFixedassetbaofeiService;

/**
 * 固定资产报废Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfFixedassetbaofeiServiceImpl implements ICmfFixedassetbaofeiService 
{
    @Autowired
    private CmfFixedassetbaofeiMapper cmfFixedassetbaofeiMapper;

    /**
     * 查询固定资产报废
     * 
     * @param id 固定资产报废主键
     * @return 固定资产报废
     */
    @Override
    public CmfFixedassetbaofei selectCmfFixedassetbaofeiById(Integer id)
    {
        return cmfFixedassetbaofeiMapper.selectCmfFixedassetbaofeiById(id);
    }

    /**
     * 查询固定资产报废列表
     * 
     * @param cmfFixedassetbaofei 固定资产报废
     * @return 固定资产报废
     */
    @Override
    public List<CmfFixedassetbaofei> selectCmfFixedassetbaofeiList(CmfFixedassetbaofei cmfFixedassetbaofei)
    {
        return cmfFixedassetbaofeiMapper.selectCmfFixedassetbaofeiList(cmfFixedassetbaofei);
    }

    /**
     * 新增固定资产报废
     * 
     * @param cmfFixedassetbaofei 固定资产报废
     * @return 结果
     */
    @Override
    public int insertCmfFixedassetbaofei(CmfFixedassetbaofei cmfFixedassetbaofei)
    {
        return cmfFixedassetbaofeiMapper.insertCmfFixedassetbaofei(cmfFixedassetbaofei);
    }

    /**
     * 修改固定资产报废
     * 
     * @param cmfFixedassetbaofei 固定资产报废
     * @return 结果
     */
    @Override
    public int updateCmfFixedassetbaofei(CmfFixedassetbaofei cmfFixedassetbaofei)
    {
        return cmfFixedassetbaofeiMapper.updateCmfFixedassetbaofei(cmfFixedassetbaofei);
    }

    /**
     * 批量删除固定资产报废
     * 
     * @param ids 需要删除的固定资产报废主键
     * @return 结果
     */
    @Override
    public int deleteCmfFixedassetbaofeiByIds(Integer[] ids)
    {
        return cmfFixedassetbaofeiMapper.deleteCmfFixedassetbaofeiByIds(ids);
    }

    /**
     * 删除固定资产报废信息
     * 
     * @param id 固定资产报废主键
     * @return 结果
     */
    @Override
    public int deleteCmfFixedassetbaofeiById(Integer id)
    {
        return cmfFixedassetbaofeiMapper.deleteCmfFixedassetbaofeiById(id);
    }
}
