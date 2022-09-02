package com.vrcrm.basicdata.service;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfSupplylever;

/**
 * 供应商等级Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfSupplyleverService 
{
    /**
     * 查询供应商等级
     * 
     * @param id 供应商等级主键
     * @return 供应商等级
     */
    public CmfSupplylever selectCmfSupplyleverById(Integer id);

    /**
     * 查询供应商等级列表
     * 
     * @param cmfSupplylever 供应商等级
     * @return 供应商等级集合
     */
    public List<CmfSupplylever> selectCmfSupplyleverList(CmfSupplylever cmfSupplylever);

    /**
     * 新增供应商等级
     * 
     * @param cmfSupplylever 供应商等级
     * @return 结果
     */
    public int insertCmfSupplylever(CmfSupplylever cmfSupplylever);

    /**
     * 修改供应商等级
     * 
     * @param cmfSupplylever 供应商等级
     * @return 结果
     */
    public int updateCmfSupplylever(CmfSupplylever cmfSupplylever);

    /**
     * 批量删除供应商等级
     * 
     * @param ids 需要删除的供应商等级主键集合
     * @return 结果
     */
    public int deleteCmfSupplyleverByIds(Integer[] ids);

    /**
     * 删除供应商等级信息
     * 
     * @param id 供应商等级主键
     * @return 结果
     */
    public int deleteCmfSupplyleverById(Integer id);
}
