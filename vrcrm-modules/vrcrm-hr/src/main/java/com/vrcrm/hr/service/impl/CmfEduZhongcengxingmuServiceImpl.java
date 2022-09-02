package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfEduZhongcengxingmuMapper;
import com.vrcrm.hr.domain.CmfEduZhongcengxingmu;
import com.vrcrm.hr.service.ICmfEduZhongcengxingmuService;

/**
 * 中层干部测评项目明细Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfEduZhongcengxingmuServiceImpl implements ICmfEduZhongcengxingmuService 
{
    @Autowired
    private CmfEduZhongcengxingmuMapper cmfEduZhongcengxingmuMapper;

    /**
     * 查询中层干部测评项目明细
     * 
     * @param id 中层干部测评项目明细主键
     * @return 中层干部测评项目明细
     */
    @Override
    public CmfEduZhongcengxingmu selectCmfEduZhongcengxingmuById(Integer id)
    {
        return cmfEduZhongcengxingmuMapper.selectCmfEduZhongcengxingmuById(id);
    }

    /**
     * 查询中层干部测评项目明细列表
     * 
     * @param cmfEduZhongcengxingmu 中层干部测评项目明细
     * @return 中层干部测评项目明细
     */
    @Override
    public List<CmfEduZhongcengxingmu> selectCmfEduZhongcengxingmuList(CmfEduZhongcengxingmu cmfEduZhongcengxingmu)
    {
        return cmfEduZhongcengxingmuMapper.selectCmfEduZhongcengxingmuList(cmfEduZhongcengxingmu);
    }

    /**
     * 新增中层干部测评项目明细
     * 
     * @param cmfEduZhongcengxingmu 中层干部测评项目明细
     * @return 结果
     */
    @Override
    public int insertCmfEduZhongcengxingmu(CmfEduZhongcengxingmu cmfEduZhongcengxingmu)
    {
        return cmfEduZhongcengxingmuMapper.insertCmfEduZhongcengxingmu(cmfEduZhongcengxingmu);
    }

    /**
     * 修改中层干部测评项目明细
     * 
     * @param cmfEduZhongcengxingmu 中层干部测评项目明细
     * @return 结果
     */
    @Override
    public int updateCmfEduZhongcengxingmu(CmfEduZhongcengxingmu cmfEduZhongcengxingmu)
    {
        return cmfEduZhongcengxingmuMapper.updateCmfEduZhongcengxingmu(cmfEduZhongcengxingmu);
    }

    /**
     * 批量删除中层干部测评项目明细
     * 
     * @param ids 需要删除的中层干部测评项目明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduZhongcengxingmuByIds(Integer[] ids)
    {
        return cmfEduZhongcengxingmuMapper.deleteCmfEduZhongcengxingmuByIds(ids);
    }

    /**
     * 删除中层干部测评项目明细信息
     * 
     * @param id 中层干部测评项目明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduZhongcengxingmuById(Integer id)
    {
        return cmfEduZhongcengxingmuMapper.deleteCmfEduZhongcengxingmuById(id);
    }
}
