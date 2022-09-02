package com.vrcrm.hr.service;

import java.util.List;
import com.vrcrm.hr.domain.CmfEduZhongcengmingxi;

/**
 * 中层干部测评内容明细Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfEduZhongcengmingxiService 
{
    /**
     * 查询中层干部测评内容明细
     * 
     * @param id 中层干部测评内容明细主键
     * @return 中层干部测评内容明细
     */
    public CmfEduZhongcengmingxi selectCmfEduZhongcengmingxiById(Integer id);

    /**
     * 查询中层干部测评内容明细列表
     * 
     * @param cmfEduZhongcengmingxi 中层干部测评内容明细
     * @return 中层干部测评内容明细集合
     */
    public List<CmfEduZhongcengmingxi> selectCmfEduZhongcengmingxiList(CmfEduZhongcengmingxi cmfEduZhongcengmingxi);

    /**
     * 新增中层干部测评内容明细
     * 
     * @param cmfEduZhongcengmingxi 中层干部测评内容明细
     * @return 结果
     */
    public int insertCmfEduZhongcengmingxi(CmfEduZhongcengmingxi cmfEduZhongcengmingxi);

    /**
     * 修改中层干部测评内容明细
     * 
     * @param cmfEduZhongcengmingxi 中层干部测评内容明细
     * @return 结果
     */
    public int updateCmfEduZhongcengmingxi(CmfEduZhongcengmingxi cmfEduZhongcengmingxi);

    /**
     * 批量删除中层干部测评内容明细
     * 
     * @param ids 需要删除的中层干部测评内容明细主键集合
     * @return 结果
     */
    public int deleteCmfEduZhongcengmingxiByIds(Integer[] ids);

    /**
     * 删除中层干部测评内容明细信息
     * 
     * @param id 中层干部测评内容明细主键
     * @return 结果
     */
    public int deleteCmfEduZhongcengmingxiById(Integer id);
}
