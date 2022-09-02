package com.vrcrm.buy.service;

import java.util.List;
import com.vrcrm.buy.domain.CmfCrmFeiyongSq;

/**
 * 费用申请Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfCrmFeiyongSqService 
{
    /**
     * 查询费用申请
     * 
     * @param id 费用申请主键
     * @return 费用申请
     */
    public CmfCrmFeiyongSq selectCmfCrmFeiyongSqById(Integer id);

    /**
     * 查询费用申请列表
     * 
     * @param cmfCrmFeiyongSq 费用申请
     * @return 费用申请集合
     */
    public List<CmfCrmFeiyongSq> selectCmfCrmFeiyongSqList(CmfCrmFeiyongSq cmfCrmFeiyongSq);

    /**
     * 新增费用申请
     * 
     * @param cmfCrmFeiyongSq 费用申请
     * @return 结果
     */
    public int insertCmfCrmFeiyongSq(CmfCrmFeiyongSq cmfCrmFeiyongSq);

    /**
     * 修改费用申请
     * 
     * @param cmfCrmFeiyongSq 费用申请
     * @return 结果
     */
    public int updateCmfCrmFeiyongSq(CmfCrmFeiyongSq cmfCrmFeiyongSq);

    /**
     * 批量删除费用申请
     * 
     * @param ids 需要删除的费用申请主键集合
     * @return 结果
     */
    public int deleteCmfCrmFeiyongSqByIds(Integer[] ids);

    /**
     * 删除费用申请信息
     * 
     * @param id 费用申请主键
     * @return 结果
     */
    public int deleteCmfCrmFeiyongSqById(Integer id);
}
