package com.vrcrm.political.mapper;

import java.util.List;
import com.vrcrm.political.domain.CmfDictShiyongleixing;

/**
 * 使用类型Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfDictShiyongleixingMapper 
{
    /**
     * 查询使用类型
     * 
     * @param id 使用类型主键
     * @return 使用类型
     */
    public CmfDictShiyongleixing selectCmfDictShiyongleixingById(Integer id);

    /**
     * 查询使用类型列表
     * 
     * @param cmfDictShiyongleixing 使用类型
     * @return 使用类型集合
     */
    public List<CmfDictShiyongleixing> selectCmfDictShiyongleixingList(CmfDictShiyongleixing cmfDictShiyongleixing);

    /**
     * 新增使用类型
     * 
     * @param cmfDictShiyongleixing 使用类型
     * @return 结果
     */
    public int insertCmfDictShiyongleixing(CmfDictShiyongleixing cmfDictShiyongleixing);

    /**
     * 修改使用类型
     * 
     * @param cmfDictShiyongleixing 使用类型
     * @return 结果
     */
    public int updateCmfDictShiyongleixing(CmfDictShiyongleixing cmfDictShiyongleixing);

    /**
     * 删除使用类型
     * 
     * @param id 使用类型主键
     * @return 结果
     */
    public int deleteCmfDictShiyongleixingById(Integer id);

    /**
     * 批量删除使用类型
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfDictShiyongleixingByIds(Integer[] ids);
}
