package com.vrcrm.customer.service;

import java.util.List;
import com.vrcrm.customer.domain.CmfCrmZhuangtai;

/**
 * 状态Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfCrmZhuangtaiService 
{
    /**
     * 查询状态
     * 
     * @param id 状态主键
     * @return 状态
     */
    public CmfCrmZhuangtai selectCmfCrmZhuangtaiById(Integer id);

    /**
     * 查询状态列表
     * 
     * @param cmfCrmZhuangtai 状态
     * @return 状态集合
     */
    public List<CmfCrmZhuangtai> selectCmfCrmZhuangtaiList(CmfCrmZhuangtai cmfCrmZhuangtai);

    /**
     * 新增状态
     * 
     * @param cmfCrmZhuangtai 状态
     * @return 结果
     */
    public int insertCmfCrmZhuangtai(CmfCrmZhuangtai cmfCrmZhuangtai);

    /**
     * 修改状态
     * 
     * @param cmfCrmZhuangtai 状态
     * @return 结果
     */
    public int updateCmfCrmZhuangtai(CmfCrmZhuangtai cmfCrmZhuangtai);

    /**
     * 批量删除状态
     * 
     * @param ids 需要删除的状态主键集合
     * @return 结果
     */
    public int deleteCmfCrmZhuangtaiByIds(Integer[] ids);

    /**
     * 删除状态信息
     * 
     * @param id 状态主键
     * @return 结果
     */
    public int deleteCmfCrmZhuangtaiById(Integer id);
}
