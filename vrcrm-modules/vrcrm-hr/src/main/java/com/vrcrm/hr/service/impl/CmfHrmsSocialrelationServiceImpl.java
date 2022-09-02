package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfHrmsSocialrelationMapper;
import com.vrcrm.hr.domain.CmfHrmsSocialrelation;
import com.vrcrm.hr.service.ICmfHrmsSocialrelationService;

/**
 * 社会关系Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfHrmsSocialrelationServiceImpl implements ICmfHrmsSocialrelationService 
{
    @Autowired
    private CmfHrmsSocialrelationMapper cmfHrmsSocialrelationMapper;

    /**
     * 查询社会关系
     * 
     * @param id 社会关系主键
     * @return 社会关系
     */
    @Override
    public CmfHrmsSocialrelation selectCmfHrmsSocialrelationById(Integer id)
    {
        return cmfHrmsSocialrelationMapper.selectCmfHrmsSocialrelationById(id);
    }

    /**
     * 查询社会关系列表
     * 
     * @param cmfHrmsSocialrelation 社会关系
     * @return 社会关系
     */
    @Override
    public List<CmfHrmsSocialrelation> selectCmfHrmsSocialrelationList(CmfHrmsSocialrelation cmfHrmsSocialrelation)
    {
        return cmfHrmsSocialrelationMapper.selectCmfHrmsSocialrelationList(cmfHrmsSocialrelation);
    }

    /**
     * 新增社会关系
     * 
     * @param cmfHrmsSocialrelation 社会关系
     * @return 结果
     */
    @Override
    public int insertCmfHrmsSocialrelation(CmfHrmsSocialrelation cmfHrmsSocialrelation)
    {
        return cmfHrmsSocialrelationMapper.insertCmfHrmsSocialrelation(cmfHrmsSocialrelation);
    }

    /**
     * 修改社会关系
     * 
     * @param cmfHrmsSocialrelation 社会关系
     * @return 结果
     */
    @Override
    public int updateCmfHrmsSocialrelation(CmfHrmsSocialrelation cmfHrmsSocialrelation)
    {
        return cmfHrmsSocialrelationMapper.updateCmfHrmsSocialrelation(cmfHrmsSocialrelation);
    }

    /**
     * 批量删除社会关系
     * 
     * @param ids 需要删除的社会关系主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsSocialrelationByIds(Integer[] ids)
    {
        return cmfHrmsSocialrelationMapper.deleteCmfHrmsSocialrelationByIds(ids);
    }

    /**
     * 删除社会关系信息
     * 
     * @param id 社会关系主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsSocialrelationById(Integer id)
    {
        return cmfHrmsSocialrelationMapper.deleteCmfHrmsSocialrelationById(id);
    }
}
