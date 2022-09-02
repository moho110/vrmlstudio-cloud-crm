package com.vrcrm.xsystem.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.xsystem.mapper.CmfSysCodeMapper;
import com.vrcrm.xsystem.domain.CmfSysCode;
import com.vrcrm.xsystem.service.ICmfSysCodeService;

/**
 * 系统代码Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfSysCodeServiceImpl implements ICmfSysCodeService 
{
    @Autowired
    private CmfSysCodeMapper cmfSysCodeMapper;

    /**
     * 查询系统代码
     * 
     * @param id 系统代码主键
     * @return 系统代码
     */
    @Override
    public CmfSysCode selectCmfSysCodeById(Integer id)
    {
        return cmfSysCodeMapper.selectCmfSysCodeById(id);
    }

    /**
     * 查询系统代码列表
     * 
     * @param cmfSysCode 系统代码
     * @return 系统代码
     */
    @Override
    public List<CmfSysCode> selectCmfSysCodeList(CmfSysCode cmfSysCode)
    {
        return cmfSysCodeMapper.selectCmfSysCodeList(cmfSysCode);
    }

    /**
     * 新增系统代码
     * 
     * @param cmfSysCode 系统代码
     * @return 结果
     */
    @Override
    public int insertCmfSysCode(CmfSysCode cmfSysCode)
    {
        return cmfSysCodeMapper.insertCmfSysCode(cmfSysCode);
    }

    /**
     * 修改系统代码
     * 
     * @param cmfSysCode 系统代码
     * @return 结果
     */
    @Override
    public int updateCmfSysCode(CmfSysCode cmfSysCode)
    {
        return cmfSysCodeMapper.updateCmfSysCode(cmfSysCode);
    }

    /**
     * 批量删除系统代码
     * 
     * @param ids 需要删除的系统代码主键
     * @return 结果
     */
    @Override
    public int deleteCmfSysCodeByIds(Integer[] ids)
    {
        return cmfSysCodeMapper.deleteCmfSysCodeByIds(ids);
    }

    /**
     * 删除系统代码信息
     * 
     * @param id 系统代码主键
     * @return 结果
     */
    @Override
    public int deleteCmfSysCodeById(Integer id)
    {
        return cmfSysCodeMapper.deleteCmfSysCodeById(id);
    }
}
