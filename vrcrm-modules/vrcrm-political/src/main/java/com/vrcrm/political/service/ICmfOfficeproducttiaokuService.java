package com.vrcrm.political.service;

import java.util.List;
import com.vrcrm.political.domain.CmfOfficeproducttiaoku;

/**
 * 办公用品调库Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfOfficeproducttiaokuService 
{
    /**
     * 查询办公用品调库
     * 
     * @param id 办公用品调库主键
     * @return 办公用品调库
     */
    public CmfOfficeproducttiaoku selectCmfOfficeproducttiaokuById(Integer id);

    /**
     * 查询办公用品调库列表
     * 
     * @param cmfOfficeproducttiaoku 办公用品调库
     * @return 办公用品调库集合
     */
    public List<CmfOfficeproducttiaoku> selectCmfOfficeproducttiaokuList(CmfOfficeproducttiaoku cmfOfficeproducttiaoku);

    /**
     * 新增办公用品调库
     * 
     * @param cmfOfficeproducttiaoku 办公用品调库
     * @return 结果
     */
    public int insertCmfOfficeproducttiaoku(CmfOfficeproducttiaoku cmfOfficeproducttiaoku);

    /**
     * 修改办公用品调库
     * 
     * @param cmfOfficeproducttiaoku 办公用品调库
     * @return 结果
     */
    public int updateCmfOfficeproducttiaoku(CmfOfficeproducttiaoku cmfOfficeproducttiaoku);

    /**
     * 批量删除办公用品调库
     * 
     * @param ids 需要删除的办公用品调库主键集合
     * @return 结果
     */
    public int deleteCmfOfficeproducttiaokuByIds(Integer[] ids);

    /**
     * 删除办公用品调库信息
     * 
     * @param id 办公用品调库主键
     * @return 结果
     */
    public int deleteCmfOfficeproducttiaokuById(Integer id);
}
