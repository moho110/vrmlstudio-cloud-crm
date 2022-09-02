package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfEduXingzhengQingjia;

/**
 * 行政请假Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfEduXingzhengQingjiaMapper 
{
    /**
     * 查询行政请假
     * 
     * @param id 行政请假主键
     * @return 行政请假
     */
    public CmfEduXingzhengQingjia selectCmfEduXingzhengQingjiaById(Integer id);

    /**
     * 查询行政请假列表
     * 
     * @param cmfEduXingzhengQingjia 行政请假
     * @return 行政请假集合
     */
    public List<CmfEduXingzhengQingjia> selectCmfEduXingzhengQingjiaList(CmfEduXingzhengQingjia cmfEduXingzhengQingjia);

    /**
     * 新增行政请假
     * 
     * @param cmfEduXingzhengQingjia 行政请假
     * @return 结果
     */
    public int insertCmfEduXingzhengQingjia(CmfEduXingzhengQingjia cmfEduXingzhengQingjia);

    /**
     * 修改行政请假
     * 
     * @param cmfEduXingzhengQingjia 行政请假
     * @return 结果
     */
    public int updateCmfEduXingzhengQingjia(CmfEduXingzhengQingjia cmfEduXingzhengQingjia);

    /**
     * 删除行政请假
     * 
     * @param id 行政请假主键
     * @return 结果
     */
    public int deleteCmfEduXingzhengQingjiaById(Integer id);

    /**
     * 批量删除行政请假
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfEduXingzhengQingjiaByIds(Integer[] ids);
}
