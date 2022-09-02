package com.vrcrm.mytable.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.mytable.mapper.CmfCallertypeMapper;
import com.vrcrm.mytable.domain.CmfCallertype;
import com.vrcrm.mytable.service.ICmfCallertypeService;

/**
 * 呼叫人类型Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfCallertypeServiceImpl implements ICmfCallertypeService 
{
    @Autowired
    private CmfCallertypeMapper cmfCallertypeMapper;

    /**
     * 查询呼叫人类型
     * 
     * @param id 呼叫人类型主键
     * @return 呼叫人类型
     */
    @Override
    public CmfCallertype selectCmfCallertypeById(Integer id)
    {
        return cmfCallertypeMapper.selectCmfCallertypeById(id);
    }

    /**
     * 查询呼叫人类型列表
     * 
     * @param cmfCallertype 呼叫人类型
     * @return 呼叫人类型
     */
    @Override
    public List<CmfCallertype> selectCmfCallertypeList(CmfCallertype cmfCallertype)
    {
        return cmfCallertypeMapper.selectCmfCallertypeList(cmfCallertype);
    }

    /**
     * 新增呼叫人类型
     * 
     * @param cmfCallertype 呼叫人类型
     * @return 结果
     */
    @Override
    public int insertCmfCallertype(CmfCallertype cmfCallertype)
    {
        return cmfCallertypeMapper.insertCmfCallertype(cmfCallertype);
    }

    /**
     * 修改呼叫人类型
     * 
     * @param cmfCallertype 呼叫人类型
     * @return 结果
     */
    @Override
    public int updateCmfCallertype(CmfCallertype cmfCallertype)
    {
        return cmfCallertypeMapper.updateCmfCallertype(cmfCallertype);
    }

    /**
     * 批量删除呼叫人类型
     * 
     * @param ids 需要删除的呼叫人类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfCallertypeByIds(Integer[] ids)
    {
        return cmfCallertypeMapper.deleteCmfCallertypeByIds(ids);
    }

    /**
     * 删除呼叫人类型信息
     * 
     * @param id 呼叫人类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfCallertypeById(Integer id)
    {
        return cmfCallertypeMapper.deleteCmfCallertypeById(id);
    }
}
