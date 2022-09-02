package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfHrmsRPStatus;

/**
 * 奖惩状态Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfHrmsRPStatusMapper 
{
    /**
     * 查询奖惩状态
     * 
     * @param id 奖惩状态主键
     * @return 奖惩状态
     */
    public CmfHrmsRPStatus selectCmfHrmsRPStatusById(Integer id);

    /**
     * 查询奖惩状态列表
     * 
     * @param cmfHrmsRPStatus 奖惩状态
     * @return 奖惩状态集合
     */
    public List<CmfHrmsRPStatus> selectCmfHrmsRPStatusList(CmfHrmsRPStatus cmfHrmsRPStatus);

    /**
     * 新增奖惩状态
     * 
     * @param cmfHrmsRPStatus 奖惩状态
     * @return 结果
     */
    public int insertCmfHrmsRPStatus(CmfHrmsRPStatus cmfHrmsRPStatus);

    /**
     * 修改奖惩状态
     * 
     * @param cmfHrmsRPStatus 奖惩状态
     * @return 结果
     */
    public int updateCmfHrmsRPStatus(CmfHrmsRPStatus cmfHrmsRPStatus);

    /**
     * 删除奖惩状态
     * 
     * @param id 奖惩状态主键
     * @return 结果
     */
    public int deleteCmfHrmsRPStatusById(Integer id);

    /**
     * 批量删除奖惩状态
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfHrmsRPStatusByIds(Integer[] ids);
}
