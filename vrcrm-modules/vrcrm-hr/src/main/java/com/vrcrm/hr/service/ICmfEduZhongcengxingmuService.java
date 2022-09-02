package com.vrcrm.hr.service;

import java.util.List;
import com.vrcrm.hr.domain.CmfEduZhongcengxingmu;

/**
 * 中层干部测评项目明细Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfEduZhongcengxingmuService 
{
    /**
     * 查询中层干部测评项目明细
     * 
     * @param id 中层干部测评项目明细主键
     * @return 中层干部测评项目明细
     */
    public CmfEduZhongcengxingmu selectCmfEduZhongcengxingmuById(Integer id);

    /**
     * 查询中层干部测评项目明细列表
     * 
     * @param cmfEduZhongcengxingmu 中层干部测评项目明细
     * @return 中层干部测评项目明细集合
     */
    public List<CmfEduZhongcengxingmu> selectCmfEduZhongcengxingmuList(CmfEduZhongcengxingmu cmfEduZhongcengxingmu);

    /**
     * 新增中层干部测评项目明细
     * 
     * @param cmfEduZhongcengxingmu 中层干部测评项目明细
     * @return 结果
     */
    public int insertCmfEduZhongcengxingmu(CmfEduZhongcengxingmu cmfEduZhongcengxingmu);

    /**
     * 修改中层干部测评项目明细
     * 
     * @param cmfEduZhongcengxingmu 中层干部测评项目明细
     * @return 结果
     */
    public int updateCmfEduZhongcengxingmu(CmfEduZhongcengxingmu cmfEduZhongcengxingmu);

    /**
     * 批量删除中层干部测评项目明细
     * 
     * @param ids 需要删除的中层干部测评项目明细主键集合
     * @return 结果
     */
    public int deleteCmfEduZhongcengxingmuByIds(Integer[] ids);

    /**
     * 删除中层干部测评项目明细信息
     * 
     * @param id 中层干部测评项目明细主键
     * @return 结果
     */
    public int deleteCmfEduZhongcengxingmuById(Integer id);
}
