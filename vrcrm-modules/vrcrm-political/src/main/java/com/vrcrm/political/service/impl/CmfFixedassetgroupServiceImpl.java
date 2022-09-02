package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfFixedassetgroupMapper;
import com.vrcrm.political.domain.CmfFixedassetgroup;
import com.vrcrm.political.service.ICmfFixedassetgroupService;

/**
 * 固定资产分类Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfFixedassetgroupServiceImpl implements ICmfFixedassetgroupService 
{
    @Autowired
    private CmfFixedassetgroupMapper cmfFixedassetgroupMapper;

    /**
     * 查询固定资产分类
     * 
     * @param id 固定资产分类主键
     * @return 固定资产分类
     */
    @Override
    public CmfFixedassetgroup selectCmfFixedassetgroupById(Integer id)
    {
        return cmfFixedassetgroupMapper.selectCmfFixedassetgroupById(id);
    }

    /**
     * 查询固定资产分类列表
     * 
     * @param cmfFixedassetgroup 固定资产分类
     * @return 固定资产分类
     */
    @Override
    public List<CmfFixedassetgroup> selectCmfFixedassetgroupList(CmfFixedassetgroup cmfFixedassetgroup)
    {
        return cmfFixedassetgroupMapper.selectCmfFixedassetgroupList(cmfFixedassetgroup);
    }

    /**
     * 新增固定资产分类
     * 
     * @param cmfFixedassetgroup 固定资产分类
     * @return 结果
     */
    @Override
    public int insertCmfFixedassetgroup(CmfFixedassetgroup cmfFixedassetgroup)
    {
        return cmfFixedassetgroupMapper.insertCmfFixedassetgroup(cmfFixedassetgroup);
    }

    /**
     * 修改固定资产分类
     * 
     * @param cmfFixedassetgroup 固定资产分类
     * @return 结果
     */
    @Override
    public int updateCmfFixedassetgroup(CmfFixedassetgroup cmfFixedassetgroup)
    {
        return cmfFixedassetgroupMapper.updateCmfFixedassetgroup(cmfFixedassetgroup);
    }

    /**
     * 批量删除固定资产分类
     * 
     * @param ids 需要删除的固定资产分类主键
     * @return 结果
     */
    @Override
    public int deleteCmfFixedassetgroupByIds(Integer[] ids)
    {
        return cmfFixedassetgroupMapper.deleteCmfFixedassetgroupByIds(ids);
    }

    /**
     * 删除固定资产分类信息
     * 
     * @param id 固定资产分类主键
     * @return 结果
     */
    @Override
    public int deleteCmfFixedassetgroupById(Integer id)
    {
        return cmfFixedassetgroupMapper.deleteCmfFixedassetgroupById(id);
    }
}
