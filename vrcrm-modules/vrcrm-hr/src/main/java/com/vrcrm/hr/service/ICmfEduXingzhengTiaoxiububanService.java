package com.vrcrm.hr.service;

import java.util.List;
import com.vrcrm.hr.domain.CmfEduXingzhengTiaoxiububan;

/**
 * 行政调休补班Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfEduXingzhengTiaoxiububanService 
{
    /**
     * 查询行政调休补班
     * 
     * @param id 行政调休补班主键
     * @return 行政调休补班
     */
    public CmfEduXingzhengTiaoxiububan selectCmfEduXingzhengTiaoxiububanById(Integer id);

    /**
     * 查询行政调休补班列表
     * 
     * @param cmfEduXingzhengTiaoxiububan 行政调休补班
     * @return 行政调休补班集合
     */
    public List<CmfEduXingzhengTiaoxiububan> selectCmfEduXingzhengTiaoxiububanList(CmfEduXingzhengTiaoxiububan cmfEduXingzhengTiaoxiububan);

    /**
     * 新增行政调休补班
     * 
     * @param cmfEduXingzhengTiaoxiububan 行政调休补班
     * @return 结果
     */
    public int insertCmfEduXingzhengTiaoxiububan(CmfEduXingzhengTiaoxiububan cmfEduXingzhengTiaoxiububan);

    /**
     * 修改行政调休补班
     * 
     * @param cmfEduXingzhengTiaoxiububan 行政调休补班
     * @return 结果
     */
    public int updateCmfEduXingzhengTiaoxiububan(CmfEduXingzhengTiaoxiububan cmfEduXingzhengTiaoxiububan);

    /**
     * 批量删除行政调休补班
     * 
     * @param ids 需要删除的行政调休补班主键集合
     * @return 结果
     */
    public int deleteCmfEduXingzhengTiaoxiububanByIds(Integer[] ids);

    /**
     * 删除行政调休补班信息
     * 
     * @param id 行政调休补班主键
     * @return 结果
     */
    public int deleteCmfEduXingzhengTiaoxiububanById(Integer id);
}
