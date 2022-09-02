package com.vrcrm.political.service;

import java.util.List;
import com.vrcrm.political.domain.CmfFixedassetin;

/**
 * 固定资产入库Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfFixedassetinService 
{
    /**
     * 查询固定资产入库
     * 
     * @param id 固定资产入库主键
     * @return 固定资产入库
     */
    public CmfFixedassetin selectCmfFixedassetinById(Integer id);

    /**
     * 查询固定资产入库列表
     * 
     * @param cmfFixedassetin 固定资产入库
     * @return 固定资产入库集合
     */
    public List<CmfFixedassetin> selectCmfFixedassetinList(CmfFixedassetin cmfFixedassetin);

    /**
     * 新增固定资产入库
     * 
     * @param cmfFixedassetin 固定资产入库
     * @return 结果
     */
    public int insertCmfFixedassetin(CmfFixedassetin cmfFixedassetin);

    /**
     * 修改固定资产入库
     * 
     * @param cmfFixedassetin 固定资产入库
     * @return 结果
     */
    public int updateCmfFixedassetin(CmfFixedassetin cmfFixedassetin);

    /**
     * 批量删除固定资产入库
     * 
     * @param ids 需要删除的固定资产入库主键集合
     * @return 结果
     */
    public int deleteCmfFixedassetinByIds(Integer[] ids);

    /**
     * 删除固定资产入库信息
     * 
     * @param id 固定资产入库主键
     * @return 结果
     */
    public int deleteCmfFixedassetinById(Integer id);
}
