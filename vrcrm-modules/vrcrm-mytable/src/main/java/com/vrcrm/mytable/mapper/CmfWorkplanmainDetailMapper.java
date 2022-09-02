package com.vrcrm.mytable.mapper;

import java.util.List;
import com.vrcrm.mytable.domain.CmfWorkplanmainDetail;

/**
 * 工作计划明细Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfWorkplanmainDetailMapper 
{
    /**
     * 查询工作计划明细
     * 
     * @param id 工作计划明细主键
     * @return 工作计划明细
     */
    public CmfWorkplanmainDetail selectCmfWorkplanmainDetailById(Integer id);

    /**
     * 查询工作计划明细列表
     * 
     * @param cmfWorkplanmainDetail 工作计划明细
     * @return 工作计划明细集合
     */
    public List<CmfWorkplanmainDetail> selectCmfWorkplanmainDetailList(CmfWorkplanmainDetail cmfWorkplanmainDetail);

    /**
     * 新增工作计划明细
     * 
     * @param cmfWorkplanmainDetail 工作计划明细
     * @return 结果
     */
    public int insertCmfWorkplanmainDetail(CmfWorkplanmainDetail cmfWorkplanmainDetail);

    /**
     * 修改工作计划明细
     * 
     * @param cmfWorkplanmainDetail 工作计划明细
     * @return 结果
     */
    public int updateCmfWorkplanmainDetail(CmfWorkplanmainDetail cmfWorkplanmainDetail);

    /**
     * 删除工作计划明细
     * 
     * @param id 工作计划明细主键
     * @return 结果
     */
    public int deleteCmfWorkplanmainDetailById(Integer id);

    /**
     * 批量删除工作计划明细
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfWorkplanmainDetailByIds(Integer[] ids);
}
