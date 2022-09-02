package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfFixedassetweixiuMapper;
import com.vrcrm.political.domain.CmfFixedassetweixiu;
import com.vrcrm.political.service.ICmfFixedassetweixiuService;

/**
 * 固定资产维修Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfFixedassetweixiuServiceImpl implements ICmfFixedassetweixiuService 
{
    @Autowired
    private CmfFixedassetweixiuMapper cmfFixedassetweixiuMapper;

    /**
     * 查询固定资产维修
     * 
     * @param id 固定资产维修主键
     * @return 固定资产维修
     */
    @Override
    public CmfFixedassetweixiu selectCmfFixedassetweixiuById(Integer id)
    {
        return cmfFixedassetweixiuMapper.selectCmfFixedassetweixiuById(id);
    }

    /**
     * 查询固定资产维修列表
     * 
     * @param cmfFixedassetweixiu 固定资产维修
     * @return 固定资产维修
     */
    @Override
    public List<CmfFixedassetweixiu> selectCmfFixedassetweixiuList(CmfFixedassetweixiu cmfFixedassetweixiu)
    {
        return cmfFixedassetweixiuMapper.selectCmfFixedassetweixiuList(cmfFixedassetweixiu);
    }

    /**
     * 新增固定资产维修
     * 
     * @param cmfFixedassetweixiu 固定资产维修
     * @return 结果
     */
    @Override
    public int insertCmfFixedassetweixiu(CmfFixedassetweixiu cmfFixedassetweixiu)
    {
        return cmfFixedassetweixiuMapper.insertCmfFixedassetweixiu(cmfFixedassetweixiu);
    }

    /**
     * 修改固定资产维修
     * 
     * @param cmfFixedassetweixiu 固定资产维修
     * @return 结果
     */
    @Override
    public int updateCmfFixedassetweixiu(CmfFixedassetweixiu cmfFixedassetweixiu)
    {
        return cmfFixedassetweixiuMapper.updateCmfFixedassetweixiu(cmfFixedassetweixiu);
    }

    /**
     * 批量删除固定资产维修
     * 
     * @param ids 需要删除的固定资产维修主键
     * @return 结果
     */
    @Override
    public int deleteCmfFixedassetweixiuByIds(Integer[] ids)
    {
        return cmfFixedassetweixiuMapper.deleteCmfFixedassetweixiuByIds(ids);
    }

    /**
     * 删除固定资产维修信息
     * 
     * @param id 固定资产维修主键
     * @return 结果
     */
    @Override
    public int deleteCmfFixedassetweixiuById(Integer id)
    {
        return cmfFixedassetweixiuMapper.deleteCmfFixedassetweixiuById(id);
    }
}
