package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfOfficeproductcangkuMapper;
import com.vrcrm.political.domain.CmfOfficeproductcangku;
import com.vrcrm.political.service.ICmfOfficeproductcangkuService;

/**
 * 办公用品仓库Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfOfficeproductcangkuServiceImpl implements ICmfOfficeproductcangkuService 
{
    @Autowired
    private CmfOfficeproductcangkuMapper cmfOfficeproductcangkuMapper;

    /**
     * 查询办公用品仓库
     * 
     * @param id 办公用品仓库主键
     * @return 办公用品仓库
     */
    @Override
    public CmfOfficeproductcangku selectCmfOfficeproductcangkuById(Integer id)
    {
        return cmfOfficeproductcangkuMapper.selectCmfOfficeproductcangkuById(id);
    }

    /**
     * 查询办公用品仓库列表
     * 
     * @param cmfOfficeproductcangku 办公用品仓库
     * @return 办公用品仓库
     */
    @Override
    public List<CmfOfficeproductcangku> selectCmfOfficeproductcangkuList(CmfOfficeproductcangku cmfOfficeproductcangku)
    {
        return cmfOfficeproductcangkuMapper.selectCmfOfficeproductcangkuList(cmfOfficeproductcangku);
    }

    /**
     * 新增办公用品仓库
     * 
     * @param cmfOfficeproductcangku 办公用品仓库
     * @return 结果
     */
    @Override
    public int insertCmfOfficeproductcangku(CmfOfficeproductcangku cmfOfficeproductcangku)
    {
        return cmfOfficeproductcangkuMapper.insertCmfOfficeproductcangku(cmfOfficeproductcangku);
    }

    /**
     * 修改办公用品仓库
     * 
     * @param cmfOfficeproductcangku 办公用品仓库
     * @return 结果
     */
    @Override
    public int updateCmfOfficeproductcangku(CmfOfficeproductcangku cmfOfficeproductcangku)
    {
        return cmfOfficeproductcangkuMapper.updateCmfOfficeproductcangku(cmfOfficeproductcangku);
    }

    /**
     * 批量删除办公用品仓库
     * 
     * @param ids 需要删除的办公用品仓库主键
     * @return 结果
     */
    @Override
    public int deleteCmfOfficeproductcangkuByIds(Integer[] ids)
    {
        return cmfOfficeproductcangkuMapper.deleteCmfOfficeproductcangkuByIds(ids);
    }

    /**
     * 删除办公用品仓库信息
     * 
     * @param id 办公用品仓库主键
     * @return 结果
     */
    @Override
    public int deleteCmfOfficeproductcangkuById(Integer id)
    {
        return cmfOfficeproductcangkuMapper.deleteCmfOfficeproductcangkuById(id);
    }
}
