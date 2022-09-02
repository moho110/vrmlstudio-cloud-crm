package com.vrcrm.store.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.store.mapper.CmfStoreaccesstypeMapper;
import com.vrcrm.store.domain.CmfStoreaccesstype;
import com.vrcrm.store.service.ICmfStoreaccesstypeService;

/**
 * 库存处理类型Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfStoreaccesstypeServiceImpl implements ICmfStoreaccesstypeService 
{
    @Autowired
    private CmfStoreaccesstypeMapper cmfStoreaccesstypeMapper;

    /**
     * 查询库存处理类型
     * 
     * @param id 库存处理类型主键
     * @return 库存处理类型
     */
    @Override
    public CmfStoreaccesstype selectCmfStoreaccesstypeById(Integer id)
    {
        return cmfStoreaccesstypeMapper.selectCmfStoreaccesstypeById(id);
    }

    /**
     * 查询库存处理类型列表
     * 
     * @param cmfStoreaccesstype 库存处理类型
     * @return 库存处理类型
     */
    @Override
    public List<CmfStoreaccesstype> selectCmfStoreaccesstypeList(CmfStoreaccesstype cmfStoreaccesstype)
    {
        return cmfStoreaccesstypeMapper.selectCmfStoreaccesstypeList(cmfStoreaccesstype);
    }

    /**
     * 新增库存处理类型
     * 
     * @param cmfStoreaccesstype 库存处理类型
     * @return 结果
     */
    @Override
    public int insertCmfStoreaccesstype(CmfStoreaccesstype cmfStoreaccesstype)
    {
        return cmfStoreaccesstypeMapper.insertCmfStoreaccesstype(cmfStoreaccesstype);
    }

    /**
     * 修改库存处理类型
     * 
     * @param cmfStoreaccesstype 库存处理类型
     * @return 结果
     */
    @Override
    public int updateCmfStoreaccesstype(CmfStoreaccesstype cmfStoreaccesstype)
    {
        return cmfStoreaccesstypeMapper.updateCmfStoreaccesstype(cmfStoreaccesstype);
    }

    /**
     * 批量删除库存处理类型
     * 
     * @param ids 需要删除的库存处理类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfStoreaccesstypeByIds(Integer[] ids)
    {
        return cmfStoreaccesstypeMapper.deleteCmfStoreaccesstypeByIds(ids);
    }

    /**
     * 删除库存处理类型信息
     * 
     * @param id 库存处理类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfStoreaccesstypeById(Integer id)
    {
        return cmfStoreaccesstypeMapper.deleteCmfStoreaccesstypeById(id);
    }
}
