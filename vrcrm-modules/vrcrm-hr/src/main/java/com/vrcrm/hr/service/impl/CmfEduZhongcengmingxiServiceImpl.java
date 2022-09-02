package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfEduZhongcengmingxiMapper;
import com.vrcrm.hr.domain.CmfEduZhongcengmingxi;
import com.vrcrm.hr.service.ICmfEduZhongcengmingxiService;

/**
 * 中层干部测评内容明细Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfEduZhongcengmingxiServiceImpl implements ICmfEduZhongcengmingxiService 
{
    @Autowired
    private CmfEduZhongcengmingxiMapper cmfEduZhongcengmingxiMapper;

    /**
     * 查询中层干部测评内容明细
     * 
     * @param id 中层干部测评内容明细主键
     * @return 中层干部测评内容明细
     */
    @Override
    public CmfEduZhongcengmingxi selectCmfEduZhongcengmingxiById(Integer id)
    {
        return cmfEduZhongcengmingxiMapper.selectCmfEduZhongcengmingxiById(id);
    }

    /**
     * 查询中层干部测评内容明细列表
     * 
     * @param cmfEduZhongcengmingxi 中层干部测评内容明细
     * @return 中层干部测评内容明细
     */
    @Override
    public List<CmfEduZhongcengmingxi> selectCmfEduZhongcengmingxiList(CmfEduZhongcengmingxi cmfEduZhongcengmingxi)
    {
        return cmfEduZhongcengmingxiMapper.selectCmfEduZhongcengmingxiList(cmfEduZhongcengmingxi);
    }

    /**
     * 新增中层干部测评内容明细
     * 
     * @param cmfEduZhongcengmingxi 中层干部测评内容明细
     * @return 结果
     */
    @Override
    public int insertCmfEduZhongcengmingxi(CmfEduZhongcengmingxi cmfEduZhongcengmingxi)
    {
        return cmfEduZhongcengmingxiMapper.insertCmfEduZhongcengmingxi(cmfEduZhongcengmingxi);
    }

    /**
     * 修改中层干部测评内容明细
     * 
     * @param cmfEduZhongcengmingxi 中层干部测评内容明细
     * @return 结果
     */
    @Override
    public int updateCmfEduZhongcengmingxi(CmfEduZhongcengmingxi cmfEduZhongcengmingxi)
    {
        return cmfEduZhongcengmingxiMapper.updateCmfEduZhongcengmingxi(cmfEduZhongcengmingxi);
    }

    /**
     * 批量删除中层干部测评内容明细
     * 
     * @param ids 需要删除的中层干部测评内容明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduZhongcengmingxiByIds(Integer[] ids)
    {
        return cmfEduZhongcengmingxiMapper.deleteCmfEduZhongcengmingxiByIds(ids);
    }

    /**
     * 删除中层干部测评内容明细信息
     * 
     * @param id 中层干部测评内容明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduZhongcengmingxiById(Integer id)
    {
        return cmfEduZhongcengmingxiMapper.deleteCmfEduZhongcengmingxiById(id);
    }
}
