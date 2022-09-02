package com.vrcrm.mytable.service;

import java.util.List;
import com.vrcrm.mytable.domain.CmfCalltype;

/**
 * 来电类型Service接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface ICmfCalltypeService 
{
    /**
     * 查询来电类型
     * 
     * @param id 来电类型主键
     * @return 来电类型
     */
    public CmfCalltype selectCmfCalltypeById(Integer id);

    /**
     * 查询来电类型列表
     * 
     * @param cmfCalltype 来电类型
     * @return 来电类型集合
     */
    public List<CmfCalltype> selectCmfCalltypeList(CmfCalltype cmfCalltype);

    /**
     * 新增来电类型
     * 
     * @param cmfCalltype 来电类型
     * @return 结果
     */
    public int insertCmfCalltype(CmfCalltype cmfCalltype);

    /**
     * 修改来电类型
     * 
     * @param cmfCalltype 来电类型
     * @return 结果
     */
    public int updateCmfCalltype(CmfCalltype cmfCalltype);

    /**
     * 批量删除来电类型
     * 
     * @param ids 需要删除的来电类型主键集合
     * @return 结果
     */
    public int deleteCmfCalltypeByIds(Integer[] ids);

    /**
     * 删除来电类型信息
     * 
     * @param id 来电类型主键
     * @return 结果
     */
    public int deleteCmfCalltypeById(Integer id);
}
