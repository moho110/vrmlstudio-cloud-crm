package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfEduXingzhengYearcheckMapper;
import com.vrcrm.hr.domain.CmfEduXingzhengYearcheck;
import com.vrcrm.hr.service.ICmfEduXingzhengYearcheckService;

/**
 * 行政人员年度考核量化表Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfEduXingzhengYearcheckServiceImpl implements ICmfEduXingzhengYearcheckService 
{
    @Autowired
    private CmfEduXingzhengYearcheckMapper cmfEduXingzhengYearcheckMapper;

    /**
     * 查询行政人员年度考核量化表
     * 
     * @param id 行政人员年度考核量化表主键
     * @return 行政人员年度考核量化表
     */
    @Override
    public CmfEduXingzhengYearcheck selectCmfEduXingzhengYearcheckById(Integer id)
    {
        return cmfEduXingzhengYearcheckMapper.selectCmfEduXingzhengYearcheckById(id);
    }

    /**
     * 查询行政人员年度考核量化表列表
     * 
     * @param cmfEduXingzhengYearcheck 行政人员年度考核量化表
     * @return 行政人员年度考核量化表
     */
    @Override
    public List<CmfEduXingzhengYearcheck> selectCmfEduXingzhengYearcheckList(CmfEduXingzhengYearcheck cmfEduXingzhengYearcheck)
    {
        return cmfEduXingzhengYearcheckMapper.selectCmfEduXingzhengYearcheckList(cmfEduXingzhengYearcheck);
    }

    /**
     * 新增行政人员年度考核量化表
     * 
     * @param cmfEduXingzhengYearcheck 行政人员年度考核量化表
     * @return 结果
     */
    @Override
    public int insertCmfEduXingzhengYearcheck(CmfEduXingzhengYearcheck cmfEduXingzhengYearcheck)
    {
        return cmfEduXingzhengYearcheckMapper.insertCmfEduXingzhengYearcheck(cmfEduXingzhengYearcheck);
    }

    /**
     * 修改行政人员年度考核量化表
     * 
     * @param cmfEduXingzhengYearcheck 行政人员年度考核量化表
     * @return 结果
     */
    @Override
    public int updateCmfEduXingzhengYearcheck(CmfEduXingzhengYearcheck cmfEduXingzhengYearcheck)
    {
        return cmfEduXingzhengYearcheckMapper.updateCmfEduXingzhengYearcheck(cmfEduXingzhengYearcheck);
    }

    /**
     * 批量删除行政人员年度考核量化表
     * 
     * @param ids 需要删除的行政人员年度考核量化表主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengYearcheckByIds(Integer[] ids)
    {
        return cmfEduXingzhengYearcheckMapper.deleteCmfEduXingzhengYearcheckByIds(ids);
    }

    /**
     * 删除行政人员年度考核量化表信息
     * 
     * @param id 行政人员年度考核量化表主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengYearcheckById(Integer id)
    {
        return cmfEduXingzhengYearcheckMapper.deleteCmfEduXingzhengYearcheckById(id);
    }
}
