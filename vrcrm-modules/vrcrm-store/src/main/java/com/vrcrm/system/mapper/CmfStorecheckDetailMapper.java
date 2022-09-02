package com.vrcrm.system.mapper;

import java.util.List;
import com.vrcrm.system.domain.CmfStorecheckDetail;

/**
 * 库存盘点明细Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfStorecheckDetailMapper 
{
    /**
     * 查询库存盘点明细
     * 
     * @param id 库存盘点明细主键
     * @return 库存盘点明细
     */
    public CmfStorecheckDetail selectCmfStorecheckDetailById(Integer id);

    /**
     * 查询库存盘点明细列表
     * 
     * @param cmfStorecheckDetail 库存盘点明细
     * @return 库存盘点明细集合
     */
    public List<CmfStorecheckDetail> selectCmfStorecheckDetailList(CmfStorecheckDetail cmfStorecheckDetail);

    /**
     * 新增库存盘点明细
     * 
     * @param cmfStorecheckDetail 库存盘点明细
     * @return 结果
     */
    public int insertCmfStorecheckDetail(CmfStorecheckDetail cmfStorecheckDetail);

    /**
     * 修改库存盘点明细
     * 
     * @param cmfStorecheckDetail 库存盘点明细
     * @return 结果
     */
    public int updateCmfStorecheckDetail(CmfStorecheckDetail cmfStorecheckDetail);

    /**
     * 删除库存盘点明细
     * 
     * @param id 库存盘点明细主键
     * @return 结果
     */
    public int deleteCmfStorecheckDetailById(Integer id);

    /**
     * 批量删除库存盘点明细
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfStorecheckDetailByIds(Integer[] ids);
}
