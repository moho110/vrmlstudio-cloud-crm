package com.vrcrm.basicdata.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfProductzuzhuangDetailMapper;
import com.vrcrm.basicdata.domain.CmfProductzuzhuangDetail;
import com.vrcrm.basicdata.service.ICmfProductzuzhuangDetailService;

/**
 * 产品组装明细Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfProductzuzhuangDetailServiceImpl implements ICmfProductzuzhuangDetailService 
{
    @Autowired
    private CmfProductzuzhuangDetailMapper cmfProductzuzhuangDetailMapper;

    /**
     * 查询产品组装明细
     * 
     * @param id 产品组装明细主键
     * @return 产品组装明细
     */
    @Override
    public CmfProductzuzhuangDetail selectCmfProductzuzhuangDetailById(Integer id)
    {
        return cmfProductzuzhuangDetailMapper.selectCmfProductzuzhuangDetailById(id);
    }

    /**
     * 查询产品组装明细列表
     * 
     * @param cmfProductzuzhuangDetail 产品组装明细
     * @return 产品组装明细
     */
    @Override
    public List<CmfProductzuzhuangDetail> selectCmfProductzuzhuangDetailList(CmfProductzuzhuangDetail cmfProductzuzhuangDetail)
    {
        return cmfProductzuzhuangDetailMapper.selectCmfProductzuzhuangDetailList(cmfProductzuzhuangDetail);
    }

    /**
     * 新增产品组装明细
     * 
     * @param cmfProductzuzhuangDetail 产品组装明细
     * @return 结果
     */
    @Override
    public int insertCmfProductzuzhuangDetail(CmfProductzuzhuangDetail cmfProductzuzhuangDetail)
    {
        return cmfProductzuzhuangDetailMapper.insertCmfProductzuzhuangDetail(cmfProductzuzhuangDetail);
    }

    /**
     * 修改产品组装明细
     * 
     * @param cmfProductzuzhuangDetail 产品组装明细
     * @return 结果
     */
    @Override
    public int updateCmfProductzuzhuangDetail(CmfProductzuzhuangDetail cmfProductzuzhuangDetail)
    {
        return cmfProductzuzhuangDetailMapper.updateCmfProductzuzhuangDetail(cmfProductzuzhuangDetail);
    }

    /**
     * 批量删除产品组装明细
     * 
     * @param ids 需要删除的产品组装明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfProductzuzhuangDetailByIds(Integer[] ids)
    {
        return cmfProductzuzhuangDetailMapper.deleteCmfProductzuzhuangDetailByIds(ids);
    }

    /**
     * 删除产品组装明细信息
     * 
     * @param id 产品组装明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfProductzuzhuangDetailById(Integer id)
    {
        return cmfProductzuzhuangDetailMapper.deleteCmfProductzuzhuangDetailById(id);
    }
}
