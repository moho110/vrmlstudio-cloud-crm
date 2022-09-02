package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfDormBuildingMapper;
import com.vrcrm.political.domain.CmfDormBuilding;
import com.vrcrm.political.service.ICmfDormBuildingService;

/**
 * 宿舍楼Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfDormBuildingServiceImpl implements ICmfDormBuildingService 
{
    @Autowired
    private CmfDormBuildingMapper cmfDormBuildingMapper;

    /**
     * 查询宿舍楼
     * 
     * @param id 宿舍楼主键
     * @return 宿舍楼
     */
    @Override
    public CmfDormBuilding selectCmfDormBuildingById(Integer id)
    {
        return cmfDormBuildingMapper.selectCmfDormBuildingById(id);
    }

    /**
     * 查询宿舍楼列表
     * 
     * @param cmfDormBuilding 宿舍楼
     * @return 宿舍楼
     */
    @Override
    public List<CmfDormBuilding> selectCmfDormBuildingList(CmfDormBuilding cmfDormBuilding)
    {
        return cmfDormBuildingMapper.selectCmfDormBuildingList(cmfDormBuilding);
    }

    /**
     * 新增宿舍楼
     * 
     * @param cmfDormBuilding 宿舍楼
     * @return 结果
     */
    @Override
    public int insertCmfDormBuilding(CmfDormBuilding cmfDormBuilding)
    {
        return cmfDormBuildingMapper.insertCmfDormBuilding(cmfDormBuilding);
    }

    /**
     * 修改宿舍楼
     * 
     * @param cmfDormBuilding 宿舍楼
     * @return 结果
     */
    @Override
    public int updateCmfDormBuilding(CmfDormBuilding cmfDormBuilding)
    {
        return cmfDormBuildingMapper.updateCmfDormBuilding(cmfDormBuilding);
    }

    /**
     * 批量删除宿舍楼
     * 
     * @param ids 需要删除的宿舍楼主键
     * @return 结果
     */
    @Override
    public int deleteCmfDormBuildingByIds(Integer[] ids)
    {
        return cmfDormBuildingMapper.deleteCmfDormBuildingByIds(ids);
    }

    /**
     * 删除宿舍楼信息
     * 
     * @param id 宿舍楼主键
     * @return 结果
     */
    @Override
    public int deleteCmfDormBuildingById(Integer id)
    {
        return cmfDormBuildingMapper.deleteCmfDormBuildingById(id);
    }
}
