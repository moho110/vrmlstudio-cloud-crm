package com.vrcrm.sales.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.sales.mapper.CmfFahuodanDetailMapper;
import com.vrcrm.sales.domain.CmfFahuodanDetail;
import com.vrcrm.sales.service.ICmfFahuodanDetailService;

/**
 * 发货单明细Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfFahuodanDetailServiceImpl implements ICmfFahuodanDetailService 
{
    @Autowired
    private CmfFahuodanDetailMapper cmfFahuodanDetailMapper;

    /**
     * 查询发货单明细
     * 
     * @param id 发货单明细主键
     * @return 发货单明细
     */
    @Override
    public CmfFahuodanDetail selectCmfFahuodanDetailById(Integer id)
    {
        return cmfFahuodanDetailMapper.selectCmfFahuodanDetailById(id);
    }

    /**
     * 查询发货单明细列表
     * 
     * @param cmfFahuodanDetail 发货单明细
     * @return 发货单明细
     */
    @Override
    public List<CmfFahuodanDetail> selectCmfFahuodanDetailList(CmfFahuodanDetail cmfFahuodanDetail)
    {
        return cmfFahuodanDetailMapper.selectCmfFahuodanDetailList(cmfFahuodanDetail);
    }

    /**
     * 新增发货单明细
     * 
     * @param cmfFahuodanDetail 发货单明细
     * @return 结果
     */
    @Override
    public int insertCmfFahuodanDetail(CmfFahuodanDetail cmfFahuodanDetail)
    {
        return cmfFahuodanDetailMapper.insertCmfFahuodanDetail(cmfFahuodanDetail);
    }

    /**
     * 修改发货单明细
     * 
     * @param cmfFahuodanDetail 发货单明细
     * @return 结果
     */
    @Override
    public int updateCmfFahuodanDetail(CmfFahuodanDetail cmfFahuodanDetail)
    {
        return cmfFahuodanDetailMapper.updateCmfFahuodanDetail(cmfFahuodanDetail);
    }

    /**
     * 批量删除发货单明细
     * 
     * @param ids 需要删除的发货单明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfFahuodanDetailByIds(Integer[] ids)
    {
        return cmfFahuodanDetailMapper.deleteCmfFahuodanDetailByIds(ids);
    }

    /**
     * 删除发货单明细信息
     * 
     * @param id 发货单明细主键
     * @return 结果
     */
    @Override
    public int deleteCmfFahuodanDetailById(Integer id)
    {
        return cmfFahuodanDetailMapper.deleteCmfFahuodanDetailById(id);
    }
}
