package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfOfficeproductMapper;
import com.vrcrm.political.domain.CmfOfficeproduct;
import com.vrcrm.political.service.ICmfOfficeproductService;

/**
 * 办公用品列表Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfOfficeproductServiceImpl implements ICmfOfficeproductService 
{
    @Autowired
    private CmfOfficeproductMapper cmfOfficeproductMapper;

    /**
     * 查询办公用品列表
     * 
     * @param id 办公用品列表主键
     * @return 办公用品列表
     */
    @Override
    public CmfOfficeproduct selectCmfOfficeproductById(Integer id)
    {
        return cmfOfficeproductMapper.selectCmfOfficeproductById(id);
    }

    /**
     * 查询办公用品列表列表
     * 
     * @param cmfOfficeproduct 办公用品列表
     * @return 办公用品列表
     */
    @Override
    public List<CmfOfficeproduct> selectCmfOfficeproductList(CmfOfficeproduct cmfOfficeproduct)
    {
        return cmfOfficeproductMapper.selectCmfOfficeproductList(cmfOfficeproduct);
    }

    /**
     * 新增办公用品列表
     * 
     * @param cmfOfficeproduct 办公用品列表
     * @return 结果
     */
    @Override
    public int insertCmfOfficeproduct(CmfOfficeproduct cmfOfficeproduct)
    {
        return cmfOfficeproductMapper.insertCmfOfficeproduct(cmfOfficeproduct);
    }

    /**
     * 修改办公用品列表
     * 
     * @param cmfOfficeproduct 办公用品列表
     * @return 结果
     */
    @Override
    public int updateCmfOfficeproduct(CmfOfficeproduct cmfOfficeproduct)
    {
        return cmfOfficeproductMapper.updateCmfOfficeproduct(cmfOfficeproduct);
    }

    /**
     * 批量删除办公用品列表
     * 
     * @param ids 需要删除的办公用品列表主键
     * @return 结果
     */
    @Override
    public int deleteCmfOfficeproductByIds(Integer[] ids)
    {
        return cmfOfficeproductMapper.deleteCmfOfficeproductByIds(ids);
    }

    /**
     * 删除办公用品列表信息
     * 
     * @param id 办公用品列表主键
     * @return 结果
     */
    @Override
    public int deleteCmfOfficeproductById(Integer id)
    {
        return cmfOfficeproductMapper.deleteCmfOfficeproductById(id);
    }
}
