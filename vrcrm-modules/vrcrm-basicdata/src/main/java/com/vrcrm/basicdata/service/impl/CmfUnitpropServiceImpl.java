package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfUnitpropMapper;
import com.vrcrm.basicdata.domain.CmfUnitprop;
import com.vrcrm.basicdata.service.ICmfUnitpropService;

/**
 * 单位属性Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfUnitpropServiceImpl implements ICmfUnitpropService 
{
    @Autowired
    private CmfUnitpropMapper cmfUnitpropMapper;

    /**
     * 查询单位属性
     * 
     * @param id 单位属性主键
     * @return 单位属性
     */
    @Override
    public CmfUnitprop selectCmfUnitpropById(Integer id)
    {
        return cmfUnitpropMapper.selectCmfUnitpropById(id);
    }

    /**
     * 查询单位属性列表
     * 
     * @param cmfUnitprop 单位属性
     * @return 单位属性
     */
    @Override
    public List<CmfUnitprop> selectCmfUnitpropList(CmfUnitprop cmfUnitprop)
    {
        return cmfUnitpropMapper.selectCmfUnitpropList(cmfUnitprop);
    }

    /**
     * 新增单位属性
     * 
     * @param cmfUnitprop 单位属性
     * @return 结果
     */
    @Override
    public int insertCmfUnitprop(CmfUnitprop cmfUnitprop)
    {
        return cmfUnitpropMapper.insertCmfUnitprop(cmfUnitprop);
    }

    /**
     * 修改单位属性
     * 
     * @param cmfUnitprop 单位属性
     * @return 结果
     */
    @Override
    public int updateCmfUnitprop(CmfUnitprop cmfUnitprop)
    {
        return cmfUnitpropMapper.updateCmfUnitprop(cmfUnitprop);
    }

    /**
     * 批量删除单位属性
     * 
     * @param ids 需要删除的单位属性主键
     * @return 结果
     */
    @Override
    public int deleteCmfUnitpropByIds(Integer[] ids)
    {
        return cmfUnitpropMapper.deleteCmfUnitpropByIds(ids);
    }

    /**
     * 删除单位属性信息
     * 
     * @param id 单位属性主键
     * @return 结果
     */
    @Override
    public int deleteCmfUnitpropById(Integer id)
    {
        return cmfUnitpropMapper.deleteCmfUnitpropById(id);
    }
}
