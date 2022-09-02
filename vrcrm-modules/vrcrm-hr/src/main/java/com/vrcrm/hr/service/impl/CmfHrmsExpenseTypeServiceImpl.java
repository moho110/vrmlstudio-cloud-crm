package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfHrmsExpenseTypeMapper;
import com.vrcrm.hr.domain.CmfHrmsExpenseType;
import com.vrcrm.hr.service.ICmfHrmsExpenseTypeService;

/**
 * 费用类型Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfHrmsExpenseTypeServiceImpl implements ICmfHrmsExpenseTypeService 
{
    @Autowired
    private CmfHrmsExpenseTypeMapper cmfHrmsExpenseTypeMapper;

    /**
     * 查询费用类型
     * 
     * @param id 费用类型主键
     * @return 费用类型
     */
    @Override
    public CmfHrmsExpenseType selectCmfHrmsExpenseTypeById(Integer id)
    {
        return cmfHrmsExpenseTypeMapper.selectCmfHrmsExpenseTypeById(id);
    }

    /**
     * 查询费用类型列表
     * 
     * @param cmfHrmsExpenseType 费用类型
     * @return 费用类型
     */
    @Override
    public List<CmfHrmsExpenseType> selectCmfHrmsExpenseTypeList(CmfHrmsExpenseType cmfHrmsExpenseType)
    {
        return cmfHrmsExpenseTypeMapper.selectCmfHrmsExpenseTypeList(cmfHrmsExpenseType);
    }

    /**
     * 新增费用类型
     * 
     * @param cmfHrmsExpenseType 费用类型
     * @return 结果
     */
    @Override
    public int insertCmfHrmsExpenseType(CmfHrmsExpenseType cmfHrmsExpenseType)
    {
        return cmfHrmsExpenseTypeMapper.insertCmfHrmsExpenseType(cmfHrmsExpenseType);
    }

    /**
     * 修改费用类型
     * 
     * @param cmfHrmsExpenseType 费用类型
     * @return 结果
     */
    @Override
    public int updateCmfHrmsExpenseType(CmfHrmsExpenseType cmfHrmsExpenseType)
    {
        return cmfHrmsExpenseTypeMapper.updateCmfHrmsExpenseType(cmfHrmsExpenseType);
    }

    /**
     * 批量删除费用类型
     * 
     * @param ids 需要删除的费用类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsExpenseTypeByIds(Integer[] ids)
    {
        return cmfHrmsExpenseTypeMapper.deleteCmfHrmsExpenseTypeByIds(ids);
    }

    /**
     * 删除费用类型信息
     * 
     * @param id 费用类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsExpenseTypeById(Integer id)
    {
        return cmfHrmsExpenseTypeMapper.deleteCmfHrmsExpenseTypeById(id);
    }
}
