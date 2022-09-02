package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfEduXingzhengTiaobanxianghuMapper;
import com.vrcrm.hr.domain.CmfEduXingzhengTiaobanxianghu;
import com.vrcrm.hr.service.ICmfEduXingzhengTiaobanxianghuService;

/**
 * 行政调班项目Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfEduXingzhengTiaobanxianghuServiceImpl implements ICmfEduXingzhengTiaobanxianghuService 
{
    @Autowired
    private CmfEduXingzhengTiaobanxianghuMapper cmfEduXingzhengTiaobanxianghuMapper;

    /**
     * 查询行政调班项目
     * 
     * @param id 行政调班项目主键
     * @return 行政调班项目
     */
    @Override
    public CmfEduXingzhengTiaobanxianghu selectCmfEduXingzhengTiaobanxianghuById(Integer id)
    {
        return cmfEduXingzhengTiaobanxianghuMapper.selectCmfEduXingzhengTiaobanxianghuById(id);
    }

    /**
     * 查询行政调班项目列表
     * 
     * @param cmfEduXingzhengTiaobanxianghu 行政调班项目
     * @return 行政调班项目
     */
    @Override
    public List<CmfEduXingzhengTiaobanxianghu> selectCmfEduXingzhengTiaobanxianghuList(CmfEduXingzhengTiaobanxianghu cmfEduXingzhengTiaobanxianghu)
    {
        return cmfEduXingzhengTiaobanxianghuMapper.selectCmfEduXingzhengTiaobanxianghuList(cmfEduXingzhengTiaobanxianghu);
    }

    /**
     * 新增行政调班项目
     * 
     * @param cmfEduXingzhengTiaobanxianghu 行政调班项目
     * @return 结果
     */
    @Override
    public int insertCmfEduXingzhengTiaobanxianghu(CmfEduXingzhengTiaobanxianghu cmfEduXingzhengTiaobanxianghu)
    {
        return cmfEduXingzhengTiaobanxianghuMapper.insertCmfEduXingzhengTiaobanxianghu(cmfEduXingzhengTiaobanxianghu);
    }

    /**
     * 修改行政调班项目
     * 
     * @param cmfEduXingzhengTiaobanxianghu 行政调班项目
     * @return 结果
     */
    @Override
    public int updateCmfEduXingzhengTiaobanxianghu(CmfEduXingzhengTiaobanxianghu cmfEduXingzhengTiaobanxianghu)
    {
        return cmfEduXingzhengTiaobanxianghuMapper.updateCmfEduXingzhengTiaobanxianghu(cmfEduXingzhengTiaobanxianghu);
    }

    /**
     * 批量删除行政调班项目
     * 
     * @param ids 需要删除的行政调班项目主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengTiaobanxianghuByIds(Integer[] ids)
    {
        return cmfEduXingzhengTiaobanxianghuMapper.deleteCmfEduXingzhengTiaobanxianghuByIds(ids);
    }

    /**
     * 删除行政调班项目信息
     * 
     * @param id 行政调班项目主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengTiaobanxianghuById(Integer id)
    {
        return cmfEduXingzhengTiaobanxianghuMapper.deleteCmfEduXingzhengTiaobanxianghuById(id);
    }
}
