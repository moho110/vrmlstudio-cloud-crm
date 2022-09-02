package com.vrcrm.mytable.service;

import java.util.List;
import com.vrcrm.mytable.domain.CmfCalendarType;

/**
 * 日程类型Service接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface ICmfCalendarTypeService 
{
    /**
     * 查询日程类型
     * 
     * @param id 日程类型主键
     * @return 日程类型
     */
    public CmfCalendarType selectCmfCalendarTypeById(Integer id);

    /**
     * 查询日程类型列表
     * 
     * @param cmfCalendarType 日程类型
     * @return 日程类型集合
     */
    public List<CmfCalendarType> selectCmfCalendarTypeList(CmfCalendarType cmfCalendarType);

    /**
     * 新增日程类型
     * 
     * @param cmfCalendarType 日程类型
     * @return 结果
     */
    public int insertCmfCalendarType(CmfCalendarType cmfCalendarType);

    /**
     * 修改日程类型
     * 
     * @param cmfCalendarType 日程类型
     * @return 结果
     */
    public int updateCmfCalendarType(CmfCalendarType cmfCalendarType);

    /**
     * 批量删除日程类型
     * 
     * @param ids 需要删除的日程类型主键集合
     * @return 结果
     */
    public int deleteCmfCalendarTypeByIds(Integer[] ids);

    /**
     * 删除日程类型信息
     * 
     * @param id 日程类型主键
     * @return 结果
     */
    public int deleteCmfCalendarTypeById(Integer id);
}
