package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfOfficeproductgroupMapper;
import com.vrcrm.political.domain.CmfOfficeproductgroup;
import com.vrcrm.political.service.ICmfOfficeproductgroupService;

/**
 * 办公用品分类Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfOfficeproductgroupServiceImpl implements ICmfOfficeproductgroupService 
{
    @Autowired
    private CmfOfficeproductgroupMapper cmfOfficeproductgroupMapper;

    /**
     * 查询办公用品分类
     * 
     * @param id 办公用品分类主键
     * @return 办公用品分类
     */
    @Override
    public CmfOfficeproductgroup selectCmfOfficeproductgroupById(Integer id)
    {
        return cmfOfficeproductgroupMapper.selectCmfOfficeproductgroupById(id);
    }

    /**
     * 查询办公用品分类列表
     * 
     * @param cmfOfficeproductgroup 办公用品分类
     * @return 办公用品分类
     */
    @Override
    public List<CmfOfficeproductgroup> selectCmfOfficeproductgroupList(CmfOfficeproductgroup cmfOfficeproductgroup)
    {
        return cmfOfficeproductgroupMapper.selectCmfOfficeproductgroupList(cmfOfficeproductgroup);
    }

    /**
     * 新增办公用品分类
     * 
     * @param cmfOfficeproductgroup 办公用品分类
     * @return 结果
     */
    @Override
    public int insertCmfOfficeproductgroup(CmfOfficeproductgroup cmfOfficeproductgroup)
    {
        return cmfOfficeproductgroupMapper.insertCmfOfficeproductgroup(cmfOfficeproductgroup);
    }

    /**
     * 修改办公用品分类
     * 
     * @param cmfOfficeproductgroup 办公用品分类
     * @return 结果
     */
    @Override
    public int updateCmfOfficeproductgroup(CmfOfficeproductgroup cmfOfficeproductgroup)
    {
        return cmfOfficeproductgroupMapper.updateCmfOfficeproductgroup(cmfOfficeproductgroup);
    }

    /**
     * 批量删除办公用品分类
     * 
     * @param ids 需要删除的办公用品分类主键
     * @return 结果
     */
    @Override
    public int deleteCmfOfficeproductgroupByIds(Integer[] ids)
    {
        return cmfOfficeproductgroupMapper.deleteCmfOfficeproductgroupByIds(ids);
    }

    /**
     * 删除办公用品分类信息
     * 
     * @param id 办公用品分类主键
     * @return 结果
     */
    @Override
    public int deleteCmfOfficeproductgroupById(Integer id)
    {
        return cmfOfficeproductgroupMapper.deleteCmfOfficeproductgroupById(id);
    }
}
