package com.vrcrm.customer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.customer.mapper.CmfCrmZhuangtaiMapper;
import com.vrcrm.customer.domain.CmfCrmZhuangtai;
import com.vrcrm.customer.service.ICmfCrmZhuangtaiService;

/**
 * 状态Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfCrmZhuangtaiServiceImpl implements ICmfCrmZhuangtaiService 
{
    @Autowired
    private CmfCrmZhuangtaiMapper cmfCrmZhuangtaiMapper;

    /**
     * 查询状态
     * 
     * @param id 状态主键
     * @return 状态
     */
    @Override
    public CmfCrmZhuangtai selectCmfCrmZhuangtaiById(Integer id)
    {
        return cmfCrmZhuangtaiMapper.selectCmfCrmZhuangtaiById(id);
    }

    /**
     * 查询状态列表
     * 
     * @param cmfCrmZhuangtai 状态
     * @return 状态
     */
    @Override
    public List<CmfCrmZhuangtai> selectCmfCrmZhuangtaiList(CmfCrmZhuangtai cmfCrmZhuangtai)
    {
        return cmfCrmZhuangtaiMapper.selectCmfCrmZhuangtaiList(cmfCrmZhuangtai);
    }

    /**
     * 新增状态
     * 
     * @param cmfCrmZhuangtai 状态
     * @return 结果
     */
    @Override
    public int insertCmfCrmZhuangtai(CmfCrmZhuangtai cmfCrmZhuangtai)
    {
        return cmfCrmZhuangtaiMapper.insertCmfCrmZhuangtai(cmfCrmZhuangtai);
    }

    /**
     * 修改状态
     * 
     * @param cmfCrmZhuangtai 状态
     * @return 结果
     */
    @Override
    public int updateCmfCrmZhuangtai(CmfCrmZhuangtai cmfCrmZhuangtai)
    {
        return cmfCrmZhuangtaiMapper.updateCmfCrmZhuangtai(cmfCrmZhuangtai);
    }

    /**
     * 批量删除状态
     * 
     * @param ids 需要删除的状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmZhuangtaiByIds(Integer[] ids)
    {
        return cmfCrmZhuangtaiMapper.deleteCmfCrmZhuangtaiByIds(ids);
    }

    /**
     * 删除状态信息
     * 
     * @param id 状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmZhuangtaiById(Integer id)
    {
        return cmfCrmZhuangtaiMapper.deleteCmfCrmZhuangtaiById(id);
    }
}
