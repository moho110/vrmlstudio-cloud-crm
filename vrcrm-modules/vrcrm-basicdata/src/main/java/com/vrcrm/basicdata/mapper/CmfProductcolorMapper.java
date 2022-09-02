package com.vrcrm.basicdata.mapper;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfProductcolor;

/**
 * 产品颜色Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfProductcolorMapper 
{
    /**
     * 查询产品颜色
     * 
     * @param id 产品颜色主键
     * @return 产品颜色
     */
    public CmfProductcolor selectCmfProductcolorById(Integer id);

    /**
     * 查询产品颜色列表
     * 
     * @param cmfProductcolor 产品颜色
     * @return 产品颜色集合
     */
    public List<CmfProductcolor> selectCmfProductcolorList(CmfProductcolor cmfProductcolor);

    /**
     * 新增产品颜色
     * 
     * @param cmfProductcolor 产品颜色
     * @return 结果
     */
    public int insertCmfProductcolor(CmfProductcolor cmfProductcolor);

    /**
     * 修改产品颜色
     * 
     * @param cmfProductcolor 产品颜色
     * @return 结果
     */
    public int updateCmfProductcolor(CmfProductcolor cmfProductcolor);

    /**
     * 删除产品颜色
     * 
     * @param id 产品颜色主键
     * @return 结果
     */
    public int deleteCmfProductcolorById(Integer id);

    /**
     * 批量删除产品颜色
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfProductcolorByIds(Integer[] ids);
}
