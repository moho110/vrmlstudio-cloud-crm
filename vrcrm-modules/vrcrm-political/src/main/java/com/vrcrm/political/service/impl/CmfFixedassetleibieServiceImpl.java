package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfFixedassetleibieMapper;
import com.vrcrm.political.domain.CmfFixedassetleibie;
import com.vrcrm.political.service.ICmfFixedassetleibieService;

/**
 * 固定资产类别Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfFixedassetleibieServiceImpl implements ICmfFixedassetleibieService 
{
    @Autowired
    private CmfFixedassetleibieMapper cmfFixedassetleibieMapper;

    /**
     * 查询固定资产类别
     * 
     * @param id 固定资产类别主键
     * @return 固定资产类别
     */
    @Override
    public CmfFixedassetleibie selectCmfFixedassetleibieById(Integer id)
    {
        return cmfFixedassetleibieMapper.selectCmfFixedassetleibieById(id);
    }

    /**
     * 查询固定资产类别列表
     * 
     * @param cmfFixedassetleibie 固定资产类别
     * @return 固定资产类别
     */
    @Override
    public List<CmfFixedassetleibie> selectCmfFixedassetleibieList(CmfFixedassetleibie cmfFixedassetleibie)
    {
        return cmfFixedassetleibieMapper.selectCmfFixedassetleibieList(cmfFixedassetleibie);
    }

    /**
     * 新增固定资产类别
     * 
     * @param cmfFixedassetleibie 固定资产类别
     * @return 结果
     */
    @Override
    public int insertCmfFixedassetleibie(CmfFixedassetleibie cmfFixedassetleibie)
    {
        return cmfFixedassetleibieMapper.insertCmfFixedassetleibie(cmfFixedassetleibie);
    }

    /**
     * 修改固定资产类别
     * 
     * @param cmfFixedassetleibie 固定资产类别
     * @return 结果
     */
    @Override
    public int updateCmfFixedassetleibie(CmfFixedassetleibie cmfFixedassetleibie)
    {
        return cmfFixedassetleibieMapper.updateCmfFixedassetleibie(cmfFixedassetleibie);
    }

    /**
     * 批量删除固定资产类别
     * 
     * @param ids 需要删除的固定资产类别主键
     * @return 结果
     */
    @Override
    public int deleteCmfFixedassetleibieByIds(Integer[] ids)
    {
        return cmfFixedassetleibieMapper.deleteCmfFixedassetleibieByIds(ids);
    }

    /**
     * 删除固定资产类别信息
     * 
     * @param id 固定资产类别主键
     * @return 结果
     */
    @Override
    public int deleteCmfFixedassetleibieById(Integer id)
    {
        return cmfFixedassetleibieMapper.deleteCmfFixedassetleibieById(id);
    }
}
