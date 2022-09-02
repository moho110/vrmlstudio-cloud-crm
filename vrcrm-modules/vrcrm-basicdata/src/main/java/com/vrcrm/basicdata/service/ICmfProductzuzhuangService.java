package com.vrcrm.basicdata.service;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfProductzuzhuang;

/**
 * 产品组装Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfProductzuzhuangService 
{
    /**
     * 查询产品组装
     * 
     * @param id 产品组装主键
     * @return 产品组装
     */
    public CmfProductzuzhuang selectCmfProductzuzhuangById(Integer id);

    /**
     * 查询产品组装列表
     * 
     * @param cmfProductzuzhuang 产品组装
     * @return 产品组装集合
     */
    public List<CmfProductzuzhuang> selectCmfProductzuzhuangList(CmfProductzuzhuang cmfProductzuzhuang);

    /**
     * 新增产品组装
     * 
     * @param cmfProductzuzhuang 产品组装
     * @return 结果
     */
    public int insertCmfProductzuzhuang(CmfProductzuzhuang cmfProductzuzhuang);

    /**
     * 修改产品组装
     * 
     * @param cmfProductzuzhuang 产品组装
     * @return 结果
     */
    public int updateCmfProductzuzhuang(CmfProductzuzhuang cmfProductzuzhuang);

    /**
     * 批量删除产品组装
     * 
     * @param ids 需要删除的产品组装主键集合
     * @return 结果
     */
    public int deleteCmfProductzuzhuangByIds(Integer[] ids);

    /**
     * 删除产品组装信息
     * 
     * @param id 产品组装主键
     * @return 结果
     */
    public int deleteCmfProductzuzhuangById(Integer id);
}
