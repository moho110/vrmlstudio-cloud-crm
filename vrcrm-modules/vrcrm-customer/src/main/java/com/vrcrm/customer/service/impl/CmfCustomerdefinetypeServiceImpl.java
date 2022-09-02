package com.vrcrm.customer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.customer.mapper.CmfCustomerdefinetypeMapper;
import com.vrcrm.customer.domain.CmfCustomerdefinetype;
import com.vrcrm.customer.service.ICmfCustomerdefinetypeService;

/**
 * 客户定义类型Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfCustomerdefinetypeServiceImpl implements ICmfCustomerdefinetypeService 
{
    @Autowired
    private CmfCustomerdefinetypeMapper cmfCustomerdefinetypeMapper;

    /**
     * 查询客户定义类型
     * 
     * @param id 客户定义类型主键
     * @return 客户定义类型
     */
    @Override
    public CmfCustomerdefinetype selectCmfCustomerdefinetypeById(Integer id)
    {
        return cmfCustomerdefinetypeMapper.selectCmfCustomerdefinetypeById(id);
    }

    /**
     * 查询客户定义类型列表
     * 
     * @param cmfCustomerdefinetype 客户定义类型
     * @return 客户定义类型
     */
    @Override
    public List<CmfCustomerdefinetype> selectCmfCustomerdefinetypeList(CmfCustomerdefinetype cmfCustomerdefinetype)
    {
        return cmfCustomerdefinetypeMapper.selectCmfCustomerdefinetypeList(cmfCustomerdefinetype);
    }

    /**
     * 新增客户定义类型
     * 
     * @param cmfCustomerdefinetype 客户定义类型
     * @return 结果
     */
    @Override
    public int insertCmfCustomerdefinetype(CmfCustomerdefinetype cmfCustomerdefinetype)
    {
        return cmfCustomerdefinetypeMapper.insertCmfCustomerdefinetype(cmfCustomerdefinetype);
    }

    /**
     * 修改客户定义类型
     * 
     * @param cmfCustomerdefinetype 客户定义类型
     * @return 结果
     */
    @Override
    public int updateCmfCustomerdefinetype(CmfCustomerdefinetype cmfCustomerdefinetype)
    {
        return cmfCustomerdefinetypeMapper.updateCmfCustomerdefinetype(cmfCustomerdefinetype);
    }

    /**
     * 批量删除客户定义类型
     * 
     * @param ids 需要删除的客户定义类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfCustomerdefinetypeByIds(Integer[] ids)
    {
        return cmfCustomerdefinetypeMapper.deleteCmfCustomerdefinetypeByIds(ids);
    }

    /**
     * 删除客户定义类型信息
     * 
     * @param id 客户定义类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfCustomerdefinetypeById(Integer id)
    {
        return cmfCustomerdefinetypeMapper.deleteCmfCustomerdefinetypeById(id);
    }
}
