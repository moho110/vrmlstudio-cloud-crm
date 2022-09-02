package com.vrcrm.mytable.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.mytable.mapper.CmfCallchuliMapper;
import com.vrcrm.mytable.domain.CmfCallchuli;
import com.vrcrm.mytable.service.ICmfCallchuliService;

/**
 * 来电处理Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfCallchuliServiceImpl implements ICmfCallchuliService 
{
    @Autowired
    private CmfCallchuliMapper cmfCallchuliMapper;

    /**
     * 查询来电处理
     * 
     * @param id 来电处理主键
     * @return 来电处理
     */
    @Override
    public CmfCallchuli selectCmfCallchuliById(Integer id)
    {
        return cmfCallchuliMapper.selectCmfCallchuliById(id);
    }

    /**
     * 查询来电处理列表
     * 
     * @param cmfCallchuli 来电处理
     * @return 来电处理
     */
    @Override
    public List<CmfCallchuli> selectCmfCallchuliList(CmfCallchuli cmfCallchuli)
    {
        return cmfCallchuliMapper.selectCmfCallchuliList(cmfCallchuli);
    }

    /**
     * 新增来电处理
     * 
     * @param cmfCallchuli 来电处理
     * @return 结果
     */
    @Override
    public int insertCmfCallchuli(CmfCallchuli cmfCallchuli)
    {
        return cmfCallchuliMapper.insertCmfCallchuli(cmfCallchuli);
    }

    /**
     * 修改来电处理
     * 
     * @param cmfCallchuli 来电处理
     * @return 结果
     */
    @Override
    public int updateCmfCallchuli(CmfCallchuli cmfCallchuli)
    {
        return cmfCallchuliMapper.updateCmfCallchuli(cmfCallchuli);
    }

    /**
     * 批量删除来电处理
     * 
     * @param ids 需要删除的来电处理主键
     * @return 结果
     */
    @Override
    public int deleteCmfCallchuliByIds(Integer[] ids)
    {
        return cmfCallchuliMapper.deleteCmfCallchuliByIds(ids);
    }

    /**
     * 删除来电处理信息
     * 
     * @param id 来电处理主键
     * @return 结果
     */
    @Override
    public int deleteCmfCallchuliById(Integer id)
    {
        return cmfCallchuliMapper.deleteCmfCallchuliById(id);
    }
}
