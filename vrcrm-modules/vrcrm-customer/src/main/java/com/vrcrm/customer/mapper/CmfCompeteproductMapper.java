package com.vrcrm.customer.mapper;

import java.util.List;
import com.vrcrm.customer.domain.CmfCompeteproduct;

/**
 * 竞争对手Mapper接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface CmfCompeteproductMapper 
{
    /**
     * 查询竞争对手
     * 
     * @param id 竞争对手主键
     * @return 竞争对手
     */
    public CmfCompeteproduct selectCmfCompeteproductById(Integer id);

    /**
     * 查询竞争对手列表
     * 
     * @param cmfCompeteproduct 竞争对手
     * @return 竞争对手集合
     */
    public List<CmfCompeteproduct> selectCmfCompeteproductList(CmfCompeteproduct cmfCompeteproduct);

    /**
     * 新增竞争对手
     * 
     * @param cmfCompeteproduct 竞争对手
     * @return 结果
     */
    public int insertCmfCompeteproduct(CmfCompeteproduct cmfCompeteproduct);

    /**
     * 修改竞争对手
     * 
     * @param cmfCompeteproduct 竞争对手
     * @return 结果
     */
    public int updateCmfCompeteproduct(CmfCompeteproduct cmfCompeteproduct);

    /**
     * 删除竞争对手
     * 
     * @param id 竞争对手主键
     * @return 结果
     */
    public int deleteCmfCompeteproductById(Integer id);

    /**
     * 批量删除竞争对手
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfCompeteproductByIds(Integer[] ids);
}
