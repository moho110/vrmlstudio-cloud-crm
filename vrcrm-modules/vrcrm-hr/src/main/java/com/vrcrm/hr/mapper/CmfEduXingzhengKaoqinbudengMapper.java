package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfEduXingzhengKaoqinbudeng;

/**
 * 行政考勤补登Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfEduXingzhengKaoqinbudengMapper 
{
    /**
     * 查询行政考勤补登
     * 
     * @param id 行政考勤补登主键
     * @return 行政考勤补登
     */
    public CmfEduXingzhengKaoqinbudeng selectCmfEduXingzhengKaoqinbudengById(Integer id);

    /**
     * 查询行政考勤补登列表
     * 
     * @param cmfEduXingzhengKaoqinbudeng 行政考勤补登
     * @return 行政考勤补登集合
     */
    public List<CmfEduXingzhengKaoqinbudeng> selectCmfEduXingzhengKaoqinbudengList(CmfEduXingzhengKaoqinbudeng cmfEduXingzhengKaoqinbudeng);

    /**
     * 新增行政考勤补登
     * 
     * @param cmfEduXingzhengKaoqinbudeng 行政考勤补登
     * @return 结果
     */
    public int insertCmfEduXingzhengKaoqinbudeng(CmfEduXingzhengKaoqinbudeng cmfEduXingzhengKaoqinbudeng);

    /**
     * 修改行政考勤补登
     * 
     * @param cmfEduXingzhengKaoqinbudeng 行政考勤补登
     * @return 结果
     */
    public int updateCmfEduXingzhengKaoqinbudeng(CmfEduXingzhengKaoqinbudeng cmfEduXingzhengKaoqinbudeng);

    /**
     * 删除行政考勤补登
     * 
     * @param id 行政考勤补登主键
     * @return 结果
     */
    public int deleteCmfEduXingzhengKaoqinbudengById(Integer id);

    /**
     * 批量删除行政考勤补登
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfEduXingzhengKaoqinbudengByIds(Integer[] ids);
}
