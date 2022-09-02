package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfOfficeproductleibieMapper;
import com.vrcrm.political.domain.CmfOfficeproductleibie;
import com.vrcrm.political.service.ICmfOfficeproductleibieService;

/**
 * 办公用品类别Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfOfficeproductleibieServiceImpl implements ICmfOfficeproductleibieService 
{
    @Autowired
    private CmfOfficeproductleibieMapper cmfOfficeproductleibieMapper;

    /**
     * 查询办公用品类别
     * 
     * @param id 办公用品类别主键
     * @return 办公用品类别
     */
    @Override
    public CmfOfficeproductleibie selectCmfOfficeproductleibieById(Integer id)
    {
        return cmfOfficeproductleibieMapper.selectCmfOfficeproductleibieById(id);
    }

    /**
     * 查询办公用品类别列表
     * 
     * @param cmfOfficeproductleibie 办公用品类别
     * @return 办公用品类别
     */
    @Override
    public List<CmfOfficeproductleibie> selectCmfOfficeproductleibieList(CmfOfficeproductleibie cmfOfficeproductleibie)
    {
        return cmfOfficeproductleibieMapper.selectCmfOfficeproductleibieList(cmfOfficeproductleibie);
    }

    /**
     * 新增办公用品类别
     * 
     * @param cmfOfficeproductleibie 办公用品类别
     * @return 结果
     */
    @Override
    public int insertCmfOfficeproductleibie(CmfOfficeproductleibie cmfOfficeproductleibie)
    {
        return cmfOfficeproductleibieMapper.insertCmfOfficeproductleibie(cmfOfficeproductleibie);
    }

    /**
     * 修改办公用品类别
     * 
     * @param cmfOfficeproductleibie 办公用品类别
     * @return 结果
     */
    @Override
    public int updateCmfOfficeproductleibie(CmfOfficeproductleibie cmfOfficeproductleibie)
    {
        return cmfOfficeproductleibieMapper.updateCmfOfficeproductleibie(cmfOfficeproductleibie);
    }

    /**
     * 批量删除办公用品类别
     * 
     * @param ids 需要删除的办公用品类别主键
     * @return 结果
     */
    @Override
    public int deleteCmfOfficeproductleibieByIds(Integer[] ids)
    {
        return cmfOfficeproductleibieMapper.deleteCmfOfficeproductleibieByIds(ids);
    }

    /**
     * 删除办公用品类别信息
     * 
     * @param id 办公用品类别主键
     * @return 结果
     */
    @Override
    public int deleteCmfOfficeproductleibieById(Integer id)
    {
        return cmfOfficeproductleibieMapper.deleteCmfOfficeproductleibieById(id);
    }
}
