package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfHrmsRewardPunishmentMapper;
import com.vrcrm.hr.domain.CmfHrmsRewardPunishment;
import com.vrcrm.hr.service.ICmfHrmsRewardPunishmentService;

/**
 * 人员奖惩Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfHrmsRewardPunishmentServiceImpl implements ICmfHrmsRewardPunishmentService 
{
    @Autowired
    private CmfHrmsRewardPunishmentMapper cmfHrmsRewardPunishmentMapper;

    /**
     * 查询人员奖惩
     * 
     * @param id 人员奖惩主键
     * @return 人员奖惩
     */
    @Override
    public CmfHrmsRewardPunishment selectCmfHrmsRewardPunishmentById(Integer id)
    {
        return cmfHrmsRewardPunishmentMapper.selectCmfHrmsRewardPunishmentById(id);
    }

    /**
     * 查询人员奖惩列表
     * 
     * @param cmfHrmsRewardPunishment 人员奖惩
     * @return 人员奖惩
     */
    @Override
    public List<CmfHrmsRewardPunishment> selectCmfHrmsRewardPunishmentList(CmfHrmsRewardPunishment cmfHrmsRewardPunishment)
    {
        return cmfHrmsRewardPunishmentMapper.selectCmfHrmsRewardPunishmentList(cmfHrmsRewardPunishment);
    }

    /**
     * 新增人员奖惩
     * 
     * @param cmfHrmsRewardPunishment 人员奖惩
     * @return 结果
     */
    @Override
    public int insertCmfHrmsRewardPunishment(CmfHrmsRewardPunishment cmfHrmsRewardPunishment)
    {
        return cmfHrmsRewardPunishmentMapper.insertCmfHrmsRewardPunishment(cmfHrmsRewardPunishment);
    }

    /**
     * 修改人员奖惩
     * 
     * @param cmfHrmsRewardPunishment 人员奖惩
     * @return 结果
     */
    @Override
    public int updateCmfHrmsRewardPunishment(CmfHrmsRewardPunishment cmfHrmsRewardPunishment)
    {
        return cmfHrmsRewardPunishmentMapper.updateCmfHrmsRewardPunishment(cmfHrmsRewardPunishment);
    }

    /**
     * 批量删除人员奖惩
     * 
     * @param ids 需要删除的人员奖惩主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsRewardPunishmentByIds(Integer[] ids)
    {
        return cmfHrmsRewardPunishmentMapper.deleteCmfHrmsRewardPunishmentByIds(ids);
    }

    /**
     * 删除人员奖惩信息
     * 
     * @param id 人员奖惩主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsRewardPunishmentById(Integer id)
    {
        return cmfHrmsRewardPunishmentMapper.deleteCmfHrmsRewardPunishmentById(id);
    }
}
