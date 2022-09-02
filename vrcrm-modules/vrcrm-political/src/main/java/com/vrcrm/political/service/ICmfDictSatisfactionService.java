package com.vrcrm.political.service;

import java.util.List;
import com.vrcrm.political.domain.CmfDictSatisfaction;

/**
 * 满意度Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfDictSatisfactionService 
{
    /**
     * 查询满意度
     * 
     * @param id 满意度主键
     * @return 满意度
     */
    public CmfDictSatisfaction selectCmfDictSatisfactionById(Integer id);

    /**
     * 查询满意度列表
     * 
     * @param cmfDictSatisfaction 满意度
     * @return 满意度集合
     */
    public List<CmfDictSatisfaction> selectCmfDictSatisfactionList(CmfDictSatisfaction cmfDictSatisfaction);

    /**
     * 新增满意度
     * 
     * @param cmfDictSatisfaction 满意度
     * @return 结果
     */
    public int insertCmfDictSatisfaction(CmfDictSatisfaction cmfDictSatisfaction);

    /**
     * 修改满意度
     * 
     * @param cmfDictSatisfaction 满意度
     * @return 结果
     */
    public int updateCmfDictSatisfaction(CmfDictSatisfaction cmfDictSatisfaction);

    /**
     * 批量删除满意度
     * 
     * @param ids 需要删除的满意度主键集合
     * @return 结果
     */
    public int deleteCmfDictSatisfactionByIds(Integer[] ids);

    /**
     * 删除满意度信息
     * 
     * @param id 满意度主键
     * @return 结果
     */
    public int deleteCmfDictSatisfactionById(Integer id);
}
