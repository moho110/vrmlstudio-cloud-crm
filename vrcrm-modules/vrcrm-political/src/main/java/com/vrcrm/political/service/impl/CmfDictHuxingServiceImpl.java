package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfDictHuxingMapper;
import com.vrcrm.political.domain.CmfDictHuxing;
import com.vrcrm.political.service.ICmfDictHuxingService;

/**
 * 户型Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfDictHuxingServiceImpl implements ICmfDictHuxingService 
{
    @Autowired
    private CmfDictHuxingMapper cmfDictHuxingMapper;

    /**
     * 查询户型
     * 
     * @param id 户型主键
     * @return 户型
     */
    @Override
    public CmfDictHuxing selectCmfDictHuxingById(Integer id)
    {
        return cmfDictHuxingMapper.selectCmfDictHuxingById(id);
    }

    /**
     * 查询户型列表
     * 
     * @param cmfDictHuxing 户型
     * @return 户型
     */
    @Override
    public List<CmfDictHuxing> selectCmfDictHuxingList(CmfDictHuxing cmfDictHuxing)
    {
        return cmfDictHuxingMapper.selectCmfDictHuxingList(cmfDictHuxing);
    }

    /**
     * 新增户型
     * 
     * @param cmfDictHuxing 户型
     * @return 结果
     */
    @Override
    public int insertCmfDictHuxing(CmfDictHuxing cmfDictHuxing)
    {
        return cmfDictHuxingMapper.insertCmfDictHuxing(cmfDictHuxing);
    }

    /**
     * 修改户型
     * 
     * @param cmfDictHuxing 户型
     * @return 结果
     */
    @Override
    public int updateCmfDictHuxing(CmfDictHuxing cmfDictHuxing)
    {
        return cmfDictHuxingMapper.updateCmfDictHuxing(cmfDictHuxing);
    }

    /**
     * 批量删除户型
     * 
     * @param ids 需要删除的户型主键
     * @return 结果
     */
    @Override
    public int deleteCmfDictHuxingByIds(Integer[] ids)
    {
        return cmfDictHuxingMapper.deleteCmfDictHuxingByIds(ids);
    }

    /**
     * 删除户型信息
     * 
     * @param id 户型主键
     * @return 结果
     */
    @Override
    public int deleteCmfDictHuxingById(Integer id)
    {
        return cmfDictHuxingMapper.deleteCmfDictHuxingById(id);
    }
}
