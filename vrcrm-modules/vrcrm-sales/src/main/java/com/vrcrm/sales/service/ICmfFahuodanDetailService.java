package com.vrcrm.sales.service;

import java.util.List;
import com.vrcrm.sales.domain.CmfFahuodanDetail;

/**
 * 发货单明细Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfFahuodanDetailService 
{
    /**
     * 查询发货单明细
     * 
     * @param id 发货单明细主键
     * @return 发货单明细
     */
    public CmfFahuodanDetail selectCmfFahuodanDetailById(Integer id);

    /**
     * 查询发货单明细列表
     * 
     * @param cmfFahuodanDetail 发货单明细
     * @return 发货单明细集合
     */
    public List<CmfFahuodanDetail> selectCmfFahuodanDetailList(CmfFahuodanDetail cmfFahuodanDetail);

    /**
     * 新增发货单明细
     * 
     * @param cmfFahuodanDetail 发货单明细
     * @return 结果
     */
    public int insertCmfFahuodanDetail(CmfFahuodanDetail cmfFahuodanDetail);

    /**
     * 修改发货单明细
     * 
     * @param cmfFahuodanDetail 发货单明细
     * @return 结果
     */
    public int updateCmfFahuodanDetail(CmfFahuodanDetail cmfFahuodanDetail);

    /**
     * 批量删除发货单明细
     * 
     * @param ids 需要删除的发货单明细主键集合
     * @return 结果
     */
    public int deleteCmfFahuodanDetailByIds(Integer[] ids);

    /**
     * 删除发货单明细信息
     * 
     * @param id 发货单明细主键
     * @return 结果
     */
    public int deleteCmfFahuodanDetailById(Integer id);
}
