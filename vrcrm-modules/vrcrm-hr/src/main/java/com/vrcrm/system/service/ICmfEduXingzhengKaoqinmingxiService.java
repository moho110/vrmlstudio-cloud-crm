package com.vrcrm.system.service;

import java.util.List;
import com.vrcrm.system.domain.CmfEduXingzhengKaoqinmingxi;

/**
 * 考勤明细Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfEduXingzhengKaoqinmingxiService 
{
    /**
     * 查询考勤明细
     * 
     * @param id 考勤明细主键
     * @return 考勤明细
     */
    public CmfEduXingzhengKaoqinmingxi selectCmfEduXingzhengKaoqinmingxiById(Integer id);

    /**
     * 查询考勤明细列表
     * 
     * @param cmfEduXingzhengKaoqinmingxi 考勤明细
     * @return 考勤明细集合
     */
    public List<CmfEduXingzhengKaoqinmingxi> selectCmfEduXingzhengKaoqinmingxiList(CmfEduXingzhengKaoqinmingxi cmfEduXingzhengKaoqinmingxi);

    /**
     * 新增考勤明细
     * 
     * @param cmfEduXingzhengKaoqinmingxi 考勤明细
     * @return 结果
     */
    public int insertCmfEduXingzhengKaoqinmingxi(CmfEduXingzhengKaoqinmingxi cmfEduXingzhengKaoqinmingxi);

    /**
     * 修改考勤明细
     * 
     * @param cmfEduXingzhengKaoqinmingxi 考勤明细
     * @return 结果
     */
    public int updateCmfEduXingzhengKaoqinmingxi(CmfEduXingzhengKaoqinmingxi cmfEduXingzhengKaoqinmingxi);

    /**
     * 批量删除考勤明细
     * 
     * @param ids 需要删除的考勤明细主键集合
     * @return 结果
     */
    public int deleteCmfEduXingzhengKaoqinmingxiByIds(Integer[] ids);

    /**
     * 删除考勤明细信息
     * 
     * @param id 考勤明细主键
     * @return 结果
     */
    public int deleteCmfEduXingzhengKaoqinmingxiById(Integer id);
}
