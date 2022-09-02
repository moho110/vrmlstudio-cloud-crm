package com.vrcrm.sales.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.sales.mapper.CmfSalemodeMapper;
import com.vrcrm.sales.domain.CmfSalemode;
import com.vrcrm.sales.service.ICmfSalemodeService;

/**
 * 销售模式Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSalemodeServiceImpl implements ICmfSalemodeService 
{
    @Autowired
    private CmfSalemodeMapper cmfSalemodeMapper;

    /**
     * 查询销售模式
     * 
     * @param id 销售模式主键
     * @return 销售模式
     */
    @Override
    public CmfSalemode selectCmfSalemodeById(Integer id)
    {
        return cmfSalemodeMapper.selectCmfSalemodeById(id);
    }

    /**
     * 查询销售模式列表
     * 
     * @param cmfSalemode 销售模式
     * @return 销售模式
     */
    @Override
    public List<CmfSalemode> selectCmfSalemodeList(CmfSalemode cmfSalemode)
    {
        return cmfSalemodeMapper.selectCmfSalemodeList(cmfSalemode);
    }

    /**
     * 新增销售模式
     * 
     * @param cmfSalemode 销售模式
     * @return 结果
     */
    @Override
    public int insertCmfSalemode(CmfSalemode cmfSalemode)
    {
        return cmfSalemodeMapper.insertCmfSalemode(cmfSalemode);
    }

    /**
     * 修改销售模式
     * 
     * @param cmfSalemode 销售模式
     * @return 结果
     */
    @Override
    public int updateCmfSalemode(CmfSalemode cmfSalemode)
    {
        return cmfSalemodeMapper.updateCmfSalemode(cmfSalemode);
    }

    /**
     * 批量删除销售模式
     * 
     * @param ids 需要删除的销售模式主键
     * @return 结果
     */
    @Override
    public int deleteCmfSalemodeByIds(Integer[] ids)
    {
        return cmfSalemodeMapper.deleteCmfSalemodeByIds(ids);
    }

    /**
     * 删除销售模式信息
     * 
     * @param id 销售模式主键
     * @return 结果
     */
    @Override
    public int deleteCmfSalemodeById(Integer id)
    {
        return cmfSalemodeMapper.deleteCmfSalemodeById(id);
    }
}
