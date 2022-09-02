package com.vrcrm.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.xsystem.mapper.CmfSystemhelpMapper;
import com.vrcrm.xsystem.domain.CmfSystemhelp;
import com.vrcrm.xsystem.service.ICmfSystemhelpService;

/**
 * 系统帮助Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSystemhelpServiceImpl implements ICmfSystemhelpService 
{
    @Autowired
    private CmfSystemhelpMapper cmfSystemhelpMapper;

    /**
     * 查询系统帮助
     * 
     * @param id 系统帮助主键
     * @return 系统帮助
     */
    @Override
    public CmfSystemhelp selectCmfSystemhelpById(Integer id)
    {
        return cmfSystemhelpMapper.selectCmfSystemhelpById(id);
    }

    /**
     * 查询系统帮助列表
     * 
     * @param cmfSystemhelp 系统帮助
     * @return 系统帮助
     */
    @Override
    public List<CmfSystemhelp> selectCmfSystemhelpList(CmfSystemhelp cmfSystemhelp)
    {
        return cmfSystemhelpMapper.selectCmfSystemhelpList(cmfSystemhelp);
    }

    /**
     * 新增系统帮助
     * 
     * @param cmfSystemhelp 系统帮助
     * @return 结果
     */
    @Override
    public int insertCmfSystemhelp(CmfSystemhelp cmfSystemhelp)
    {
        return cmfSystemhelpMapper.insertCmfSystemhelp(cmfSystemhelp);
    }

    /**
     * 修改系统帮助
     * 
     * @param cmfSystemhelp 系统帮助
     * @return 结果
     */
    @Override
    public int updateCmfSystemhelp(CmfSystemhelp cmfSystemhelp)
    {
        return cmfSystemhelpMapper.updateCmfSystemhelp(cmfSystemhelp);
    }

    /**
     * 批量删除系统帮助
     * 
     * @param ids 需要删除的系统帮助主键
     * @return 结果
     */
    @Override
    public int deleteCmfSystemhelpByIds(Integer[] ids)
    {
        return cmfSystemhelpMapper.deleteCmfSystemhelpByIds(ids);
    }

    /**
     * 删除系统帮助信息
     * 
     * @param id 系统帮助主键
     * @return 结果
     */
    @Override
    public int deleteCmfSystemhelpById(Integer id)
    {
        return cmfSystemhelpMapper.deleteCmfSystemhelpById(id);
    }
}
