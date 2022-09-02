package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfHrmsTransferTypeMapper;
import com.vrcrm.hr.domain.CmfHrmsTransferType;
import com.vrcrm.hr.service.ICmfHrmsTransferTypeService;

/**
 * 转职类型Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfHrmsTransferTypeServiceImpl implements ICmfHrmsTransferTypeService 
{
    @Autowired
    private CmfHrmsTransferTypeMapper cmfHrmsTransferTypeMapper;

    /**
     * 查询转职类型
     * 
     * @param id 转职类型主键
     * @return 转职类型
     */
    @Override
    public CmfHrmsTransferType selectCmfHrmsTransferTypeById(Integer id)
    {
        return cmfHrmsTransferTypeMapper.selectCmfHrmsTransferTypeById(id);
    }

    /**
     * 查询转职类型列表
     * 
     * @param cmfHrmsTransferType 转职类型
     * @return 转职类型
     */
    @Override
    public List<CmfHrmsTransferType> selectCmfHrmsTransferTypeList(CmfHrmsTransferType cmfHrmsTransferType)
    {
        return cmfHrmsTransferTypeMapper.selectCmfHrmsTransferTypeList(cmfHrmsTransferType);
    }

    /**
     * 新增转职类型
     * 
     * @param cmfHrmsTransferType 转职类型
     * @return 结果
     */
    @Override
    public int insertCmfHrmsTransferType(CmfHrmsTransferType cmfHrmsTransferType)
    {
        return cmfHrmsTransferTypeMapper.insertCmfHrmsTransferType(cmfHrmsTransferType);
    }

    /**
     * 修改转职类型
     * 
     * @param cmfHrmsTransferType 转职类型
     * @return 结果
     */
    @Override
    public int updateCmfHrmsTransferType(CmfHrmsTransferType cmfHrmsTransferType)
    {
        return cmfHrmsTransferTypeMapper.updateCmfHrmsTransferType(cmfHrmsTransferType);
    }

    /**
     * 批量删除转职类型
     * 
     * @param ids 需要删除的转职类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsTransferTypeByIds(Integer[] ids)
    {
        return cmfHrmsTransferTypeMapper.deleteCmfHrmsTransferTypeByIds(ids);
    }

    /**
     * 删除转职类型信息
     * 
     * @param id 转职类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsTransferTypeById(Integer id)
    {
        return cmfHrmsTransferTypeMapper.deleteCmfHrmsTransferTypeById(id);
    }
}
