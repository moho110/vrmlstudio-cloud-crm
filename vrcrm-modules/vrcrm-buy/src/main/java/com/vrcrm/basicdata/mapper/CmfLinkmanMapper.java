package com.vrcrm.basicdata.mapper;

import java.util.List;
import com.vrcrm.basicdata.domain.CmfLinkman;

/**
 * 联系人Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfLinkmanMapper 
{
    /**
     * 查询联系人
     * 
     * @param id 联系人主键
     * @return 联系人
     */
    public CmfLinkman selectCmfLinkmanById(Integer id);

    /**
     * 查询联系人列表
     * 
     * @param cmfLinkman 联系人
     * @return 联系人集合
     */
    public List<CmfLinkman> selectCmfLinkmanList(CmfLinkman cmfLinkman);

    /**
     * 新增联系人
     * 
     * @param cmfLinkman 联系人
     * @return 结果
     */
    public int insertCmfLinkman(CmfLinkman cmfLinkman);

    /**
     * 修改联系人
     * 
     * @param cmfLinkman 联系人
     * @return 结果
     */
    public int updateCmfLinkman(CmfLinkman cmfLinkman);

    /**
     * 删除联系人
     * 
     * @param id 联系人主键
     * @return 结果
     */
    public int deleteCmfLinkmanById(Integer id);

    /**
     * 批量删除联系人
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfLinkmanByIds(Integer[] ids);
}
