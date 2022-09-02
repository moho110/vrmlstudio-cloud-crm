package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfEduXingzhengPaibanMapper;
import com.vrcrm.hr.domain.CmfEduXingzhengPaiban;
import com.vrcrm.hr.service.ICmfEduXingzhengPaibanService;

/**
 * 行政排班Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfEduXingzhengPaibanServiceImpl implements ICmfEduXingzhengPaibanService 
{
    @Autowired
    private CmfEduXingzhengPaibanMapper cmfEduXingzhengPaibanMapper;

    /**
     * 查询行政排班
     * 
     * @param id 行政排班主键
     * @return 行政排班
     */
    @Override
    public CmfEduXingzhengPaiban selectCmfEduXingzhengPaibanById(Integer id)
    {
        return cmfEduXingzhengPaibanMapper.selectCmfEduXingzhengPaibanById(id);
    }

    /**
     * 查询行政排班列表
     * 
     * @param cmfEduXingzhengPaiban 行政排班
     * @return 行政排班
     */
    @Override
    public List<CmfEduXingzhengPaiban> selectCmfEduXingzhengPaibanList(CmfEduXingzhengPaiban cmfEduXingzhengPaiban)
    {
        return cmfEduXingzhengPaibanMapper.selectCmfEduXingzhengPaibanList(cmfEduXingzhengPaiban);
    }

    /**
     * 新增行政排班
     * 
     * @param cmfEduXingzhengPaiban 行政排班
     * @return 结果
     */
    @Override
    public int insertCmfEduXingzhengPaiban(CmfEduXingzhengPaiban cmfEduXingzhengPaiban)
    {
        return cmfEduXingzhengPaibanMapper.insertCmfEduXingzhengPaiban(cmfEduXingzhengPaiban);
    }

    /**
     * 修改行政排班
     * 
     * @param cmfEduXingzhengPaiban 行政排班
     * @return 结果
     */
    @Override
    public int updateCmfEduXingzhengPaiban(CmfEduXingzhengPaiban cmfEduXingzhengPaiban)
    {
        return cmfEduXingzhengPaibanMapper.updateCmfEduXingzhengPaiban(cmfEduXingzhengPaiban);
    }

    /**
     * 批量删除行政排班
     * 
     * @param ids 需要删除的行政排班主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengPaibanByIds(Integer[] ids)
    {
        return cmfEduXingzhengPaibanMapper.deleteCmfEduXingzhengPaibanByIds(ids);
    }

    /**
     * 删除行政排班信息
     * 
     * @param id 行政排班主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengPaibanById(Integer id)
    {
        return cmfEduXingzhengPaibanMapper.deleteCmfEduXingzhengPaibanById(id);
    }
}
