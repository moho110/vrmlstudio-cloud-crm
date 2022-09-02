package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfNumzeroMapper;
import com.vrcrm.basicdata.domain.CmfNumzero;
import com.vrcrm.basicdata.service.ICmfNumzeroService;

/**
 * ZeroService业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfNumzeroServiceImpl implements ICmfNumzeroService 
{
    @Autowired
    private CmfNumzeroMapper cmfNumzeroMapper;

    /**
     * 查询Zero
     * 
     * @param id Zero主键
     * @return Zero
     */
    @Override
    public CmfNumzero selectCmfNumzeroById(Integer id)
    {
        return cmfNumzeroMapper.selectCmfNumzeroById(id);
    }

    /**
     * 查询Zero列表
     * 
     * @param cmfNumzero Zero
     * @return Zero
     */
    @Override
    public List<CmfNumzero> selectCmfNumzeroList(CmfNumzero cmfNumzero)
    {
        return cmfNumzeroMapper.selectCmfNumzeroList(cmfNumzero);
    }

    /**
     * 新增Zero
     * 
     * @param cmfNumzero Zero
     * @return 结果
     */
    @Override
    public int insertCmfNumzero(CmfNumzero cmfNumzero)
    {
        return cmfNumzeroMapper.insertCmfNumzero(cmfNumzero);
    }

    /**
     * 修改Zero
     * 
     * @param cmfNumzero Zero
     * @return 结果
     */
    @Override
    public int updateCmfNumzero(CmfNumzero cmfNumzero)
    {
        return cmfNumzeroMapper.updateCmfNumzero(cmfNumzero);
    }

    /**
     * 批量删除Zero
     * 
     * @param ids 需要删除的Zero主键
     * @return 结果
     */
    @Override
    public int deleteCmfNumzeroByIds(Integer[] ids)
    {
        return cmfNumzeroMapper.deleteCmfNumzeroByIds(ids);
    }

    /**
     * 删除Zero信息
     * 
     * @param id Zero主键
     * @return 结果
     */
    @Override
    public int deleteCmfNumzeroById(Integer id)
    {
        return cmfNumzeroMapper.deleteCmfNumzeroById(id);
    }
}
