package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfModifyrecordMapper;
import com.vrcrm.basicdata.domain.CmfModifyrecord;
import com.vrcrm.basicdata.service.ICmfModifyrecordService;

/**
 * 修改记录Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfModifyrecordServiceImpl implements ICmfModifyrecordService 
{
    @Autowired
    private CmfModifyrecordMapper cmfModifyrecordMapper;

    /**
     * 查询修改记录
     * 
     * @param id 修改记录主键
     * @return 修改记录
     */
    @Override
    public CmfModifyrecord selectCmfModifyrecordById(Integer id)
    {
        return cmfModifyrecordMapper.selectCmfModifyrecordById(id);
    }

    /**
     * 查询修改记录列表
     * 
     * @param cmfModifyrecord 修改记录
     * @return 修改记录
     */
    @Override
    public List<CmfModifyrecord> selectCmfModifyrecordList(CmfModifyrecord cmfModifyrecord)
    {
        return cmfModifyrecordMapper.selectCmfModifyrecordList(cmfModifyrecord);
    }

    /**
     * 新增修改记录
     * 
     * @param cmfModifyrecord 修改记录
     * @return 结果
     */
    @Override
    public int insertCmfModifyrecord(CmfModifyrecord cmfModifyrecord)
    {
        return cmfModifyrecordMapper.insertCmfModifyrecord(cmfModifyrecord);
    }

    /**
     * 修改修改记录
     * 
     * @param cmfModifyrecord 修改记录
     * @return 结果
     */
    @Override
    public int updateCmfModifyrecord(CmfModifyrecord cmfModifyrecord)
    {
        return cmfModifyrecordMapper.updateCmfModifyrecord(cmfModifyrecord);
    }

    /**
     * 批量删除修改记录
     * 
     * @param ids 需要删除的修改记录主键
     * @return 结果
     */
    @Override
    public int deleteCmfModifyrecordByIds(Integer[] ids)
    {
        return cmfModifyrecordMapper.deleteCmfModifyrecordByIds(ids);
    }

    /**
     * 删除修改记录信息
     * 
     * @param id 修改记录主键
     * @return 结果
     */
    @Override
    public int deleteCmfModifyrecordById(Integer id)
    {
        return cmfModifyrecordMapper.deleteCmfModifyrecordById(id);
    }
}
