package com.vrcrm.finance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.finance.mapper.CmfAccessbankMapper;
import com.vrcrm.finance.domain.CmfAccessbank;
import com.vrcrm.finance.service.ICmfAccessbankService;

/**
 * 帐号操作Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-13
 */
@Service
public class CmfAccessbankServiceImpl implements ICmfAccessbankService 
{
    @Autowired
    private CmfAccessbankMapper cmfAccessbankMapper;

    /**
     * 查询帐号操作
     * 
     * @param id 帐号操作主键
     * @return 帐号操作
     */
    @Override
    public CmfAccessbank selectCmfAccessbankById(Integer id)
    {
        return cmfAccessbankMapper.selectCmfAccessbankById(id);
    }

    /**
     * 查询帐号操作列表
     * 
     * @param cmfAccessbank 帐号操作
     * @return 帐号操作
     */
    @Override
    public List<CmfAccessbank> selectCmfAccessbankList(CmfAccessbank cmfAccessbank)
    {
        return cmfAccessbankMapper.selectCmfAccessbankList(cmfAccessbank);
    }

    /**
     * 新增帐号操作
     * 
     * @param cmfAccessbank 帐号操作
     * @return 结果
     */
    @Override
    public int insertCmfAccessbank(CmfAccessbank cmfAccessbank)
    {
        return cmfAccessbankMapper.insertCmfAccessbank(cmfAccessbank);
    }

    /**
     * 修改帐号操作
     * 
     * @param cmfAccessbank 帐号操作
     * @return 结果
     */
    @Override
    public int updateCmfAccessbank(CmfAccessbank cmfAccessbank)
    {
        return cmfAccessbankMapper.updateCmfAccessbank(cmfAccessbank);
    }

    /**
     * 批量删除帐号操作
     * 
     * @param ids 需要删除的帐号操作主键
     * @return 结果
     */
    @Override
    public int deleteCmfAccessbankByIds(Integer[] ids)
    {
        return cmfAccessbankMapper.deleteCmfAccessbankByIds(ids);
    }

    /**
     * 删除帐号操作信息
     * 
     * @param id 帐号操作主键
     * @return 结果
     */
    @Override
    public int deleteCmfAccessbankById(Integer id)
    {
        return cmfAccessbankMapper.deleteCmfAccessbankById(id);
    }
}
