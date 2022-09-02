package com.vrcrm.sales.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.sales.mapper.CmfFahuotypeMapper;
import com.vrcrm.sales.domain.CmfFahuotype;
import com.vrcrm.sales.service.ICmfFahuotypeService;

/**
 * 发货类型Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfFahuotypeServiceImpl implements ICmfFahuotypeService 
{
    @Autowired
    private CmfFahuotypeMapper cmfFahuotypeMapper;

    /**
     * 查询发货类型
     * 
     * @param id 发货类型主键
     * @return 发货类型
     */
    @Override
    public CmfFahuotype selectCmfFahuotypeById(Integer id)
    {
        return cmfFahuotypeMapper.selectCmfFahuotypeById(id);
    }

    /**
     * 查询发货类型列表
     * 
     * @param cmfFahuotype 发货类型
     * @return 发货类型
     */
    @Override
    public List<CmfFahuotype> selectCmfFahuotypeList(CmfFahuotype cmfFahuotype)
    {
        return cmfFahuotypeMapper.selectCmfFahuotypeList(cmfFahuotype);
    }

    /**
     * 新增发货类型
     * 
     * @param cmfFahuotype 发货类型
     * @return 结果
     */
    @Override
    public int insertCmfFahuotype(CmfFahuotype cmfFahuotype)
    {
        return cmfFahuotypeMapper.insertCmfFahuotype(cmfFahuotype);
    }

    /**
     * 修改发货类型
     * 
     * @param cmfFahuotype 发货类型
     * @return 结果
     */
    @Override
    public int updateCmfFahuotype(CmfFahuotype cmfFahuotype)
    {
        return cmfFahuotypeMapper.updateCmfFahuotype(cmfFahuotype);
    }

    /**
     * 批量删除发货类型
     * 
     * @param ids 需要删除的发货类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfFahuotypeByIds(Integer[] ids)
    {
        return cmfFahuotypeMapper.deleteCmfFahuotypeByIds(ids);
    }

    /**
     * 删除发货类型信息
     * 
     * @param id 发货类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfFahuotypeById(Integer id)
    {
        return cmfFahuotypeMapper.deleteCmfFahuotypeById(id);
    }
}
