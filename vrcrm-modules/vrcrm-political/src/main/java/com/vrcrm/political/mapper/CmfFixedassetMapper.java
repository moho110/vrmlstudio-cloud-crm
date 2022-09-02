package com.vrcrm.political.mapper;

import java.util.List;
import com.vrcrm.political.domain.CmfFixedasset;

/**
 * 固定资产Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfFixedassetMapper 
{
    /**
     * 查询固定资产
     * 
     * @param id 固定资产主键
     * @return 固定资产
     */
    public CmfFixedasset selectCmfFixedassetById(Integer id);

    /**
     * 查询固定资产列表
     * 
     * @param cmfFixedasset 固定资产
     * @return 固定资产集合
     */
    public List<CmfFixedasset> selectCmfFixedassetList(CmfFixedasset cmfFixedasset);

    /**
     * 新增固定资产
     * 
     * @param cmfFixedasset 固定资产
     * @return 结果
     */
    public int insertCmfFixedasset(CmfFixedasset cmfFixedasset);

    /**
     * 修改固定资产
     * 
     * @param cmfFixedasset 固定资产
     * @return 结果
     */
    public int updateCmfFixedasset(CmfFixedasset cmfFixedasset);

    /**
     * 删除固定资产
     * 
     * @param id 固定资产主键
     * @return 结果
     */
    public int deleteCmfFixedassetById(Integer id);

    /**
     * 批量删除固定资产
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfFixedassetByIds(Integer[] ids);
}
