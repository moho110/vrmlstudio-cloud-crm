package com.vrcrm.basicdata.service.impl;

import java.util.List;
import com.vrcrm.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.basicdata.mapper.CmfRecycleBinMapper;
import com.vrcrm.basicdata.domain.CmfRecycleBin;
import com.vrcrm.basicdata.service.ICmfRecycleBinService;

/**
 * 回收站Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-18
 */
@Service
public class CmfRecycleBinServiceImpl implements ICmfRecycleBinService 
{
    @Autowired
    private CmfRecycleBinMapper cmfRecycleBinMapper;

    /**
     * 查询回收站
     * 
     * @param id 回收站主键
     * @return 回收站
     */
    @Override
    public CmfRecycleBin selectCmfRecycleBinById(Integer id)
    {
        return cmfRecycleBinMapper.selectCmfRecycleBinById(id);
    }

    /**
     * 查询回收站列表
     * 
     * @param cmfRecycleBin 回收站
     * @return 回收站
     */
    @Override
    public List<CmfRecycleBin> selectCmfRecycleBinList(CmfRecycleBin cmfRecycleBin)
    {
        return cmfRecycleBinMapper.selectCmfRecycleBinList(cmfRecycleBin);
    }

    /**
     * 新增回收站
     * 
     * @param cmfRecycleBin 回收站
     * @return 结果
     */
    @Override
    public int insertCmfRecycleBin(CmfRecycleBin cmfRecycleBin)
    {
        cmfRecycleBin.setCreateTime(DateUtils.getNowDate());
        return cmfRecycleBinMapper.insertCmfRecycleBin(cmfRecycleBin);
    }

    /**
     * 修改回收站
     * 
     * @param cmfRecycleBin 回收站
     * @return 结果
     */
    @Override
    public int updateCmfRecycleBin(CmfRecycleBin cmfRecycleBin)
    {
        return cmfRecycleBinMapper.updateCmfRecycleBin(cmfRecycleBin);
    }

    /**
     * 批量删除回收站
     * 
     * @param ids 需要删除的回收站主键
     * @return 结果
     */
    @Override
    public int deleteCmfRecycleBinByIds(Integer[] ids)
    {
        return cmfRecycleBinMapper.deleteCmfRecycleBinByIds(ids);
    }

    /**
     * 删除回收站信息
     * 
     * @param id 回收站主键
     * @return 结果
     */
    @Override
    public int deleteCmfRecycleBinById(Integer id)
    {
        return cmfRecycleBinMapper.deleteCmfRecycleBinById(id);
    }
}
