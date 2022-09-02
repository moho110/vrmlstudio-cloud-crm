package com.vrcrm.sales.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.sales.mapper.CmfSellbilltypeMapper;
import com.vrcrm.sales.domain.CmfSellbilltype;
import com.vrcrm.sales.service.ICmfSellbilltypeService;

/**
 * 销售清单类型Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSellbilltypeServiceImpl implements ICmfSellbilltypeService 
{
    @Autowired
    private CmfSellbilltypeMapper cmfSellbilltypeMapper;

    /**
     * 查询销售清单类型
     * 
     * @param id 销售清单类型主键
     * @return 销售清单类型
     */
    @Override
    public CmfSellbilltype selectCmfSellbilltypeById(Integer id)
    {
        return cmfSellbilltypeMapper.selectCmfSellbilltypeById(id);
    }

    /**
     * 查询销售清单类型列表
     * 
     * @param cmfSellbilltype 销售清单类型
     * @return 销售清单类型
     */
    @Override
    public List<CmfSellbilltype> selectCmfSellbilltypeList(CmfSellbilltype cmfSellbilltype)
    {
        return cmfSellbilltypeMapper.selectCmfSellbilltypeList(cmfSellbilltype);
    }

    /**
     * 新增销售清单类型
     * 
     * @param cmfSellbilltype 销售清单类型
     * @return 结果
     */
    @Override
    public int insertCmfSellbilltype(CmfSellbilltype cmfSellbilltype)
    {
        return cmfSellbilltypeMapper.insertCmfSellbilltype(cmfSellbilltype);
    }

    /**
     * 修改销售清单类型
     * 
     * @param cmfSellbilltype 销售清单类型
     * @return 结果
     */
    @Override
    public int updateCmfSellbilltype(CmfSellbilltype cmfSellbilltype)
    {
        return cmfSellbilltypeMapper.updateCmfSellbilltype(cmfSellbilltype);
    }

    /**
     * 批量删除销售清单类型
     * 
     * @param ids 需要删除的销售清单类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfSellbilltypeByIds(Integer[] ids)
    {
        return cmfSellbilltypeMapper.deleteCmfSellbilltypeByIds(ids);
    }

    /**
     * 删除销售清单类型信息
     * 
     * @param id 销售清单类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfSellbilltypeById(Integer id)
    {
        return cmfSellbilltypeMapper.deleteCmfSellbilltypeById(id);
    }
}
