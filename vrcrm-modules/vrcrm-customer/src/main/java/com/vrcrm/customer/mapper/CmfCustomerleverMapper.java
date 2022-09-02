package com.vrcrm.customer.mapper;

import java.util.List;
import com.vrcrm.customer.domain.CmfCustomerlever;

/**
 * 客户等级Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfCustomerleverMapper 
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
     * 删除客户等级
     * 
     * @param id 客户等级主键
     * @return 结果
     */
    public int deleteCmfCustomerleverById(Integer id);

    /**
     * 批量删除客户等级
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfCustomerleverByIds(Integer[] ids);
}
