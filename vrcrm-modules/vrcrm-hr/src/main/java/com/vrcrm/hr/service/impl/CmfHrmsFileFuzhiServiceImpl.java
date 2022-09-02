package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfHrmsFileFuzhiMapper;
import com.vrcrm.hr.domain.CmfHrmsFileFuzhi;
import com.vrcrm.hr.service.ICmfHrmsFileFuzhiService;

/**
 * 人员复职Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfHrmsFileFuzhiServiceImpl implements ICmfHrmsFileFuzhiService 
{
    @Autowired
    private CmfHrmsFileFuzhiMapper cmfHrmsFileFuzhiMapper;

    /**
     * 查询人员复职
     * 
     * @param id 人员复职主键
     * @return 人员复职
     */
    @Override
    public CmfHrmsFileFuzhi selectCmfHrmsFileFuzhiById(Integer id)
    {
        return cmfHrmsFileFuzhiMapper.selectCmfHrmsFileFuzhiById(id);
    }

    /**
     * 查询人员复职列表
     * 
     * @param cmfHrmsFileFuzhi 人员复职
     * @return 人员复职
     */
    @Override
    public List<CmfHrmsFileFuzhi> selectCmfHrmsFileFuzhiList(CmfHrmsFileFuzhi cmfHrmsFileFuzhi)
    {
        return cmfHrmsFileFuzhiMapper.selectCmfHrmsFileFuzhiList(cmfHrmsFileFuzhi);
    }

    /**
     * 新增人员复职
     * 
     * @param cmfHrmsFileFuzhi 人员复职
     * @return 结果
     */
    @Override
    public int insertCmfHrmsFileFuzhi(CmfHrmsFileFuzhi cmfHrmsFileFuzhi)
    {
        return cmfHrmsFileFuzhiMapper.insertCmfHrmsFileFuzhi(cmfHrmsFileFuzhi);
    }

    /**
     * 修改人员复职
     * 
     * @param cmfHrmsFileFuzhi 人员复职
     * @return 结果
     */
    @Override
    public int updateCmfHrmsFileFuzhi(CmfHrmsFileFuzhi cmfHrmsFileFuzhi)
    {
        return cmfHrmsFileFuzhiMapper.updateCmfHrmsFileFuzhi(cmfHrmsFileFuzhi);
    }

    /**
     * 批量删除人员复职
     * 
     * @param ids 需要删除的人员复职主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsFileFuzhiByIds(Integer[] ids)
    {
        return cmfHrmsFileFuzhiMapper.deleteCmfHrmsFileFuzhiByIds(ids);
    }

    /**
     * 删除人员复职信息
     * 
     * @param id 人员复职主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsFileFuzhiById(Integer id)
    {
        return cmfHrmsFileFuzhiMapper.deleteCmfHrmsFileFuzhiById(id);
    }
}
