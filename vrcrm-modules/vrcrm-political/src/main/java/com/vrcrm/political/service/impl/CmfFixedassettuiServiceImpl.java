package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfFixedassettuiMapper;
import com.vrcrm.political.domain.CmfFixedassettui;
import com.vrcrm.political.service.ICmfFixedassettuiService;

/**
 * 固定资产归还Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfFixedassettuiServiceImpl implements ICmfFixedassettuiService 
{
    @Autowired
    private CmfFixedassettuiMapper cmfFixedassettuiMapper;

    /**
     * 查询固定资产归还
     * 
     * @param id 固定资产归还主键
     * @return 固定资产归还
     */
    @Override
    public CmfFixedassettui selectCmfFixedassettuiById(Integer id)
    {
        return cmfFixedassettuiMapper.selectCmfFixedassettuiById(id);
    }

    /**
     * 查询固定资产归还列表
     * 
     * @param cmfFixedassettui 固定资产归还
     * @return 固定资产归还
     */
    @Override
    public List<CmfFixedassettui> selectCmfFixedassettuiList(CmfFixedassettui cmfFixedassettui)
    {
        return cmfFixedassettuiMapper.selectCmfFixedassettuiList(cmfFixedassettui);
    }

    /**
     * 新增固定资产归还
     * 
     * @param cmfFixedassettui 固定资产归还
     * @return 结果
     */
    @Override
    public int insertCmfFixedassettui(CmfFixedassettui cmfFixedassettui)
    {
        return cmfFixedassettuiMapper.insertCmfFixedassettui(cmfFixedassettui);
    }

    /**
     * 修改固定资产归还
     * 
     * @param cmfFixedassettui 固定资产归还
     * @return 结果
     */
    @Override
    public int updateCmfFixedassettui(CmfFixedassettui cmfFixedassettui)
    {
        return cmfFixedassettuiMapper.updateCmfFixedassettui(cmfFixedassettui);
    }

    /**
     * 批量删除固定资产归还
     * 
     * @param ids 需要删除的固定资产归还主键
     * @return 结果
     */
    @Override
    public int deleteCmfFixedassettuiByIds(Integer[] ids)
    {
        return cmfFixedassettuiMapper.deleteCmfFixedassettuiByIds(ids);
    }

    /**
     * 删除固定资产归还信息
     * 
     * @param id 固定资产归还主键
     * @return 结果
     */
    @Override
    public int deleteCmfFixedassettuiById(Integer id)
    {
        return cmfFixedassettuiMapper.deleteCmfFixedassettuiById(id);
    }
}
