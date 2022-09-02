package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfHrmsFileFuzhi;

/**
 * 人员复职Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfHrmsFileFuzhiMapper 
{
    /**
     * 查询人员复职
     * 
     * @param id 人员复职主键
     * @return 人员复职
     */
    public CmfHrmsFileFuzhi selectCmfHrmsFileFuzhiById(Integer id);

    /**
     * 查询人员复职列表
     * 
     * @param cmfHrmsFileFuzhi 人员复职
     * @return 人员复职集合
     */
    public List<CmfHrmsFileFuzhi> selectCmfHrmsFileFuzhiList(CmfHrmsFileFuzhi cmfHrmsFileFuzhi);

    /**
     * 新增人员复职
     * 
     * @param cmfHrmsFileFuzhi 人员复职
     * @return 结果
     */
    public int insertCmfHrmsFileFuzhi(CmfHrmsFileFuzhi cmfHrmsFileFuzhi);

    /**
     * 修改人员复职
     * 
     * @param cmfHrmsFileFuzhi 人员复职
     * @return 结果
     */
    public int updateCmfHrmsFileFuzhi(CmfHrmsFileFuzhi cmfHrmsFileFuzhi);

    /**
     * 删除人员复职
     * 
     * @param id 人员复职主键
     * @return 结果
     */
    public int deleteCmfHrmsFileFuzhiById(Integer id);

    /**
     * 批量删除人员复职
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfHrmsFileFuzhiByIds(Integer[] ids);
}
