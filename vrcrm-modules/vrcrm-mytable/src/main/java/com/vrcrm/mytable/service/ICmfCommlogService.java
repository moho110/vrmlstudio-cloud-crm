package com.vrcrm.mytable.service;

import java.util.List;
import com.vrcrm.mytable.domain.CmfCommlog;

/**
 * 通用日志Service接口
 * 
 * @author VRer
 * @date 2022-04-14
 */
public interface ICmfCommlogService 
{
    /**
     * 查询通用日志
     * 
     * @param id 通用日志主键
     * @return 通用日志
     */
    public CmfCommlog selectCmfCommlogById(Integer id);

    /**
     * 查询通用日志列表
     * 
     * @param cmfCommlog 通用日志
     * @return 通用日志集合
     */
    public List<CmfCommlog> selectCmfCommlogList(CmfCommlog cmfCommlog);

    /**
     * 新增通用日志
     * 
     * @param cmfCommlog 通用日志
     * @return 结果
     */
    public int insertCmfCommlog(CmfCommlog cmfCommlog);

    /**
     * 修改通用日志
     * 
     * @param cmfCommlog 通用日志
     * @return 结果
     */
    public int updateCmfCommlog(CmfCommlog cmfCommlog);

    /**
     * 批量删除通用日志
     * 
     * @param ids 需要删除的通用日志主键集合
     * @return 结果
     */
    public int deleteCmfCommlogByIds(Integer[] ids);

    /**
     * 删除通用日志信息
     * 
     * @param id 通用日志主键
     * @return 结果
     */
    public int deleteCmfCommlogById(Integer id);
}
