package com.vrcrm.basicdata.service;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfFeiyongrecord;

/**
 * 费用记录Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfFeiyongrecordService 
{
    /**
     * 查询费用记录
     * 
     * @param id 费用记录主键
     * @return 费用记录
     */
    public CmfFeiyongrecord selectCmfFeiyongrecordById(Integer id);

    /**
     * 查询费用记录列表
     * 
     * @param cmfFeiyongrecord 费用记录
     * @return 费用记录集合
     */
    public List<CmfFeiyongrecord> selectCmfFeiyongrecordList(CmfFeiyongrecord cmfFeiyongrecord);

    /**
     * 新增费用记录
     * 
     * @param cmfFeiyongrecord 费用记录
     * @return 结果
     */
    public int insertCmfFeiyongrecord(CmfFeiyongrecord cmfFeiyongrecord);

    /**
     * 修改费用记录
     * 
     * @param cmfFeiyongrecord 费用记录
     * @return 结果
     */
    public int updateCmfFeiyongrecord(CmfFeiyongrecord cmfFeiyongrecord);

    /**
     * 批量删除费用记录
     * 
     * @param ids 需要删除的费用记录主键集合
     * @return 结果
     */
    public int deleteCmfFeiyongrecordByIds(Integer[] ids);

    /**
     * 删除费用记录信息
     * 
     * @param id 费用记录主键
     * @return 结果
     */
    public int deleteCmfFeiyongrecordById(Integer id);
}
