package com.vrcrm.mytable.service;

import java.util.List;
import com.vrcrm.mytable.domain.CmfCrmMytableXssx;

/**
 * 显示属性Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfCrmMytableXssxService 
{
    /**
     * 查询显示属性
     * 
     * @param id 显示属性主键
     * @return 显示属性
     */
    public CmfCrmMytableXssx selectCmfCrmMytableXssxById(Integer id);

    /**
     * 查询显示属性列表
     * 
     * @param cmfCrmMytableXssx 显示属性
     * @return 显示属性集合
     */
    public List<CmfCrmMytableXssx> selectCmfCrmMytableXssxList(CmfCrmMytableXssx cmfCrmMytableXssx);

    /**
     * 新增显示属性
     * 
     * @param cmfCrmMytableXssx 显示属性
     * @return 结果
     */
    public int insertCmfCrmMytableXssx(CmfCrmMytableXssx cmfCrmMytableXssx);

    /**
     * 修改显示属性
     * 
     * @param cmfCrmMytableXssx 显示属性
     * @return 结果
     */
    public int updateCmfCrmMytableXssx(CmfCrmMytableXssx cmfCrmMytableXssx);

    /**
     * 批量删除显示属性
     * 
     * @param ids 需要删除的显示属性主键集合
     * @return 结果
     */
    public int deleteCmfCrmMytableXssxByIds(Integer[] ids);

    /**
     * 删除显示属性信息
     * 
     * @param id 显示属性主键
     * @return 结果
     */
    public int deleteCmfCrmMytableXssxById(Integer id);
}
