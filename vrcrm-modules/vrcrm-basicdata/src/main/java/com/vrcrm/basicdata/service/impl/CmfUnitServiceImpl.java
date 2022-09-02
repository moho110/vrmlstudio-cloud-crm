package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfUnitMapper;
import com.vrcrm.basicdata.domain.CmfUnit;
import com.vrcrm.basicdata.service.ICmfUnitService;

/**
 * 单位Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfUnitServiceImpl implements ICmfUnitService 
{
    @Autowired
    private CmfUnitMapper cmfUnitMapper;

    /**
     * 查询单位
     * 
     * @param id 单位主键
     * @return 单位
     */
    @Override
    public CmfUnit selectCmfUnitById(Integer id)
    {
        return cmfUnitMapper.selectCmfUnitById(id);
    }

    /**
     * 查询单位列表
     * 
     * @param cmfUnit 单位
     * @return 单位
     */
    @Override
    public List<CmfUnit> selectCmfUnitList(CmfUnit cmfUnit)
    {
        return cmfUnitMapper.selectCmfUnitList(cmfUnit);
    }

    /**
     * 新增单位
     * 
     * @param cmfUnit 单位
     * @return 结果
     */
    @Override
    public int insertCmfUnit(CmfUnit cmfUnit)
    {
        return cmfUnitMapper.insertCmfUnit(cmfUnit);
    }

    /**
     * 修改单位
     * 
     * @param cmfUnit 单位
     * @return 结果
     */
    @Override
    public int updateCmfUnit(CmfUnit cmfUnit)
    {
        return cmfUnitMapper.updateCmfUnit(cmfUnit);
    }

    /**
     * 批量删除单位
     * 
     * @param ids 需要删除的单位主键
     * @return 结果
     */
    @Override
    public int deleteCmfUnitByIds(Integer[] ids)
    {
        return cmfUnitMapper.deleteCmfUnitByIds(ids);
    }

    /**
     * 删除单位信息
     * 
     * @param id 单位主键
     * @return 结果
     */
    @Override
    public int deleteCmfUnitById(Integer id)
    {
        return cmfUnitMapper.deleteCmfUnitById(id);
    }
}
