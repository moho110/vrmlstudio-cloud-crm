package com.vrcrm.sales.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.sales.mapper.CmfShoupiaorecordMapper;
import com.vrcrm.sales.domain.CmfShoupiaorecord;
import com.vrcrm.sales.service.ICmfShoupiaorecordService;

/**
 * 收票记录Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfShoupiaorecordServiceImpl implements ICmfShoupiaorecordService 
{
    @Autowired
    private CmfShoupiaorecordMapper cmfShoupiaorecordMapper;

    /**
     * 查询收票记录
     * 
     * @param id 收票记录主键
     * @return 收票记录
     */
    @Override
    public CmfShoupiaorecord selectCmfShoupiaorecordById(Integer id)
    {
        return cmfShoupiaorecordMapper.selectCmfShoupiaorecordById(id);
    }

    /**
     * 查询收票记录列表
     * 
     * @param cmfShoupiaorecord 收票记录
     * @return 收票记录
     */
    @Override
    public List<CmfShoupiaorecord> selectCmfShoupiaorecordList(CmfShoupiaorecord cmfShoupiaorecord)
    {
        return cmfShoupiaorecordMapper.selectCmfShoupiaorecordList(cmfShoupiaorecord);
    }

    /**
     * 新增收票记录
     * 
     * @param cmfShoupiaorecord 收票记录
     * @return 结果
     */
    @Override
    public int insertCmfShoupiaorecord(CmfShoupiaorecord cmfShoupiaorecord)
    {
        return cmfShoupiaorecordMapper.insertCmfShoupiaorecord(cmfShoupiaorecord);
    }

    /**
     * 修改收票记录
     * 
     * @param cmfShoupiaorecord 收票记录
     * @return 结果
     */
    @Override
    public int updateCmfShoupiaorecord(CmfShoupiaorecord cmfShoupiaorecord)
    {
        return cmfShoupiaorecordMapper.updateCmfShoupiaorecord(cmfShoupiaorecord);
    }

    /**
     * 批量删除收票记录
     * 
     * @param ids 需要删除的收票记录主键
     * @return 结果
     */
    @Override
    public int deleteCmfShoupiaorecordByIds(Integer[] ids)
    {
        return cmfShoupiaorecordMapper.deleteCmfShoupiaorecordByIds(ids);
    }

    /**
     * 删除收票记录信息
     * 
     * @param id 收票记录主键
     * @return 结果
     */
    @Override
    public int deleteCmfShoupiaorecordById(Integer id)
    {
        return cmfShoupiaorecordMapper.deleteCmfShoupiaorecordById(id);
    }
}
