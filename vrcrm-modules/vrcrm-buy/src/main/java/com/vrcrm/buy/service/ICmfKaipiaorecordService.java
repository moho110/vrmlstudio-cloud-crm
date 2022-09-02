package com.vrcrm.buy.service;

import java.util.List;
import com.vrcrm.buy.domain.CmfKaipiaorecord;

/**
 * 开票记录Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfKaipiaorecordService 
{
    /**
     * 查询开票记录
     * 
     * @param id 开票记录主键
     * @return 开票记录
     */
    public CmfKaipiaorecord selectCmfKaipiaorecordById(Integer id);

    /**
     * 查询开票记录列表
     * 
     * @param cmfKaipiaorecord 开票记录
     * @return 开票记录集合
     */
    public List<CmfKaipiaorecord> selectCmfKaipiaorecordList(CmfKaipiaorecord cmfKaipiaorecord);

    /**
     * 新增开票记录
     * 
     * @param cmfKaipiaorecord 开票记录
     * @return 结果
     */
    public int insertCmfKaipiaorecord(CmfKaipiaorecord cmfKaipiaorecord);

    /**
     * 修改开票记录
     * 
     * @param cmfKaipiaorecord 开票记录
     * @return 结果
     */
    public int updateCmfKaipiaorecord(CmfKaipiaorecord cmfKaipiaorecord);

    /**
     * 批量删除开票记录
     * 
     * @param ids 需要删除的开票记录主键集合
     * @return 结果
     */
    public int deleteCmfKaipiaorecordByIds(Integer[] ids);

    /**
     * 删除开票记录信息
     * 
     * @param id 开票记录主键
     * @return 结果
     */
    public int deleteCmfKaipiaorecordById(Integer id);
}
