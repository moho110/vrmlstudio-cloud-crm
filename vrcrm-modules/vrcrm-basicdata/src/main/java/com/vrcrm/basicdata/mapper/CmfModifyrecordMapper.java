package com.vrcrm.basicdata.mapper;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfModifyrecord;

/**
 * 修改记录Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfModifyrecordMapper 
{
    /**
     * 查询修改记录
     * 
     * @param id 修改记录主键
     * @return 修改记录
     */
    public CmfModifyrecord selectCmfModifyrecordById(Integer id);

    /**
     * 查询修改记录列表
     * 
     * @param cmfModifyrecord 修改记录
     * @return 修改记录集合
     */
    public List<CmfModifyrecord> selectCmfModifyrecordList(CmfModifyrecord cmfModifyrecord);

    /**
     * 新增修改记录
     * 
     * @param cmfModifyrecord 修改记录
     * @return 结果
     */
    public int insertCmfModifyrecord(CmfModifyrecord cmfModifyrecord);

    /**
     * 修改修改记录
     * 
     * @param cmfModifyrecord 修改记录
     * @return 结果
     */
    public int updateCmfModifyrecord(CmfModifyrecord cmfModifyrecord);

    /**
     * 删除修改记录
     * 
     * @param id 修改记录主键
     * @return 结果
     */
    public int deleteCmfModifyrecordById(Integer id);

    /**
     * 批量删除修改记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfModifyrecordByIds(Integer[] ids);
}
