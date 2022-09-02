package com.vrcrm.customer.service;

import java.util.List;
import com.vrcrm.customer.domain.CmfCrmContact;

/**
 * 联系方式Service接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface ICmfCrmContactService 
{
    /**
     * 查询联系方式
     * 
     * @param id 联系方式主键
     * @return 联系方式
     */
    public CmfCrmContact selectCmfCrmContactById(Integer id);

    /**
     * 查询联系方式列表
     * 
     * @param cmfCrmContact 联系方式
     * @return 联系方式集合
     */
    public List<CmfCrmContact> selectCmfCrmContactList(CmfCrmContact cmfCrmContact);

    /**
     * 新增联系方式
     * 
     * @param cmfCrmContact 联系方式
     * @return 结果
     */
    public int insertCmfCrmContact(CmfCrmContact cmfCrmContact);

    /**
     * 修改联系方式
     * 
     * @param cmfCrmContact 联系方式
     * @return 结果
     */
    public int updateCmfCrmContact(CmfCrmContact cmfCrmContact);

    /**
     * 批量删除联系方式
     * 
     * @param ids 需要删除的联系方式主键集合
     * @return 结果
     */
    public int deleteCmfCrmContactByIds(Integer[] ids);

    /**
     * 删除联系方式信息
     * 
     * @param id 联系方式主键
     * @return 结果
     */
    public int deleteCmfCrmContactById(Integer id);
}
