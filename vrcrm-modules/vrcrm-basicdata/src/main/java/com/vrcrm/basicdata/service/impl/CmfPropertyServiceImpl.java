package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfPropertyMapper;
import com.vrcrm.basicdata.domain.CmfProperty;
import com.vrcrm.basicdata.service.ICmfPropertyService;

/**
 * 行业归属Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfPropertyServiceImpl implements ICmfPropertyService 
{
    @Autowired
    private CmfPropertyMapper cmfPropertyMapper;

    /**
     * 查询行业归属
     * 
     * @param id 行业归属主键
     * @return 行业归属
     */
    @Override
    public CmfProperty selectCmfPropertyById(Integer id)
    {
        return cmfPropertyMapper.selectCmfPropertyById(id);
    }

    /**
     * 查询行业归属列表
     * 
     * @param cmfProperty 行业归属
     * @return 行业归属
     */
    @Override
    public List<CmfProperty> selectCmfPropertyList(CmfProperty cmfProperty)
    {
        return cmfPropertyMapper.selectCmfPropertyList(cmfProperty);
    }

    /**
     * 新增行业归属
     * 
     * @param cmfProperty 行业归属
     * @return 结果
     */
    @Override
    public int insertCmfProperty(CmfProperty cmfProperty)
    {
        return cmfPropertyMapper.insertCmfProperty(cmfProperty);
    }

    /**
     * 修改行业归属
     * 
     * @param cmfProperty 行业归属
     * @return 结果
     */
    @Override
    public int updateCmfProperty(CmfProperty cmfProperty)
    {
        return cmfPropertyMapper.updateCmfProperty(cmfProperty);
    }

    /**
     * 批量删除行业归属
     * 
     * @param ids 需要删除的行业归属主键
     * @return 结果
     */
    @Override
    public int deleteCmfPropertyByIds(Integer[] ids)
    {
        return cmfPropertyMapper.deleteCmfPropertyByIds(ids);
    }

    /**
     * 删除行业归属信息
     * 
     * @param id 行业归属主键
     * @return 结果
     */
    @Override
    public int deleteCmfPropertyById(Integer id)
    {
        return cmfPropertyMapper.deleteCmfPropertyById(id);
    }
}
