package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfOfficeproductoutMapper;
import com.vrcrm.political.domain.CmfOfficeproductout;
import com.vrcrm.political.service.ICmfOfficeproductoutService;

/**
 * 办公用品出库Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfOfficeproductoutServiceImpl implements ICmfOfficeproductoutService 
{
    @Autowired
    private CmfOfficeproductoutMapper cmfOfficeproductoutMapper;

    /**
     * 查询办公用品出库
     * 
     * @param id 办公用品出库主键
     * @return 办公用品出库
     */
    @Override
    public CmfOfficeproductout selectCmfOfficeproductoutById(Integer id)
    {
        return cmfOfficeproductoutMapper.selectCmfOfficeproductoutById(id);
    }

    /**
     * 查询办公用品出库列表
     * 
     * @param cmfOfficeproductout 办公用品出库
     * @return 办公用品出库
     */
    @Override
    public List<CmfOfficeproductout> selectCmfOfficeproductoutList(CmfOfficeproductout cmfOfficeproductout)
    {
        return cmfOfficeproductoutMapper.selectCmfOfficeproductoutList(cmfOfficeproductout);
    }

    /**
     * 新增办公用品出库
     * 
     * @param cmfOfficeproductout 办公用品出库
     * @return 结果
     */
    @Override
    public int insertCmfOfficeproductout(CmfOfficeproductout cmfOfficeproductout)
    {
        return cmfOfficeproductoutMapper.insertCmfOfficeproductout(cmfOfficeproductout);
    }

    /**
     * 修改办公用品出库
     * 
     * @param cmfOfficeproductout 办公用品出库
     * @return 结果
     */
    @Override
    public int updateCmfOfficeproductout(CmfOfficeproductout cmfOfficeproductout)
    {
        return cmfOfficeproductoutMapper.updateCmfOfficeproductout(cmfOfficeproductout);
    }

    /**
     * 批量删除办公用品出库
     * 
     * @param ids 需要删除的办公用品出库主键
     * @return 结果
     */
    @Override
    public int deleteCmfOfficeproductoutByIds(Integer[] ids)
    {
        return cmfOfficeproductoutMapper.deleteCmfOfficeproductoutByIds(ids);
    }

    /**
     * 删除办公用品出库信息
     * 
     * @param id 办公用品出库主键
     * @return 结果
     */
    @Override
    public int deleteCmfOfficeproductoutById(Integer id)
    {
        return cmfOfficeproductoutMapper.deleteCmfOfficeproductoutById(id);
    }
}
