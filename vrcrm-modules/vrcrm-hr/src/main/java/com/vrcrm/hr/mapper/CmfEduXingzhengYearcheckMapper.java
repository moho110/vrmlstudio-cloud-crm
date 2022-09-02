package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfEduXingzhengYearcheck;

/**
 * 行政人员年度考核量化表Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfEduXingzhengYearcheckMapper 
{
    /**
     * 查询行政人员年度考核量化表
     * 
     * @param id 行政人员年度考核量化表主键
     * @return 行政人员年度考核量化表
     */
    public CmfEduXingzhengYearcheck selectCmfEduXingzhengYearcheckById(Integer id);

    /**
     * 查询行政人员年度考核量化表列表
     * 
     * @param cmfEduXingzhengYearcheck 行政人员年度考核量化表
     * @return 行政人员年度考核量化表集合
     */
    public List<CmfEduXingzhengYearcheck> selectCmfEduXingzhengYearcheckList(CmfEduXingzhengYearcheck cmfEduXingzhengYearcheck);

    /**
     * 新增行政人员年度考核量化表
     * 
     * @param cmfEduXingzhengYearcheck 行政人员年度考核量化表
     * @return 结果
     */
    public int insertCmfEduXingzhengYearcheck(CmfEduXingzhengYearcheck cmfEduXingzhengYearcheck);

    /**
     * 修改行政人员年度考核量化表
     * 
     * @param cmfEduXingzhengYearcheck 行政人员年度考核量化表
     * @return 结果
     */
    public int updateCmfEduXingzhengYearcheck(CmfEduXingzhengYearcheck cmfEduXingzhengYearcheck);

    /**
     * 删除行政人员年度考核量化表
     * 
     * @param id 行政人员年度考核量化表主键
     * @return 结果
     */
    public int deleteCmfEduXingzhengYearcheckById(Integer id);

    /**
     * 批量删除行政人员年度考核量化表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfEduXingzhengYearcheckByIds(Integer[] ids);
}
