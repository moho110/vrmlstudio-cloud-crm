package com.vrcrm.mytable.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.mytable.mapper.CmfWorkplanstateMapper;
import com.vrcrm.mytable.domain.CmfWorkplanstate;
import com.vrcrm.mytable.service.ICmfWorkplanstateService;

/**
 * 工作计划状态Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfWorkplanstateServiceImpl implements ICmfWorkplanstateService 
{
    @Autowired
    private CmfWorkplanstateMapper cmfWorkplanstateMapper;

    /**
     * 查询工作计划状态
     * 
     * @param id 工作计划状态主键
     * @return 工作计划状态
     */
    @Override
    public CmfWorkplanstate selectCmfWorkplanstateById(Integer id)
    {
        return cmfWorkplanstateMapper.selectCmfWorkplanstateById(id);
    }

    /**
     * 查询工作计划状态列表
     * 
     * @param cmfWorkplanstate 工作计划状态
     * @return 工作计划状态
     */
    @Override
    public List<CmfWorkplanstate> selectCmfWorkplanstateList(CmfWorkplanstate cmfWorkplanstate)
    {
        return cmfWorkplanstateMapper.selectCmfWorkplanstateList(cmfWorkplanstate);
    }

    /**
     * 新增工作计划状态
     * 
     * @param cmfWorkplanstate 工作计划状态
     * @return 结果
     */
    @Override
    public int insertCmfWorkplanstate(CmfWorkplanstate cmfWorkplanstate)
    {
        return cmfWorkplanstateMapper.insertCmfWorkplanstate(cmfWorkplanstate);
    }

    /**
     * 修改工作计划状态
     * 
     * @param cmfWorkplanstate 工作计划状态
     * @return 结果
     */
    @Override
    public int updateCmfWorkplanstate(CmfWorkplanstate cmfWorkplanstate)
    {
        return cmfWorkplanstateMapper.updateCmfWorkplanstate(cmfWorkplanstate);
    }

    /**
     * 批量删除工作计划状态
     * 
     * @param ids 需要删除的工作计划状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfWorkplanstateByIds(Integer[] ids)
    {
        return cmfWorkplanstateMapper.deleteCmfWorkplanstateByIds(ids);
    }

    /**
     * 删除工作计划状态信息
     * 
     * @param id 工作计划状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfWorkplanstateById(Integer id)
    {
        return cmfWorkplanstateMapper.deleteCmfWorkplanstateById(id);
    }
}
