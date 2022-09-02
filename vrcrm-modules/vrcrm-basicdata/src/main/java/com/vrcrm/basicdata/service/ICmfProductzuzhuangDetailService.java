package com.vrcrm.basicdata.service;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfProductzuzhuangDetail;

/**
 * 产品组装明细Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfProductzuzhuangDetailService 
{
    /**
     * 查询产品组装明细
     * 
     * @param id 产品组装明细主键
     * @return 产品组装明细
     */
    public CmfProductzuzhuangDetail selectCmfProductzuzhuangDetailById(Integer id);

    /**
     * 查询产品组装明细列表
     * 
     * @param cmfProductzuzhuangDetail 产品组装明细
     * @return 产品组装明细集合
     */
    public List<CmfProductzuzhuangDetail> selectCmfProductzuzhuangDetailList(CmfProductzuzhuangDetail cmfProductzuzhuangDetail);

    /**
     * 新增产品组装明细
     * 
     * @param cmfProductzuzhuangDetail 产品组装明细
     * @return 结果
     */
    public int insertCmfProductzuzhuangDetail(CmfProductzuzhuangDetail cmfProductzuzhuangDetail);

    /**
     * 修改产品组装明细
     * 
     * @param cmfProductzuzhuangDetail 产品组装明细
     * @return 结果
     */
    public int updateCmfProductzuzhuangDetail(CmfProductzuzhuangDetail cmfProductzuzhuangDetail);

    /**
     * 批量删除产品组装明细
     * 
     * @param ids 需要删除的产品组装明细主键集合
     * @return 结果
     */
    public int deleteCmfProductzuzhuangDetailByIds(Integer[] ids);

    /**
     * 删除产品组装明细信息
     * 
     * @param id 产品组装明细主键
     * @return 结果
     */
    public int deleteCmfProductzuzhuangDetailById(Integer id);
}
