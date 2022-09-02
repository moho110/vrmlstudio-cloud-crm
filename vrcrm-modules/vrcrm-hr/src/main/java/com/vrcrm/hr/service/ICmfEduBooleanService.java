package com.vrcrm.hr.service;

import java.util.List;
import com.vrcrm.hr.domain.CmfEduBoolean;

/**
 * 是否教育Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfEduBooleanService 
{
    /**
     * 查询是否教育
     * 
     * @param id 是否教育主键
     * @return 是否教育
     */
    public CmfEduBoolean selectCmfEduBooleanById(Integer id);

    /**
     * 查询是否教育列表
     * 
     * @param cmfEduBoolean 是否教育
     * @return 是否教育集合
     */
    public List<CmfEduBoolean> selectCmfEduBooleanList(CmfEduBoolean cmfEduBoolean);

    /**
     * 新增是否教育
     * 
     * @param cmfEduBoolean 是否教育
     * @return 结果
     */
    public int insertCmfEduBoolean(CmfEduBoolean cmfEduBoolean);

    /**
     * 修改是否教育
     * 
     * @param cmfEduBoolean 是否教育
     * @return 结果
     */
    public int updateCmfEduBoolean(CmfEduBoolean cmfEduBoolean);

    /**
     * 批量删除是否教育
     * 
     * @param ids 需要删除的是否教育主键集合
     * @return 结果
     */
    public int deleteCmfEduBooleanByIds(Integer[] ids);

    /**
     * 删除是否教育信息
     * 
     * @param id 是否教育主键
     * @return 结果
     */
    public int deleteCmfEduBooleanById(Integer id);
}
