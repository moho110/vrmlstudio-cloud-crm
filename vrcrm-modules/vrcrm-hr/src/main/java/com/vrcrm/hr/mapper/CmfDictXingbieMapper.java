package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfDictXingbie;

/**
 * 性别Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfDictXingbieMapper 
{
    /**
     * 查询性别
     * 
     * @param id 性别主键
     * @return 性别
     */
    public CmfDictXingbie selectCmfDictXingbieById(Integer id);

    /**
     * 查询性别列表
     * 
     * @param cmfDictXingbie 性别
     * @return 性别集合
     */
    public List<CmfDictXingbie> selectCmfDictXingbieList(CmfDictXingbie cmfDictXingbie);

    /**
     * 新增性别
     * 
     * @param cmfDictXingbie 性别
     * @return 结果
     */
    public int insertCmfDictXingbie(CmfDictXingbie cmfDictXingbie);

    /**
     * 修改性别
     * 
     * @param cmfDictXingbie 性别
     * @return 结果
     */
    public int updateCmfDictXingbie(CmfDictXingbie cmfDictXingbie);

    /**
     * 删除性别
     * 
     * @param id 性别主键
     * @return 结果
     */
    public int deleteCmfDictXingbieById(Integer id);

    /**
     * 批量删除性别
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfDictXingbieByIds(Integer[] ids);
}
