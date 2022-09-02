package com.vrcrm.sales.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.sales.mapper.CmfFahuodanMapper;
import com.vrcrm.sales.domain.CmfFahuodan;
import com.vrcrm.sales.service.ICmfFahuodanService;

/**
 * 发货单Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfFahuodanServiceImpl implements ICmfFahuodanService 
{
    @Autowired
    private CmfFahuodanMapper cmfFahuodanMapper;

    /**
     * 查询发货单
     * 
     * @param id 发货单主键
     * @return 发货单
     */
    @Override
    public CmfFahuodan selectCmfFahuodanById(Integer id)
    {
        return cmfFahuodanMapper.selectCmfFahuodanById(id);
    }

    /**
     * 查询发货单列表
     * 
     * @param cmfFahuodan 发货单
     * @return 发货单
     */
    @Override
    public List<CmfFahuodan> selectCmfFahuodanList(CmfFahuodan cmfFahuodan)
    {
        return cmfFahuodanMapper.selectCmfFahuodanList(cmfFahuodan);
    }

    /**
     * 新增发货单
     * 
     * @param cmfFahuodan 发货单
     * @return 结果
     */
    @Override
    public int insertCmfFahuodan(CmfFahuodan cmfFahuodan)
    {
        return cmfFahuodanMapper.insertCmfFahuodan(cmfFahuodan);
    }

    /**
     * 修改发货单
     * 
     * @param cmfFahuodan 发货单
     * @return 结果
     */
    @Override
    public int updateCmfFahuodan(CmfFahuodan cmfFahuodan)
    {
        return cmfFahuodanMapper.updateCmfFahuodan(cmfFahuodan);
    }

    /**
     * 批量删除发货单
     * 
     * @param ids 需要删除的发货单主键
     * @return 结果
     */
    @Override
    public int deleteCmfFahuodanByIds(Integer[] ids)
    {
        return cmfFahuodanMapper.deleteCmfFahuodanByIds(ids);
    }

    /**
     * 删除发货单信息
     * 
     * @param id 发货单主键
     * @return 结果
     */
    @Override
    public int deleteCmfFahuodanById(Integer id)
    {
        return cmfFahuodanMapper.deleteCmfFahuodanById(id);
    }
}
