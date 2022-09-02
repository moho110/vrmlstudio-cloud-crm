package com.vrcrm.customer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.customer.mapper.CmfCompeteproductMapper;
import com.vrcrm.customer.domain.CmfCompeteproduct;
import com.vrcrm.customer.service.ICmfCompeteproductService;

/**
 * 竞争对手Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfCompeteproductServiceImpl implements ICmfCompeteproductService 
{
    @Autowired
    private CmfCompeteproductMapper cmfCompeteproductMapper;

    /**
     * 查询竞争对手
     * 
     * @param id 竞争对手主键
     * @return 竞争对手
     */
    @Override
    public CmfCompeteproduct selectCmfCompeteproductById(Integer id)
    {
        return cmfCompeteproductMapper.selectCmfCompeteproductById(id);
    }

    /**
     * 查询竞争对手列表
     * 
     * @param cmfCompeteproduct 竞争对手
     * @return 竞争对手
     */
    @Override
    public List<CmfCompeteproduct> selectCmfCompeteproductList(CmfCompeteproduct cmfCompeteproduct)
    {
        return cmfCompeteproductMapper.selectCmfCompeteproductList(cmfCompeteproduct);
    }

    /**
     * 新增竞争对手
     * 
     * @param cmfCompeteproduct 竞争对手
     * @return 结果
     */
    @Override
    public int insertCmfCompeteproduct(CmfCompeteproduct cmfCompeteproduct)
    {
        return cmfCompeteproductMapper.insertCmfCompeteproduct(cmfCompeteproduct);
    }

    /**
     * 修改竞争对手
     * 
     * @param cmfCompeteproduct 竞争对手
     * @return 结果
     */
    @Override
    public int updateCmfCompeteproduct(CmfCompeteproduct cmfCompeteproduct)
    {
        return cmfCompeteproductMapper.updateCmfCompeteproduct(cmfCompeteproduct);
    }

    /**
     * 批量删除竞争对手
     * 
     * @param ids 需要删除的竞争对手主键
     * @return 结果
     */
    @Override
    public int deleteCmfCompeteproductByIds(Integer[] ids)
    {
        return cmfCompeteproductMapper.deleteCmfCompeteproductByIds(ids);
    }

    /**
     * 删除竞争对手信息
     * 
     * @param id 竞争对手主键
     * @return 结果
     */
    @Override
    public int deleteCmfCompeteproductById(Integer id)
    {
        return cmfCompeteproductMapper.deleteCmfCompeteproductById(id);
    }
}
