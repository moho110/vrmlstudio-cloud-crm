package com.vrcrm.basicdata.service;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfSupplylinkman;

/**
 * 供应商联系人Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfSupplylinkmanService 
{
    /**
     * 查询供应商联系人
     * 
     * @param id 供应商联系人主键
     * @return 供应商联系人
     */
    public CmfSupplylinkman selectCmfSupplylinkmanById(Integer id);

    /**
     * 查询供应商联系人列表
     * 
     * @param cmfSupplylinkman 供应商联系人
     * @return 供应商联系人集合
     */
    public List<CmfSupplylinkman> selectCmfSupplylinkmanList(CmfSupplylinkman cmfSupplylinkman);

    /**
     * 新增供应商联系人
     * 
     * @param cmfSupplylinkman 供应商联系人
     * @return 结果
     */
    public int insertCmfSupplylinkman(CmfSupplylinkman cmfSupplylinkman);

    /**
     * 修改供应商联系人
     * 
     * @param cmfSupplylinkman 供应商联系人
     * @return 结果
     */
    public int updateCmfSupplylinkman(CmfSupplylinkman cmfSupplylinkman);

    /**
     * 批量删除供应商联系人
     * 
     * @param ids 需要删除的供应商联系人主键集合
     * @return 结果
     */
    public int deleteCmfSupplylinkmanByIds(Integer[] ids);

    /**
     * 删除供应商联系人信息
     * 
     * @param id 供应商联系人主键
     * @return 结果
     */
    public int deleteCmfSupplylinkmanById(Integer id);
}
