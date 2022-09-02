package com.vrcrm.sales.mapper;

import java.util.List;
import com.vrcrm.sales.domain.CmfSellbilltype;

/**
 * 销售清单类型Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfSellbilltypeMapper 
{
    /**
     * 查询销售清单类型
     * 
     * @param id 销售清单类型主键
     * @return 销售清单类型
     */
    public CmfSellbilltype selectCmfSellbilltypeById(Integer id);

    /**
     * 查询销售清单类型列表
     * 
     * @param cmfSellbilltype 销售清单类型
     * @return 销售清单类型集合
     */
    public List<CmfSellbilltype> selectCmfSellbilltypeList(CmfSellbilltype cmfSellbilltype);

    /**
     * 新增销售清单类型
     * 
     * @param cmfSellbilltype 销售清单类型
     * @return 结果
     */
    public int insertCmfSellbilltype(CmfSellbilltype cmfSellbilltype);

    /**
     * 修改销售清单类型
     * 
     * @param cmfSellbilltype 销售清单类型
     * @return 结果
     */
    public int updateCmfSellbilltype(CmfSellbilltype cmfSellbilltype);

    /**
     * 删除销售清单类型
     * 
     * @param id 销售清单类型主键
     * @return 结果
     */
    public int deleteCmfSellbilltypeById(Integer id);

    /**
     * 批量删除销售清单类型
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfSellbilltypeByIds(Integer[] ids);
}
