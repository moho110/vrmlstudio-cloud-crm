package com.vrcrm.mytable.service;

import java.util.List;
import com.vrcrm.mytable.domain.CmfCallchuli;

/**
 * 来电处理Service接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface ICmfCallchuliService 
{
    /**
     * 查询来电处理
     * 
     * @param id 来电处理主键
     * @return 来电处理
     */
    public CmfCallchuli selectCmfCallchuliById(Integer id);

    /**
     * 查询来电处理列表
     * 
     * @param cmfCallchuli 来电处理
     * @return 来电处理集合
     */
    public List<CmfCallchuli> selectCmfCallchuliList(CmfCallchuli cmfCallchuli);

    /**
     * 新增来电处理
     * 
     * @param cmfCallchuli 来电处理
     * @return 结果
     */
    public int insertCmfCallchuli(CmfCallchuli cmfCallchuli);

    /**
     * 修改来电处理
     * 
     * @param cmfCallchuli 来电处理
     * @return 结果
     */
    public int updateCmfCallchuli(CmfCallchuli cmfCallchuli);

    /**
     * 批量删除来电处理
     * 
     * @param ids 需要删除的来电处理主键集合
     * @return 结果
     */
    public int deleteCmfCallchuliByIds(Integer[] ids);

    /**
     * 删除来电处理信息
     * 
     * @param id 来电处理主键
     * @return 结果
     */
    public int deleteCmfCallchuliById(Integer id);
}
