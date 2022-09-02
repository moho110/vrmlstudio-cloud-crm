package com.vrcrm.basicdata.mapper;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfProductzuzhuang2Detail;

/**
 * 产品组装明细Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfProductzuzhuang2DetailMapper 
{
    /**
     * 查询产品组装明细
     * 
     * @param id 产品组装明细主键
     * @return 产品组装明细
     */
    public CmfProductzuzhuang2Detail selectCmfProductzuzhuang2DetailById(Integer id);

    /**
     * 查询产品组装明细列表
     * 
     * @param cmfProductzuzhuang2Detail 产品组装明细
     * @return 产品组装明细集合
     */
    public List<CmfProductzuzhuang2Detail> selectCmfProductzuzhuang2DetailList(CmfProductzuzhuang2Detail cmfProductzuzhuang2Detail);

    /**
     * 新增产品组装明细
     * 
     * @param cmfProductzuzhuang2Detail 产品组装明细
     * @return 结果
     */
    public int insertCmfProductzuzhuang2Detail(CmfProductzuzhuang2Detail cmfProductzuzhuang2Detail);

    /**
     * 修改产品组装明细
     * 
     * @param cmfProductzuzhuang2Detail 产品组装明细
     * @return 结果
     */
    public int updateCmfProductzuzhuang2Detail(CmfProductzuzhuang2Detail cmfProductzuzhuang2Detail);

    /**
     * 删除产品组装明细
     * 
     * @param id 产品组装明细主键
     * @return 结果
     */
    public int deleteCmfProductzuzhuang2DetailById(Integer id);

    /**
     * 批量删除产品组装明细
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfProductzuzhuang2DetailByIds(Integer[] ids);
}
