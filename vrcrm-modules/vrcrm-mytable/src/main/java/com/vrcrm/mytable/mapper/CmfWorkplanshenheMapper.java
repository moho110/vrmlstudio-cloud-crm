package com.vrcrm.mytable.mapper;

import java.util.List;
import com.vrcrm.mytable.domain.CmfWorkplanshenhe;

/**
 * 工作计划审核Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfWorkplanshenheMapper 
{
    /**
     * 查询工作计划审核
     * 
     * @param id 工作计划审核主键
     * @return 工作计划审核
     */
    public CmfWorkplanshenhe selectCmfWorkplanshenheById(Integer id);

    /**
     * 查询工作计划审核列表
     * 
     * @param cmfWorkplanshenhe 工作计划审核
     * @return 工作计划审核集合
     */
    public List<CmfWorkplanshenhe> selectCmfWorkplanshenheList(CmfWorkplanshenhe cmfWorkplanshenhe);

    /**
     * 新增工作计划审核
     * 
     * @param cmfWorkplanshenhe 工作计划审核
     * @return 结果
     */
    public int insertCmfWorkplanshenhe(CmfWorkplanshenhe cmfWorkplanshenhe);

    /**
     * 修改工作计划审核
     * 
     * @param cmfWorkplanshenhe 工作计划审核
     * @return 结果
     */
    public int updateCmfWorkplanshenhe(CmfWorkplanshenhe cmfWorkplanshenhe);

    /**
     * 删除工作计划审核
     * 
     * @param id 工作计划审核主键
     * @return 结果
     */
    public int deleteCmfWorkplanshenheById(Integer id);

    /**
     * 批量删除工作计划审核
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfWorkplanshenheByIds(Integer[] ids);
}
