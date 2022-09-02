package com.vrcrm.mytable.service;

import java.util.List;
import com.vrcrm.mytable.domain.CmfCallertype;

/**
 * 呼叫人类型Service接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface ICmfCallertypeService 
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
     * 批量删除呼叫人类型
     * 
     * @param ids 需要删除的呼叫人类型主键集合
     * @return 结果
     */
    public int deleteCmfCallertypeByIds(Integer[] ids);

    /**
     * 删除呼叫人类型信息
     * 
     * @param id 呼叫人类型主键
     * @return 结果
     */
    public int deleteCmfCallertypeById(Integer id);
}
