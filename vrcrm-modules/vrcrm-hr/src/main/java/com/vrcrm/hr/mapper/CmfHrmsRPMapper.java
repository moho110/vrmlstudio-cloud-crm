package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfHrmsRP;

/**
 * 是否奖惩Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfHrmsRPMapper 
{
    /**
     * 查询是否奖惩
     * 
     * @param id 是否奖惩主键
     * @return 是否奖惩
     */
    public CmfHrmsRP selectCmfHrmsRPById(Integer id);

    /**
     * 查询是否奖惩列表
     * 
     * @param cmfHrmsRP 是否奖惩
     * @return 是否奖惩集合
     */
    public List<CmfHrmsRP> selectCmfHrmsRPList(CmfHrmsRP cmfHrmsRP);

    /**
     * 新增是否奖惩
     * 
     * @param cmfHrmsRP 是否奖惩
     * @return 结果
     */
    public int insertCmfHrmsRP(CmfHrmsRP cmfHrmsRP);

    /**
     * 修改是否奖惩
     * 
     * @param cmfHrmsRP 是否奖惩
     * @return 结果
     */
    public int updateCmfHrmsRP(CmfHrmsRP cmfHrmsRP);

    /**
     * 删除是否奖惩
     * 
     * @param id 是否奖惩主键
     * @return 结果
     */
    public int deleteCmfHrmsRPById(Integer id);

    /**
     * 批量删除是否奖惩
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfHrmsRPByIds(Integer[] ids);
}
