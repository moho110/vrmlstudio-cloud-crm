package com.vrcrm.buy.service;

import java.util.List;
import com.vrcrm.buy.domain.CmfImportant;

/**
 * 重要性Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfImportantService 
{
    /**
     * 查询重要性
     * 
     * @param id 重要性主键
     * @return 重要性
     */
    public CmfImportant selectCmfImportantById(Integer id);

    /**
     * 查询重要性列表
     * 
     * @param cmfImportant 重要性
     * @return 重要性集合
     */
    public List<CmfImportant> selectCmfImportantList(CmfImportant cmfImportant);

    /**
     * 新增重要性
     * 
     * @param cmfImportant 重要性
     * @return 结果
     */
    public int insertCmfImportant(CmfImportant cmfImportant);

    /**
     * 修改重要性
     * 
     * @param cmfImportant 重要性
     * @return 结果
     */
    public int updateCmfImportant(CmfImportant cmfImportant);

    /**
     * 批量删除重要性
     * 
     * @param ids 需要删除的重要性主键集合
     * @return 结果
     */
    public int deleteCmfImportantByIds(Integer[] ids);

    /**
     * 删除重要性信息
     * 
     * @param id 重要性主键
     * @return 结果
     */
    public int deleteCmfImportantById(Integer id);
}
