package com.vrcrm.mytable.mapper;

import java.util.List;
import com.vrcrm.mytable.domain.CmfCalltype;

/**
 * 来电类型Mapper接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface CmfCalltypeMapper 
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
     * 删除来电类型
     * 
     * @param id 来电类型主键
     * @return 结果
     */
    public int deleteCmfCalltypeById(Integer id);

    /**
     * 批量删除来电类型
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfCalltypeByIds(Integer[] ids);
}
