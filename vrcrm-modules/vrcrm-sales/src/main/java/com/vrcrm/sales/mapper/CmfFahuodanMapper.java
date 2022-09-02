package com.vrcrm.sales.mapper;

import java.util.List;
import com.vrcrm.sales.domain.CmfFahuodan;

/**
 * 发货单Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfFahuodanMapper 
{
    /**
     * 查询发货单
     * 
     * @param id 发货单主键
     * @return 发货单
     */
    public CmfFahuodan selectCmfFahuodanById(Integer id);

    /**
     * 查询发货单列表
     * 
     * @param cmfFahuodan 发货单
     * @return 发货单集合
     */
    public List<CmfFahuodan> selectCmfFahuodanList(CmfFahuodan cmfFahuodan);

    /**
     * 新增发货单
     * 
     * @param cmfFahuodan 发货单
     * @return 结果
     */
    public int insertCmfFahuodan(CmfFahuodan cmfFahuodan);

    /**
     * 修改发货单
     * 
     * @param cmfFahuodan 发货单
     * @return 结果
     */
    public int updateCmfFahuodan(CmfFahuodan cmfFahuodan);

    /**
     * 删除发货单
     * 
     * @param id 发货单主键
     * @return 结果
     */
    public int deleteCmfFahuodanById(Integer id);

    /**
     * 批量删除发货单
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfFahuodanByIds(Integer[] ids);
}
