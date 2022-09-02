package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfOfficeproductbaofeiMapper;
import com.vrcrm.political.domain.CmfOfficeproductbaofei;
import com.vrcrm.political.service.ICmfOfficeproductbaofeiService;

/**
 * 办公用品报废Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfOfficeproductbaofeiServiceImpl implements ICmfOfficeproductbaofeiService 
{
    @Autowired
    private CmfOfficeproductbaofeiMapper cmfOfficeproductbaofeiMapper;

    /**
     * 查询办公用品报废
     * 
     * @param id 办公用品报废主键
     * @return 办公用品报废
     */
    @Override
    public CmfOfficeproductbaofei selectCmfOfficeproductbaofeiById(Integer id)
    {
        return cmfOfficeproductbaofeiMapper.selectCmfOfficeproductbaofeiById(id);
    }

    /**
     * 查询办公用品报废列表
     * 
     * @param cmfOfficeproductbaofei 办公用品报废
     * @return 办公用品报废
     */
    @Override
    public List<CmfOfficeproductbaofei> selectCmfOfficeproductbaofeiList(CmfOfficeproductbaofei cmfOfficeproductbaofei)
    {
        return cmfOfficeproductbaofeiMapper.selectCmfOfficeproductbaofeiList(cmfOfficeproductbaofei);
    }

    /**
     * 新增办公用品报废
     * 
     * @param cmfOfficeproductbaofei 办公用品报废
     * @return 结果
     */
    @Override
    public int insertCmfOfficeproductbaofei(CmfOfficeproductbaofei cmfOfficeproductbaofei)
    {
        return cmfOfficeproductbaofeiMapper.insertCmfOfficeproductbaofei(cmfOfficeproductbaofei);
    }

    /**
     * 修改办公用品报废
     * 
     * @param cmfOfficeproductbaofei 办公用品报废
     * @return 结果
     */
    @Override
    public int updateCmfOfficeproductbaofei(CmfOfficeproductbaofei cmfOfficeproductbaofei)
    {
        return cmfOfficeproductbaofeiMapper.updateCmfOfficeproductbaofei(cmfOfficeproductbaofei);
    }

    /**
     * 批量删除办公用品报废
     * 
     * @param ids 需要删除的办公用品报废主键
     * @return 结果
     */
    @Override
    public int deleteCmfOfficeproductbaofeiByIds(Integer[] ids)
    {
        return cmfOfficeproductbaofeiMapper.deleteCmfOfficeproductbaofeiByIds(ids);
    }

    /**
     * 删除办公用品报废信息
     * 
     * @param id 办公用品报废主键
     * @return 结果
     */
    @Override
    public int deleteCmfOfficeproductbaofeiById(Integer id)
    {
        return cmfOfficeproductbaofeiMapper.deleteCmfOfficeproductbaofeiById(id);
    }
}
