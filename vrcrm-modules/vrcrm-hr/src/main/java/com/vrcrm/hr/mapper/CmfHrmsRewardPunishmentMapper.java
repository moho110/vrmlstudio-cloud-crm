package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfHrmsRewardPunishment;

/**
 * 人员奖惩Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfHrmsRewardPunishmentMapper 
{
    /**
     * 查询人员奖惩
     * 
     * @param id 人员奖惩主键
     * @return 人员奖惩
     */
    public CmfHrmsRewardPunishment selectCmfHrmsRewardPunishmentById(Integer id);

    /**
     * 查询人员奖惩列表
     * 
     * @param cmfHrmsRewardPunishment 人员奖惩
     * @return 人员奖惩集合
     */
    public List<CmfHrmsRewardPunishment> selectCmfHrmsRewardPunishmentList(CmfHrmsRewardPunishment cmfHrmsRewardPunishment);

    /**
     * 新增人员奖惩
     * 
     * @param cmfHrmsRewardPunishment 人员奖惩
     * @return 结果
     */
    public int insertCmfHrmsRewardPunishment(CmfHrmsRewardPunishment cmfHrmsRewardPunishment);

    /**
     * 修改人员奖惩
     * 
     * @param cmfHrmsRewardPunishment 人员奖惩
     * @return 结果
     */
    public int updateCmfHrmsRewardPunishment(CmfHrmsRewardPunishment cmfHrmsRewardPunishment);

    /**
     * 删除人员奖惩
     * 
     * @param id 人员奖惩主键
     * @return 结果
     */
    public int deleteCmfHrmsRewardPunishmentById(Integer id);

    /**
     * 批量删除人员奖惩
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfHrmsRewardPunishmentByIds(Integer[] ids);
}
