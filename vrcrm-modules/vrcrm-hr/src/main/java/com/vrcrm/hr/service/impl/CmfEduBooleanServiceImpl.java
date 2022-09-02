package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfEduBooleanMapper;
import com.vrcrm.hr.domain.CmfEduBoolean;
import com.vrcrm.hr.service.ICmfEduBooleanService;

/**
 * 是否教育Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfEduBooleanServiceImpl implements ICmfEduBooleanService 
{
    @Autowired
    private CmfEduBooleanMapper cmfEduBooleanMapper;

    /**
     * 查询是否教育
     * 
     * @param id 是否教育主键
     * @return 是否教育
     */
    @Override
    public CmfEduBoolean selectCmfEduBooleanById(Integer id)
    {
        return cmfEduBooleanMapper.selectCmfEduBooleanById(id);
    }

    /**
     * 查询是否教育列表
     * 
     * @param cmfEduBoolean 是否教育
     * @return 是否教育
     */
    @Override
    public List<CmfEduBoolean> selectCmfEduBooleanList(CmfEduBoolean cmfEduBoolean)
    {
        return cmfEduBooleanMapper.selectCmfEduBooleanList(cmfEduBoolean);
    }

    /**
     * 新增是否教育
     * 
     * @param cmfEduBoolean 是否教育
     * @return 结果
     */
    @Override
    public int insertCmfEduBoolean(CmfEduBoolean cmfEduBoolean)
    {
        return cmfEduBooleanMapper.insertCmfEduBoolean(cmfEduBoolean);
    }

    /**
     * 修改是否教育
     * 
     * @param cmfEduBoolean 是否教育
     * @return 结果
     */
    @Override
    public int updateCmfEduBoolean(CmfEduBoolean cmfEduBoolean)
    {
        return cmfEduBooleanMapper.updateCmfEduBoolean(cmfEduBoolean);
    }

    /**
     * 批量删除是否教育
     * 
     * @param ids 需要删除的是否教育主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduBooleanByIds(Integer[] ids)
    {
        return cmfEduBooleanMapper.deleteCmfEduBooleanByIds(ids);
    }

    /**
     * 删除是否教育信息
     * 
     * @param id 是否教育主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduBooleanById(Integer id)
    {
        return cmfEduBooleanMapper.deleteCmfEduBooleanById(id);
    }
}
