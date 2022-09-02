package com.vrcrm.mytable.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.mytable.mapper.CmfWorkplanmainMapper;
import com.vrcrm.mytable.domain.CmfWorkplanmain;
import com.vrcrm.mytable.service.ICmfWorkplanmainService;

/**
 * 工作计划Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfWorkplanmainServiceImpl implements ICmfWorkplanmainService 
{
    @Autowired
    private CmfWorkplanmainMapper cmfWorkplanmainMapper;

    /**
     * 查询工作计划
     * 
     * @param id 工作计划主键
     * @return 工作计划
     */
    @Override
    public CmfWorkplanmain selectCmfWorkplanmainById(Integer id)
    {
        return cmfWorkplanmainMapper.selectCmfWorkplanmainById(id);
    }

    /**
     * 查询工作计划列表
     * 
     * @param cmfWorkplanmain 工作计划
     * @return 工作计划
     */
    @Override
    public List<CmfWorkplanmain> selectCmfWorkplanmainList(CmfWorkplanmain cmfWorkplanmain)
    {
        return cmfWorkplanmainMapper.selectCmfWorkplanmainList(cmfWorkplanmain);
    }

    /**
     * 新增工作计划
     * 
     * @param cmfWorkplanmain 工作计划
     * @return 结果
     */
    @Override
    public int insertCmfWorkplanmain(CmfWorkplanmain cmfWorkplanmain)
    {
        return cmfWorkplanmainMapper.insertCmfWorkplanmain(cmfWorkplanmain);
    }

    /**
     * 修改工作计划
     * 
     * @param cmfWorkplanmain 工作计划
     * @return 结果
     */
    @Override
    public int updateCmfWorkplanmain(CmfWorkplanmain cmfWorkplanmain)
    {
        return cmfWorkplanmainMapper.updateCmfWorkplanmain(cmfWorkplanmain);
    }

    /**
     * 批量删除工作计划
     * 
     * @param ids 需要删除的工作计划主键
     * @return 结果
     */
    @Override
    public int deleteCmfWorkplanmainByIds(Integer[] ids)
    {
        return cmfWorkplanmainMapper.deleteCmfWorkplanmainByIds(ids);
    }

    /**
     * 删除工作计划信息
     * 
     * @param id 工作计划主键
     * @return 结果
     */
    @Override
    public int deleteCmfWorkplanmainById(Integer id)
    {
        return cmfWorkplanmainMapper.deleteCmfWorkplanmainById(id);
    }
}
