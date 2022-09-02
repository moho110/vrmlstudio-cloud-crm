package com.vrcrm.customer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.customer.mapper.CmfCustomerleverMapper;
import com.vrcrm.customer.domain.CmfCustomerlever;
import com.vrcrm.customer.service.ICmfCustomerleverService;

/**
 * 客户等级Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfCustomerleverServiceImpl implements ICmfCustomerleverService 
{
    @Autowired
    private CmfCustomerleverMapper cmfCustomerleverMapper;

    /**
     * 查询客户等级
     * 
     * @param id 客户等级主键
     * @return 客户等级
     */
    @Override
    public CmfCustomerlever selectCmfCustomerleverById(Integer id)
    {
        return cmfCustomerleverMapper.selectCmfCustomerleverById(id);
    }

    /**
     * 查询客户等级列表
     * 
     * @param cmfCustomerlever 客户等级
     * @return 客户等级
     */
    @Override
    public List<CmfCustomerlever> selectCmfCustomerleverList(CmfCustomerlever cmfCustomerlever)
    {
        return cmfCustomerleverMapper.selectCmfCustomerleverList(cmfCustomerlever);
    }

    /**
     * 新增客户等级
     * 
     * @param cmfCustomerlever 客户等级
     * @return 结果
     */
    @Override
    public int insertCmfCustomerlever(CmfCustomerlever cmfCustomerlever)
    {
        return cmfCustomerleverMapper.insertCmfCustomerlever(cmfCustomerlever);
    }

    /**
     * 修改客户等级
     * 
     * @param cmfCustomerlever 客户等级
     * @return 结果
     */
    @Override
    public int updateCmfCustomerlever(CmfCustomerlever cmfCustomerlever)
    {
        return cmfCustomerleverMapper.updateCmfCustomerlever(cmfCustomerlever);
    }

    /**
     * 批量删除客户等级
     * 
     * @param ids 需要删除的客户等级主键
     * @return 结果
     */
    @Override
    public int deleteCmfCustomerleverByIds(Integer[] ids)
    {
        return cmfCustomerleverMapper.deleteCmfCustomerleverByIds(ids);
    }

    /**
     * 删除客户等级信息
     * 
     * @param id 客户等级主键
     * @return 结果
     */
    @Override
    public int deleteCmfCustomerleverById(Integer id)
    {
        return cmfCustomerleverMapper.deleteCmfCustomerleverById(id);
    }
}
