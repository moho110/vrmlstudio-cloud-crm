package com.vrcrm.basicdata.mapper;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfRecycleBin;

/**
 * 回收站Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfRecycleBinMapper 
{
    /**
     * 查询回收站
     * 
     * @param id 回收站主键
     * @return 回收站
     */
    public CmfRecycleBin selectCmfRecycleBinById(Integer id);

    /**
     * 查询回收站列表
     * 
     * @param cmfRecycleBin 回收站
     * @return 回收站集合
     */
    public List<CmfRecycleBin> selectCmfRecycleBinList(CmfRecycleBin cmfRecycleBin);

    /**
     * 新增回收站
     * 
     * @param cmfRecycleBin 回收站
     * @return 结果
     */
    public int insertCmfRecycleBin(CmfRecycleBin cmfRecycleBin);

    /**
     * 修改回收站
     * 
     * @param cmfRecycleBin 回收站
     * @return 结果
     */
    public int updateCmfRecycleBin(CmfRecycleBin cmfRecycleBin);

    /**
     * 删除回收站
     * 
     * @param id 回收站主键
     * @return 结果
     */
    public int deleteCmfRecycleBinById(Integer id);

    /**
     * 批量删除回收站
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfRecycleBinByIds(Integer[] ids);
}
