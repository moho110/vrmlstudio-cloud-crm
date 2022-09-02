package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfEduZhongcengceping;

/**
 * 中层测评Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfEduZhongcengcepingMapper 
{
    /**
     * 查询中层测评
     * 
     * @param id 中层测评主键
     * @return 中层测评
     */
    public CmfEduZhongcengceping selectCmfEduZhongcengcepingById(Integer id);

    /**
     * 查询中层测评列表
     * 
     * @param cmfEduZhongcengceping 中层测评
     * @return 中层测评集合
     */
    public List<CmfEduZhongcengceping> selectCmfEduZhongcengcepingList(CmfEduZhongcengceping cmfEduZhongcengceping);

    /**
     * 新增中层测评
     * 
     * @param cmfEduZhongcengceping 中层测评
     * @return 结果
     */
    public int insertCmfEduZhongcengceping(CmfEduZhongcengceping cmfEduZhongcengceping);

    /**
     * 修改中层测评
     * 
     * @param cmfEduZhongcengceping 中层测评
     * @return 结果
     */
    public int updateCmfEduZhongcengceping(CmfEduZhongcengceping cmfEduZhongcengceping);

    /**
     * 删除中层测评
     * 
     * @param id 中层测评主键
     * @return 结果
     */
    public int deleteCmfEduZhongcengcepingById(Integer id);

    /**
     * 批量删除中层测评
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfEduZhongcengcepingByIds(Integer[] ids);
}
