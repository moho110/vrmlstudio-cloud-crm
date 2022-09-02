package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfMeasureMapper;
import com.vrcrm.basicdata.domain.CmfMeasure;
import com.vrcrm.basicdata.service.ICmfMeasureService;

/**
 * 计量单位Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfMeasureServiceImpl implements ICmfMeasureService 
{
    @Autowired
    private CmfMeasureMapper cmfMeasureMapper;

    /**
     * 查询计量单位
     * 
     * @param id 计量单位主键
     * @return 计量单位
     */
    @Override
    public CmfMeasure selectCmfMeasureById(Integer id)
    {
        return cmfMeasureMapper.selectCmfMeasureById(id);
    }

    /**
     * 查询计量单位列表
     * 
     * @param cmfMeasure 计量单位
     * @return 计量单位
     */
    @Override
    public List<CmfMeasure> selectCmfMeasureList(CmfMeasure cmfMeasure)
    {
        return cmfMeasureMapper.selectCmfMeasureList(cmfMeasure);
    }

    /**
     * 新增计量单位
     * 
     * @param cmfMeasure 计量单位
     * @return 结果
     */
    @Override
    public int insertCmfMeasure(CmfMeasure cmfMeasure)
    {
        return cmfMeasureMapper.insertCmfMeasure(cmfMeasure);
    }

    /**
     * 修改计量单位
     * 
     * @param cmfMeasure 计量单位
     * @return 结果
     */
    @Override
    public int updateCmfMeasure(CmfMeasure cmfMeasure)
    {
        return cmfMeasureMapper.updateCmfMeasure(cmfMeasure);
    }

    /**
     * 批量删除计量单位
     * 
     * @param ids 需要删除的计量单位主键
     * @return 结果
     */
    @Override
    public int deleteCmfMeasureByIds(Integer[] ids)
    {
        return cmfMeasureMapper.deleteCmfMeasureByIds(ids);
    }

    /**
     * 删除计量单位信息
     * 
     * @param id 计量单位主键
     * @return 结果
     */
    @Override
    public int deleteCmfMeasureById(Integer id)
    {
        return cmfMeasureMapper.deleteCmfMeasureById(id);
    }
}
