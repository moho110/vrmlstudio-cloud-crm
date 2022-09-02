package com.vrcrm.political.service;

import java.util.List;
import com.vrcrm.political.domain.CmfOfficeproductgroup;

/**
 * 办公用品分类Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfOfficeproductgroupService 
{
    /**
     * 查询办公用品分类
     * 
     * @param id 办公用品分类主键
     * @return 办公用品分类
     */
    public CmfOfficeproductgroup selectCmfOfficeproductgroupById(Integer id);

    /**
     * 查询办公用品分类列表
     * 
     * @param cmfOfficeproductgroup 办公用品分类
     * @return 办公用品分类集合
     */
    public List<CmfOfficeproductgroup> selectCmfOfficeproductgroupList(CmfOfficeproductgroup cmfOfficeproductgroup);

    /**
     * 新增办公用品分类
     * 
     * @param cmfOfficeproductgroup 办公用品分类
     * @return 结果
     */
    public int insertCmfOfficeproductgroup(CmfOfficeproductgroup cmfOfficeproductgroup);

    /**
     * 修改办公用品分类
     * 
     * @param cmfOfficeproductgroup 办公用品分类
     * @return 结果
     */
    public int updateCmfOfficeproductgroup(CmfOfficeproductgroup cmfOfficeproductgroup);

    /**
     * 批量删除办公用品分类
     * 
     * @param ids 需要删除的办公用品分类主键集合
     * @return 结果
     */
    public int deleteCmfOfficeproductgroupByIds(Integer[] ids);

    /**
     * 删除办公用品分类信息
     * 
     * @param id 办公用品分类主键
     * @return 结果
     */
    public int deleteCmfOfficeproductgroupById(Integer id);
}
