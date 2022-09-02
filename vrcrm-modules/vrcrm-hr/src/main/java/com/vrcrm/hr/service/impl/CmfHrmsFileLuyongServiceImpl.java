package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfHrmsFileLuyongMapper;
import com.vrcrm.hr.domain.CmfHrmsFileLuyong;
import com.vrcrm.hr.service.ICmfHrmsFileLuyongService;

/**
 * 人员录用Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfHrmsFileLuyongServiceImpl implements ICmfHrmsFileLuyongService 
{
    @Autowired
    private CmfHrmsFileLuyongMapper cmfHrmsFileLuyongMapper;

    /**
     * 查询人员录用
     * 
     * @param id 人员录用主键
     * @return 人员录用
     */
    @Override
    public CmfHrmsFileLuyong selectCmfHrmsFileLuyongById(Integer id)
    {
        return cmfHrmsFileLuyongMapper.selectCmfHrmsFileLuyongById(id);
    }

    /**
     * 查询人员录用列表
     * 
     * @param cmfHrmsFileLuyong 人员录用
     * @return 人员录用
     */
    @Override
    public List<CmfHrmsFileLuyong> selectCmfHrmsFileLuyongList(CmfHrmsFileLuyong cmfHrmsFileLuyong)
    {
        return cmfHrmsFileLuyongMapper.selectCmfHrmsFileLuyongList(cmfHrmsFileLuyong);
    }

    /**
     * 新增人员录用
     * 
     * @param cmfHrmsFileLuyong 人员录用
     * @return 结果
     */
    @Override
    public int insertCmfHrmsFileLuyong(CmfHrmsFileLuyong cmfHrmsFileLuyong)
    {
        return cmfHrmsFileLuyongMapper.insertCmfHrmsFileLuyong(cmfHrmsFileLuyong);
    }

    /**
     * 修改人员录用
     * 
     * @param cmfHrmsFileLuyong 人员录用
     * @return 结果
     */
    @Override
    public int updateCmfHrmsFileLuyong(CmfHrmsFileLuyong cmfHrmsFileLuyong)
    {
        return cmfHrmsFileLuyongMapper.updateCmfHrmsFileLuyong(cmfHrmsFileLuyong);
    }

    /**
     * 批量删除人员录用
     * 
     * @param ids 需要删除的人员录用主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsFileLuyongByIds(Integer[] ids)
    {
        return cmfHrmsFileLuyongMapper.deleteCmfHrmsFileLuyongByIds(ids);
    }

    /**
     * 删除人员录用信息
     * 
     * @param id 人员录用主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsFileLuyongById(Integer id)
    {
        return cmfHrmsFileLuyongMapper.deleteCmfHrmsFileLuyongById(id);
    }
}
