package com.vrcrm.political.mapper;

import java.util.List;
import com.vrcrm.political.domain.CmfFixedassetbaofei;

/**
 * 固定资产报废Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfFixedassetbaofeiMapper 
{
    /**
     * 查询固定资产报废
     * 
     * @param id 固定资产报废主键
     * @return 固定资产报废
     */
    public CmfFixedassetbaofei selectCmfFixedassetbaofeiById(Integer id);

    /**
     * 查询固定资产报废列表
     * 
     * @param cmfFixedassetbaofei 固定资产报废
     * @return 固定资产报废集合
     */
    public List<CmfFixedassetbaofei> selectCmfFixedassetbaofeiList(CmfFixedassetbaofei cmfFixedassetbaofei);

    /**
     * 新增固定资产报废
     * 
     * @param cmfFixedassetbaofei 固定资产报废
     * @return 结果
     */
    public int insertCmfFixedassetbaofei(CmfFixedassetbaofei cmfFixedassetbaofei);

    /**
     * 修改固定资产报废
     * 
     * @param cmfFixedassetbaofei 固定资产报废
     * @return 结果
     */
    public int updateCmfFixedassetbaofei(CmfFixedassetbaofei cmfFixedassetbaofei);

    /**
     * 删除固定资产报废
     * 
     * @param id 固定资产报废主键
     * @return 结果
     */
    public int deleteCmfFixedassetbaofeiById(Integer id);

    /**
     * 批量删除固定资产报废
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfFixedassetbaofeiByIds(Integer[] ids);
}
