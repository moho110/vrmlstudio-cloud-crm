package com.vrcrm.finance.service;

import java.util.List;
import com.vrcrm.finance.domain.CmfAccessprepays;

/**
 * 预付款记录Service接口
 * 
 * @author VRer
 * @date 2022-04-13
 */
public interface ICmfAccessprepaysService 
{
    /**
     * 查询预付款记录
     * 
     * @param id 预付款记录主键
     * @return 预付款记录
     */
    public CmfAccessprepays selectCmfAccessprepaysById(Integer id);

    /**
     * 查询预付款记录列表
     * 
     * @param cmfAccessprepays 预付款记录
     * @return 预付款记录集合
     */
    public List<CmfAccessprepays> selectCmfAccessprepaysList(CmfAccessprepays cmfAccessprepays);

    /**
     * 新增预付款记录
     * 
     * @param cmfAccessprepays 预付款记录
     * @return 结果
     */
    public int insertCmfAccessprepays(CmfAccessprepays cmfAccessprepays);

    /**
     * 修改预付款记录
     * 
     * @param cmfAccessprepays 预付款记录
     * @return 结果
     */
    public int updateCmfAccessprepays(CmfAccessprepays cmfAccessprepays);

    /**
     * 批量删除预付款记录
     * 
     * @param ids 需要删除的预付款记录主键集合
     * @return 结果
     */
    public int deleteCmfAccessprepaysByIds(Integer[] ids);

    /**
     * 删除预付款记录信息
     * 
     * @param id 预付款记录主键
     * @return 结果
     */
    public int deleteCmfAccessprepaysById(Integer id);
}
