package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfEduXingzhengWorkCheckRegister;

/**
 * 行政人员工作考核登记表Mapper接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface CmfEduXingzhengWorkCheckRegisterMapper 
{
    /**
     * 查询行政人员工作考核登记表
     * 
     * @param id 行政人员工作考核登记表主键
     * @return 行政人员工作考核登记表
     */
    public CmfEduXingzhengWorkCheckRegister selectCmfEduXingzhengWorkCheckRegisterById(Integer id);

    /**
     * 查询行政人员工作考核登记表列表
     * 
     * @param cmfEduXingzhengWorkCheckRegister 行政人员工作考核登记表
     * @return 行政人员工作考核登记表集合
     */
    public List<CmfEduXingzhengWorkCheckRegister> selectCmfEduXingzhengWorkCheckRegisterList(CmfEduXingzhengWorkCheckRegister cmfEduXingzhengWorkCheckRegister);

    /**
     * 新增行政人员工作考核登记表
     * 
     * @param cmfEduXingzhengWorkCheckRegister 行政人员工作考核登记表
     * @return 结果
     */
    public int insertCmfEduXingzhengWorkCheckRegister(CmfEduXingzhengWorkCheckRegister cmfEduXingzhengWorkCheckRegister);

    /**
     * 修改行政人员工作考核登记表
     * 
     * @param cmfEduXingzhengWorkCheckRegister 行政人员工作考核登记表
     * @return 结果
     */
    public int updateCmfEduXingzhengWorkCheckRegister(CmfEduXingzhengWorkCheckRegister cmfEduXingzhengWorkCheckRegister);

    /**
     * 删除行政人员工作考核登记表
     * 
     * @param id 行政人员工作考核登记表主键
     * @return 结果
     */
    public int deleteCmfEduXingzhengWorkCheckRegisterById(Integer id);

    /**
     * 批量删除行政人员工作考核登记表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfEduXingzhengWorkCheckRegisterByIds(Integer[] ids);
}
