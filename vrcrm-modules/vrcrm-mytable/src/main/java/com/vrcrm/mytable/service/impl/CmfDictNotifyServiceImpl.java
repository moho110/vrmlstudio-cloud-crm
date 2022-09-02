package com.vrcrm.mytable.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.mytable.mapper.CmfDictNotifyMapper;
import com.vrcrm.mytable.domain.CmfDictNotify;
import com.vrcrm.mytable.service.ICmfDictNotifyService;

/**
 * 紧急程度Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfDictNotifyServiceImpl implements ICmfDictNotifyService 
{
    @Autowired
    private CmfDictNotifyMapper cmfDictNotifyMapper;

    /**
     * 查询紧急程度
     * 
     * @param id 紧急程度主键
     * @return 紧急程度
     */
    @Override
    public CmfDictNotify selectCmfDictNotifyById(Integer id)
    {
        return cmfDictNotifyMapper.selectCmfDictNotifyById(id);
    }

    /**
     * 查询紧急程度列表
     * 
     * @param cmfDictNotify 紧急程度
     * @return 紧急程度
     */
    @Override
    public List<CmfDictNotify> selectCmfDictNotifyList(CmfDictNotify cmfDictNotify)
    {
        return cmfDictNotifyMapper.selectCmfDictNotifyList(cmfDictNotify);
    }

    /**
     * 新增紧急程度
     * 
     * @param cmfDictNotify 紧急程度
     * @return 结果
     */
    @Override
    public int insertCmfDictNotify(CmfDictNotify cmfDictNotify)
    {
        return cmfDictNotifyMapper.insertCmfDictNotify(cmfDictNotify);
    }

    /**
     * 修改紧急程度
     * 
     * @param cmfDictNotify 紧急程度
     * @return 结果
     */
    @Override
    public int updateCmfDictNotify(CmfDictNotify cmfDictNotify)
    {
        return cmfDictNotifyMapper.updateCmfDictNotify(cmfDictNotify);
    }

    /**
     * 批量删除紧急程度
     * 
     * @param ids 需要删除的紧急程度主键
     * @return 结果
     */
    @Override
    public int deleteCmfDictNotifyByIds(Integer[] ids)
    {
        return cmfDictNotifyMapper.deleteCmfDictNotifyByIds(ids);
    }

    /**
     * 删除紧急程度信息
     * 
     * @param id 紧急程度主键
     * @return 结果
     */
    @Override
    public int deleteCmfDictNotifyById(Integer id)
    {
        return cmfDictNotifyMapper.deleteCmfDictNotifyById(id);
    }
}
