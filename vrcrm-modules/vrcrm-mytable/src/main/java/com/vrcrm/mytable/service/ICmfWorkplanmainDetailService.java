package com.vrcrm.mytable.service;

import java.util.List;
import com.vrcrm.mytable.domain.CmfWorkplanmainDetail;

/**
 * 工作计划明细Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfWorkplanmainDetailService 
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
     * 批量删除工作计划明细
     * 
     * @param ids 需要删除的工作计划明细主键集合
     * @return 结果
     */
    public int deleteCmfWorkplanmainDetailByIds(Integer[] ids);

    /**
     * 删除工作计划明细信息
     * 
     * @param id 工作计划明细主键
     * @return 结果
     */
    public int deleteCmfWorkplanmainDetailById(Integer id);
}
