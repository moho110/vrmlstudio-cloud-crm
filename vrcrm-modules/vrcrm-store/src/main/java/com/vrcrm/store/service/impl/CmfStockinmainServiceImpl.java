package com.vrcrm.store.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.store.mapper.CmfStockinmainMapper;
import com.vrcrm.store.domain.CmfStockinmain;
import com.vrcrm.store.service.ICmfStockinmainService;

/**
 * 仓库管理入库Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfStockinmainServiceImpl implements ICmfStockinmainService 
{
    @Autowired
    private CmfStockinmainMapper cmfStockinmainMapper;

    /**
     * 查询仓库管理入库
     * 
     * @param id 仓库管理入库主键
     * @return 仓库管理入库
     */
    @Override
    public CmfStockinmain selectCmfStockinmainById(Integer id)
    {
        return cmfStockinmainMapper.selectCmfStockinmainById(id);
    }

    /**
     * 查询仓库管理入库列表
     * 
     * @param cmfStockinmain 仓库管理入库
     * @return 仓库管理入库
     */
    @Override
    public List<CmfStockinmain> selectCmfStockinmainList(CmfStockinmain cmfStockinmain)
    {
        return cmfStockinmainMapper.selectCmfStockinmainList(cmfStockinmain);
    }

    /**
     * 新增仓库管理入库
     * 
     * @param cmfStockinmain 仓库管理入库
     * @return 结果
     */
    @Override
    public int insertCmfStockinmain(CmfStockinmain cmfStockinmain)
    {
        return cmfStockinmainMapper.insertCmfStockinmain(cmfStockinmain);
    }

    /**
     * 修改仓库管理入库
     * 
     * @param cmfStockinmain 仓库管理入库
     * @return 结果
     */
    @Override
    public int updateCmfStockinmain(CmfStockinmain cmfStockinmain)
    {
        return cmfStockinmainMapper.updateCmfStockinmain(cmfStockinmain);
    }

    /**
     * 批量删除仓库管理入库
     * 
     * @param ids 需要删除的仓库管理入库主键
     * @return 结果
     */
    @Override
    public int deleteCmfStockinmainByIds(Integer[] ids)
    {
        return cmfStockinmainMapper.deleteCmfStockinmainByIds(ids);
    }

    /**
     * 删除仓库管理入库信息
     * 
     * @param id 仓库管理入库主键
     * @return 结果
     */
    @Override
    public int deleteCmfStockinmainById(Integer id)
    {
        return cmfStockinmainMapper.deleteCmfStockinmainById(id);
    }
}
