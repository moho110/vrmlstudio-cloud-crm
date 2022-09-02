package com.vrcrm.political.service;

import java.util.List;
import com.vrcrm.political.domain.CmfOfficeproductout;

/**
 * 办公用品出库Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfOfficeproductoutService 
{
    /**
     * 查询办公用品出库
     * 
     * @param id 办公用品出库主键
     * @return 办公用品出库
     */
    public CmfOfficeproductout selectCmfOfficeproductoutById(Integer id);

    /**
     * 查询办公用品出库列表
     * 
     * @param cmfOfficeproductout 办公用品出库
     * @return 办公用品出库集合
     */
    public List<CmfOfficeproductout> selectCmfOfficeproductoutList(CmfOfficeproductout cmfOfficeproductout);

    /**
     * 新增办公用品出库
     * 
     * @param cmfOfficeproductout 办公用品出库
     * @return 结果
     */
    public int insertCmfOfficeproductout(CmfOfficeproductout cmfOfficeproductout);

    /**
     * 修改办公用品出库
     * 
     * @param cmfOfficeproductout 办公用品出库
     * @return 结果
     */
    public int updateCmfOfficeproductout(CmfOfficeproductout cmfOfficeproductout);

    /**
     * 批量删除办公用品出库
     * 
     * @param ids 需要删除的办公用品出库主键集合
     * @return 结果
     */
    public int deleteCmfOfficeproductoutByIds(Integer[] ids);

    /**
     * 删除办公用品出库信息
     * 
     * @param id 办公用品出库主键
     * @return 结果
     */
    public int deleteCmfOfficeproductoutById(Integer id);
}
