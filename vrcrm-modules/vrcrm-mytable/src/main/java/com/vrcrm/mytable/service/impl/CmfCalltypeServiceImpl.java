package com.vrcrm.mytable.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.mytable.mapper.CmfCalltypeMapper;
import com.vrcrm.mytable.domain.CmfCalltype;
import com.vrcrm.mytable.service.ICmfCalltypeService;

/**
 * 来电类型Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfCalltypeServiceImpl implements ICmfCalltypeService 
{
    @Autowired
    private CmfCalltypeMapper cmfCalltypeMapper;

    /**
     * 查询来电类型
     * 
     * @param id 来电类型主键
     * @return 来电类型
     */
    @Override
    public CmfCalltype selectCmfCalltypeById(Integer id)
    {
        return cmfCalltypeMapper.selectCmfCalltypeById(id);
    }

    /**
     * 查询来电类型列表
     * 
     * @param cmfCalltype 来电类型
     * @return 来电类型
     */
    @Override
    public List<CmfCalltype> selectCmfCalltypeList(CmfCalltype cmfCalltype)
    {
        return cmfCalltypeMapper.selectCmfCalltypeList(cmfCalltype);
    }

    /**
     * 新增来电类型
     * 
     * @param cmfCalltype 来电类型
     * @return 结果
     */
    @Override
    public int insertCmfCalltype(CmfCalltype cmfCalltype)
    {
        return cmfCalltypeMapper.insertCmfCalltype(cmfCalltype);
    }

    /**
     * 修改来电类型
     * 
     * @param cmfCalltype 来电类型
     * @return 结果
     */
    @Override
    public int updateCmfCalltype(CmfCalltype cmfCalltype)
    {
        return cmfCalltypeMapper.updateCmfCalltype(cmfCalltype);
    }

    /**
     * 批量删除来电类型
     * 
     * @param ids 需要删除的来电类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfCalltypeByIds(Integer[] ids)
    {
        return cmfCalltypeMapper.deleteCmfCalltypeByIds(ids);
    }

    /**
     * 删除来电类型信息
     * 
     * @param id 来电类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfCalltypeById(Integer id)
    {
        return cmfCalltypeMapper.deleteCmfCalltypeById(id);
    }
}
