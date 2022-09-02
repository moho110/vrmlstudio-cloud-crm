package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfGbSexMapper;
import com.vrcrm.political.domain.CmfGbSex;
import com.vrcrm.political.service.ICmfGbSexService;

/**
 * 性别Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfGbSexServiceImpl implements ICmfGbSexService 
{
    @Autowired
    private CmfGbSexMapper cmfGbSexMapper;

    /**
     * 查询性别
     * 
     * @param id 性别主键
     * @return 性别
     */
    @Override
    public CmfGbSex selectCmfGbSexById(Integer id)
    {
        return cmfGbSexMapper.selectCmfGbSexById(id);
    }

    /**
     * 查询性别列表
     * 
     * @param cmfGbSex 性别
     * @return 性别
     */
    @Override
    public List<CmfGbSex> selectCmfGbSexList(CmfGbSex cmfGbSex)
    {
        return cmfGbSexMapper.selectCmfGbSexList(cmfGbSex);
    }

    /**
     * 新增性别
     * 
     * @param cmfGbSex 性别
     * @return 结果
     */
    @Override
    public int insertCmfGbSex(CmfGbSex cmfGbSex)
    {
        return cmfGbSexMapper.insertCmfGbSex(cmfGbSex);
    }

    /**
     * 修改性别
     * 
     * @param cmfGbSex 性别
     * @return 结果
     */
    @Override
    public int updateCmfGbSex(CmfGbSex cmfGbSex)
    {
        return cmfGbSexMapper.updateCmfGbSex(cmfGbSex);
    }

    /**
     * 批量删除性别
     * 
     * @param ids 需要删除的性别主键
     * @return 结果
     */
    @Override
    public int deleteCmfGbSexByIds(Integer[] ids)
    {
        return cmfGbSexMapper.deleteCmfGbSexByIds(ids);
    }

    /**
     * 删除性别信息
     * 
     * @param id 性别主键
     * @return 结果
     */
    @Override
    public int deleteCmfGbSexById(Integer id)
    {
        return cmfGbSexMapper.deleteCmfGbSexById(id);
    }
}
