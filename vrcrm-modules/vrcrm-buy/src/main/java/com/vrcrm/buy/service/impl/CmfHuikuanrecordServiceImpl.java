package com.vrcrm.buy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.buy.mapper.CmfHuikuanrecordMapper;
import com.vrcrm.buy.domain.CmfHuikuanrecord;
import com.vrcrm.buy.service.ICmfHuikuanrecordService;

/**
 * 汇款记录Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfHuikuanrecordServiceImpl implements ICmfHuikuanrecordService 
{
    @Autowired
    private CmfHuikuanrecordMapper cmfHuikuanrecordMapper;

    /**
     * 查询汇款记录
     * 
     * @param id 汇款记录主键
     * @return 汇款记录
     */
    @Override
    public CmfHuikuanrecord selectCmfHuikuanrecordById(Integer id)
    {
        return cmfHuikuanrecordMapper.selectCmfHuikuanrecordById(id);
    }

    /**
     * 查询汇款记录列表
     * 
     * @param cmfHuikuanrecord 汇款记录
     * @return 汇款记录
     */
    @Override
    public List<CmfHuikuanrecord> selectCmfHuikuanrecordList(CmfHuikuanrecord cmfHuikuanrecord)
    {
        return cmfHuikuanrecordMapper.selectCmfHuikuanrecordList(cmfHuikuanrecord);
    }

    /**
     * 新增汇款记录
     * 
     * @param cmfHuikuanrecord 汇款记录
     * @return 结果
     */
    @Override
    public int insertCmfHuikuanrecord(CmfHuikuanrecord cmfHuikuanrecord)
    {
        return cmfHuikuanrecordMapper.insertCmfHuikuanrecord(cmfHuikuanrecord);
    }

    /**
     * 修改汇款记录
     * 
     * @param cmfHuikuanrecord 汇款记录
     * @return 结果
     */
    @Override
    public int updateCmfHuikuanrecord(CmfHuikuanrecord cmfHuikuanrecord)
    {
        return cmfHuikuanrecordMapper.updateCmfHuikuanrecord(cmfHuikuanrecord);
    }

    /**
     * 批量删除汇款记录
     * 
     * @param ids 需要删除的汇款记录主键
     * @return 结果
     */
    @Override
    public int deleteCmfHuikuanrecordByIds(Integer[] ids)
    {
        return cmfHuikuanrecordMapper.deleteCmfHuikuanrecordByIds(ids);
    }

    /**
     * 删除汇款记录信息
     * 
     * @param id 汇款记录主键
     * @return 结果
     */
    @Override
    public int deleteCmfHuikuanrecordById(Integer id)
    {
        return cmfHuikuanrecordMapper.deleteCmfHuikuanrecordById(id);
    }
}
