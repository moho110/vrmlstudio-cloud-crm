package com.vrcrm.xsystem.mapper;

import java.util.List;
import com.vrcrm.xsystem.domain.CmfSystemLogall;

/**
 * 系统操作日志Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfSystemLogallMapper 
{
    /**
     * 查询系统操作日志
     * 
     * @param id 系统操作日志主键
     * @return 系统操作日志
     */
    public CmfSystemLogall selectCmfSystemLogallById(Integer id);

    /**
     * 查询系统操作日志列表
     * 
     * @param cmfSystemLogall 系统操作日志
     * @return 系统操作日志集合
     */
    public List<CmfSystemLogall> selectCmfSystemLogallList(CmfSystemLogall cmfSystemLogall);

    /**
     * 新增系统操作日志
     * 
     * @param cmfSystemLogall 系统操作日志
     * @return 结果
     */
    public int insertCmfSystemLogall(CmfSystemLogall cmfSystemLogall);

    /**
     * 修改系统操作日志
     * 
     * @param cmfSystemLogall 系统操作日志
     * @return 结果
     */
    public int updateCmfSystemLogall(CmfSystemLogall cmfSystemLogall);

    /**
     * 删除系统操作日志
     * 
     * @param id 系统操作日志主键
     * @return 结果
     */
    public int deleteCmfSystemLogallById(Integer id);

    /**
     * 批量删除系统操作日志
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfSystemLogallByIds(Integer[] ids);
}
