package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfHrmsFileMapper;
import com.vrcrm.hr.domain.CmfHrmsFile;
import com.vrcrm.hr.service.ICmfHrmsFileService;

/**
 * 人事档案Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfHrmsFileServiceImpl implements ICmfHrmsFileService 
{
    @Autowired
    private CmfHrmsFileMapper cmfHrmsFileMapper;

    /**
     * 查询人事档案
     * 
     * @param id 人事档案主键
     * @return 人事档案
     */
    @Override
    public CmfHrmsFile selectCmfHrmsFileById(Integer id)
    {
        return cmfHrmsFileMapper.selectCmfHrmsFileById(id);
    }

    /**
     * 查询人事档案列表
     * 
     * @param cmfHrmsFile 人事档案
     * @return 人事档案
     */
    @Override
    public List<CmfHrmsFile> selectCmfHrmsFileList(CmfHrmsFile cmfHrmsFile)
    {
        return cmfHrmsFileMapper.selectCmfHrmsFileList(cmfHrmsFile);
    }

    /**
     * 新增人事档案
     * 
     * @param cmfHrmsFile 人事档案
     * @return 结果
     */
    @Override
    public int insertCmfHrmsFile(CmfHrmsFile cmfHrmsFile)
    {
        return cmfHrmsFileMapper.insertCmfHrmsFile(cmfHrmsFile);
    }

    /**
     * 修改人事档案
     * 
     * @param cmfHrmsFile 人事档案
     * @return 结果
     */
    @Override
    public int updateCmfHrmsFile(CmfHrmsFile cmfHrmsFile)
    {
        return cmfHrmsFileMapper.updateCmfHrmsFile(cmfHrmsFile);
    }

    /**
     * 批量删除人事档案
     * 
     * @param ids 需要删除的人事档案主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsFileByIds(Integer[] ids)
    {
        return cmfHrmsFileMapper.deleteCmfHrmsFileByIds(ids);
    }

    /**
     * 删除人事档案信息
     * 
     * @param id 人事档案主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsFileById(Integer id)
    {
        return cmfHrmsFileMapper.deleteCmfHrmsFileById(id);
    }
}
