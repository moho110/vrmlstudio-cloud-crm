package com.vrcrm.xsystem.mapper;

import java.util.List;
import com.vrcrm.xsystem.domain.CmfSysCode;

/**
 * 系统代码Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfSysCodeMapper 
{
    /**
     * 查询系统代码
     * 
     * @param id 系统代码主键
     * @return 系统代码
     */
    public CmfSysCode selectCmfSysCodeById(Integer id);

    /**
     * 查询系统代码列表
     * 
     * @param cmfSysCode 系统代码
     * @return 系统代码集合
     */
    public List<CmfSysCode> selectCmfSysCodeList(CmfSysCode cmfSysCode);

    /**
     * 新增系统代码
     * 
     * @param cmfSysCode 系统代码
     * @return 结果
     */
    public int insertCmfSysCode(CmfSysCode cmfSysCode);

    /**
     * 修改系统代码
     * 
     * @param cmfSysCode 系统代码
     * @return 结果
     */
    public int updateCmfSysCode(CmfSysCode cmfSysCode);

    /**
     * 删除系统代码
     * 
     * @param id 系统代码主键
     * @return 结果
     */
    public int deleteCmfSysCodeById(Integer id);

    /**
     * 批量删除系统代码
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfSysCodeByIds(Integer[] ids);
}
