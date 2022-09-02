package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfEduXingzhengJiabanbuxiuMapper;
import com.vrcrm.hr.domain.CmfEduXingzhengJiabanbuxiu;
import com.vrcrm.hr.service.ICmfEduXingzhengJiabanbuxiuService;

/**
 * 行政加班补休Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfEduXingzhengJiabanbuxiuServiceImpl implements ICmfEduXingzhengJiabanbuxiuService 
{
    @Autowired
    private CmfEduXingzhengJiabanbuxiuMapper cmfEduXingzhengJiabanbuxiuMapper;

    /**
     * 查询行政加班补休
     * 
     * @param id 行政加班补休主键
     * @return 行政加班补休
     */
    @Override
    public CmfEduXingzhengJiabanbuxiu selectCmfEduXingzhengJiabanbuxiuById(Integer id)
    {
        return cmfEduXingzhengJiabanbuxiuMapper.selectCmfEduXingzhengJiabanbuxiuById(id);
    }

    /**
     * 查询行政加班补休列表
     * 
     * @param cmfEduXingzhengJiabanbuxiu 行政加班补休
     * @return 行政加班补休
     */
    @Override
    public List<CmfEduXingzhengJiabanbuxiu> selectCmfEduXingzhengJiabanbuxiuList(CmfEduXingzhengJiabanbuxiu cmfEduXingzhengJiabanbuxiu)
    {
        return cmfEduXingzhengJiabanbuxiuMapper.selectCmfEduXingzhengJiabanbuxiuList(cmfEduXingzhengJiabanbuxiu);
    }

    /**
     * 新增行政加班补休
     * 
     * @param cmfEduXingzhengJiabanbuxiu 行政加班补休
     * @return 结果
     */
    @Override
    public int insertCmfEduXingzhengJiabanbuxiu(CmfEduXingzhengJiabanbuxiu cmfEduXingzhengJiabanbuxiu)
    {
        return cmfEduXingzhengJiabanbuxiuMapper.insertCmfEduXingzhengJiabanbuxiu(cmfEduXingzhengJiabanbuxiu);
    }

    /**
     * 修改行政加班补休
     * 
     * @param cmfEduXingzhengJiabanbuxiu 行政加班补休
     * @return 结果
     */
    @Override
    public int updateCmfEduXingzhengJiabanbuxiu(CmfEduXingzhengJiabanbuxiu cmfEduXingzhengJiabanbuxiu)
    {
        return cmfEduXingzhengJiabanbuxiuMapper.updateCmfEduXingzhengJiabanbuxiu(cmfEduXingzhengJiabanbuxiu);
    }

    /**
     * 批量删除行政加班补休
     * 
     * @param ids 需要删除的行政加班补休主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengJiabanbuxiuByIds(Integer[] ids)
    {
        return cmfEduXingzhengJiabanbuxiuMapper.deleteCmfEduXingzhengJiabanbuxiuByIds(ids);
    }

    /**
     * 删除行政加班补休信息
     * 
     * @param id 行政加班补休主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengJiabanbuxiuById(Integer id)
    {
        return cmfEduXingzhengJiabanbuxiuMapper.deleteCmfEduXingzhengJiabanbuxiuById(id);
    }
}
