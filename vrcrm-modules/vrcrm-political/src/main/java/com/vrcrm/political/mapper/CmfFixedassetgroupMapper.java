package com.vrcrm.political.mapper;

import java.util.List;
import com.vrcrm.political.domain.CmfFixedassetgroup;

/**
 * 固定资产分类Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfFixedassetgroupMapper 
{
    /**
     * 查询固定资产分类
     * 
     * @param id 固定资产分类主键
     * @return 固定资产分类
     */
    public CmfFixedassetgroup selectCmfFixedassetgroupById(Integer id);

    /**
     * 查询固定资产分类列表
     * 
     * @param cmfFixedassetgroup 固定资产分类
     * @return 固定资产分类集合
     */
    public List<CmfFixedassetgroup> selectCmfFixedassetgroupList(CmfFixedassetgroup cmfFixedassetgroup);

    /**
     * 新增固定资产分类
     * 
     * @param cmfFixedassetgroup 固定资产分类
     * @return 结果
     */
    public int insertCmfFixedassetgroup(CmfFixedassetgroup cmfFixedassetgroup);

    /**
     * 修改固定资产分类
     * 
     * @param cmfFixedassetgroup 固定资产分类
     * @return 结果
     */
    public int updateCmfFixedassetgroup(CmfFixedassetgroup cmfFixedassetgroup);

    /**
     * 删除固定资产分类
     * 
     * @param id 固定资产分类主键
     * @return 结果
     */
    public int deleteCmfFixedassetgroupById(Integer id);

    /**
     * 批量删除固定资产分类
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfFixedassetgroupByIds(Integer[] ids);
}
