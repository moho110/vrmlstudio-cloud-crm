package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfEduBuildingMapper;
import com.vrcrm.political.domain.CmfEduBuilding;
import com.vrcrm.political.service.ICmfEduBuildingService;

/**
 * 教学楼Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfEduBuildingServiceImpl implements ICmfEduBuildingService 
{
    @Autowired
    private CmfEduBuildingMapper cmfEduBuildingMapper;

    /**
     * 查询教学楼
     * 
     * @param id 教学楼主键
     * @return 教学楼
     */
    @Override
    public CmfEduBuilding selectCmfEduBuildingById(Integer id)
    {
        return cmfEduBuildingMapper.selectCmfEduBuildingById(id);
    }

    /**
     * 查询教学楼列表
     * 
     * @param cmfEduBuilding 教学楼
     * @return 教学楼
     */
    @Override
    public List<CmfEduBuilding> selectCmfEduBuildingList(CmfEduBuilding cmfEduBuilding)
    {
        return cmfEduBuildingMapper.selectCmfEduBuildingList(cmfEduBuilding);
    }

    /**
     * 新增教学楼
     * 
     * @param cmfEduBuilding 教学楼
     * @return 结果
     */
    @Override
    public int insertCmfEduBuilding(CmfEduBuilding cmfEduBuilding)
    {
        return cmfEduBuildingMapper.insertCmfEduBuilding(cmfEduBuilding);
    }

    /**
     * 修改教学楼
     * 
     * @param cmfEduBuilding 教学楼
     * @return 结果
     */
    @Override
    public int updateCmfEduBuilding(CmfEduBuilding cmfEduBuilding)
    {
        return cmfEduBuildingMapper.updateCmfEduBuilding(cmfEduBuilding);
    }

    /**
     * 批量删除教学楼
     * 
     * @param ids 需要删除的教学楼主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduBuildingByIds(Integer[] ids)
    {
        return cmfEduBuildingMapper.deleteCmfEduBuildingByIds(ids);
    }

    /**
     * 删除教学楼信息
     * 
     * @param id 教学楼主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduBuildingById(Integer id)
    {
        return cmfEduBuildingMapper.deleteCmfEduBuildingById(id);
    }
}
