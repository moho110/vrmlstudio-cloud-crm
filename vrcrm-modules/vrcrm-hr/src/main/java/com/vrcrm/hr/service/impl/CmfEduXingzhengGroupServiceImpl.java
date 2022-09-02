package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfEduXingzhengGroupMapper;
import com.vrcrm.hr.domain.CmfEduXingzhengGroup;
import com.vrcrm.hr.service.ICmfEduXingzhengGroupService;

/**
 * 行政分类Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfEduXingzhengGroupServiceImpl implements ICmfEduXingzhengGroupService 
{
    @Autowired
    private CmfEduXingzhengGroupMapper cmfEduXingzhengGroupMapper;

    /**
     * 查询行政分类
     * 
     * @param id 行政分类主键
     * @return 行政分类
     */
    @Override
    public CmfEduXingzhengGroup selectCmfEduXingzhengGroupById(Integer id)
    {
        return cmfEduXingzhengGroupMapper.selectCmfEduXingzhengGroupById(id);
    }

    /**
     * 查询行政分类列表
     * 
     * @param cmfEduXingzhengGroup 行政分类
     * @return 行政分类
     */
    @Override
    public List<CmfEduXingzhengGroup> selectCmfEduXingzhengGroupList(CmfEduXingzhengGroup cmfEduXingzhengGroup)
    {
        return cmfEduXingzhengGroupMapper.selectCmfEduXingzhengGroupList(cmfEduXingzhengGroup);
    }

    /**
     * 新增行政分类
     * 
     * @param cmfEduXingzhengGroup 行政分类
     * @return 结果
     */
    @Override
    public int insertCmfEduXingzhengGroup(CmfEduXingzhengGroup cmfEduXingzhengGroup)
    {
        return cmfEduXingzhengGroupMapper.insertCmfEduXingzhengGroup(cmfEduXingzhengGroup);
    }

    /**
     * 修改行政分类
     * 
     * @param cmfEduXingzhengGroup 行政分类
     * @return 结果
     */
    @Override
    public int updateCmfEduXingzhengGroup(CmfEduXingzhengGroup cmfEduXingzhengGroup)
    {
        return cmfEduXingzhengGroupMapper.updateCmfEduXingzhengGroup(cmfEduXingzhengGroup);
    }

    /**
     * 批量删除行政分类
     * 
     * @param ids 需要删除的行政分类主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengGroupByIds(Integer[] ids)
    {
        return cmfEduXingzhengGroupMapper.deleteCmfEduXingzhengGroupByIds(ids);
    }

    /**
     * 删除行政分类信息
     * 
     * @param id 行政分类主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengGroupById(Integer id)
    {
        return cmfEduXingzhengGroupMapper.deleteCmfEduXingzhengGroupById(id);
    }
}
