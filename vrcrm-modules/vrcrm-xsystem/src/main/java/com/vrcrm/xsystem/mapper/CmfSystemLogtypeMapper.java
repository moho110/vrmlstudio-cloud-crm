package com.vrcrm.xsystem.mapper;

import java.util.List;
import com.vrcrm.xsystem.domain.CmfSystemLogtype;

/**
 * 系统日志类型Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfSystemLogtypeMapper 
{
    /**
     * 查询系统日志类型
     * 
     * @param id 系统日志类型主键
     * @return 系统日志类型
     */
    public CmfSystemLogtype selectCmfSystemLogtypeById(Integer id);

    /**
     * 查询系统日志类型列表
     * 
     * @param cmfSystemLogtype 系统日志类型
     * @return 系统日志类型集合
     */
    public List<CmfSystemLogtype> selectCmfSystemLogtypeList(CmfSystemLogtype cmfSystemLogtype);

    /**
     * 新增系统日志类型
     * 
     * @param cmfSystemLogtype 系统日志类型
     * @return 结果
     */
    public int insertCmfSystemLogtype(CmfSystemLogtype cmfSystemLogtype);

    /**
     * 修改系统日志类型
     * 
     * @param cmfSystemLogtype 系统日志类型
     * @return 结果
     */
    public int updateCmfSystemLogtype(CmfSystemLogtype cmfSystemLogtype);

    /**
     * 删除系统日志类型
     * 
     * @param id 系统日志类型主键
     * @return 结果
     */
    public int deleteCmfSystemLogtypeById(Integer id);

    /**
     * 批量删除系统日志类型
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfSystemLogtypeByIds(Integer[] ids);
}
