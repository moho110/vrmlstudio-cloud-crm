package com.vrcrm.hr.service;

import java.util.List;
import com.vrcrm.hr.domain.CmfEduXingzhengTiaoban;

/**
 * 行政调班Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfEduXingzhengTiaobanService 
{
    /**
     * 查询行政调班
     * 
     * @param id 行政调班主键
     * @return 行政调班
     */
    public CmfEduXingzhengTiaoban selectCmfEduXingzhengTiaobanById(Integer id);

    /**
     * 查询行政调班列表
     * 
     * @param cmfEduXingzhengTiaoban 行政调班
     * @return 行政调班集合
     */
    public List<CmfEduXingzhengTiaoban> selectCmfEduXingzhengTiaobanList(CmfEduXingzhengTiaoban cmfEduXingzhengTiaoban);

    /**
     * 新增行政调班
     * 
     * @param cmfEduXingzhengTiaoban 行政调班
     * @return 结果
     */
    public int insertCmfEduXingzhengTiaoban(CmfEduXingzhengTiaoban cmfEduXingzhengTiaoban);

    /**
     * 修改行政调班
     * 
     * @param cmfEduXingzhengTiaoban 行政调班
     * @return 结果
     */
    public int updateCmfEduXingzhengTiaoban(CmfEduXingzhengTiaoban cmfEduXingzhengTiaoban);

    /**
     * 批量删除行政调班
     * 
     * @param ids 需要删除的行政调班主键集合
     * @return 结果
     */
    public int deleteCmfEduXingzhengTiaobanByIds(Integer[] ids);

    /**
     * 删除行政调班信息
     * 
     * @param id 行政调班主键
     * @return 结果
     */
    public int deleteCmfEduXingzhengTiaobanById(Integer id);
}
