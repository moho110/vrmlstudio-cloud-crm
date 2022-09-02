package com.vrcrm.xsystem.service;

import java.util.List;
import com.vrcrm.xsystem.domain.CmfSystemlang;

/**
 * 系统语言Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfSystemlangService 
{
    /**
     * 查询系统语言
     * 
     * @param id 系统语言主键
     * @return 系统语言
     */
    public CmfSystemlang selectCmfSystemlangById(Integer id);

    /**
     * 查询系统语言列表
     * 
     * @param cmfSystemlang 系统语言
     * @return 系统语言集合
     */
    public List<CmfSystemlang> selectCmfSystemlangList(CmfSystemlang cmfSystemlang);

    /**
     * 新增系统语言
     * 
     * @param cmfSystemlang 系统语言
     * @return 结果
     */
    public int insertCmfSystemlang(CmfSystemlang cmfSystemlang);

    /**
     * 修改系统语言
     * 
     * @param cmfSystemlang 系统语言
     * @return 结果
     */
    public int updateCmfSystemlang(CmfSystemlang cmfSystemlang);

    /**
     * 批量删除系统语言
     * 
     * @param ids 需要删除的系统语言主键集合
     * @return 结果
     */
    public int deleteCmfSystemlangByIds(Integer[] ids);

    /**
     * 删除系统语言信息
     * 
     * @param id 系统语言主键
     * @return 结果
     */
    public int deleteCmfSystemlangById(Integer id);
}
