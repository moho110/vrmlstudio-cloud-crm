package com.vrcrm.customer.service;

import java.util.List;
import com.vrcrm.customer.domain.CmfCompeteproduct;

/**
 * 竞争对手Service接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface ICmfCompeteproductService 
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
     * 批量删除竞争对手
     * 
     * @param ids 需要删除的竞争对手主键集合
     * @return 结果
     */
    public int deleteCmfCompeteproductByIds(Integer[] ids);

    /**
     * 删除竞争对手信息
     * 
     * @param id 竞争对手主键
     * @return 结果
     */
    public int deleteCmfCompeteproductById(Integer id);
}
