package com.vrcrm.customer.mapper;

import java.util.List;
import com.vrcrm.customer.domain.CmfCrmShenqingbaobei;

/**
 * 申请报备Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfCrmShenqingbaobeiMapper 
{
    /**
     * 查询申请报备
     * 
     * @param id 申请报备主键
     * @return 申请报备
     */
    public CmfCrmShenqingbaobei selectCmfCrmShenqingbaobeiById(Integer id);

    /**
     * 查询申请报备列表
     * 
     * @param cmfCrmShenqingbaobei 申请报备
     * @return 申请报备集合
     */
    public List<CmfCrmShenqingbaobei> selectCmfCrmShenqingbaobeiList(CmfCrmShenqingbaobei cmfCrmShenqingbaobei);

    /**
     * 新增申请报备
     * 
     * @param cmfCrmShenqingbaobei 申请报备
     * @return 结果
     */
    public int insertCmfCrmShenqingbaobei(CmfCrmShenqingbaobei cmfCrmShenqingbaobei);

    /**
     * 修改申请报备
     * 
     * @param cmfCrmShenqingbaobei 申请报备
     * @return 结果
     */
    public int updateCmfCrmShenqingbaobei(CmfCrmShenqingbaobei cmfCrmShenqingbaobei);

    /**
     * 删除申请报备
     * 
     * @param id 申请报备主键
     * @return 结果
     */
    public int deleteCmfCrmShenqingbaobeiById(Integer id);

    /**
     * 批量删除申请报备
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfCrmShenqingbaobeiByIds(Integer[] ids);
}
