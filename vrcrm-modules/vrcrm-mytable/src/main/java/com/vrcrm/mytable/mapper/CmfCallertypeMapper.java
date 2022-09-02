package com.vrcrm.mytable.mapper;

import java.util.List;
import com.vrcrm.mytable.domain.CmfCallertype;

/**
 * 呼叫人类型Mapper接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface CmfCallertypeMapper 
{
    /**
     * 查询呼叫人类型
     * 
     * @param id 呼叫人类型主键
     * @return 呼叫人类型
     */
    public CmfCallertype selectCmfCallertypeById(Integer id);

    /**
     * 查询呼叫人类型列表
     * 
     * @param cmfCallertype 呼叫人类型
     * @return 呼叫人类型集合
     */
    public List<CmfCallertype> selectCmfCallertypeList(CmfCallertype cmfCallertype);

    /**
     * 新增呼叫人类型
     * 
     * @param cmfCallertype 呼叫人类型
     * @return 结果
     */
    public int insertCmfCallertype(CmfCallertype cmfCallertype);

    /**
     * 修改呼叫人类型
     * 
     * @param cmfCallertype 呼叫人类型
     * @return 结果
     */
    public int updateCmfCallertype(CmfCallertype cmfCallertype);

    /**
     * 删除呼叫人类型
     * 
     * @param id 呼叫人类型主键
     * @return 结果
     */
    public int deleteCmfCallertypeById(Integer id);

    /**
     * 批量删除呼叫人类型
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfCallertypeByIds(Integer[] ids);
}
