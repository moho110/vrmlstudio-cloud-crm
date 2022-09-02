package com.vrcrm.hr.service;

import java.util.List;
import com.vrcrm.hr.domain.CmfEduXingzhengJiabanbuxiu;

/**
 * 行政加班补休Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfEduXingzhengJiabanbuxiuService 
{
    /**
     * 查询行政加班补休
     * 
     * @param id 行政加班补休主键
     * @return 行政加班补休
     */
    public CmfEduXingzhengJiabanbuxiu selectCmfEduXingzhengJiabanbuxiuById(Integer id);

    /**
     * 查询行政加班补休列表
     * 
     * @param cmfEduXingzhengJiabanbuxiu 行政加班补休
     * @return 行政加班补休集合
     */
    public List<CmfEduXingzhengJiabanbuxiu> selectCmfEduXingzhengJiabanbuxiuList(CmfEduXingzhengJiabanbuxiu cmfEduXingzhengJiabanbuxiu);

    /**
     * 新增行政加班补休
     * 
     * @param cmfEduXingzhengJiabanbuxiu 行政加班补休
     * @return 结果
     */
    public int insertCmfEduXingzhengJiabanbuxiu(CmfEduXingzhengJiabanbuxiu cmfEduXingzhengJiabanbuxiu);

    /**
     * 修改行政加班补休
     * 
     * @param cmfEduXingzhengJiabanbuxiu 行政加班补休
     * @return 结果
     */
    public int updateCmfEduXingzhengJiabanbuxiu(CmfEduXingzhengJiabanbuxiu cmfEduXingzhengJiabanbuxiu);

    /**
     * 批量删除行政加班补休
     * 
     * @param ids 需要删除的行政加班补休主键集合
     * @return 结果
     */
    public int deleteCmfEduXingzhengJiabanbuxiuByIds(Integer[] ids);

    /**
     * 删除行政加班补休信息
     * 
     * @param id 行政加班补休主键
     * @return 结果
     */
    public int deleteCmfEduXingzhengJiabanbuxiuById(Integer id);
}
