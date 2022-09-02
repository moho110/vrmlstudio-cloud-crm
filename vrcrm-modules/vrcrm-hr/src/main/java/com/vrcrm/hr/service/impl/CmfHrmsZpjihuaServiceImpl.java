package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfHrmsZpjihuaMapper;
import com.vrcrm.hr.domain.CmfHrmsZpjihua;
import com.vrcrm.hr.service.ICmfHrmsZpjihuaService;

/**
 * 招聘计划Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfHrmsZpjihuaServiceImpl implements ICmfHrmsZpjihuaService 
{
    @Autowired
    private CmfHrmsZpjihuaMapper cmfHrmsZpjihuaMapper;

    /**
     * 查询招聘计划
     * 
     * @param id 招聘计划主键
     * @return 招聘计划
     */
    @Override
    public CmfHrmsZpjihua selectCmfHrmsZpjihuaById(Integer id)
    {
        return cmfHrmsZpjihuaMapper.selectCmfHrmsZpjihuaById(id);
    }

    /**
     * 查询招聘计划列表
     * 
     * @param cmfHrmsZpjihua 招聘计划
     * @return 招聘计划
     */
    @Override
    public List<CmfHrmsZpjihua> selectCmfHrmsZpjihuaList(CmfHrmsZpjihua cmfHrmsZpjihua)
    {
        return cmfHrmsZpjihuaMapper.selectCmfHrmsZpjihuaList(cmfHrmsZpjihua);
    }

    /**
     * 新增招聘计划
     * 
     * @param cmfHrmsZpjihua 招聘计划
     * @return 结果
     */
    @Override
    public int insertCmfHrmsZpjihua(CmfHrmsZpjihua cmfHrmsZpjihua)
    {
        return cmfHrmsZpjihuaMapper.insertCmfHrmsZpjihua(cmfHrmsZpjihua);
    }

    /**
     * 修改招聘计划
     * 
     * @param cmfHrmsZpjihua 招聘计划
     * @return 结果
     */
    @Override
    public int updateCmfHrmsZpjihua(CmfHrmsZpjihua cmfHrmsZpjihua)
    {
        return cmfHrmsZpjihuaMapper.updateCmfHrmsZpjihua(cmfHrmsZpjihua);
    }

    /**
     * 批量删除招聘计划
     * 
     * @param ids 需要删除的招聘计划主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsZpjihuaByIds(Integer[] ids)
    {
        return cmfHrmsZpjihuaMapper.deleteCmfHrmsZpjihuaByIds(ids);
    }

    /**
     * 删除招聘计划信息
     * 
     * @param id 招聘计划主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsZpjihuaById(Integer id)
    {
        return cmfHrmsZpjihuaMapper.deleteCmfHrmsZpjihuaById(id);
    }
}
