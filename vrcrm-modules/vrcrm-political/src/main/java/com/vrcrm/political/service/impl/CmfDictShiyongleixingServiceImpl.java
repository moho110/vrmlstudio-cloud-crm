package com.vrcrm.political.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.political.mapper.CmfDictShiyongleixingMapper;
import com.vrcrm.political.domain.CmfDictShiyongleixing;
import com.vrcrm.political.service.ICmfDictShiyongleixingService;

/**
 * 使用类型Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfDictShiyongleixingServiceImpl implements ICmfDictShiyongleixingService 
{
    @Autowired
    private CmfDictShiyongleixingMapper cmfDictShiyongleixingMapper;

    /**
     * 查询使用类型
     * 
     * @param id 使用类型主键
     * @return 使用类型
     */
    @Override
    public CmfDictShiyongleixing selectCmfDictShiyongleixingById(Integer id)
    {
        return cmfDictShiyongleixingMapper.selectCmfDictShiyongleixingById(id);
    }

    /**
     * 查询使用类型列表
     * 
     * @param cmfDictShiyongleixing 使用类型
     * @return 使用类型
     */
    @Override
    public List<CmfDictShiyongleixing> selectCmfDictShiyongleixingList(CmfDictShiyongleixing cmfDictShiyongleixing)
    {
        return cmfDictShiyongleixingMapper.selectCmfDictShiyongleixingList(cmfDictShiyongleixing);
    }

    /**
     * 新增使用类型
     * 
     * @param cmfDictShiyongleixing 使用类型
     * @return 结果
     */
    @Override
    public int insertCmfDictShiyongleixing(CmfDictShiyongleixing cmfDictShiyongleixing)
    {
        return cmfDictShiyongleixingMapper.insertCmfDictShiyongleixing(cmfDictShiyongleixing);
    }

    /**
     * 修改使用类型
     * 
     * @param cmfDictShiyongleixing 使用类型
     * @return 结果
     */
    @Override
    public int updateCmfDictShiyongleixing(CmfDictShiyongleixing cmfDictShiyongleixing)
    {
        return cmfDictShiyongleixingMapper.updateCmfDictShiyongleixing(cmfDictShiyongleixing);
    }

    /**
     * 批量删除使用类型
     * 
     * @param ids 需要删除的使用类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfDictShiyongleixingByIds(Integer[] ids)
    {
        return cmfDictShiyongleixingMapper.deleteCmfDictShiyongleixingByIds(ids);
    }

    /**
     * 删除使用类型信息
     * 
     * @param id 使用类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfDictShiyongleixingById(Integer id)
    {
        return cmfDictShiyongleixingMapper.deleteCmfDictShiyongleixingById(id);
    }
}
