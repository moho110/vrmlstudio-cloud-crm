package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfHrmsFileLizhiMapper;
import com.vrcrm.hr.domain.CmfHrmsFileLizhi;
import com.vrcrm.hr.service.ICmfHrmsFileLizhiService;

/**
 * 人员离职Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfHrmsFileLizhiServiceImpl implements ICmfHrmsFileLizhiService 
{
    @Autowired
    private CmfHrmsFileLizhiMapper cmfHrmsFileLizhiMapper;

    /**
     * 查询人员离职
     * 
     * @param id 人员离职主键
     * @return 人员离职
     */
    @Override
    public CmfHrmsFileLizhi selectCmfHrmsFileLizhiById(Integer id)
    {
        return cmfHrmsFileLizhiMapper.selectCmfHrmsFileLizhiById(id);
    }

    /**
     * 查询人员离职列表
     * 
     * @param cmfHrmsFileLizhi 人员离职
     * @return 人员离职
     */
    @Override
    public List<CmfHrmsFileLizhi> selectCmfHrmsFileLizhiList(CmfHrmsFileLizhi cmfHrmsFileLizhi)
    {
        return cmfHrmsFileLizhiMapper.selectCmfHrmsFileLizhiList(cmfHrmsFileLizhi);
    }

    /**
     * 新增人员离职
     * 
     * @param cmfHrmsFileLizhi 人员离职
     * @return 结果
     */
    @Override
    public int insertCmfHrmsFileLizhi(CmfHrmsFileLizhi cmfHrmsFileLizhi)
    {
        return cmfHrmsFileLizhiMapper.insertCmfHrmsFileLizhi(cmfHrmsFileLizhi);
    }

    /**
     * 修改人员离职
     * 
     * @param cmfHrmsFileLizhi 人员离职
     * @return 结果
     */
    @Override
    public int updateCmfHrmsFileLizhi(CmfHrmsFileLizhi cmfHrmsFileLizhi)
    {
        return cmfHrmsFileLizhiMapper.updateCmfHrmsFileLizhi(cmfHrmsFileLizhi);
    }

    /**
     * 批量删除人员离职
     * 
     * @param ids 需要删除的人员离职主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsFileLizhiByIds(Integer[] ids)
    {
        return cmfHrmsFileLizhiMapper.deleteCmfHrmsFileLizhiByIds(ids);
    }

    /**
     * 删除人员离职信息
     * 
     * @param id 人员离职主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsFileLizhiById(Integer id)
    {
        return cmfHrmsFileLizhiMapper.deleteCmfHrmsFileLizhiById(id);
    }
}
