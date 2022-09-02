package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfOfficeproducttiaokuMapper;
import com.vrcrm.political.domain.CmfOfficeproducttiaoku;
import com.vrcrm.political.service.ICmfOfficeproducttiaokuService;

/**
 * 办公用品调库Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfOfficeproducttiaokuServiceImpl implements ICmfOfficeproducttiaokuService 
{
    @Autowired
    private CmfOfficeproducttiaokuMapper cmfOfficeproducttiaokuMapper;

    /**
     * 查询办公用品调库
     * 
     * @param id 办公用品调库主键
     * @return 办公用品调库
     */
    @Override
    public CmfOfficeproducttiaoku selectCmfOfficeproducttiaokuById(Integer id)
    {
        return cmfOfficeproducttiaokuMapper.selectCmfOfficeproducttiaokuById(id);
    }

    /**
     * 查询办公用品调库列表
     * 
     * @param cmfOfficeproducttiaoku 办公用品调库
     * @return 办公用品调库
     */
    @Override
    public List<CmfOfficeproducttiaoku> selectCmfOfficeproducttiaokuList(CmfOfficeproducttiaoku cmfOfficeproducttiaoku)
    {
        return cmfOfficeproducttiaokuMapper.selectCmfOfficeproducttiaokuList(cmfOfficeproducttiaoku);
    }

    /**
     * 新增办公用品调库
     * 
     * @param cmfOfficeproducttiaoku 办公用品调库
     * @return 结果
     */
    @Override
    public int insertCmfOfficeproducttiaoku(CmfOfficeproducttiaoku cmfOfficeproducttiaoku)
    {
        return cmfOfficeproducttiaokuMapper.insertCmfOfficeproducttiaoku(cmfOfficeproducttiaoku);
    }

    /**
     * 修改办公用品调库
     * 
     * @param cmfOfficeproducttiaoku 办公用品调库
     * @return 结果
     */
    @Override
    public int updateCmfOfficeproducttiaoku(CmfOfficeproducttiaoku cmfOfficeproducttiaoku)
    {
        return cmfOfficeproducttiaokuMapper.updateCmfOfficeproducttiaoku(cmfOfficeproducttiaoku);
    }

    /**
     * 批量删除办公用品调库
     * 
     * @param ids 需要删除的办公用品调库主键
     * @return 结果
     */
    @Override
    public int deleteCmfOfficeproducttiaokuByIds(Integer[] ids)
    {
        return cmfOfficeproducttiaokuMapper.deleteCmfOfficeproducttiaokuByIds(ids);
    }

    /**
     * 删除办公用品调库信息
     * 
     * @param id 办公用品调库主键
     * @return 结果
     */
    @Override
    public int deleteCmfOfficeproducttiaokuById(Integer id)
    {
        return cmfOfficeproducttiaokuMapper.deleteCmfOfficeproducttiaokuById(id);
    }
}
