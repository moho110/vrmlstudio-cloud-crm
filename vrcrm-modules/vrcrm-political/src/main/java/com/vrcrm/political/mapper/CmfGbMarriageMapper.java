package com.vrcrm.political.mapper;

import java.util.List;
import com.vrcrm.political.domain.CmfGbMarriage;

/**
 * 婚否Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfGbMarriageMapper 
{
    /**
     * 查询婚否
     * 
     * @param id 婚否主键
     * @return 婚否
     */
    public CmfGbMarriage selectCmfGbMarriageById(Integer id);

    /**
     * 查询婚否列表
     * 
     * @param cmfGbMarriage 婚否
     * @return 婚否集合
     */
    public List<CmfGbMarriage> selectCmfGbMarriageList(CmfGbMarriage cmfGbMarriage);

    /**
     * 新增婚否
     * 
     * @param cmfGbMarriage 婚否
     * @return 结果
     */
    public int insertCmfGbMarriage(CmfGbMarriage cmfGbMarriage);

    /**
     * 修改婚否
     * 
     * @param cmfGbMarriage 婚否
     * @return 结果
     */
    public int updateCmfGbMarriage(CmfGbMarriage cmfGbMarriage);

    /**
     * 删除婚否
     * 
     * @param id 婚否主键
     * @return 结果
     */
    public int deleteCmfGbMarriageById(Integer id);

    /**
     * 批量删除婚否
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfGbMarriageByIds(Integer[] ids);
}
