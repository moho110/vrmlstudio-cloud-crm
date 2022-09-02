package com.vrcrm.political.mapper;

import java.util.List;
import com.vrcrm.political.domain.CmfOfficeproductbaofei;

/**
 * 办公用品报废Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfOfficeproductbaofeiMapper 
{
    /**
     * 查询办公用品报废
     * 
     * @param id 办公用品报废主键
     * @return 办公用品报废
     */
    public CmfOfficeproductbaofei selectCmfOfficeproductbaofeiById(Integer id);

    /**
     * 查询办公用品报废列表
     * 
     * @param cmfOfficeproductbaofei 办公用品报废
     * @return 办公用品报废集合
     */
    public List<CmfOfficeproductbaofei> selectCmfOfficeproductbaofeiList(CmfOfficeproductbaofei cmfOfficeproductbaofei);

    /**
     * 新增办公用品报废
     * 
     * @param cmfOfficeproductbaofei 办公用品报废
     * @return 结果
     */
    public int insertCmfOfficeproductbaofei(CmfOfficeproductbaofei cmfOfficeproductbaofei);

    /**
     * 修改办公用品报废
     * 
     * @param cmfOfficeproductbaofei 办公用品报废
     * @return 结果
     */
    public int updateCmfOfficeproductbaofei(CmfOfficeproductbaofei cmfOfficeproductbaofei);

    /**
     * 删除办公用品报废
     * 
     * @param id 办公用品报废主键
     * @return 结果
     */
    public int deleteCmfOfficeproductbaofeiById(Integer id);

    /**
     * 批量删除办公用品报废
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfOfficeproductbaofeiByIds(Integer[] ids);
}
