package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfOfficeguihuanstateMapper;
import com.vrcrm.political.domain.CmfOfficeguihuanstate;
import com.vrcrm.political.service.ICmfOfficeguihuanstateService;

/**
 * 办公用品归还状态Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfOfficeguihuanstateServiceImpl implements ICmfOfficeguihuanstateService 
{
    @Autowired
    private CmfOfficeguihuanstateMapper cmfOfficeguihuanstateMapper;

    /**
     * 查询办公用品归还状态
     * 
     * @param id 办公用品归还状态主键
     * @return 办公用品归还状态
     */
    @Override
    public CmfOfficeguihuanstate selectCmfOfficeguihuanstateById(Integer id)
    {
        return cmfOfficeguihuanstateMapper.selectCmfOfficeguihuanstateById(id);
    }

    /**
     * 查询办公用品归还状态列表
     * 
     * @param cmfOfficeguihuanstate 办公用品归还状态
     * @return 办公用品归还状态
     */
    @Override
    public List<CmfOfficeguihuanstate> selectCmfOfficeguihuanstateList(CmfOfficeguihuanstate cmfOfficeguihuanstate)
    {
        return cmfOfficeguihuanstateMapper.selectCmfOfficeguihuanstateList(cmfOfficeguihuanstate);
    }

    /**
     * 新增办公用品归还状态
     * 
     * @param cmfOfficeguihuanstate 办公用品归还状态
     * @return 结果
     */
    @Override
    public int insertCmfOfficeguihuanstate(CmfOfficeguihuanstate cmfOfficeguihuanstate)
    {
        return cmfOfficeguihuanstateMapper.insertCmfOfficeguihuanstate(cmfOfficeguihuanstate);
    }

    /**
     * 修改办公用品归还状态
     * 
     * @param cmfOfficeguihuanstate 办公用品归还状态
     * @return 结果
     */
    @Override
    public int updateCmfOfficeguihuanstate(CmfOfficeguihuanstate cmfOfficeguihuanstate)
    {
        return cmfOfficeguihuanstateMapper.updateCmfOfficeguihuanstate(cmfOfficeguihuanstate);
    }

    /**
     * 批量删除办公用品归还状态
     * 
     * @param ids 需要删除的办公用品归还状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfOfficeguihuanstateByIds(Integer[] ids)
    {
        return cmfOfficeguihuanstateMapper.deleteCmfOfficeguihuanstateByIds(ids);
    }

    /**
     * 删除办公用品归还状态信息
     * 
     * @param id 办公用品归还状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfOfficeguihuanstateById(Integer id)
    {
        return cmfOfficeguihuanstateMapper.deleteCmfOfficeguihuanstateById(id);
    }
}
