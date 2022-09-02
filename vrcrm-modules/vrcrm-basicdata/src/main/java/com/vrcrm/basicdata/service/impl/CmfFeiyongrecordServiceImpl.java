package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfFeiyongrecordMapper;
import com.vrcrm.basicdata.domain.CmfFeiyongrecord;
import com.vrcrm.basicdata.service.ICmfFeiyongrecordService;

/**
 * 费用记录Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfFeiyongrecordServiceImpl implements ICmfFeiyongrecordService 
{
    @Autowired
    private CmfFeiyongrecordMapper cmfFeiyongrecordMapper;

    /**
     * 查询费用记录
     * 
     * @param id 费用记录主键
     * @return 费用记录
     */
    @Override
    public CmfFeiyongrecord selectCmfFeiyongrecordById(Integer id)
    {
        return cmfFeiyongrecordMapper.selectCmfFeiyongrecordById(id);
    }

    /**
     * 查询费用记录列表
     * 
     * @param cmfFeiyongrecord 费用记录
     * @return 费用记录
     */
    @Override
    public List<CmfFeiyongrecord> selectCmfFeiyongrecordList(CmfFeiyongrecord cmfFeiyongrecord)
    {
        return cmfFeiyongrecordMapper.selectCmfFeiyongrecordList(cmfFeiyongrecord);
    }

    /**
     * 新增费用记录
     * 
     * @param cmfFeiyongrecord 费用记录
     * @return 结果
     */
    @Override
    public int insertCmfFeiyongrecord(CmfFeiyongrecord cmfFeiyongrecord)
    {
        return cmfFeiyongrecordMapper.insertCmfFeiyongrecord(cmfFeiyongrecord);
    }

    /**
     * 修改费用记录
     * 
     * @param cmfFeiyongrecord 费用记录
     * @return 结果
     */
    @Override
    public int updateCmfFeiyongrecord(CmfFeiyongrecord cmfFeiyongrecord)
    {
        return cmfFeiyongrecordMapper.updateCmfFeiyongrecord(cmfFeiyongrecord);
    }

    /**
     * 批量删除费用记录
     * 
     * @param ids 需要删除的费用记录主键
     * @return 结果
     */
    @Override
    public int deleteCmfFeiyongrecordByIds(Integer[] ids)
    {
        return cmfFeiyongrecordMapper.deleteCmfFeiyongrecordByIds(ids);
    }

    /**
     * 删除费用记录信息
     * 
     * @param id 费用记录主键
     * @return 结果
     */
    @Override
    public int deleteCmfFeiyongrecordById(Integer id)
    {
        return cmfFeiyongrecordMapper.deleteCmfFeiyongrecordById(id);
    }
}
