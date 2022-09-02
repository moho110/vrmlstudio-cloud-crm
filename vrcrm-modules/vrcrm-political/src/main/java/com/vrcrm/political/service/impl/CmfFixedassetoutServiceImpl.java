package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfFixedassetoutMapper;
import com.vrcrm.political.domain.CmfFixedassetout;
import com.vrcrm.political.service.ICmfFixedassetoutService;

/**
 * 固定资产出库Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfFixedassetoutServiceImpl implements ICmfFixedassetoutService 
{
    @Autowired
    private CmfFixedassetoutMapper cmfFixedassetoutMapper;

    /**
     * 查询固定资产出库
     * 
     * @param id 固定资产出库主键
     * @return 固定资产出库
     */
    @Override
    public CmfFixedassetout selectCmfFixedassetoutById(Integer id)
    {
        return cmfFixedassetoutMapper.selectCmfFixedassetoutById(id);
    }

    /**
     * 查询固定资产出库列表
     * 
     * @param cmfFixedassetout 固定资产出库
     * @return 固定资产出库
     */
    @Override
    public List<CmfFixedassetout> selectCmfFixedassetoutList(CmfFixedassetout cmfFixedassetout)
    {
        return cmfFixedassetoutMapper.selectCmfFixedassetoutList(cmfFixedassetout);
    }

    /**
     * 新增固定资产出库
     * 
     * @param cmfFixedassetout 固定资产出库
     * @return 结果
     */
    @Override
    public int insertCmfFixedassetout(CmfFixedassetout cmfFixedassetout)
    {
        return cmfFixedassetoutMapper.insertCmfFixedassetout(cmfFixedassetout);
    }

    /**
     * 修改固定资产出库
     * 
     * @param cmfFixedassetout 固定资产出库
     * @return 结果
     */
    @Override
    public int updateCmfFixedassetout(CmfFixedassetout cmfFixedassetout)
    {
        return cmfFixedassetoutMapper.updateCmfFixedassetout(cmfFixedassetout);
    }

    /**
     * 批量删除固定资产出库
     * 
     * @param ids 需要删除的固定资产出库主键
     * @return 结果
     */
    @Override
    public int deleteCmfFixedassetoutByIds(Integer[] ids)
    {
        return cmfFixedassetoutMapper.deleteCmfFixedassetoutByIds(ids);
    }

    /**
     * 删除固定资产出库信息
     * 
     * @param id 固定资产出库主键
     * @return 结果
     */
    @Override
    public int deleteCmfFixedassetoutById(Integer id)
    {
        return cmfFixedassetoutMapper.deleteCmfFixedassetoutById(id);
    }
}
