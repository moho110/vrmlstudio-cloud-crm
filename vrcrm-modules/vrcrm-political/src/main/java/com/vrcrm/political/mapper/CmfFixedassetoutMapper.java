package com.vrcrm.political.mapper;

import java.util.List;
import com.vrcrm.political.domain.CmfFixedassetout;

/**
 * 固定资产出库Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfFixedassetoutMapper 
{
    /**
     * 查询固定资产出库
     * 
     * @param id 固定资产出库主键
     * @return 固定资产出库
     */
    public CmfFixedassetout selectCmfFixedassetoutById(Integer id);

    /**
     * 查询固定资产出库列表
     * 
     * @param cmfFixedassetout 固定资产出库
     * @return 固定资产出库集合
     */
    public List<CmfFixedassetout> selectCmfFixedassetoutList(CmfFixedassetout cmfFixedassetout);

    /**
     * 新增固定资产出库
     * 
     * @param cmfFixedassetout 固定资产出库
     * @return 结果
     */
    public int insertCmfFixedassetout(CmfFixedassetout cmfFixedassetout);

    /**
     * 修改固定资产出库
     * 
     * @param cmfFixedassetout 固定资产出库
     * @return 结果
     */
    public int updateCmfFixedassetout(CmfFixedassetout cmfFixedassetout);

    /**
     * 删除固定资产出库
     * 
     * @param id 固定资产出库主键
     * @return 结果
     */
    public int deleteCmfFixedassetoutById(Integer id);

    /**
     * 批量删除固定资产出库
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfFixedassetoutByIds(Integer[] ids);
}
