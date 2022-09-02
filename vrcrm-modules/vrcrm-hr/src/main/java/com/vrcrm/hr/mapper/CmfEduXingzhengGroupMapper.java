package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfEduXingzhengGroup;

/**
 * 行政分类Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfEduXingzhengGroupMapper 
{
    /**
     * 查询行政分类
     * 
     * @param id 行政分类主键
     * @return 行政分类
     */
    public CmfEduXingzhengGroup selectCmfEduXingzhengGroupById(Integer id);

    /**
     * 查询行政分类列表
     * 
     * @param cmfEduXingzhengGroup 行政分类
     * @return 行政分类集合
     */
    public List<CmfEduXingzhengGroup> selectCmfEduXingzhengGroupList(CmfEduXingzhengGroup cmfEduXingzhengGroup);

    /**
     * 新增行政分类
     * 
     * @param cmfEduXingzhengGroup 行政分类
     * @return 结果
     */
    public int insertCmfEduXingzhengGroup(CmfEduXingzhengGroup cmfEduXingzhengGroup);

    /**
     * 修改行政分类
     * 
     * @param cmfEduXingzhengGroup 行政分类
     * @return 结果
     */
    public int updateCmfEduXingzhengGroup(CmfEduXingzhengGroup cmfEduXingzhengGroup);

    /**
     * 删除行政分类
     * 
     * @param id 行政分类主键
     * @return 结果
     */
    public int deleteCmfEduXingzhengGroupById(Integer id);

    /**
     * 批量删除行政分类
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfEduXingzhengGroupByIds(Integer[] ids);
}
