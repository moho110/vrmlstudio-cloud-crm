package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfWuBuildinginformationMapper;
import com.vrcrm.political.domain.CmfWuBuildinginformation;
import com.vrcrm.political.service.ICmfWuBuildinginformationService;

/**
 * 房产信息Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfWuBuildinginformationServiceImpl implements ICmfWuBuildinginformationService 
{
    @Autowired
    private CmfWuBuildinginformationMapper cmfWuBuildinginformationMapper;

    /**
     * 查询房产信息
     * 
     * @param id 房产信息主键
     * @return 房产信息
     */
    @Override
    public CmfWuBuildinginformation selectCmfWuBuildinginformationById(Integer id)
    {
        return cmfWuBuildinginformationMapper.selectCmfWuBuildinginformationById(id);
    }

    /**
     * 查询房产信息列表
     * 
     * @param cmfWuBuildinginformation 房产信息
     * @return 房产信息
     */
    @Override
    public List<CmfWuBuildinginformation> selectCmfWuBuildinginformationList(CmfWuBuildinginformation cmfWuBuildinginformation)
    {
        return cmfWuBuildinginformationMapper.selectCmfWuBuildinginformationList(cmfWuBuildinginformation);
    }

    /**
     * 新增房产信息
     * 
     * @param cmfWuBuildinginformation 房产信息
     * @return 结果
     */
    @Override
    public int insertCmfWuBuildinginformation(CmfWuBuildinginformation cmfWuBuildinginformation)
    {
        return cmfWuBuildinginformationMapper.insertCmfWuBuildinginformation(cmfWuBuildinginformation);
    }

    /**
     * 修改房产信息
     * 
     * @param cmfWuBuildinginformation 房产信息
     * @return 结果
     */
    @Override
    public int updateCmfWuBuildinginformation(CmfWuBuildinginformation cmfWuBuildinginformation)
    {
        return cmfWuBuildinginformationMapper.updateCmfWuBuildinginformation(cmfWuBuildinginformation);
    }

    /**
     * 批量删除房产信息
     * 
     * @param ids 需要删除的房产信息主键
     * @return 结果
     */
    @Override
    public int deleteCmfWuBuildinginformationByIds(Integer[] ids)
    {
        return cmfWuBuildinginformationMapper.deleteCmfWuBuildinginformationByIds(ids);
    }

    /**
     * 删除房产信息信息
     * 
     * @param id 房产信息主键
     * @return 结果
     */
    @Override
    public int deleteCmfWuBuildinginformationById(Integer id)
    {
        return cmfWuBuildinginformationMapper.deleteCmfWuBuildinginformationById(id);
    }
}
