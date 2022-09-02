package com.vrcrm.store.mapper;

import java.util.List;
import com.vrcrm.store.domain.CmfStockoutmainDetailColor;

/**
 * 仓库出库明细颜色Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfStockoutmainDetailColorMapper 
{
    /**
     * 查询仓库出库明细颜色
     * 
     * @param id 仓库出库明细颜色主键
     * @return 仓库出库明细颜色
     */
    public CmfStockoutmainDetailColor selectCmfStockoutmainDetailColorById(Integer id);

    /**
     * 查询仓库出库明细颜色列表
     * 
     * @param cmfStockoutmainDetailColor 仓库出库明细颜色
     * @return 仓库出库明细颜色集合
     */
    public List<CmfStockoutmainDetailColor> selectCmfStockoutmainDetailColorList(CmfStockoutmainDetailColor cmfStockoutmainDetailColor);

    /**
     * 新增仓库出库明细颜色
     * 
     * @param cmfStockoutmainDetailColor 仓库出库明细颜色
     * @return 结果
     */
    public int insertCmfStockoutmainDetailColor(CmfStockoutmainDetailColor cmfStockoutmainDetailColor);

    /**
     * 修改仓库出库明细颜色
     * 
     * @param cmfStockoutmainDetailColor 仓库出库明细颜色
     * @return 结果
     */
    public int updateCmfStockoutmainDetailColor(CmfStockoutmainDetailColor cmfStockoutmainDetailColor);

    /**
     * 删除仓库出库明细颜色
     * 
     * @param id 仓库出库明细颜色主键
     * @return 结果
     */
    public int deleteCmfStockoutmainDetailColorById(Integer id);

    /**
     * 批量删除仓库出库明细颜色
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfStockoutmainDetailColorByIds(Integer[] ids);
}
