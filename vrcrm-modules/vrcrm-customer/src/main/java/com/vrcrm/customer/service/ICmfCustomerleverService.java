package com.vrcrm.customer.service;

import java.util.List;
import com.vrcrm.customer.domain.CmfCustomerlever;

/**
 * 客户等级Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfCustomerleverService 
{
    /**
     * 查询客户等级
     * 
     * @param id 客户等级主键
     * @return 客户等级
     */
    public CmfCustomerlever selectCmfCustomerleverById(Integer id);

    /**
     * 查询客户等级列表
     * 
     * @param cmfCustomerlever 客户等级
     * @return 客户等级集合
     */
    public List<CmfCustomerlever> selectCmfCustomerleverList(CmfCustomerlever cmfCustomerlever);

    /**
     * 新增客户等级
     * 
     * @param cmfCustomerlever 客户等级
     * @return 结果
     */
    public int insertCmfCustomerlever(CmfCustomerlever cmfCustomerlever);

    /**
     * 修改客户等级
     * 
     * @param cmfCustomerlever 客户等级
     * @return 结果
     */
    public int updateCmfCustomerlever(CmfCustomerlever cmfCustomerlever);

    /**
     * 批量删除客户等级
     * 
     * @param ids 需要删除的客户等级主键集合
     * @return 结果
     */
    public int deleteCmfCustomerleverByIds(Integer[] ids);

    /**
     * 删除客户等级信息
     * 
     * @param id 客户等级主键
     * @return 结果
     */
    public int deleteCmfCustomerleverById(Integer id);
}
