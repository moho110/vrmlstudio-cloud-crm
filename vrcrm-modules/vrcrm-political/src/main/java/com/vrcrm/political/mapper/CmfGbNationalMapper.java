package com.vrcrm.political.mapper;

import java.util.List;
import com.vrcrm.political.domain.CmfGbNational;

/**
 * 国籍Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfGbNationalMapper 
{
    /**
     * 查询国籍
     * 
     * @param id 国籍主键
     * @return 国籍
     */
    public CmfGbNational selectCmfGbNationalById(Integer id);

    /**
     * 查询国籍列表
     * 
     * @param cmfGbNational 国籍
     * @return 国籍集合
     */
    public List<CmfGbNational> selectCmfGbNationalList(CmfGbNational cmfGbNational);

    /**
     * 新增国籍
     * 
     * @param cmfGbNational 国籍
     * @return 结果
     */
    public int insertCmfGbNational(CmfGbNational cmfGbNational);

    /**
     * 修改国籍
     * 
     * @param cmfGbNational 国籍
     * @return 结果
     */
    public int updateCmfGbNational(CmfGbNational cmfGbNational);

    /**
     * 删除国籍
     * 
     * @param id 国籍主键
     * @return 结果
     */
    public int deleteCmfGbNationalById(Integer id);

    /**
     * 批量删除国籍
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfGbNationalByIds(Integer[] ids);
}
