package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfEduXingzhengWorkCheckRegisterMapper;
import com.vrcrm.hr.domain.CmfEduXingzhengWorkCheckRegister;
import com.vrcrm.hr.service.ICmfEduXingzhengWorkCheckRegisterService;

/**
 * 行政人员工作考核登记表Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfEduXingzhengWorkCheckRegisterServiceImpl implements ICmfEduXingzhengWorkCheckRegisterService 
{
    @Autowired
    private CmfEduXingzhengWorkCheckRegisterMapper cmfEduXingzhengWorkCheckRegisterMapper;

    /**
     * 查询行政人员工作考核登记表
     * 
     * @param id 行政人员工作考核登记表主键
     * @return 行政人员工作考核登记表
     */
    @Override
    public CmfEduXingzhengWorkCheckRegister selectCmfEduXingzhengWorkCheckRegisterById(Integer id)
    {
        return cmfEduXingzhengWorkCheckRegisterMapper.selectCmfEduXingzhengWorkCheckRegisterById(id);
    }

    /**
     * 查询行政人员工作考核登记表列表
     * 
     * @param cmfEduXingzhengWorkCheckRegister 行政人员工作考核登记表
     * @return 行政人员工作考核登记表
     */
    @Override
    public List<CmfEduXingzhengWorkCheckRegister> selectCmfEduXingzhengWorkCheckRegisterList(CmfEduXingzhengWorkCheckRegister cmfEduXingzhengWorkCheckRegister)
    {
        return cmfEduXingzhengWorkCheckRegisterMapper.selectCmfEduXingzhengWorkCheckRegisterList(cmfEduXingzhengWorkCheckRegister);
    }

    /**
     * 新增行政人员工作考核登记表
     * 
     * @param cmfEduXingzhengWorkCheckRegister 行政人员工作考核登记表
     * @return 结果
     */
    @Override
    public int insertCmfEduXingzhengWorkCheckRegister(CmfEduXingzhengWorkCheckRegister cmfEduXingzhengWorkCheckRegister)
    {
        return cmfEduXingzhengWorkCheckRegisterMapper.insertCmfEduXingzhengWorkCheckRegister(cmfEduXingzhengWorkCheckRegister);
    }

    /**
     * 修改行政人员工作考核登记表
     * 
     * @param cmfEduXingzhengWorkCheckRegister 行政人员工作考核登记表
     * @return 结果
     */
    @Override
    public int updateCmfEduXingzhengWorkCheckRegister(CmfEduXingzhengWorkCheckRegister cmfEduXingzhengWorkCheckRegister)
    {
        return cmfEduXingzhengWorkCheckRegisterMapper.updateCmfEduXingzhengWorkCheckRegister(cmfEduXingzhengWorkCheckRegister);
    }

    /**
     * 批量删除行政人员工作考核登记表
     * 
     * @param ids 需要删除的行政人员工作考核登记表主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengWorkCheckRegisterByIds(Integer[] ids)
    {
        return cmfEduXingzhengWorkCheckRegisterMapper.deleteCmfEduXingzhengWorkCheckRegisterByIds(ids);
    }

    /**
     * 删除行政人员工作考核登记表信息
     * 
     * @param id 行政人员工作考核登记表主键
     * @return 结果
     */
    @Override
    public int deleteCmfEduXingzhengWorkCheckRegisterById(Integer id)
    {
        return cmfEduXingzhengWorkCheckRegisterMapper.deleteCmfEduXingzhengWorkCheckRegisterById(id);
    }
}
