package com.vrcrm.political.mapper;

import java.util.List;
import com.vrcrm.political.domain.CmfEduBuilding;

/**
 * 教学楼Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfEduBuildingMapper 
{
    /**
     * 查询教学楼
     * 
     * @param id 教学楼主键
     * @return 教学楼
     */
    public CmfEduBuilding selectCmfEduBuildingById(Integer id);

    /**
     * 查询教学楼列表
     * 
     * @param cmfEduBuilding 教学楼
     * @return 教学楼集合
     */
    public List<CmfEduBuilding> selectCmfEduBuildingList(CmfEduBuilding cmfEduBuilding);

    /**
     * 新增教学楼
     * 
     * @param cmfEduBuilding 教学楼
     * @return 结果
     */
    public int insertCmfEduBuilding(CmfEduBuilding cmfEduBuilding);

    /**
     * 修改教学楼
     * 
     * @param cmfEduBuilding 教学楼
     * @return 结果
     */
    public int updateCmfEduBuilding(CmfEduBuilding cmfEduBuilding);

    /**
     * 删除教学楼
     * 
     * @param id 教学楼主键
     * @return 结果
     */
    public int deleteCmfEduBuildingById(Integer id);

    /**
     * 批量删除教学楼
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfEduBuildingByIds(Integer[] ids);
}
