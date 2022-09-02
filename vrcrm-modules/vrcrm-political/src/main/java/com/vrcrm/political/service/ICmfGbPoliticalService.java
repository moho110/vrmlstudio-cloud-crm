package com.vrcrm.political.service;

import java.util.List;
import com.vrcrm.political.domain.CmfGbPolitical;

/**
 * 政治面貌Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfGbPoliticalService 
{
    /**
     * 查询政治面貌
     * 
     * @param id 政治面貌主键
     * @return 政治面貌
     */
    public CmfGbPolitical selectCmfGbPoliticalById(Integer id);

    /**
     * 查询政治面貌列表
     * 
     * @param cmfGbPolitical 政治面貌
     * @return 政治面貌集合
     */
    public List<CmfGbPolitical> selectCmfGbPoliticalList(CmfGbPolitical cmfGbPolitical);

    /**
     * 新增政治面貌
     * 
     * @param cmfGbPolitical 政治面貌
     * @return 结果
     */
    public int insertCmfGbPolitical(CmfGbPolitical cmfGbPolitical);

    /**
     * 修改政治面貌
     * 
     * @param cmfGbPolitical 政治面貌
     * @return 结果
     */
    public int updateCmfGbPolitical(CmfGbPolitical cmfGbPolitical);

    /**
     * 批量删除政治面貌
     * 
     * @param ids 需要删除的政治面貌主键集合
     * @return 结果
     */
    public int deleteCmfGbPoliticalByIds(Integer[] ids);

    /**
     * 删除政治面貌信息
     * 
     * @param id 政治面貌主键
     * @return 结果
     */
    public int deleteCmfGbPoliticalById(Integer id);
}
