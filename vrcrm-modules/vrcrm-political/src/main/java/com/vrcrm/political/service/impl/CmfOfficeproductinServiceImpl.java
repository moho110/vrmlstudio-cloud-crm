package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfOfficeproductinMapper;
import com.vrcrm.political.domain.CmfOfficeproductin;
import com.vrcrm.political.service.ICmfOfficeproductinService;

/**
 * 办公用品入库Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfOfficeproductinServiceImpl implements ICmfOfficeproductinService 
{
    @Autowired
    private CmfOfficeproductinMapper cmfOfficeproductinMapper;

    /**
     * 查询办公用品入库
     * 
     * @param id 办公用品入库主键
     * @return 办公用品入库
     */
    @Override
    public CmfOfficeproductin selectCmfOfficeproductinById(Integer id)
    {
        return cmfOfficeproductinMapper.selectCmfOfficeproductinById(id);
    }

    /**
     * 查询办公用品入库列表
     * 
     * @param cmfOfficeproductin 办公用品入库
     * @return 办公用品入库
     */
    @Override
    public List<CmfOfficeproductin> selectCmfOfficeproductinList(CmfOfficeproductin cmfOfficeproductin)
    {
        return cmfOfficeproductinMapper.selectCmfOfficeproductinList(cmfOfficeproductin);
    }

    /**
     * 新增办公用品入库
     * 
     * @param cmfOfficeproductin 办公用品入库
     * @return 结果
     */
    @Override
    public int insertCmfOfficeproductin(CmfOfficeproductin cmfOfficeproductin)
    {
        return cmfOfficeproductinMapper.insertCmfOfficeproductin(cmfOfficeproductin);
    }

    /**
     * 修改办公用品入库
     * 
     * @param cmfOfficeproductin 办公用品入库
     * @return 结果
     */
    @Override
    public int updateCmfOfficeproductin(CmfOfficeproductin cmfOfficeproductin)
    {
        return cmfOfficeproductinMapper.updateCmfOfficeproductin(cmfOfficeproductin);
    }

    /**
     * 批量删除办公用品入库
     * 
     * @param ids 需要删除的办公用品入库主键
     * @return 结果
     */
    @Override
    public int deleteCmfOfficeproductinByIds(Integer[] ids)
    {
        return cmfOfficeproductinMapper.deleteCmfOfficeproductinByIds(ids);
    }

    /**
     * 删除办公用品入库信息
     * 
     * @param id 办公用品入库主键
     * @return 结果
     */
    @Override
    public int deleteCmfOfficeproductinById(Integer id)
    {
        return cmfOfficeproductinMapper.deleteCmfOfficeproductinById(id);
    }
}
