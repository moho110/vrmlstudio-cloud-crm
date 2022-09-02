package com.vrcrm.xsystem.service;

import java.util.List;
import com.vrcrm.xsystem.domain.CmfSysMenu;

/**
 * 系统菜单Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfSysMenuService 
{
    /**
     * 查询系统菜单
     * 
     * @param id 系统菜单主键
     * @return 系统菜单
     */
    public CmfSysMenu selectCmfSysMenuById(Integer id);

    /**
     * 查询系统菜单列表
     * 
     * @param cmfSysMenu 系统菜单
     * @return 系统菜单集合
     */
    public List<CmfSysMenu> selectCmfSysMenuList(CmfSysMenu cmfSysMenu);

    /**
     * 新增系统菜单
     * 
     * @param cmfSysMenu 系统菜单
     * @return 结果
     */
    public int insertCmfSysMenu(CmfSysMenu cmfSysMenu);

    /**
     * 修改系统菜单
     * 
     * @param cmfSysMenu 系统菜单
     * @return 结果
     */
    public int updateCmfSysMenu(CmfSysMenu cmfSysMenu);

    /**
     * 批量删除系统菜单
     * 
     * @param ids 需要删除的系统菜单主键集合
     * @return 结果
     */
    public int deleteCmfSysMenuByIds(Integer[] ids);

    /**
     * 删除系统菜单信息
     * 
     * @param id 系统菜单主键
     * @return 结果
     */
    public int deleteCmfSysMenuById(Integer id);
}
