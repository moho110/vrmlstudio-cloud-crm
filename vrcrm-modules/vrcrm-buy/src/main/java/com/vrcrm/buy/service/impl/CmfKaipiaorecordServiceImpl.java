package com.vrcrm.buy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.buy.mapper.CmfKaipiaorecordMapper;
import com.vrcrm.buy.domain.CmfKaipiaorecord;
import com.vrcrm.buy.service.ICmfKaipiaorecordService;

/**
 * 开票记录Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfKaipiaorecordServiceImpl implements ICmfKaipiaorecordService 
{
    @Autowired
    private CmfKaipiaorecordMapper cmfKaipiaorecordMapper;

    /**
     * 查询开票记录
     * 
     * @param id 开票记录主键
     * @return 开票记录
     */
    @Override
    public CmfKaipiaorecord selectCmfKaipiaorecordById(Integer id)
    {
        return cmfKaipiaorecordMapper.selectCmfKaipiaorecordById(id);
    }

    /**
     * 查询开票记录列表
     * 
     * @param cmfKaipiaorecord 开票记录
     * @return 开票记录
     */
    @Override
    public List<CmfKaipiaorecord> selectCmfKaipiaorecordList(CmfKaipiaorecord cmfKaipiaorecord)
    {
        return cmfKaipiaorecordMapper.selectCmfKaipiaorecordList(cmfKaipiaorecord);
    }

    /**
     * 新增开票记录
     * 
     * @param cmfKaipiaorecord 开票记录
     * @return 结果
     */
    @Override
    public int insertCmfKaipiaorecord(CmfKaipiaorecord cmfKaipiaorecord)
    {
        return cmfKaipiaorecordMapper.insertCmfKaipiaorecord(cmfKaipiaorecord);
    }

    /**
     * 修改开票记录
     * 
     * @param cmfKaipiaorecord 开票记录
     * @return 结果
     */
    @Override
    public int updateCmfKaipiaorecord(CmfKaipiaorecord cmfKaipiaorecord)
    {
        return cmfKaipiaorecordMapper.updateCmfKaipiaorecord(cmfKaipiaorecord);
    }

    /**
     * 批量删除开票记录
     * 
     * @param ids 需要删除的开票记录主键
     * @return 结果
     */
    @Override
    public int deleteCmfKaipiaorecordByIds(Integer[] ids)
    {
        return cmfKaipiaorecordMapper.deleteCmfKaipiaorecordByIds(ids);
    }

    /**
     * 删除开票记录信息
     * 
     * @param id 开票记录主键
     * @return 结果
     */
    @Override
    public int deleteCmfKaipiaorecordById(Integer id)
    {
        return cmfKaipiaorecordMapper.deleteCmfKaipiaorecordById(id);
    }
}
