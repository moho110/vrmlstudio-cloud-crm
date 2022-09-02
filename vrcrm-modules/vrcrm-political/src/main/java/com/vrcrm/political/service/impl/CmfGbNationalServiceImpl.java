package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfGbNationalMapper;
import com.vrcrm.political.domain.CmfGbNational;
import com.vrcrm.political.service.ICmfGbNationalService;

/**
 * 国籍Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfGbNationalServiceImpl implements ICmfGbNationalService 
{
    @Autowired
    private CmfGbNationalMapper cmfGbNationalMapper;

    /**
     * 查询国籍
     * 
     * @param id 国籍主键
     * @return 国籍
     */
    @Override
    public CmfGbNational selectCmfGbNationalById(Integer id)
    {
        return cmfGbNationalMapper.selectCmfGbNationalById(id);
    }

    /**
     * 查询国籍列表
     * 
     * @param cmfGbNational 国籍
     * @return 国籍
     */
    @Override
    public List<CmfGbNational> selectCmfGbNationalList(CmfGbNational cmfGbNational)
    {
        return cmfGbNationalMapper.selectCmfGbNationalList(cmfGbNational);
    }

    /**
     * 新增国籍
     * 
     * @param cmfGbNational 国籍
     * @return 结果
     */
    @Override
    public int insertCmfGbNational(CmfGbNational cmfGbNational)
    {
        return cmfGbNationalMapper.insertCmfGbNational(cmfGbNational);
    }

    /**
     * 修改国籍
     * 
     * @param cmfGbNational 国籍
     * @return 结果
     */
    @Override
    public int updateCmfGbNational(CmfGbNational cmfGbNational)
    {
        return cmfGbNationalMapper.updateCmfGbNational(cmfGbNational);
    }

    /**
     * 批量删除国籍
     * 
     * @param ids 需要删除的国籍主键
     * @return 结果
     */
    @Override
    public int deleteCmfGbNationalByIds(Integer[] ids)
    {
        return cmfGbNationalMapper.deleteCmfGbNationalByIds(ids);
    }

    /**
     * 删除国籍信息
     * 
     * @param id 国籍主键
     * @return 结果
     */
    @Override
    public int deleteCmfGbNationalById(Integer id)
    {
        return cmfGbNationalMapper.deleteCmfGbNationalById(id);
    }
}
