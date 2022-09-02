package com.vrcrm.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.xsystem.mapper.CmfSysMenuMapper;
import com.vrcrm.xsystem.domain.CmfSysMenu;
import com.vrcrm.xsystem.service.ICmfSysMenuService;

/**
 * 系统菜单Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSysMenuServiceImpl implements ICmfSysMenuService 
{
    @Autowired
    private CmfSysMenuMapper cmfSysMenuMapper;

    /**
     * 查询系统菜单
     * 
     * @param id 系统菜单主键
     * @return 系统菜单
     */
    @Override
    public CmfSysMenu selectCmfSysMenuById(Integer id)
    {
        return cmfSysMenuMapper.selectCmfSysMenuById(id);
    }

    /**
     * 查询系统菜单列表
     * 
     * @param cmfSysMenu 系统菜单
     * @return 系统菜单
     */
    @Override
    public List<CmfSysMenu> selectCmfSysMenuList(CmfSysMenu cmfSysMenu)
    {
        return cmfSysMenuMapper.selectCmfSysMenuList(cmfSysMenu);
    }

    /**
     * 新增系统菜单
     * 
     * @param cmfSysMenu 系统菜单
     * @return 结果
     */
    @Override
    public int insertCmfSysMenu(CmfSysMenu cmfSysMenu)
    {
        return cmfSysMenuMapper.insertCmfSysMenu(cmfSysMenu);
    }

    /**
     * 修改系统菜单
     * 
     * @param cmfSysMenu 系统菜单
     * @return 结果
     */
    @Override
    public int updateCmfSysMenu(CmfSysMenu cmfSysMenu)
    {
        return cmfSysMenuMapper.updateCmfSysMenu(cmfSysMenu);
    }

    /**
     * 批量删除系统菜单
     * 
     * @param ids 需要删除的系统菜单主键
     * @return 结果
     */
    @Override
    public int deleteCmfSysMenuByIds(Integer[] ids)
    {
        return cmfSysMenuMapper.deleteCmfSysMenuByIds(ids);
    }

    /**
     * 删除系统菜单信息
     * 
     * @param id 系统菜单主键
     * @return 结果
     */
    @Override
    public int deleteCmfSysMenuById(Integer id)
    {
        return cmfSysMenuMapper.deleteCmfSysMenuById(id);
    }
}
