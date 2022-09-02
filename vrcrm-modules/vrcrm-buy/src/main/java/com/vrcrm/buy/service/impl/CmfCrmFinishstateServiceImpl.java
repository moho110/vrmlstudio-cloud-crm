package com.vrcrm.buy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.buy.mapper.CmfCrmFinishstateMapper;
import com.vrcrm.buy.domain.CmfCrmFinishstate;
import com.vrcrm.buy.service.ICmfCrmFinishstateService;

/**
 * 完成状态Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfCrmFinishstateServiceImpl implements ICmfCrmFinishstateService 
{
    @Autowired
    private CmfCrmFinishstateMapper cmfCrmFinishstateMapper;

    /**
     * 查询完成状态
     * 
     * @param id 完成状态主键
     * @return 完成状态
     */
    @Override
    public CmfCrmFinishstate selectCmfCrmFinishstateById(Integer id)
    {
        return cmfCrmFinishstateMapper.selectCmfCrmFinishstateById(id);
    }

    /**
     * 查询完成状态列表
     * 
     * @param cmfCrmFinishstate 完成状态
     * @return 完成状态
     */
    @Override
    public List<CmfCrmFinishstate> selectCmfCrmFinishstateList(CmfCrmFinishstate cmfCrmFinishstate)
    {
        return cmfCrmFinishstateMapper.selectCmfCrmFinishstateList(cmfCrmFinishstate);
    }

    /**
     * 新增完成状态
     * 
     * @param cmfCrmFinishstate 完成状态
     * @return 结果
     */
    @Override
    public int insertCmfCrmFinishstate(CmfCrmFinishstate cmfCrmFinishstate)
    {
        return cmfCrmFinishstateMapper.insertCmfCrmFinishstate(cmfCrmFinishstate);
    }

    /**
     * 修改完成状态
     * 
     * @param cmfCrmFinishstate 完成状态
     * @return 结果
     */
    @Override
    public int updateCmfCrmFinishstate(CmfCrmFinishstate cmfCrmFinishstate)
    {
        return cmfCrmFinishstateMapper.updateCmfCrmFinishstate(cmfCrmFinishstate);
    }

    /**
     * 批量删除完成状态
     * 
     * @param ids 需要删除的完成状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmFinishstateByIds(Integer[] ids)
    {
        return cmfCrmFinishstateMapper.deleteCmfCrmFinishstateByIds(ids);
    }

    /**
     * 删除完成状态信息
     * 
     * @param id 完成状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmFinishstateById(Integer id)
    {
        return cmfCrmFinishstateMapper.deleteCmfCrmFinishstateById(id);
    }
}
