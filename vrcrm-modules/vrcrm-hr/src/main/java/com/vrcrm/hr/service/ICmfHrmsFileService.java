package com.vrcrm.hr.service;

import java.util.List;
import com.vrcrm.hr.domain.CmfHrmsFile;

/**
 * 人事档案Service接口
 * 
 * @author VRer
 * @date 2022-04-15
 */
public interface ICmfHrmsFileService 
{
    /**
     * 查询人事档案
     * 
     * @param id 人事档案主键
     * @return 人事档案
     */
    public CmfHrmsFile selectCmfHrmsFileById(Integer id);

    /**
     * 查询人事档案列表
     * 
     * @param cmfHrmsFile 人事档案
     * @return 人事档案集合
     */
    public List<CmfHrmsFile> selectCmfHrmsFileList(CmfHrmsFile cmfHrmsFile);

    /**
     * 新增人事档案
     * 
     * @param cmfHrmsFile 人事档案
     * @return 结果
     */
    public int insertCmfHrmsFile(CmfHrmsFile cmfHrmsFile);

    /**
     * 修改人事档案
     * 
     * @param cmfHrmsFile 人事档案
     * @return 结果
     */
    public int updateCmfHrmsFile(CmfHrmsFile cmfHrmsFile);

    /**
     * 批量删除人事档案
     * 
     * @param ids 需要删除的人事档案主键集合
     * @return 结果
     */
    public int deleteCmfHrmsFileByIds(Integer[] ids);

    /**
     * 删除人事档案信息
     * 
     * @param id 人事档案主键
     * @return 结果
     */
    public int deleteCmfHrmsFileById(Integer id);
}
