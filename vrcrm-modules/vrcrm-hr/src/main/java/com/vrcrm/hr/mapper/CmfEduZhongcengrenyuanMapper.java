package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfEduZhongcengrenyuan;

/**
 * 中层干部被评人员明细Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfEduZhongcengrenyuanMapper 
{
    /**
     * 查询中层干部被评人员明细
     * 
     * @param id 中层干部被评人员明细主键
     * @return 中层干部被评人员明细
     */
    public CmfEduZhongcengrenyuan selectCmfEduZhongcengrenyuanById(Integer id);

    /**
     * 查询中层干部被评人员明细列表
     * 
     * @param cmfEduZhongcengrenyuan 中层干部被评人员明细
     * @return 中层干部被评人员明细集合
     */
    public List<CmfEduZhongcengrenyuan> selectCmfEduZhongcengrenyuanList(CmfEduZhongcengrenyuan cmfEduZhongcengrenyuan);

    /**
     * 新增中层干部被评人员明细
     * 
     * @param cmfEduZhongcengrenyuan 中层干部被评人员明细
     * @return 结果
     */
    public int insertCmfEduZhongcengrenyuan(CmfEduZhongcengrenyuan cmfEduZhongcengrenyuan);

    /**
     * 修改中层干部被评人员明细
     * 
     * @param cmfEduZhongcengrenyuan 中层干部被评人员明细
     * @return 结果
     */
    public int updateCmfEduZhongcengrenyuan(CmfEduZhongcengrenyuan cmfEduZhongcengrenyuan);

    /**
     * 删除中层干部被评人员明细
     * 
     * @param id 中层干部被评人员明细主键
     * @return 结果
     */
    public int deleteCmfEduZhongcengrenyuanById(Integer id);

    /**
     * 批量删除中层干部被评人员明细
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfEduZhongcengrenyuanByIds(Integer[] ids);
}
