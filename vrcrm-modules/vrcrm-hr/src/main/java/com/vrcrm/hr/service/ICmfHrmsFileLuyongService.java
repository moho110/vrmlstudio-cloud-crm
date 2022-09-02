package com.vrcrm.hr.service;

import java.util.List;
import com.vrcrm.hr.domain.CmfHrmsFileLuyong;

/**
 * 人员录用Service接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface ICmfHrmsFileLuyongService 
{
    /**
     * 查询人员录用
     * 
     * @param id 人员录用主键
     * @return 人员录用
     */
    public CmfHrmsFileLuyong selectCmfHrmsFileLuyongById(Integer id);

    /**
     * 查询人员录用列表
     * 
     * @param cmfHrmsFileLuyong 人员录用
     * @return 人员录用集合
     */
    public List<CmfHrmsFileLuyong> selectCmfHrmsFileLuyongList(CmfHrmsFileLuyong cmfHrmsFileLuyong);

    /**
     * 新增人员录用
     * 
     * @param cmfHrmsFileLuyong 人员录用
     * @return 结果
     */
    public int insertCmfHrmsFileLuyong(CmfHrmsFileLuyong cmfHrmsFileLuyong);

    /**
     * 修改人员录用
     * 
     * @param cmfHrmsFileLuyong 人员录用
     * @return 结果
     */
    public int updateCmfHrmsFileLuyong(CmfHrmsFileLuyong cmfHrmsFileLuyong);

    /**
     * 批量删除人员录用
     * 
     * @param ids 需要删除的人员录用主键集合
     * @return 结果
     */
    public int deleteCmfHrmsFileLuyongByIds(Integer[] ids);

    /**
     * 删除人员录用信息
     * 
     * @param id 人员录用主键
     * @return 结果
     */
    public int deleteCmfHrmsFileLuyongById(Integer id);
}
