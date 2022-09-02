package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfEduZhongcengrenyuanMapper;
import com.vrcrm.hr.domain.CmfEduZhongcengrenyuan;
import com.vrcrm.hr.service.ICmfEduZhongcengrenyuanService;

/**
 * 中层干部被评人员明细Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfEduZhongcengrenyuanServiceImpl implements ICmfEduZhongcengrenyuanService 
{
    @Autowired
    private CmfEduZhongcengrenyuanMapper cmfEduZhongcengrenyuanMapper;

    /**
     * 查询中层干部被评人员明细
     * 
     * @param id 中层干部被评人员明细主键
     * @return 中层干部被评人员明细
     */
    @Override
    public CmfEduZhongcengrenyuan selectCmfEduZhongcengrenyuanById(Integer id)
    {
        return cmfEduZhongcengrenyuanMapper.selectCmfEduZhongcengrenyuanById(id);
    }

    /**
     * 查询中层干部被评人员明细列表
     * 
     * @param cmfEduZhongcengrenyuan 中层干部被评人员明细
     * @return 中层干部被评人员明细
     */
    @Override
    public List<CmfEduZhongcengrenyuan> selectCmfEduZhongcengrenyuanList(CmfEduZhongcengrenyuan cmfEduZhongcengrenyuan)
    {
        return cmfEduZhongcengrenyuanMapper.selectCmfEduZhongcengrenyuanList(cmfEduZhongcengrenyuan);
    }

    /**
     * 新增中层干部被评人员明细
     * 
     * @param cmfEduZhongcengrenyuan 中层干部被评人员明细
     * @return 结果
     */
    @Override
    public int insertCmfEduZhongcengrenyuan(CmfEduZhongcengrenyuan cmfEduZhongcengrenyuan)
    {
        return cmfEduZhongcengrenyuanMapper.insertCmfEduZhongcengrenyuan(cmfEduZhongcengrenyuan);
    }

    /**
     * 修改中层干部被评人员明细
     * 
     * @param cmfEduZhongcengrenyuan 中层干部被评人员明细
     * @return 结果
     */
    @Override
    public int updateCmfEduZhongcengrenyuan(CmfEduZhongcengrenyuan cmfEduZhongcengrenyuan)
    {
        return cmfEduZhongcengrenyuanMapper.updateCmfEduZhongcengrenyuan(cmfEduZhongcengrenyuan);
    }

    /**
     * 批量删除中层干部被评人员明细
     * 
     * @param ids 需要删除的中层干部被评人员明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduZhongcengrenyuanByIds(Integer[] ids)
    {
        return cmfEduZhongcengrenyuanMapper.deleteCmfEduZhongcengrenyuanByIds(ids);
    }

    /**
     * 删除中层干部被评人员明细信息
     * 
     * @param id 中层干部被评人员明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduZhongcengrenyuanById(Integer id)
    {
        return cmfEduZhongcengrenyuanMapper.deleteCmfEduZhongcengrenyuanById(id);
    }
}
