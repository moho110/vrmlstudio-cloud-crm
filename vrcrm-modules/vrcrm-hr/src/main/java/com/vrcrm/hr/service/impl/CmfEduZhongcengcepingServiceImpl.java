package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfEduZhongcengcepingMapper;
import com.vrcrm.hr.domain.CmfEduZhongcengceping;
import com.vrcrm.hr.service.ICmfEduZhongcengcepingService;

/**
 * 中层测评Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfEduZhongcengcepingServiceImpl implements ICmfEduZhongcengcepingService 
{
    @Autowired
    private CmfEduZhongcengcepingMapper cmfEduZhongcengcepingMapper;

    /**
     * 查询中层测评
     * 
     * @param id 中层测评主键
     * @return 中层测评
     */
    @Override
    public CmfEduZhongcengceping selectCmfEduZhongcengcepingById(Integer id)
    {
        return cmfEduZhongcengcepingMapper.selectCmfEduZhongcengcepingById(id);
    }

    /**
     * 查询中层测评列表
     * 
     * @param cmfEduZhongcengceping 中层测评
     * @return 中层测评
     */
    @Override
    public List<CmfEduZhongcengceping> selectCmfEduZhongcengcepingList(CmfEduZhongcengceping cmfEduZhongcengceping)
    {
        return cmfEduZhongcengcepingMapper.selectCmfEduZhongcengcepingList(cmfEduZhongcengceping);
    }

    /**
     * 新增中层测评
     * 
     * @param cmfEduZhongcengceping 中层测评
     * @return 结果
     */
    @Override
    public int insertCmfEduZhongcengceping(CmfEduZhongcengceping cmfEduZhongcengceping)
    {
        return cmfEduZhongcengcepingMapper.insertCmfEduZhongcengceping(cmfEduZhongcengceping);
    }

    /**
     * 修改中层测评
     * 
     * @param cmfEduZhongcengceping 中层测评
     * @return 结果
     */
    @Override
    public int updateCmfEduZhongcengceping(CmfEduZhongcengceping cmfEduZhongcengceping)
    {
        return cmfEduZhongcengcepingMapper.updateCmfEduZhongcengceping(cmfEduZhongcengceping);
    }

    /**
     * 批量删除中层测评
     * 
     * @param ids 需要删除的中层测评主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduZhongcengcepingByIds(Integer[] ids)
    {
        return cmfEduZhongcengcepingMapper.deleteCmfEduZhongcengcepingByIds(ids);
    }

    /**
     * 删除中层测评信息
     * 
     * @param id 中层测评主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduZhongcengcepingById(Integer id)
    {
        return cmfEduZhongcengcepingMapper.deleteCmfEduZhongcengcepingById(id);
    }
}
