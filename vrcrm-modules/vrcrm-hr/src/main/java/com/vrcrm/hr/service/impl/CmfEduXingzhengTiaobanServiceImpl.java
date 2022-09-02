package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfEduXingzhengTiaobanMapper;
import com.vrcrm.hr.domain.CmfEduXingzhengTiaoban;
import com.vrcrm.hr.service.ICmfEduXingzhengTiaobanService;

/**
 * 行政调班Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfEduXingzhengTiaobanServiceImpl implements ICmfEduXingzhengTiaobanService 
{
    @Autowired
    private CmfEduXingzhengTiaobanMapper cmfEduXingzhengTiaobanMapper;

    /**
     * 查询行政调班
     * 
     * @param id 行政调班主键
     * @return 行政调班
     */
    @Override
    public CmfEduXingzhengTiaoban selectCmfEduXingzhengTiaobanById(Integer id)
    {
        return cmfEduXingzhengTiaobanMapper.selectCmfEduXingzhengTiaobanById(id);
    }

    /**
     * 查询行政调班列表
     * 
     * @param cmfEduXingzhengTiaoban 行政调班
     * @return 行政调班
     */
    @Override
    public List<CmfEduXingzhengTiaoban> selectCmfEduXingzhengTiaobanList(CmfEduXingzhengTiaoban cmfEduXingzhengTiaoban)
    {
        return cmfEduXingzhengTiaobanMapper.selectCmfEduXingzhengTiaobanList(cmfEduXingzhengTiaoban);
    }

    /**
     * 新增行政调班
     * 
     * @param cmfEduXingzhengTiaoban 行政调班
     * @return 结果
     */
    @Override
    public int insertCmfEduXingzhengTiaoban(CmfEduXingzhengTiaoban cmfEduXingzhengTiaoban)
    {
        return cmfEduXingzhengTiaobanMapper.insertCmfEduXingzhengTiaoban(cmfEduXingzhengTiaoban);
    }

    /**
     * 修改行政调班
     * 
     * @param cmfEduXingzhengTiaoban 行政调班
     * @return 结果
     */
    @Override
    public int updateCmfEduXingzhengTiaoban(CmfEduXingzhengTiaoban cmfEduXingzhengTiaoban)
    {
        return cmfEduXingzhengTiaobanMapper.updateCmfEduXingzhengTiaoban(cmfEduXingzhengTiaoban);
    }

    /**
     * 批量删除行政调班
     * 
     * @param ids 需要删除的行政调班主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengTiaobanByIds(Integer[] ids)
    {
        return cmfEduXingzhengTiaobanMapper.deleteCmfEduXingzhengTiaobanByIds(ids);
    }

    /**
     * 删除行政调班信息
     * 
     * @param id 行政调班主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengTiaobanById(Integer id)
    {
        return cmfEduXingzhengTiaobanMapper.deleteCmfEduXingzhengTiaobanById(id);
    }
}
