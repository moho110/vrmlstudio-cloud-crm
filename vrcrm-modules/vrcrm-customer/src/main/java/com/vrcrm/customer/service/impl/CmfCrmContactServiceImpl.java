package com.vrcrm.customer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.customer.mapper.CmfCrmContactMapper;
import com.vrcrm.customer.domain.CmfCrmContact;
import com.vrcrm.customer.service.ICmfCrmContactService;

/**
 * 联系方式Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfCrmContactServiceImpl implements ICmfCrmContactService 
{
    @Autowired
    private CmfCrmContactMapper cmfCrmContactMapper;

    /**
     * 查询联系方式
     * 
     * @param id 联系方式主键
     * @return 联系方式
     */
    @Override
    public CmfCrmContact selectCmfCrmContactById(Integer id)
    {
        return cmfCrmContactMapper.selectCmfCrmContactById(id);
    }

    /**
     * 查询联系方式列表
     * 
     * @param cmfCrmContact 联系方式
     * @return 联系方式
     */
    @Override
    public List<CmfCrmContact> selectCmfCrmContactList(CmfCrmContact cmfCrmContact)
    {
        return cmfCrmContactMapper.selectCmfCrmContactList(cmfCrmContact);
    }

    /**
     * 新增联系方式
     * 
     * @param cmfCrmContact 联系方式
     * @return 结果
     */
    @Override
    public int insertCmfCrmContact(CmfCrmContact cmfCrmContact)
    {
        return cmfCrmContactMapper.insertCmfCrmContact(cmfCrmContact);
    }

    /**
     * 修改联系方式
     * 
     * @param cmfCrmContact 联系方式
     * @return 结果
     */
    @Override
    public int updateCmfCrmContact(CmfCrmContact cmfCrmContact)
    {
        return cmfCrmContactMapper.updateCmfCrmContact(cmfCrmContact);
    }

    /**
     * 批量删除联系方式
     * 
     * @param ids 需要删除的联系方式主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmContactByIds(Integer[] ids)
    {
        return cmfCrmContactMapper.deleteCmfCrmContactByIds(ids);
    }

    /**
     * 删除联系方式信息
     * 
     * @param id 联系方式主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmContactById(Integer id)
    {
        return cmfCrmContactMapper.deleteCmfCrmContactById(id);
    }
}
