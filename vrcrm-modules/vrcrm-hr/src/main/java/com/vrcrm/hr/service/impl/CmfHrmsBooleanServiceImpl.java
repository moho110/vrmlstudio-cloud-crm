package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfHrmsBooleanMapper;
import com.vrcrm.hr.domain.CmfHrmsBoolean;
import com.vrcrm.hr.service.ICmfHrmsBooleanService;

/**
 * 同意与否Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfHrmsBooleanServiceImpl implements ICmfHrmsBooleanService 
{
    @Autowired
    private CmfHrmsBooleanMapper cmfHrmsBooleanMapper;

    /**
     * 查询同意与否
     * 
     * @param id 同意与否主键
     * @return 同意与否
     */
    @Override
    public CmfHrmsBoolean selectCmfHrmsBooleanById(Integer id)
    {
        return cmfHrmsBooleanMapper.selectCmfHrmsBooleanById(id);
    }

    /**
     * 查询同意与否列表
     * 
     * @param cmfHrmsBoolean 同意与否
     * @return 同意与否
     */
    @Override
    public List<CmfHrmsBoolean> selectCmfHrmsBooleanList(CmfHrmsBoolean cmfHrmsBoolean)
    {
        return cmfHrmsBooleanMapper.selectCmfHrmsBooleanList(cmfHrmsBoolean);
    }

    /**
     * 新增同意与否
     * 
     * @param cmfHrmsBoolean 同意与否
     * @return 结果
     */
    @Override
    public int insertCmfHrmsBoolean(CmfHrmsBoolean cmfHrmsBoolean)
    {
        return cmfHrmsBooleanMapper.insertCmfHrmsBoolean(cmfHrmsBoolean);
    }

    /**
     * 修改同意与否
     * 
     * @param cmfHrmsBoolean 同意与否
     * @return 结果
     */
    @Override
    public int updateCmfHrmsBoolean(CmfHrmsBoolean cmfHrmsBoolean)
    {
        return cmfHrmsBooleanMapper.updateCmfHrmsBoolean(cmfHrmsBoolean);
    }

    /**
     * 批量删除同意与否
     * 
     * @param ids 需要删除的同意与否主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsBooleanByIds(Integer[] ids)
    {
        return cmfHrmsBooleanMapper.deleteCmfHrmsBooleanByIds(ids);
    }

    /**
     * 删除同意与否信息
     * 
     * @param id 同意与否主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsBooleanById(Integer id)
    {
        return cmfHrmsBooleanMapper.deleteCmfHrmsBooleanById(id);
    }
}
