package com.vrcrm.buy.service;

import java.util.List;
import com.vrcrm.buy.domain.CmfKaipiaostate;

/**
 * 开票状态Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfKaipiaostateService 
{
    /**
     * 查询开票状态
     * 
     * @param id 开票状态主键
     * @return 开票状态
     */
    public CmfKaipiaostate selectCmfKaipiaostateById(Integer id);

    /**
     * 查询开票状态列表
     * 
     * @param cmfKaipiaostate 开票状态
     * @return 开票状态集合
     */
    public List<CmfKaipiaostate> selectCmfKaipiaostateList(CmfKaipiaostate cmfKaipiaostate);

    /**
     * 新增开票状态
     * 
     * @param cmfKaipiaostate 开票状态
     * @return 结果
     */
    public int insertCmfKaipiaostate(CmfKaipiaostate cmfKaipiaostate);

    /**
     * 修改开票状态
     * 
     * @param cmfKaipiaostate 开票状态
     * @return 结果
     */
    public int updateCmfKaipiaostate(CmfKaipiaostate cmfKaipiaostate);

    /**
     * 批量删除开票状态
     * 
     * @param ids 需要删除的开票状态主键集合
     * @return 结果
     */
    public int deleteCmfKaipiaostateByIds(Integer[] ids);

    /**
     * 删除开票状态信息
     * 
     * @param id 开票状态主键
     * @return 结果
     */
    public int deleteCmfKaipiaostateById(Integer id);
}
