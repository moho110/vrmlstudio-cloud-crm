package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfFixedassetMapper;
import com.vrcrm.political.domain.CmfFixedasset;
import com.vrcrm.political.service.ICmfFixedassetService;

/**
 * 固定资产Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfFixedassetServiceImpl implements ICmfFixedassetService 
{
    @Autowired
    private CmfFixedassetMapper cmfFixedassetMapper;

    /**
     * 查询固定资产
     * 
     * @param id 固定资产主键
     * @return 固定资产
     */
    @Override
    public CmfFixedasset selectCmfFixedassetById(Integer id)
    {
        return cmfFixedassetMapper.selectCmfFixedassetById(id);
    }

    /**
     * 查询固定资产列表
     * 
     * @param cmfFixedasset 固定资产
     * @return 固定资产
     */
    @Override
    public List<CmfFixedasset> selectCmfFixedassetList(CmfFixedasset cmfFixedasset)
    {
        return cmfFixedassetMapper.selectCmfFixedassetList(cmfFixedasset);
    }

    /**
     * 新增固定资产
     * 
     * @param cmfFixedasset 固定资产
     * @return 结果
     */
    @Override
    public int insertCmfFixedasset(CmfFixedasset cmfFixedasset)
    {
        return cmfFixedassetMapper.insertCmfFixedasset(cmfFixedasset);
    }

    /**
     * 修改固定资产
     * 
     * @param cmfFixedasset 固定资产
     * @return 结果
     */
    @Override
    public int updateCmfFixedasset(CmfFixedasset cmfFixedasset)
    {
        return cmfFixedassetMapper.updateCmfFixedasset(cmfFixedasset);
    }

    /**
     * 批量删除固定资产
     * 
     * @param ids 需要删除的固定资产主键
     * @return 结果
     */
    @Override
    public int deleteCmfFixedassetByIds(Integer[] ids)
    {
        return cmfFixedassetMapper.deleteCmfFixedassetByIds(ids);
    }

    /**
     * 删除固定资产信息
     * 
     * @param id 固定资产主键
     * @return 结果
     */
    @Override
    public int deleteCmfFixedassetById(Integer id)
    {
        return cmfFixedassetMapper.deleteCmfFixedassetById(id);
    }
}
