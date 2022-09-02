package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfHrmsRPName;

/**
 * 奖惩名称Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfHrmsRPNameMapper 
{
    /**
     * 查询奖惩名称
     * 
     * @param id 奖惩名称主键
     * @return 奖惩名称
     */
    public CmfHrmsRPName selectCmfHrmsRPNameById(Integer id);

    /**
     * 查询奖惩名称列表
     * 
     * @param cmfHrmsRPName 奖惩名称
     * @return 奖惩名称集合
     */
    public List<CmfHrmsRPName> selectCmfHrmsRPNameList(CmfHrmsRPName cmfHrmsRPName);

    /**
     * 新增奖惩名称
     * 
     * @param cmfHrmsRPName 奖惩名称
     * @return 结果
     */
    public int insertCmfHrmsRPName(CmfHrmsRPName cmfHrmsRPName);

    /**
     * 修改奖惩名称
     * 
     * @param cmfHrmsRPName 奖惩名称
     * @return 结果
     */
    public int updateCmfHrmsRPName(CmfHrmsRPName cmfHrmsRPName);

    /**
     * 删除奖惩名称
     * 
     * @param id 奖惩名称主键
     * @return 结果
     */
    public int deleteCmfHrmsRPNameById(Integer id);

    /**
     * 批量删除奖惩名称
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfHrmsRPNameByIds(Integer[] ids);
}
