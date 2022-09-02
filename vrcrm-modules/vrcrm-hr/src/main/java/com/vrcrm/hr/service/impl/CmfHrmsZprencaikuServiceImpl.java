package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfHrmsZprencaikuMapper;
import com.vrcrm.hr.domain.CmfHrmsZprencaiku;
import com.vrcrm.hr.service.ICmfHrmsZprencaikuService;

/**
 * 招聘人才库Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfHrmsZprencaikuServiceImpl implements ICmfHrmsZprencaikuService 
{
    @Autowired
    private CmfHrmsZprencaikuMapper cmfHrmsZprencaikuMapper;

    /**
     * 查询招聘人才库
     * 
     * @param id 招聘人才库主键
     * @return 招聘人才库
     */
    @Override
    public CmfHrmsZprencaiku selectCmfHrmsZprencaikuById(Integer id)
    {
        return cmfHrmsZprencaikuMapper.selectCmfHrmsZprencaikuById(id);
    }

    /**
     * 查询招聘人才库列表
     * 
     * @param cmfHrmsZprencaiku 招聘人才库
     * @return 招聘人才库
     */
    @Override
    public List<CmfHrmsZprencaiku> selectCmfHrmsZprencaikuList(CmfHrmsZprencaiku cmfHrmsZprencaiku)
    {
        return cmfHrmsZprencaikuMapper.selectCmfHrmsZprencaikuList(cmfHrmsZprencaiku);
    }

    /**
     * 新增招聘人才库
     * 
     * @param cmfHrmsZprencaiku 招聘人才库
     * @return 结果
     */
    @Override
    public int insertCmfHrmsZprencaiku(CmfHrmsZprencaiku cmfHrmsZprencaiku)
    {
        return cmfHrmsZprencaikuMapper.insertCmfHrmsZprencaiku(cmfHrmsZprencaiku);
    }

    /**
     * 修改招聘人才库
     * 
     * @param cmfHrmsZprencaiku 招聘人才库
     * @return 结果
     */
    @Override
    public int updateCmfHrmsZprencaiku(CmfHrmsZprencaiku cmfHrmsZprencaiku)
    {
        return cmfHrmsZprencaikuMapper.updateCmfHrmsZprencaiku(cmfHrmsZprencaiku);
    }

    /**
     * 批量删除招聘人才库
     * 
     * @param ids 需要删除的招聘人才库主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsZprencaikuByIds(Integer[] ids)
    {
        return cmfHrmsZprencaikuMapper.deleteCmfHrmsZprencaikuByIds(ids);
    }

    /**
     * 删除招聘人才库信息
     * 
     * @param id 招聘人才库主键
     * @return 结果
     */
    @Override
    public int deleteCmfHrmsZprencaikuById(Integer id)
    {
        return cmfHrmsZprencaikuMapper.deleteCmfHrmsZprencaikuById(id);
    }
}
