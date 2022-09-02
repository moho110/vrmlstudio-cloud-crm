package com.vrcrm.store.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.store.mapper.CmfStockoutmainMapper;
import com.vrcrm.store.domain.CmfStockoutmain;
import com.vrcrm.store.service.ICmfStockoutmainService;

/**
 * 仓库出库Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfStockoutmainServiceImpl implements ICmfStockoutmainService 
{
    @Autowired
    private CmfStockoutmainMapper cmfStockoutmainMapper;

    /**
     * 查询仓库出库
     * 
     * @param id 仓库出库主键
     * @return 仓库出库
     */
    @Override
    public CmfStockoutmain selectCmfStockoutmainById(Integer id)
    {
        return cmfStockoutmainMapper.selectCmfStockoutmainById(id);
    }

    /**
     * 查询仓库出库列表
     * 
     * @param cmfStockoutmain 仓库出库
     * @return 仓库出库
     */
    @Override
    public List<CmfStockoutmain> selectCmfStockoutmainList(CmfStockoutmain cmfStockoutmain)
    {
        return cmfStockoutmainMapper.selectCmfStockoutmainList(cmfStockoutmain);
    }

    /**
     * 新增仓库出库
     * 
     * @param cmfStockoutmain 仓库出库
     * @return 结果
     */
    @Override
    public int insertCmfStockoutmain(CmfStockoutmain cmfStockoutmain)
    {
        return cmfStockoutmainMapper.insertCmfStockoutmain(cmfStockoutmain);
    }

    /**
     * 修改仓库出库
     * 
     * @param cmfStockoutmain 仓库出库
     * @return 结果
     */
    @Override
    public int updateCmfStockoutmain(CmfStockoutmain cmfStockoutmain)
    {
        return cmfStockoutmainMapper.updateCmfStockoutmain(cmfStockoutmain);
    }

    /**
     * 批量删除仓库出库
     * 
     * @param ids 需要删除的仓库出库主键
     * @return 结果
     */
    @Override
    public int deleteCmfStockoutmainByIds(Integer[] ids)
    {
        return cmfStockoutmainMapper.deleteCmfStockoutmainByIds(ids);
    }

    /**
     * 删除仓库出库信息
     * 
     * @param id 仓库出库主键
     * @return 结果
     */
    @Override
    public int deleteCmfStockoutmainById(Integer id)
    {
        return cmfStockoutmainMapper.deleteCmfStockoutmainById(id);
    }
}
