package com.vrcrm.basicdata.service;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfProducttype;

/**
 * 产品类型Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfProducttypeService 
{
    /**
     * 查询产品类型
     * 
     * @param id 产品类型主键
     * @return 产品类型
     */
    public CmfProducttype selectCmfProducttypeById(Integer id);

    /**
     * 查询产品类型列表
     * 
     * @param cmfProducttype 产品类型
     * @return 产品类型集合
     */
    public List<CmfProducttype> selectCmfProducttypeList(CmfProducttype cmfProducttype);

    /**
     * 新增产品类型
     * 
     * @param cmfProducttype 产品类型
     * @return 结果
     */
    public int insertCmfProducttype(CmfProducttype cmfProducttype);

    /**
     * 修改产品类型
     * 
     * @param cmfProducttype 产品类型
     * @return 结果
     */
    public int updateCmfProducttype(CmfProducttype cmfProducttype);

    /**
     * 批量删除产品类型
     * 
     * @param ids 需要删除的产品类型主键集合
     * @return 结果
     */
    public int deleteCmfProducttypeByIds(Integer[] ids);

    /**
     * 删除产品类型信息
     * 
     * @param id 产品类型主键
     * @return 结果
     */
    public int deleteCmfProducttypeById(Integer id);
}
