package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfProducttypeMapper;
import com.vrcrm.basicdata.domain.CmfProducttype;
import com.vrcrm.basicdata.service.ICmfProducttypeService;

/**
 * 产品类型Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfProducttypeServiceImpl implements ICmfProducttypeService 
{
    @Autowired
    private CmfProducttypeMapper cmfProducttypeMapper;

    /**
     * 查询产品类型
     * 
     * @param id 产品类型主键
     * @return 产品类型
     */
    @Override
    public CmfProducttype selectCmfProducttypeById(Integer id)
    {
        return cmfProducttypeMapper.selectCmfProducttypeById(id);
    }

    /**
     * 查询产品类型列表
     * 
     * @param cmfProducttype 产品类型
     * @return 产品类型
     */
    @Override
    public List<CmfProducttype> selectCmfProducttypeList(CmfProducttype cmfProducttype)
    {
        return cmfProducttypeMapper.selectCmfProducttypeList(cmfProducttype);
    }

    /**
     * 新增产品类型
     * 
     * @param cmfProducttype 产品类型
     * @return 结果
     */
    @Override
    public int insertCmfProducttype(CmfProducttype cmfProducttype)
    {
        return cmfProducttypeMapper.insertCmfProducttype(cmfProducttype);
    }

    /**
     * 修改产品类型
     * 
     * @param cmfProducttype 产品类型
     * @return 结果
     */
    @Override
    public int updateCmfProducttype(CmfProducttype cmfProducttype)
    {
        return cmfProducttypeMapper.updateCmfProducttype(cmfProducttype);
    }

    /**
     * 批量删除产品类型
     * 
     * @param ids 需要删除的产品类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfProducttypeByIds(Integer[] ids)
    {
        return cmfProducttypeMapper.deleteCmfProducttypeByIds(ids);
    }

    /**
     * 删除产品类型信息
     * 
     * @param id 产品类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfProducttypeById(Integer id)
    {
        return cmfProducttypeMapper.deleteCmfProducttypeById(id);
    }
}
