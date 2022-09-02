package com.vrcrm.political.mapper;

import java.util.List;
import com.vrcrm.political.domain.CmfDictHuxing;

/**
 * 户型Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfDictHuxingMapper 
{
    /**
     * 查询户型
     * 
     * @param id 户型主键
     * @return 户型
     */
    public CmfDictHuxing selectCmfDictHuxingById(Integer id);

    /**
     * 查询户型列表
     * 
     * @param cmfDictHuxing 户型
     * @return 户型集合
     */
    public List<CmfDictHuxing> selectCmfDictHuxingList(CmfDictHuxing cmfDictHuxing);

    /**
     * 新增户型
     * 
     * @param cmfDictHuxing 户型
     * @return 结果
     */
    public int insertCmfDictHuxing(CmfDictHuxing cmfDictHuxing);

    /**
     * 修改户型
     * 
     * @param cmfDictHuxing 户型
     * @return 结果
     */
    public int updateCmfDictHuxing(CmfDictHuxing cmfDictHuxing);

    /**
     * 删除户型
     * 
     * @param id 户型主键
     * @return 结果
     */
    public int deleteCmfDictHuxingById(Integer id);

    /**
     * 批量删除户型
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfDictHuxingByIds(Integer[] ids);
}
