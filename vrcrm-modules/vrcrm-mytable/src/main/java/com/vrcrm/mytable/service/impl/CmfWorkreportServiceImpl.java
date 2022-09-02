package com.vrcrm.mytable.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.mytable.mapper.CmfWorkreportMapper;
import com.vrcrm.mytable.domain.CmfWorkreport;
import com.vrcrm.mytable.service.ICmfWorkreportService;

/**
 * 工作报告Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfWorkreportServiceImpl implements ICmfWorkreportService 
{
    @Autowired
    private CmfWorkreportMapper cmfWorkreportMapper;

    /**
     * 查询工作报告
     * 
     * @param id 工作报告主键
     * @return 工作报告
     */
    @Override
    public CmfWorkreport selectCmfWorkreportById(Integer id)
    {
        return cmfWorkreportMapper.selectCmfWorkreportById(id);
    }

    /**
     * 查询工作报告列表
     * 
     * @param cmfWorkreport 工作报告
     * @return 工作报告
     */
    @Override
    public List<CmfWorkreport> selectCmfWorkreportList(CmfWorkreport cmfWorkreport)
    {
        return cmfWorkreportMapper.selectCmfWorkreportList(cmfWorkreport);
    }

    /**
     * 新增工作报告
     * 
     * @param cmfWorkreport 工作报告
     * @return 结果
     */
    @Override
    public int insertCmfWorkreport(CmfWorkreport cmfWorkreport)
    {
        return cmfWorkreportMapper.insertCmfWorkreport(cmfWorkreport);
    }

    /**
     * 修改工作报告
     * 
     * @param cmfWorkreport 工作报告
     * @return 结果
     */
    @Override
    public int updateCmfWorkreport(CmfWorkreport cmfWorkreport)
    {
        return cmfWorkreportMapper.updateCmfWorkreport(cmfWorkreport);
    }

    /**
     * 批量删除工作报告
     * 
     * @param ids 需要删除的工作报告主键
     * @return 结果
     */
    @Override
    public int deleteCmfWorkreportByIds(Integer[] ids)
    {
        return cmfWorkreportMapper.deleteCmfWorkreportByIds(ids);
    }

    /**
     * 删除工作报告信息
     * 
     * @param id 工作报告主键
     * @return 结果
     */
    @Override
    public int deleteCmfWorkreportById(Integer id)
    {
        return cmfWorkreportMapper.deleteCmfWorkreportById(id);
    }
}
