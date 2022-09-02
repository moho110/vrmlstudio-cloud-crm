package com.vrcrm.political.mapper;

import java.util.List;
import com.vrcrm.political.domain.CmfDormBuilding;

/**
 * 宿舍楼Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfDormBuildingMapper 
{
    /**
     * 查询宿舍楼
     * 
     * @param id 宿舍楼主键
     * @return 宿舍楼
     */
    public CmfDormBuilding selectCmfDormBuildingById(Integer id);

    /**
     * 查询宿舍楼列表
     * 
     * @param cmfDormBuilding 宿舍楼
     * @return 宿舍楼集合
     */
    public List<CmfDormBuilding> selectCmfDormBuildingList(CmfDormBuilding cmfDormBuilding);

    /**
     * 新增宿舍楼
     * 
     * @param cmfDormBuilding 宿舍楼
     * @return 结果
     */
    public int insertCmfDormBuilding(CmfDormBuilding cmfDormBuilding);

    /**
     * 修改宿舍楼
     * 
     * @param cmfDormBuilding 宿舍楼
     * @return 结果
     */
    public int updateCmfDormBuilding(CmfDormBuilding cmfDormBuilding);

    /**
     * 删除宿舍楼
     * 
     * @param id 宿舍楼主键
     * @return 结果
     */
    public int deleteCmfDormBuildingById(Integer id);

    /**
     * 批量删除宿舍楼
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfDormBuildingByIds(Integer[] ids);
}
