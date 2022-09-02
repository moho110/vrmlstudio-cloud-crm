package com.vrcrm.sales.service;

import java.util.List;
import com.vrcrm.sales.domain.CmfShoupiaorecord;

/**
 * 收票记录Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfShoupiaorecordService 
{
    /**
     * 查询收票记录
     * 
     * @param id 收票记录主键
     * @return 收票记录
     */
    public CmfShoupiaorecord selectCmfShoupiaorecordById(Integer id);

    /**
     * 查询收票记录列表
     * 
     * @param cmfShoupiaorecord 收票记录
     * @return 收票记录集合
     */
    public List<CmfShoupiaorecord> selectCmfShoupiaorecordList(CmfShoupiaorecord cmfShoupiaorecord);

    /**
     * 新增收票记录
     * 
     * @param cmfShoupiaorecord 收票记录
     * @return 结果
     */
    public int insertCmfShoupiaorecord(CmfShoupiaorecord cmfShoupiaorecord);

    /**
     * 修改收票记录
     * 
     * @param cmfShoupiaorecord 收票记录
     * @return 结果
     */
    public int updateCmfShoupiaorecord(CmfShoupiaorecord cmfShoupiaorecord);

    /**
     * 批量删除收票记录
     * 
     * @param ids 需要删除的收票记录主键集合
     * @return 结果
     */
    public int deleteCmfShoupiaorecordByIds(Integer[] ids);

    /**
     * 删除收票记录信息
     * 
     * @param id 收票记录主键
     * @return 结果
     */
    public int deleteCmfShoupiaorecordById(Integer id);
}
