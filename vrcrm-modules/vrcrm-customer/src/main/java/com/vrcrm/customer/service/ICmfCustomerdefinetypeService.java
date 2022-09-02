package com.vrcrm.customer.service;

import java.util.List;
import com.vrcrm.customer.domain.CmfCustomerdefinetype;

/**
 * 客户定义类型Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfCustomerdefinetypeService 
{
    /**
     * 查询客户定义类型
     * 
     * @param id 客户定义类型主键
     * @return 客户定义类型
     */
    public CmfCustomerdefinetype selectCmfCustomerdefinetypeById(Integer id);

    /**
     * 查询客户定义类型列表
     * 
     * @param cmfCustomerdefinetype 客户定义类型
     * @return 客户定义类型集合
     */
    public List<CmfCustomerdefinetype> selectCmfCustomerdefinetypeList(CmfCustomerdefinetype cmfCustomerdefinetype);

    /**
     * 新增客户定义类型
     * 
     * @param cmfCustomerdefinetype 客户定义类型
     * @return 结果
     */
    public int insertCmfCustomerdefinetype(CmfCustomerdefinetype cmfCustomerdefinetype);

    /**
     * 修改客户定义类型
     * 
     * @param cmfCustomerdefinetype 客户定义类型
     * @return 结果
     */
    public int updateCmfCustomerdefinetype(CmfCustomerdefinetype cmfCustomerdefinetype);

    /**
     * 批量删除客户定义类型
     * 
     * @param ids 需要删除的客户定义类型主键集合
     * @return 结果
     */
    public int deleteCmfCustomerdefinetypeByIds(Integer[] ids);

    /**
     * 删除客户定义类型信息
     * 
     * @param id 客户定义类型主键
     * @return 结果
     */
    public int deleteCmfCustomerdefinetypeById(Integer id);
}
