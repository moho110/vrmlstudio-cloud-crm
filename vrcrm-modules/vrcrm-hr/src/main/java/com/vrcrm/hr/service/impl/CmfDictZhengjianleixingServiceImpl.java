package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfDictZhengjianleixingMapper;
import com.vrcrm.hr.domain.CmfDictZhengjianleixing;
import com.vrcrm.hr.service.ICmfDictZhengjianleixingService;

/**
 * 证件类型Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfDictZhengjianleixingServiceImpl implements ICmfDictZhengjianleixingService 
{
    @Autowired
    private CmfDictZhengjianleixingMapper cmfDictZhengjianleixingMapper;

    /**
     * 查询证件类型
     * 
     * @param id 证件类型主键
     * @return 证件类型
     */
    @Override
    public CmfDictZhengjianleixing selectCmfDictZhengjianleixingById(Integer id)
    {
        return cmfDictZhengjianleixingMapper.selectCmfDictZhengjianleixingById(id);
    }

    /**
     * 查询证件类型列表
     * 
     * @param cmfDictZhengjianleixing 证件类型
     * @return 证件类型
     */
    @Override
    public List<CmfDictZhengjianleixing> selectCmfDictZhengjianleixingList(CmfDictZhengjianleixing cmfDictZhengjianleixing)
    {
        return cmfDictZhengjianleixingMapper.selectCmfDictZhengjianleixingList(cmfDictZhengjianleixing);
    }

    /**
     * 新增证件类型
     * 
     * @param cmfDictZhengjianleixing 证件类型
     * @return 结果
     */
    @Override
    public int insertCmfDictZhengjianleixing(CmfDictZhengjianleixing cmfDictZhengjianleixing)
    {
        return cmfDictZhengjianleixingMapper.insertCmfDictZhengjianleixing(cmfDictZhengjianleixing);
    }

    /**
     * 修改证件类型
     * 
     * @param cmfDictZhengjianleixing 证件类型
     * @return 结果
     */
    @Override
    public int updateCmfDictZhengjianleixing(CmfDictZhengjianleixing cmfDictZhengjianleixing)
    {
        return cmfDictZhengjianleixingMapper.updateCmfDictZhengjianleixing(cmfDictZhengjianleixing);
    }

    /**
     * 批量删除证件类型
     * 
     * @param ids 需要删除的证件类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfDictZhengjianleixingByIds(Integer[] ids)
    {
        return cmfDictZhengjianleixingMapper.deleteCmfDictZhengjianleixingByIds(ids);
    }

    /**
     * 删除证件类型信息
     * 
     * @param id 证件类型主键
     * @return 结果
     */
    @Override
    public int deleteCmfDictZhengjianleixingById(Integer id)
    {
        return cmfDictZhengjianleixingMapper.deleteCmfDictZhengjianleixingById(id);
    }
}
