package com.vrcrm.political.mapper;

import java.util.List;
import com.vrcrm.political.domain.CmfGbSex;

/**
 * 性别Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfGbSexMapper 
{
    /**
     * 查询性别
     * 
     * @param id 性别主键
     * @return 性别
     */
    public CmfGbSex selectCmfGbSexById(Integer id);

    /**
     * 查询性别列表
     * 
     * @param cmfGbSex 性别
     * @return 性别集合
     */
    public List<CmfGbSex> selectCmfGbSexList(CmfGbSex cmfGbSex);

    /**
     * 新增性别
     * 
     * @param cmfGbSex 性别
     * @return 结果
     */
    public int insertCmfGbSex(CmfGbSex cmfGbSex);

    /**
     * 修改性别
     * 
     * @param cmfGbSex 性别
     * @return 结果
     */
    public int updateCmfGbSex(CmfGbSex cmfGbSex);

    /**
     * 删除性别
     * 
     * @param id 性别主键
     * @return 结果
     */
    public int deleteCmfGbSexById(Integer id);

    /**
     * 批量删除性别
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfGbSexByIds(Integer[] ids);
}
