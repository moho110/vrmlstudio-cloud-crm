package com.vrcrm.buy.mapper;

import java.util.List;
import com.vrcrm.buy.domain.CmfImportant;

/**
 * 重要性Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfImportantMapper 
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
     * 删除重要性
     * 
     * @param id 重要性主键
     * @return 结果
     */
    public int deleteCmfImportantById(Integer id);

    /**
     * 批量删除重要性
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfImportantByIds(Integer[] ids);
}
