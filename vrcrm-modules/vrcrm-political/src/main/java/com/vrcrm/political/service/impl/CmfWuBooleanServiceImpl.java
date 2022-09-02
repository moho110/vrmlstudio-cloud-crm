package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfWuBooleanMapper;
import com.vrcrm.political.domain.CmfWuBoolean;
import com.vrcrm.political.service.ICmfWuBooleanService;

/**
 * 是否Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfWuBooleanServiceImpl implements ICmfWuBooleanService 
{
    @Autowired
    private CmfWuBooleanMapper cmfWuBooleanMapper;

    /**
     * 查询是否
     * 
     * @param id 是否主键
     * @return 是否
     */
    @Override
    public CmfWuBoolean selectCmfWuBooleanById(Integer id)
    {
        return cmfWuBooleanMapper.selectCmfWuBooleanById(id);
    }

    /**
     * 查询是否列表
     * 
     * @param cmfWuBoolean 是否
     * @return 是否
     */
    @Override
    public List<CmfWuBoolean> selectCmfWuBooleanList(CmfWuBoolean cmfWuBoolean)
    {
        return cmfWuBooleanMapper.selectCmfWuBooleanList(cmfWuBoolean);
    }

    /**
     * 新增是否
     * 
     * @param cmfWuBoolean 是否
     * @return 结果
     */
    @Override
    public int insertCmfWuBoolean(CmfWuBoolean cmfWuBoolean)
    {
        return cmfWuBooleanMapper.insertCmfWuBoolean(cmfWuBoolean);
    }

    /**
     * 修改是否
     * 
     * @param cmfWuBoolean 是否
     * @return 结果
     */
    @Override
    public int updateCmfWuBoolean(CmfWuBoolean cmfWuBoolean)
    {
        return cmfWuBooleanMapper.updateCmfWuBoolean(cmfWuBoolean);
    }

    /**
     * 批量删除是否
     * 
     * @param ids 需要删除的是否主键
     * @return 结果
     */
    @Override
    public int deleteCmfWuBooleanByIds(Integer[] ids)
    {
        return cmfWuBooleanMapper.deleteCmfWuBooleanByIds(ids);
    }

    /**
     * 删除是否信息
     * 
     * @param id 是否主键
     * @return 结果
     */
    @Override
    public int deleteCmfWuBooleanById(Integer id)
    {
        return cmfWuBooleanMapper.deleteCmfWuBooleanById(id);
    }
}
