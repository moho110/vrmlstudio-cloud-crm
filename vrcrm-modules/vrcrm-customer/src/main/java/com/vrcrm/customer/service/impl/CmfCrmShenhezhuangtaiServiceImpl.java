package com.vrcrm.customer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.customer.mapper.CmfCrmShenhezhuangtaiMapper;
import com.vrcrm.customer.domain.CmfCrmShenhezhuangtai;
import com.vrcrm.customer.service.ICmfCrmShenhezhuangtaiService;

/**
 * 审核状态Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfCrmShenhezhuangtaiServiceImpl implements ICmfCrmShenhezhuangtaiService 
{
    @Autowired
    private CmfCrmShenhezhuangtaiMapper cmfCrmShenhezhuangtaiMapper;

    /**
     * 查询审核状态
     * 
     * @param id 审核状态主键
     * @return 审核状态
     */
    @Override
    public CmfCrmShenhezhuangtai selectCmfCrmShenhezhuangtaiById(Integer id)
    {
        return cmfCrmShenhezhuangtaiMapper.selectCmfCrmShenhezhuangtaiById(id);
    }

    /**
     * 查询审核状态列表
     * 
     * @param cmfCrmShenhezhuangtai 审核状态
     * @return 审核状态
     */
    @Override
    public List<CmfCrmShenhezhuangtai> selectCmfCrmShenhezhuangtaiList(CmfCrmShenhezhuangtai cmfCrmShenhezhuangtai)
    {
        return cmfCrmShenhezhuangtaiMapper.selectCmfCrmShenhezhuangtaiList(cmfCrmShenhezhuangtai);
    }

    /**
     * 新增审核状态
     * 
     * @param cmfCrmShenhezhuangtai 审核状态
     * @return 结果
     */
    @Override
    public int insertCmfCrmShenhezhuangtai(CmfCrmShenhezhuangtai cmfCrmShenhezhuangtai)
    {
        return cmfCrmShenhezhuangtaiMapper.insertCmfCrmShenhezhuangtai(cmfCrmShenhezhuangtai);
    }

    /**
     * 修改审核状态
     * 
     * @param cmfCrmShenhezhuangtai 审核状态
     * @return 结果
     */
    @Override
    public int updateCmfCrmShenhezhuangtai(CmfCrmShenhezhuangtai cmfCrmShenhezhuangtai)
    {
        return cmfCrmShenhezhuangtaiMapper.updateCmfCrmShenhezhuangtai(cmfCrmShenhezhuangtai);
    }

    /**
     * 批量删除审核状态
     * 
     * @param ids 需要删除的审核状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmShenhezhuangtaiByIds(Integer[] ids)
    {
        return cmfCrmShenhezhuangtaiMapper.deleteCmfCrmShenhezhuangtaiByIds(ids);
    }

    /**
     * 删除审核状态信息
     * 
     * @param id 审核状态主键
     * @return 结果
     */
    @Override
    public int deleteCmfCrmShenhezhuangtaiById(Integer id)
    {
        return cmfCrmShenhezhuangtaiMapper.deleteCmfCrmShenhezhuangtaiById(id);
    }
}
