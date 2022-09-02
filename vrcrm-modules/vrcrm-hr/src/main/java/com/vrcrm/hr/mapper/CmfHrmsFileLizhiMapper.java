package com.vrcrm.hr.mapper;

import java.util.List;
import com.vrcrm.hr.domain.CmfHrmsFileLizhi;

/**
 * 人员离职Mapper接口
 * 
 * @author VRer
 * @date 2022-04-18
 */
public interface CmfHrmsFileLizhiMapper 
{
    /**
     * 查询人员离职
     * 
     * @param id 人员离职主键
     * @return 人员离职
     */
    public CmfHrmsFileLizhi selectCmfHrmsFileLizhiById(Integer id);

    /**
     * 查询人员离职列表
     * 
     * @param cmfHrmsFileLizhi 人员离职
     * @return 人员离职集合
     */
    public List<CmfHrmsFileLizhi> selectCmfHrmsFileLizhiList(CmfHrmsFileLizhi cmfHrmsFileLizhi);

    /**
     * 新增人员离职
     * 
     * @param cmfHrmsFileLizhi 人员离职
     * @return 结果
     */
    public int insertCmfHrmsFileLizhi(CmfHrmsFileLizhi cmfHrmsFileLizhi);

    /**
     * 修改人员离职
     * 
     * @param cmfHrmsFileLizhi 人员离职
     * @return 结果
     */
    public int updateCmfHrmsFileLizhi(CmfHrmsFileLizhi cmfHrmsFileLizhi);

    /**
     * 删除人员离职
     * 
     * @param id 人员离职主键
     * @return 结果
     */
    public int deleteCmfHrmsFileLizhiById(Integer id);

    /**
     * 批量删除人员离职
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCmfHrmsFileLizhiByIds(Integer[] ids);
}
