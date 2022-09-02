package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfHrmsZpjihua;

/**
 * 招聘计划Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfHrmsZpjihuaMapper 
{
    /**
     * 查询招聘计划
     * 
     * @param id 招聘计划主键
     * @return 招聘计划
     */
    public CmfHrmsZpjihua selectCmfHrmsZpjihuaById(Integer id);

    /**
     * 查询招聘计划列表
     * 
     * @param cmfHrmsZpjihua 招聘计划
     * @return 招聘计划集合
     */
    public List<CmfHrmsZpjihua> selectCmfHrmsZpjihuaList(CmfHrmsZpjihua cmfHrmsZpjihua);

    /**
     * 新增招聘计划
     * 
     * @param cmfHrmsZpjihua 招聘计划
     * @return 结果
     */
    public int insertCmfHrmsZpjihua(CmfHrmsZpjihua cmfHrmsZpjihua);

    /**
     * 修改招聘计划
     * 
     * @param cmfHrmsZpjihua 招聘计划
     * @return 结果
     */
    public int updateCmfHrmsZpjihua(CmfHrmsZpjihua cmfHrmsZpjihua);

    /**
     * 删除招聘计划
     * 
     * @param id 招聘计划主键
     * @return 结果
     */
    public int deleteCmfHrmsZpjihuaById(Integer id);

    /**
     * 批量删除招聘计划
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfHrmsZpjihuaByIds(Integer[] ids);
}
