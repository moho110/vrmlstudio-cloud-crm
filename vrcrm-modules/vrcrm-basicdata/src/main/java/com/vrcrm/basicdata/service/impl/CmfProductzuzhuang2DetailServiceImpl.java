package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfProductzuzhuang2DetailMapper;
import com.vrcrm.basicdata.domain.CmfProductzuzhuang2Detail;
import com.vrcrm.basicdata.service.ICmfProductzuzhuang2DetailService;

/**
 * 产品组装明细Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfProductzuzhuang2DetailServiceImpl implements ICmfProductzuzhuang2DetailService 
{
    @Autowired
    private CmfProductzuzhuang2DetailMapper cmfProductzuzhuang2DetailMapper;

    /**
     * 查询产品组装明细
     * 
     * @param id 产品组装明细主键
     * @return 产品组装明细
     */
    @Override
    public CmfProductzuzhuang2Detail selectCmfProductzuzhuang2DetailById(Integer id)
    {
        return cmfProductzuzhuang2DetailMapper.selectCmfProductzuzhuang2DetailById(id);
    }

    /**
     * 查询产品组装明细列表
     * 
     * @param cmfProductzuzhuang2Detail 产品组装明细
     * @return 产品组装明细
     */
    @Override
    public List<CmfProductzuzhuang2Detail> selectCmfProductzuzhuang2DetailList(CmfProductzuzhuang2Detail cmfProductzuzhuang2Detail)
    {
        return cmfProductzuzhuang2DetailMapper.selectCmfProductzuzhuang2DetailList(cmfProductzuzhuang2Detail);
    }

    /**
     * 新增产品组装明细
     * 
     * @param cmfProductzuzhuang2Detail 产品组装明细
     * @return 结果
     */
    @Override
    public int insertCmfProductzuzhuang2Detail(CmfProductzuzhuang2Detail cmfProductzuzhuang2Detail)
    {
        return cmfProductzuzhuang2DetailMapper.insertCmfProductzuzhuang2Detail(cmfProductzuzhuang2Detail);
    }

    /**
     * 修改产品组装明细
     * 
     * @param cmfProductzuzhuang2Detail 产品组装明细
     * @return 结果
     */
    @Override
    public int updateCmfProductzuzhuang2Detail(CmfProductzuzhuang2Detail cmfProductzuzhuang2Detail)
    {
        return cmfProductzuzhuang2DetailMapper.updateCmfProductzuzhuang2Detail(cmfProductzuzhuang2Detail);
    }

    /**
     * 批量删除产品组装明细
     * 
     * @param ids 需要删除的产品组装明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfProductzuzhuang2DetailByIds(Integer[] ids)
    {
        return cmfProductzuzhuang2DetailMapper.deleteCmfProductzuzhuang2DetailByIds(ids);
    }

    /**
     * 删除产品组装明细信息
     * 
     * @param id 产品组装明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfProductzuzhuang2DetailById(Integer id)
    {
        return cmfProductzuzhuang2DetailMapper.deleteCmfProductzuzhuang2DetailById(id);
    }
}
