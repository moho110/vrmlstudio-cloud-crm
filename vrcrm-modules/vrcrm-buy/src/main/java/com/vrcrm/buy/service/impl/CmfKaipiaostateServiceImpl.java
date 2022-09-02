package com.vrcrm.buy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.buy.mapper.CmfKaipiaostateMapper;
import com.vrcrm.buy.domain.CmfKaipiaostate;
import com.vrcrm.buy.service.ICmfKaipiaostateService;

/**
 * 开票状态Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfKaipiaostateServiceImpl implements ICmfKaipiaostateService 
{
    @Autowired
    private CmfKaipiaostateMapper cmfKaipiaostateMapper;

    /**
     * 查询开票状态
     * 
     * @param id 开票状态主键
     * @return 开票状态
     */
    @Override
    public CmfKaipiaostate selectCmfKaipiaostateById(Integer id)
    {
        return cmfKaipiaostateMapper.selectCmfKaipiaostateById(id);
    }

    /**
     * 查询开票状态列表
     * 
     * @param cmfKaipiaostate 开票状态
     * @return 开票状态
     */
    @Override
    public List<CmfKaipiaostate> selectCmfKaipiaostateList(CmfKaipiaostate cmfKaipiaostate)
    {
        return cmfKaipiaostateMapper.selectCmfKaipiaostateList(cmfKaipiaostate);
    }

    /**
     * 新增开票状态
     * 
     * @param cmfKaipiaostate 开票状态
     * @return 结果
     */
    @Override
    public int insertCmfKaipiaostate(CmfKaipiaostate cmfKaipiaostate)
    {
        return cmfKaipiaostateMapper.insertCmfKaipiaostate(cmfKaipiaostate);
    }

    /**
     * 修改开票状态
     * 
     * @param cmfKaipiaostate 开票状态
     * @return 结果
     */
    @Override
    public int updateCmfKaipiaostate(CmfKaipiaostate cmfKaipiaostate)
    {
        return cmfKaipiaostateMapper.updateCmfKaipiaostate(cmfKaipiaostate);
    }

    /**
     * 批量删除开票状态
     * 
     * @param ids 需要删除的开票状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfKaipiaostateByIds(Integer[] ids)
    {
        return cmfKaipiaostateMapper.deleteCmfKaipiaostateByIds(ids);
    }

    /**
     * 删除开票状态信息
     * 
     * @param id 开票状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfKaipiaostateById(Integer id)
    {
        return cmfKaipiaostateMapper.deleteCmfKaipiaostateById(id);
    }
}
