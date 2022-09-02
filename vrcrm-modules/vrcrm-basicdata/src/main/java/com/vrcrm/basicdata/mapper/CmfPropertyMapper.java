package com.vrcrm.basicdata.mapper;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfProperty;

/**
 * 行业归属Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfPropertyMapper 
{
    /**
     * 查询行业归属
     * 
     * @param id 行业归属主键
     * @return 行业归属
     */
    public CmfProperty selectCmfPropertyById(Integer id);

    /**
     * 查询行业归属列表
     * 
     * @param cmfProperty 行业归属
     * @return 行业归属集合
     */
    public List<CmfProperty> selectCmfPropertyList(CmfProperty cmfProperty);

    /**
     * 新增行业归属
     * 
     * @param cmfProperty 行业归属
     * @return 结果
     */
    public int insertCmfProperty(CmfProperty cmfProperty);

    /**
     * 修改行业归属
     * 
     * @param cmfProperty 行业归属
     * @return 结果
     */
    public int updateCmfProperty(CmfProperty cmfProperty);

    /**
     * 删除行业归属
     * 
     * @param id 行业归属主键
     * @return 结果
     */
    public int deleteCmfPropertyById(Integer id);

    /**
     * 批量删除行业归属
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfPropertyByIds(Integer[] ids);
}
