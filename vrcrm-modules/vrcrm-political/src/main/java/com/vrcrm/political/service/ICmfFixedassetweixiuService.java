package com.vrcrm.political.service;

import java.util.List;
import com.vrcrm.political.domain.CmfFixedassetweixiu;

/**
 * 固定资产维修Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfFixedassetweixiuService 
{
    /**
     * 查询固定资产维修
     * 
     * @param id 固定资产维修主键
     * @return 固定资产维修
     */
    public CmfFixedassetweixiu selectCmfFixedassetweixiuById(Integer id);

    /**
     * 查询固定资产维修列表
     * 
     * @param cmfFixedassetweixiu 固定资产维修
     * @return 固定资产维修集合
     */
    public List<CmfFixedassetweixiu> selectCmfFixedassetweixiuList(CmfFixedassetweixiu cmfFixedassetweixiu);

    /**
     * 新增固定资产维修
     * 
     * @param cmfFixedassetweixiu 固定资产维修
     * @return 结果
     */
    public int insertCmfFixedassetweixiu(CmfFixedassetweixiu cmfFixedassetweixiu);

    /**
     * 修改固定资产维修
     * 
     * @param cmfFixedassetweixiu 固定资产维修
     * @return 结果
     */
    public int updateCmfFixedassetweixiu(CmfFixedassetweixiu cmfFixedassetweixiu);

    /**
     * 批量删除固定资产维修
     * 
     * @param ids 需要删除的固定资产维修主键集合
     * @return 结果
     */
    public int deleteCmfFixedassetweixiuByIds(Integer[] ids);

    /**
     * 删除固定资产维修信息
     * 
     * @param id 固定资产维修主键
     * @return 结果
     */
    public int deleteCmfFixedassetweixiuById(Integer id);
}
