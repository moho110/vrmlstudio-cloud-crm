package com.vrcrm.buy.mapper;

import java.util.List;
import com.vrcrm.buy.domain.CmfInorout;

/**
 * 输入输出Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfInoroutMapper 
{
    /**
     * 查询输入输出
     * 
     * @param id 输入输出主键
     * @return 输入输出
     */
    public CmfInorout selectCmfInoroutById(Integer id);

    /**
     * 查询输入输出列表
     * 
     * @param cmfInorout 输入输出
     * @return 输入输出集合
     */
    public List<CmfInorout> selectCmfInoroutList(CmfInorout cmfInorout);

    /**
     * 新增输入输出
     * 
     * @param cmfInorout 输入输出
     * @return 结果
     */
    public int insertCmfInorout(CmfInorout cmfInorout);

    /**
     * 修改输入输出
     * 
     * @param cmfInorout 输入输出
     * @return 结果
     */
    public int updateCmfInorout(CmfInorout cmfInorout);

    /**
     * 删除输入输出
     * 
     * @param id 输入输出主键
     * @return 结果
     */
    public int deleteCmfInoroutById(Integer id);

    /**
     * 批量删除输入输出
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfInoroutByIds(Integer[] ids);
}
