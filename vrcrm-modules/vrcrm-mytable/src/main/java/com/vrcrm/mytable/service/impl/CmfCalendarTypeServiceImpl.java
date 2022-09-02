package com.vrcrm.mytable.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.mytable.mapper.CmfCalendarTypeMapper;
import com.vrcrm.mytable.domain.CmfCalendarType;
import com.vrcrm.mytable.service.ICmfCalendarTypeService;

/**
 * 日程类型Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfCalendarTypeServiceImpl implements ICmfCalendarTypeService 
{
    @Autowired
    private CmfCalendarTypeMapper cmfCalendarTypeMapper;

    /**
     * 查询日程类型
     * 
     * @param id 日程类型主键
     * @return 日程类型
     */
    @Override
    public CmfCalendarType selectCmfCalendarTypeById(Integer id)
    {
        return cmfCalendarTypeMapper.selectCmfCalendarTypeById(id);
    }

    /**
     * 查询日程类型列表
     * 
     * @param cmfCalendarType 日程类型
     * @return 日程类型
     */
    @Override
    public List<CmfCalendarType> selectCmfCalendarTypeList(CmfCalendarType cmfCalendarType)
    {
        return cmfCalendarTypeMapper.selectCmfCalendarTypeList(cmfCalendarType);
    }

    /**
     * 新增日程类型
     * 
     * @param cmfCalendarType 日程类型
     * @return 结果
     */
    @Override
    public int insertCmfCalendarType(CmfCalendarType cmfCalendarType)
    {
        return cmfCalendarTypeMapper.insertCmfCalendarType(cmfCalendarType);
    }

    /**
     * 修改日程类型
     * 
     * @param cmfCalendarType 日程类型
     * @return 结果
     */
    @Override
    public int updateCmfCalendarType(CmfCalendarType cmfCalendarType)
    {
        return cmfCalendarTypeMapper.updateCmfCalendarType(cmfCalendarType);
    }

    /**
     * 批量删除日程类型
     * 
     * @param ids 需要删除的日程类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfCalendarTypeByIds(Integer[] ids)
    {
        return cmfCalendarTypeMapper.deleteCmfCalendarTypeByIds(ids);
    }

    /**
     * 删除日程类型信息
     * 
     * @param id 日程类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfCalendarTypeById(Integer id)
    {
        return cmfCalendarTypeMapper.deleteCmfCalendarTypeById(id);
    }
}
