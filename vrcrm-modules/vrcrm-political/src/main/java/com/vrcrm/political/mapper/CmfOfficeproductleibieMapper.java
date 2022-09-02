package com.vrcrm.political.mapper;

import java.util.List;
import com.vrcrm.political.domain.CmfOfficeproductleibie;

/**
 * 办公用品类别Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfOfficeproductleibieMapper 
{
    /**
     * 查询办公用品类别
     * 
     * @param id 办公用品类别主键
     * @return 办公用品类别
     */
    public CmfOfficeproductleibie selectCmfOfficeproductleibieById(Integer id);

    /**
     * 查询办公用品类别列表
     * 
     * @param cmfOfficeproductleibie 办公用品类别
     * @return 办公用品类别集合
     */
    public List<CmfOfficeproductleibie> selectCmfOfficeproductleibieList(CmfOfficeproductleibie cmfOfficeproductleibie);

    /**
     * 新增办公用品类别
     * 
     * @param cmfOfficeproductleibie 办公用品类别
     * @return 结果
     */
    public int insertCmfOfficeproductleibie(CmfOfficeproductleibie cmfOfficeproductleibie);

    /**
     * 修改办公用品类别
     * 
     * @param cmfOfficeproductleibie 办公用品类别
     * @return 结果
     */
    public int updateCmfOfficeproductleibie(CmfOfficeproductleibie cmfOfficeproductleibie);

    /**
     * 删除办公用品类别
     * 
     * @param id 办公用品类别主键
     * @return 结果
     */
    public int deleteCmfOfficeproductleibieById(Integer id);

    /**
     * 批量删除办公用品类别
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfOfficeproductleibieByIds(Integer[] ids);
}
