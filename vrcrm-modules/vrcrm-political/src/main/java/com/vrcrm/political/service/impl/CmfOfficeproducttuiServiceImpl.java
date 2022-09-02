package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfOfficeproducttuiMapper;
import com.vrcrm.political.domain.CmfOfficeproducttui;
import com.vrcrm.political.service.ICmfOfficeproducttuiService;

/**
 * 办公用品归还Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfOfficeproducttuiServiceImpl implements ICmfOfficeproducttuiService 
{
    @Autowired
    private CmfOfficeproducttuiMapper cmfOfficeproducttuiMapper;

    /**
     * 查询办公用品归还
     * 
     * @param id 办公用品归还主键
     * @return 办公用品归还
     */
    @Override
    public CmfOfficeproducttui selectCmfOfficeproducttuiById(Integer id)
    {
        return cmfOfficeproducttuiMapper.selectCmfOfficeproducttuiById(id);
    }

    /**
     * 查询办公用品归还列表
     * 
     * @param cmfOfficeproducttui 办公用品归还
     * @return 办公用品归还
     */
    @Override
    public List<CmfOfficeproducttui> selectCmfOfficeproducttuiList(CmfOfficeproducttui cmfOfficeproducttui)
    {
        return cmfOfficeproducttuiMapper.selectCmfOfficeproducttuiList(cmfOfficeproducttui);
    }

    /**
     * 新增办公用品归还
     * 
     * @param cmfOfficeproducttui 办公用品归还
     * @return 结果
     */
    @Override
    public int insertCmfOfficeproducttui(CmfOfficeproducttui cmfOfficeproducttui)
    {
        return cmfOfficeproducttuiMapper.insertCmfOfficeproducttui(cmfOfficeproducttui);
    }

    /**
     * 修改办公用品归还
     * 
     * @param cmfOfficeproducttui 办公用品归还
     * @return 结果
     */
    @Override
    public int updateCmfOfficeproducttui(CmfOfficeproducttui cmfOfficeproducttui)
    {
        return cmfOfficeproducttuiMapper.updateCmfOfficeproducttui(cmfOfficeproducttui);
    }

    /**
     * 批量删除办公用品归还
     * 
     * @param ids 需要删除的办公用品归还主键
     * @return 结果
     */
    @Override
    public int deleteCmfOfficeproducttuiByIds(Integer[] ids)
    {
        return cmfOfficeproducttuiMapper.deleteCmfOfficeproducttuiByIds(ids);
    }

    /**
     * 删除办公用品归还信息
     * 
     * @param id 办公用品归还主键
     * @return 结果
     */
    @Override
    public int deleteCmfOfficeproducttuiById(Integer id)
    {
        return cmfOfficeproducttuiMapper.deleteCmfOfficeproducttuiById(id);
    }
}
