package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfDictWeekdayMapper;
import com.vrcrm.hr.domain.CmfDictWeekday;
import com.vrcrm.hr.service.ICmfDictWeekdayService;

/**
 * 周工作日Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfDictWeekdayServiceImpl implements ICmfDictWeekdayService 
{
    @Autowired
    private CmfDictWeekdayMapper cmfDictWeekdayMapper;

    /**
     * 查询周工作日
     * 
     * @param id 周工作日主键
     * @return 周工作日
     */
    @Override
    public CmfDictWeekday selectCmfDictWeekdayById(Integer id)
    {
        return cmfDictWeekdayMapper.selectCmfDictWeekdayById(id);
    }

    /**
     * 查询周工作日列表
     * 
     * @param cmfDictWeekday 周工作日
     * @return 周工作日
     */
    @Override
    public List<CmfDictWeekday> selectCmfDictWeekdayList(CmfDictWeekday cmfDictWeekday)
    {
        return cmfDictWeekdayMapper.selectCmfDictWeekdayList(cmfDictWeekday);
    }

    /**
     * 新增周工作日
     * 
     * @param cmfDictWeekday 周工作日
     * @return 结果
     */
    @Override
    public int insertCmfDictWeekday(CmfDictWeekday cmfDictWeekday)
    {
        return cmfDictWeekdayMapper.insertCmfDictWeekday(cmfDictWeekday);
    }

    /**
     * 修改周工作日
     * 
     * @param cmfDictWeekday 周工作日
     * @return 结果
     */
    @Override
    public int updateCmfDictWeekday(CmfDictWeekday cmfDictWeekday)
    {
        return cmfDictWeekdayMapper.updateCmfDictWeekday(cmfDictWeekday);
    }

    /**
     * 批量删除周工作日
     * 
     * @param ids 需要删除的周工作日主键
     * @return 结果
     */
    @Override
    public int deleteCmfDictWeekdayByIds(Integer[] ids)
    {
        return cmfDictWeekdayMapper.deleteCmfDictWeekdayByIds(ids);
    }

    /**
     * 删除周工作日信息
     * 
     * @param id 周工作日主键
     * @return 结果
     */
    @Override
    public int deleteCmfDictWeekdayById(Integer id)
    {
        return cmfDictWeekdayMapper.deleteCmfDictWeekdayById(id);
    }
}
