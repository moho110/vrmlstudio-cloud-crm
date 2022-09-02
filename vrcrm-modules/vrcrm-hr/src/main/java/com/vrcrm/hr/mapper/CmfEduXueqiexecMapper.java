package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfEduXueqiexec;

/**
 * 学期执行Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfEduXueqiexecMapper 
{
    /**
     * 查询学期执行
     * 
     * @param id 学期执行主键
     * @return 学期执行
     */
    public CmfEduXueqiexec selectCmfEduXueqiexecById(Integer id);

    /**
     * 查询学期执行列表
     * 
     * @param cmfEduXueqiexec 学期执行
     * @return 学期执行集合
     */
    public List<CmfEduXueqiexec> selectCmfEduXueqiexecList(CmfEduXueqiexec cmfEduXueqiexec);

    /**
     * 新增学期执行
     * 
     * @param cmfEduXueqiexec 学期执行
     * @return 结果
     */
    public int insertCmfEduXueqiexec(CmfEduXueqiexec cmfEduXueqiexec);

    /**
     * 修改学期执行
     * 
     * @param cmfEduXueqiexec 学期执行
     * @return 结果
     */
    public int updateCmfEduXueqiexec(CmfEduXueqiexec cmfEduXueqiexec);

    /**
     * 删除学期执行
     * 
     * @param id 学期执行主键
     * @return 结果
     */
    public int deleteCmfEduXueqiexecById(Integer id);

    /**
     * 批量删除学期执行
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfEduXueqiexecByIds(Integer[] ids);
}
