package com.vrcrm.mytable.mapper;

import java.util.List;
import com.vrcrm.mytable.domain.CmfWorkplanstate;

/**
 * 工作计划状态Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfWorkplanstateMapper 
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
     * 删除工作计划状态
     * 
     * @param id 工作计划状态主键
     * @return 结果
     */
    public int deleteCmfWorkplanstateById(Integer id);

    /**
     * 批量删除工作计划状态
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfWorkplanstateByIds(Integer[] ids);
}
