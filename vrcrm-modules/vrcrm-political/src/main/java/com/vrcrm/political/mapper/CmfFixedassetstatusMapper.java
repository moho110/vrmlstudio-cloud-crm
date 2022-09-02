package com.vrcrm.political.mapper;

import java.util.List;
import com.vrcrm.political.domain.CmfFixedassetstatus;

/**
 * 固定资产状态Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfFixedassetstatusMapper 
{
    /**
     * 查询固定资产状态
     * 
     * @param id 固定资产状态主键
     * @return 固定资产状态
     */
    public CmfFixedassetstatus selectCmfFixedassetstatusById(Integer id);

    /**
     * 查询固定资产状态列表
     * 
     * @param cmfFixedassetstatus 固定资产状态
     * @return 固定资产状态集合
     */
    public List<CmfFixedassetstatus> selectCmfFixedassetstatusList(CmfFixedassetstatus cmfFixedassetstatus);

    /**
     * 新增固定资产状态
     * 
     * @param cmfFixedassetstatus 固定资产状态
     * @return 结果
     */
    public int insertCmfFixedassetstatus(CmfFixedassetstatus cmfFixedassetstatus);

    /**
     * 修改固定资产状态
     * 
     * @param cmfFixedassetstatus 固定资产状态
     * @return 结果
     */
    public int updateCmfFixedassetstatus(CmfFixedassetstatus cmfFixedassetstatus);

    /**
     * 删除固定资产状态
     * 
     * @param id 固定资产状态主键
     * @return 结果
     */
    public int deleteCmfFixedassetstatusById(Integer id);

    /**
     * 批量删除固定资产状态
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfFixedassetstatusByIds(Integer[] ids);
}
