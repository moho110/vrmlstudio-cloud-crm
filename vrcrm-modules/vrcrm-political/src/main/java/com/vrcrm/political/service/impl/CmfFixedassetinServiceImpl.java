package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfFixedassetinMapper;
import com.vrcrm.political.domain.CmfFixedassetin;
import com.vrcrm.political.service.ICmfFixedassetinService;

/**
 * 固定资产入库Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfFixedassetinServiceImpl implements ICmfFixedassetinService 
{
    @Autowired
    private CmfFixedassetinMapper cmfFixedassetinMapper;

    /**
     * 查询固定资产入库
     * 
     * @param id 固定资产入库主键
     * @return 固定资产入库
     */
    @Override
    public CmfFixedassetin selectCmfFixedassetinById(Integer id)
    {
        return cmfFixedassetinMapper.selectCmfFixedassetinById(id);
    }

    /**
     * 查询固定资产入库列表
     * 
     * @param cmfFixedassetin 固定资产入库
     * @return 固定资产入库
     */
    @Override
    public List<CmfFixedassetin> selectCmfFixedassetinList(CmfFixedassetin cmfFixedassetin)
    {
        return cmfFixedassetinMapper.selectCmfFixedassetinList(cmfFixedassetin);
    }

    /**
     * 新增固定资产入库
     * 
     * @param cmfFixedassetin 固定资产入库
     * @return 结果
     */
    @Override
    public int insertCmfFixedassetin(CmfFixedassetin cmfFixedassetin)
    {
        return cmfFixedassetinMapper.insertCmfFixedassetin(cmfFixedassetin);
    }

    /**
     * 修改固定资产入库
     * 
     * @param cmfFixedassetin 固定资产入库
     * @return 结果
     */
    @Override
    public int updateCmfFixedassetin(CmfFixedassetin cmfFixedassetin)
    {
        return cmfFixedassetinMapper.updateCmfFixedassetin(cmfFixedassetin);
    }

    /**
     * 批量删除固定资产入库
     * 
     * @param ids 需要删除的固定资产入库主键
     * @return 结果
     */
    @Override
    public int deleteCmfFixedassetinByIds(Integer[] ids)
    {
        return cmfFixedassetinMapper.deleteCmfFixedassetinByIds(ids);
    }

    /**
     * 删除固定资产入库信息
     * 
     * @param id 固定资产入库主键
     * @return 结果
     */
    @Override
    public int deleteCmfFixedassetinById(Integer id)
    {
        return cmfFixedassetinMapper.deleteCmfFixedassetinById(id);
    }
}
