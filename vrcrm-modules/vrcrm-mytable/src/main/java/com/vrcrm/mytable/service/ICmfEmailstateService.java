package com.vrcrm.mytable.service;

import java.util.List;
import com.vrcrm.mytable.domain.CmfEmailstate;

/**
 * 邮件状态Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfEmailstateService 
{
    /**
     * 查询邮件状态
     * 
     * @param id 邮件状态主键
     * @return 邮件状态
     */
    public CmfEmailstate selectCmfEmailstateById(Integer id);

    /**
     * 查询邮件状态列表
     * 
     * @param cmfEmailstate 邮件状态
     * @return 邮件状态集合
     */
    public List<CmfEmailstate> selectCmfEmailstateList(CmfEmailstate cmfEmailstate);

    /**
     * 新增邮件状态
     * 
     * @param cmfEmailstate 邮件状态
     * @return 结果
     */
    public int insertCmfEmailstate(CmfEmailstate cmfEmailstate);

    /**
     * 修改邮件状态
     * 
     * @param cmfEmailstate 邮件状态
     * @return 结果
     */
    public int updateCmfEmailstate(CmfEmailstate cmfEmailstate);

    /**
     * 批量删除邮件状态
     * 
     * @param ids 需要删除的邮件状态主键集合
     * @return 结果
     */
    public int deleteCmfEmailstateByIds(Integer[] ids);

    /**
     * 删除邮件状态信息
     * 
     * @param id 邮件状态主键
     * @return 结果
     */
    public int deleteCmfEmailstateById(Integer id);
}
