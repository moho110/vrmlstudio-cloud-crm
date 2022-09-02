package com.vrcrm.political.mapper;

import java.util.List;
import com.vrcrm.political.domain.CmfFixedassetleibie;

/**
 * 固定资产类别Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfFixedassetleibieMapper 
{
    /**
     * 查询固定资产类别
     * 
     * @param id 固定资产类别主键
     * @return 固定资产类别
     */
    public CmfFixedassetleibie selectCmfFixedassetleibieById(Integer id);

    /**
     * 查询固定资产类别列表
     * 
     * @param cmfFixedassetleibie 固定资产类别
     * @return 固定资产类别集合
     */
    public List<CmfFixedassetleibie> selectCmfFixedassetleibieList(CmfFixedassetleibie cmfFixedassetleibie);

    /**
     * 新增固定资产类别
     * 
     * @param cmfFixedassetleibie 固定资产类别
     * @return 结果
     */
    public int insertCmfFixedassetleibie(CmfFixedassetleibie cmfFixedassetleibie);

    /**
     * 修改固定资产类别
     * 
     * @param cmfFixedassetleibie 固定资产类别
     * @return 结果
     */
    public int updateCmfFixedassetleibie(CmfFixedassetleibie cmfFixedassetleibie);

    /**
     * 删除固定资产类别
     * 
     * @param id 固定资产类别主键
     * @return 结果
     */
    public int deleteCmfFixedassetleibieById(Integer id);

    /**
     * 批量删除固定资产类别
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfFixedassetleibieByIds(Integer[] ids);
}
