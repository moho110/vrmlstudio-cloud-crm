package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfEduXingzhengPaiban;

/**
 * 行政排班Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfEduXingzhengPaibanMapper 
{
    /**
     * 查询行政排班
     * 
     * @param id 行政排班主键
     * @return 行政排班
     */
    public CmfEduXingzhengPaiban selectCmfEduXingzhengPaibanById(Integer id);

    /**
     * 查询行政排班列表
     * 
     * @param cmfEduXingzhengPaiban 行政排班
     * @return 行政排班集合
     */
    public List<CmfEduXingzhengPaiban> selectCmfEduXingzhengPaibanList(CmfEduXingzhengPaiban cmfEduXingzhengPaiban);

    /**
     * 新增行政排班
     * 
     * @param cmfEduXingzhengPaiban 行政排班
     * @return 结果
     */
    public int insertCmfEduXingzhengPaiban(CmfEduXingzhengPaiban cmfEduXingzhengPaiban);

    /**
     * 修改行政排班
     * 
     * @param cmfEduXingzhengPaiban 行政排班
     * @return 结果
     */
    public int updateCmfEduXingzhengPaiban(CmfEduXingzhengPaiban cmfEduXingzhengPaiban);

    /**
     * 删除行政排班
     * 
     * @param id 行政排班主键
     * @return 结果
     */
    public int deleteCmfEduXingzhengPaibanById(Integer id);

    /**
     * 批量删除行政排班
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfEduXingzhengPaibanByIds(Integer[] ids);
}
