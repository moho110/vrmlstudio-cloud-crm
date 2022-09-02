package com.vrcrm.finance.service;

import java.util.List;
import com.vrcrm.finance.domain.CmfAccesspreshou;

/**
 * 预收款记录Service接口
 * 
 * @author VRer
 * @date 2022-04-13
 */
public interface ICmfAccesspreshouService 
{
    /**
     * 查询预收款记录
     * 
     * @param id 预收款记录主键
     * @return 预收款记录
     */
    public CmfAccesspreshou selectCmfAccesspreshouById(Integer id);

    /**
     * 查询预收款记录列表
     * 
     * @param cmfAccesspreshou 预收款记录
     * @return 预收款记录集合
     */
    public List<CmfAccesspreshou> selectCmfAccesspreshouList(CmfAccesspreshou cmfAccesspreshou);

    /**
     * 新增预收款记录
     * 
     * @param cmfAccesspreshou 预收款记录
     * @return 结果
     */
    public int insertCmfAccesspreshou(CmfAccesspreshou cmfAccesspreshou);

    /**
     * 修改预收款记录
     * 
     * @param cmfAccesspreshou 预收款记录
     * @return 结果
     */
    public int updateCmfAccesspreshou(CmfAccesspreshou cmfAccesspreshou);

    /**
     * 批量删除预收款记录
     * 
     * @param ids 需要删除的预收款记录主键集合
     * @return 结果
     */
    public int deleteCmfAccesspreshouByIds(Integer[] ids);

    /**
     * 删除预收款记录信息
     * 
     * @param id 预收款记录主键
     * @return 结果
     */
    public int deleteCmfAccesspreshouById(Integer id);
}
