package com.vrcrm.mytable.service;

import java.util.List;
import com.vrcrm.mytable.domain.CmfWorkplanstate;

/**
 * 工作计划状态Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfWorkplanstateService 
{
    /**
     * 查询工作计划状态
     * 
     * @param id 工作计划状态主键
     * @return 工作计划状态
     */
    public CmfWorkplanstate selectCmfWorkplanstateById(Integer id);

    /**
     * 查询工作计划状态列表
     * 
     * @param cmfWorkplanstate 工作计划状态
     * @return 工作计划状态集合
     */
    public List<CmfWorkplanstate> selectCmfWorkplanstateList(CmfWorkplanstate cmfWorkplanstate);

    /**
     * 新增工作计划状态
     * 
     * @param cmfWorkplanstate 工作计划状态
     * @return 结果
     */
    public int insertCmfWorkplanstate(CmfWorkplanstate cmfWorkplanstate);

    /**
     * 修改工作计划状态
     * 
     * @param cmfWorkplanstate 工作计划状态
     * @return 结果
     */
    public int updateCmfWorkplanstate(CmfWorkplanstate cmfWorkplanstate);

    /**
     * 批量删除工作计划状态
     * 
     * @param ids 需要删除的工作计划状态主键集合
     * @return 结果
     */
    public int deleteCmfWorkplanstateByIds(Integer[] ids);

    /**
     * 删除工作计划状态信息
     * 
     * @param id 工作计划状态主键
     * @return 结果
     */
    public int deleteCmfWorkplanstateById(Integer id);
}
