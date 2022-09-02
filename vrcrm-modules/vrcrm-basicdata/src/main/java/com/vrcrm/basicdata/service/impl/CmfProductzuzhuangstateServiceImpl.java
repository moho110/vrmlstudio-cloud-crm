package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfProductzuzhuangstateMapper;
import com.vrcrm.basicdata.domain.CmfProductzuzhuangstate;
import com.vrcrm.basicdata.service.ICmfProductzuzhuangstateService;

/**
 * 产品组装状态Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfProductzuzhuangstateServiceImpl implements ICmfProductzuzhuangstateService 
{
    @Autowired
    private CmfProductzuzhuangstateMapper cmfProductzuzhuangstateMapper;

    /**
     * 查询产品组装状态
     * 
     * @param id 产品组装状态主键
     * @return 产品组装状态
     */
    @Override
    public CmfProductzuzhuangstate selectCmfProductzuzhuangstateById(Integer id)
    {
        return cmfProductzuzhuangstateMapper.selectCmfProductzuzhuangstateById(id);
    }

    /**
     * 查询产品组装状态列表
     * 
     * @param cmfProductzuzhuangstate 产品组装状态
     * @return 产品组装状态
     */
    @Override
    public List<CmfProductzuzhuangstate> selectCmfProductzuzhuangstateList(CmfProductzuzhuangstate cmfProductzuzhuangstate)
    {
        return cmfProductzuzhuangstateMapper.selectCmfProductzuzhuangstateList(cmfProductzuzhuangstate);
    }

    /**
     * 新增产品组装状态
     * 
     * @param cmfProductzuzhuangstate 产品组装状态
     * @return 结果
     */
    @Override
    public int insertCmfProductzuzhuangstate(CmfProductzuzhuangstate cmfProductzuzhuangstate)
    {
        return cmfProductzuzhuangstateMapper.insertCmfProductzuzhuangstate(cmfProductzuzhuangstate);
    }

    /**
     * 修改产品组装状态
     * 
     * @param cmfProductzuzhuangstate 产品组装状态
     * @return 结果
     */
    @Override
    public int updateCmfProductzuzhuangstate(CmfProductzuzhuangstate cmfProductzuzhuangstate)
    {
        return cmfProductzuzhuangstateMapper.updateCmfProductzuzhuangstate(cmfProductzuzhuangstate);
    }

    /**
     * 批量删除产品组装状态
     * 
     * @param ids 需要删除的产品组装状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfProductzuzhuangstateByIds(Integer[] ids)
    {
        return cmfProductzuzhuangstateMapper.deleteCmfProductzuzhuangstateByIds(ids);
    }

    /**
     * 删除产品组装状态信息
     * 
     * @param id 产品组装状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfProductzuzhuangstateById(Integer id)
    {
        return cmfProductzuzhuangstateMapper.deleteCmfProductzuzhuangstateById(id);
    }
}
