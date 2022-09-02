package com.vrcrm.hr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.hr.mapper.CmfDictXingbieMapper;
import com.vrcrm.hr.domain.CmfDictXingbie;
import com.vrcrm.hr.service.ICmfDictXingbieService;

/**
 * 性别Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-15
 */
@Service
public class CmfDictXingbieServiceImpl implements ICmfDictXingbieService 
{
    @Autowired
    private CmfDictXingbieMapper cmfDictXingbieMapper;

    /**
     * 查询性别
     * 
     * @param id 性别主键
     * @return 性别
     */
    @Override
    public CmfDictXingbie selectCmfDictXingbieById(Integer id)
    {
        return cmfDictXingbieMapper.selectCmfDictXingbieById(id);
    }

    /**
     * 查询性别列表
     * 
     * @param cmfDictXingbie 性别
     * @return 性别
     */
    @Override
    public List<CmfDictXingbie> selectCmfDictXingbieList(CmfDictXingbie cmfDictXingbie)
    {
        return cmfDictXingbieMapper.selectCmfDictXingbieList(cmfDictXingbie);
    }

    /**
     * 新增性别
     * 
     * @param cmfDictXingbie 性别
     * @return 结果
     */
    @Override
    public int insertCmfDictXingbie(CmfDictXingbie cmfDictXingbie)
    {
        return cmfDictXingbieMapper.insertCmfDictXingbie(cmfDictXingbie);
    }

    /**
     * 修改性别
     * 
     * @param cmfDictXingbie 性别
     * @return 结果
     */
    @Override
    public int updateCmfDictXingbie(CmfDictXingbie cmfDictXingbie)
    {
        return cmfDictXingbieMapper.updateCmfDictXingbie(cmfDictXingbie);
    }

    /**
     * 批量删除性别
     * 
     * @param ids 需要删除的性别主键
     * @return 结果
     */
    @Override
    public int deleteCmfDictXingbieByIds(Integer[] ids)
    {
        return cmfDictXingbieMapper.deleteCmfDictXingbieByIds(ids);
    }

    /**
     * 删除性别信息
     * 
     * @param id 性别主键
     * @return 结果
     */
    @Override
    public int deleteCmfDictXingbieById(Integer id)
    {
        return cmfDictXingbieMapper.deleteCmfDictXingbieById(id);
    }
}
