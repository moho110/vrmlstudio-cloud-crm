package com.vrcrm.mytable.service;

import java.util.List;
import com.vrcrm.mytable.domain.CmfWorkreport;

/**
 * 工作报告Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfWorkreportService 
{
    /**
     * 查询工作报告
     * 
     * @param id 工作报告主键
     * @return 工作报告
     */
    public CmfWorkreport selectCmfWorkreportById(Integer id);

    /**
     * 查询工作报告列表
     * 
     * @param cmfWorkreport 工作报告
     * @return 工作报告集合
     */
    public List<CmfWorkreport> selectCmfWorkreportList(CmfWorkreport cmfWorkreport);

    /**
     * 新增工作报告
     * 
     * @param cmfWorkreport 工作报告
     * @return 结果
     */
    public int insertCmfWorkreport(CmfWorkreport cmfWorkreport);

    /**
     * 修改工作报告
     * 
     * @param cmfWorkreport 工作报告
     * @return 结果
     */
    public int updateCmfWorkreport(CmfWorkreport cmfWorkreport);

    /**
     * 批量删除工作报告
     * 
     * @param ids 需要删除的工作报告主键集合
     * @return 结果
     */
    public int deleteCmfWorkreportByIds(Integer[] ids);

    /**
     * 删除工作报告信息
     * 
     * @param id 工作报告主键
     * @return 结果
     */
    public int deleteCmfWorkreportById(Integer id);
}
