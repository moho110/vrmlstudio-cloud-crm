package com.vrcrm.mytable.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vrcrm.mytable.mapper.CmfCommlogMapper;
import com.vrcrm.mytable.domain.CmfCommlog;
import com.vrcrm.mytable.service.ICmfCommlogService;

/**
 * 通用日志Service业务层处理
 * 
 * @author VRer
 * @date 2022-04-14
 */
@Service
public class CmfCommlogServiceImpl implements ICmfCommlogService 
{
    @Autowired
    private CmfCommlogMapper cmfCommlogMapper;

    /**
     * 查询通用日志
     * 
     * @param id 通用日志主键
     * @return 通用日志
     */
    @Override
    public CmfCommlog selectCmfCommlogById(Integer id)
    {
        return cmfCommlogMapper.selectCmfCommlogById(id);
    }

    /**
     * 查询通用日志列表
     * 
     * @param cmfCommlog 通用日志
     * @return 通用日志
     */
    @Override
    public List<CmfCommlog> selectCmfCommlogList(CmfCommlog cmfCommlog)
    {
        return cmfCommlogMapper.selectCmfCommlogList(cmfCommlog);
    }

    /**
     * 新增通用日志
     * 
     * @param cmfCommlog 通用日志
     * @return 结果
     */
    @Override
    public int insertCmfCommlog(CmfCommlog cmfCommlog)
    {
        return cmfCommlogMapper.insertCmfCommlog(cmfCommlog);
    }

    /**
     * 修改通用日志
     * 
     * @param cmfCommlog 通用日志
     * @return 结果
     */
    @Override
    public int updateCmfCommlog(CmfCommlog cmfCommlog)
    {
        return cmfCommlogMapper.updateCmfCommlog(cmfCommlog);
    }

    /**
     * 批量删除通用日志
     * 
     * @param ids 需要删除的通用日志主键
     * @return 结果
     */
    @Override
    public int deleteCmfCommlogByIds(Integer[] ids)
    {
        return cmfCommlogMapper.deleteCmfCommlogByIds(ids);
    }

    /**
     * 删除通用日志信息
     * 
     * @param id 通用日志主键
     * @return 结果
     */
    @Override
    public int deleteCmfCommlogById(Integer id)
    {
        return cmfCommlogMapper.deleteCmfCommlogById(id);
    }
}
