package com.vrcrm.basicdata.service;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfCmdictCountrycode;

/**
 * 国家代码Service接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface ICmfCmdictCountrycodeService 
{
    /**
     * 查询国家代码
     * 
     * @param id 国家代码主键
     * @return 国家代码
     */
    public CmfCmdictCountrycode selectCmfCmdictCountrycodeById(Integer id);

    /**
     * 查询国家代码列表
     * 
     * @param cmfCmdictCountrycode 国家代码
     * @return 国家代码集合
     */
    public List<CmfCmdictCountrycode> selectCmfCmdictCountrycodeList(CmfCmdictCountrycode cmfCmdictCountrycode);

    /**
     * 新增国家代码
     * 
     * @param cmfCmdictCountrycode 国家代码
     * @return 结果
     */
    public int insertCmfCmdictCountrycode(CmfCmdictCountrycode cmfCmdictCountrycode);

    /**
     * 修改国家代码
     * 
     * @param cmfCmdictCountrycode 国家代码
     * @return 结果
     */
    public int updateCmfCmdictCountrycode(CmfCmdictCountrycode cmfCmdictCountrycode);

    /**
     * 批量删除国家代码
     * 
     * @param ids 需要删除的国家代码主键集合
     * @return 结果
     */
    public int deleteCmfCmdictCountrycodeByIds(Integer[] ids);

    /**
     * 删除国家代码信息
     * 
     * @param id 国家代码主键
     * @return 结果
     */
    public int deleteCmfCmdictCountrycodeById(Integer id);
}
