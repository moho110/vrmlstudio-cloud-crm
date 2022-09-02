package com.vrcrm.finance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.finance.mapper.CmfAccesstypeMapper;
import com.vrcrm.finance.domain.CmfAccesstype;
import com.vrcrm.finance.service.ICmfAccesstypeService;

/**
 * 帐户操作类型Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-13
 */
@Service
public class CmfAccesstypeServiceImpl implements ICmfAccesstypeService 
{
    @Autowired
    private CmfAccesstypeMapper cmfAccesstypeMapper;

    /**
     * 查询帐户操作类型
     * 
     * @param id 帐户操作类型主键
     * @return 帐户操作类型
     */
    @Override
    public CmfAccesstype selectCmfAccesstypeById(Integer id)
    {
        return cmfAccesstypeMapper.selectCmfAccesstypeById(id);
    }

    /**
     * 查询帐户操作类型列表
     * 
     * @param cmfAccesstype 帐户操作类型
     * @return 帐户操作类型
     */
    @Override
    public List<CmfAccesstype> selectCmfAccesstypeList(CmfAccesstype cmfAccesstype)
    {
        return cmfAccesstypeMapper.selectCmfAccesstypeList(cmfAccesstype);
    }

    /**
     * 新增帐户操作类型
     * 
     * @param cmfAccesstype 帐户操作类型
     * @return 结果
     */
    @Override
    public int insertCmfAccesstype(CmfAccesstype cmfAccesstype)
    {
        return cmfAccesstypeMapper.insertCmfAccesstype(cmfAccesstype);
    }

    /**
     * 修改帐户操作类型
     * 
     * @param cmfAccesstype 帐户操作类型
     * @return 结果
     */
    @Override
    public int updateCmfAccesstype(CmfAccesstype cmfAccesstype)
    {
        return cmfAccesstypeMapper.updateCmfAccesstype(cmfAccesstype);
    }

    /**
     * 批量删除帐户操作类型
     * 
     * @param ids 需要删除的帐户操作类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfAccesstypeByIds(Integer[] ids)
    {
        return cmfAccesstypeMapper.deleteCmfAccesstypeByIds(ids);
    }

    /**
     * 删除帐户操作类型信息
     * 
     * @param id 帐户操作类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfAccesstypeById(Integer id)
    {
        return cmfAccesstypeMapper.deleteCmfAccesstypeById(id);
    }
}
