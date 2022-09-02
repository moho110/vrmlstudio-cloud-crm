package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfEduXingzhengTiaoxiububanMapper;
import com.vrcrm.hr.domain.CmfEduXingzhengTiaoxiububan;
import com.vrcrm.hr.service.ICmfEduXingzhengTiaoxiububanService;

/**
 * 行政调休补班Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfEduXingzhengTiaoxiububanServiceImpl implements ICmfEduXingzhengTiaoxiububanService 
{
    @Autowired
    private CmfEduXingzhengTiaoxiububanMapper cmfEduXingzhengTiaoxiububanMapper;

    /**
     * 查询行政调休补班
     * 
     * @param id 行政调休补班主键
     * @return 行政调休补班
     */
    @Override
    public CmfEduXingzhengTiaoxiububan selectCmfEduXingzhengTiaoxiububanById(Integer id)
    {
        return cmfEduXingzhengTiaoxiububanMapper.selectCmfEduXingzhengTiaoxiububanById(id);
    }

    /**
     * 查询行政调休补班列表
     * 
     * @param cmfEduXingzhengTiaoxiububan 行政调休补班
     * @return 行政调休补班
     */
    @Override
    public List<CmfEduXingzhengTiaoxiububan> selectCmfEduXingzhengTiaoxiububanList(CmfEduXingzhengTiaoxiububan cmfEduXingzhengTiaoxiububan)
    {
        return cmfEduXingzhengTiaoxiububanMapper.selectCmfEduXingzhengTiaoxiububanList(cmfEduXingzhengTiaoxiububan);
    }

    /**
     * 新增行政调休补班
     * 
     * @param cmfEduXingzhengTiaoxiububan 行政调休补班
     * @return 结果
     */
    @Override
    public int insertCmfEduXingzhengTiaoxiububan(CmfEduXingzhengTiaoxiububan cmfEduXingzhengTiaoxiububan)
    {
        return cmfEduXingzhengTiaoxiububanMapper.insertCmfEduXingzhengTiaoxiububan(cmfEduXingzhengTiaoxiububan);
    }

    /**
     * 修改行政调休补班
     * 
     * @param cmfEduXingzhengTiaoxiububan 行政调休补班
     * @return 结果
     */
    @Override
    public int updateCmfEduXingzhengTiaoxiububan(CmfEduXingzhengTiaoxiububan cmfEduXingzhengTiaoxiububan)
    {
        return cmfEduXingzhengTiaoxiububanMapper.updateCmfEduXingzhengTiaoxiububan(cmfEduXingzhengTiaoxiububan);
    }

    /**
     * 批量删除行政调休补班
     * 
     * @param ids 需要删除的行政调休补班主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengTiaoxiububanByIds(Integer[] ids)
    {
        return cmfEduXingzhengTiaoxiububanMapper.deleteCmfEduXingzhengTiaoxiububanByIds(ids);
    }

    /**
     * 删除行政调休补班信息
     * 
     * @param id 行政调休补班主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengTiaoxiububanById(Integer id)
    {
        return cmfEduXingzhengTiaoxiububanMapper.deleteCmfEduXingzhengTiaoxiububanById(id);
    }
}
